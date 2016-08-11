package com;

/**
 *
 * @author Raman
 */
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FindMST {

    int nodes;
    int cost[][];
    int visited[];

    public FindMST(int n) {
        nodes = n;
        cost = new int[nodes + 1][nodes + 1];
        visited = new int[nodes + 1];
    }

    public void mainMethod(int nodes) throws IOException {
        int n = nodes;
        FindMST tree = new FindMST(n);
        int ne = 1, mincost = 0;
        int a = 0, b = 0, u = 0, v = 0, min;
        int[] cost = new int[n * n];
        int k = 0;
        File f = null;
        File file = null;
//		sc = new Scanner(System.in);

        int success = 0;
        switch (n) {
            case 10:
                f = new File("AdjacencyMatrix_of_Graph_G_N_10.txt");
                file = new File("Result_Graph_G_N_10.txt");
                success = 1;
                break;
            case 20:
                f = new File("AdjacencyMatrix_of_Graph_G_N_20.txt");
                file = new File("Result_Graph_G_N_20.txt");
                success = 1;
                break;
            case 50:
                f = new File("AdjacencyMatrix_of_Graph_G_N_50.txt");
                file = new File("Result_Graph_G_N_50.txt");
                success = 1;
                break;
            case 100:
                f = new File("AdjacencyMatrix_of_Graph_G_N_100.txt");
                file = new File("Result_Graph_G_N_100.txt");
                success = 1;
                break;
            case 1000:
                f = new File("AdjacencyMatrix_of_Graph_G_N_1000.txt");
                file = new File("Result_Graph_G_N_1000.txt");
                success = 1;
                break;
            case 10000:
                f = new File("AdjacencyMatrix_of_Graph_G_N_10000.txt");
                file = new File("Result_Graph_G_N_10000.txt");
                success = 1;
                break;
            default:
                System.out.println("Invalid choice. Program will now exit.");
                success = -1;
                break;
        }

        if (success == 1) {
//		System.out.println("Enter the adjacency matrix file location:");
//		String filename = sc.nextLine();
            // File file = new File("AdjacencyMatrix_of_Graph_G_N_10.txt");
            Scanner sc;
            sc = new Scanner(f);
            // sc = new Scanner(filename);
            long startTime = System.currentTimeMillis();
            // int lineNo = 0;
            int z = 0;
            while (sc.hasNext()) {

                // String value = sc.next();
                // int tempArray[] = new int[n];
                cost[z] = Integer.valueOf(sc.next());
                // tempArray[i] = Integer.valueOf(value);
                z++;
                // System.out.println(value);
                // cost[k] = Integer.valueOf(sc.next());
                // k++;
            }

            sc.close();
            // System.out.println("Done");
            k = 0;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    tree.cost[i][j] = cost[k];
                    k++;

                    if (tree.cost[i][j] == 0) {
                        tree.cost[i][j] = 999;
                    }
                }
            }

            tree.visited[1] = 1;

            System.out.println("Total Number of nodes:" + n);
            System.out.println("List of edges and their costs::");

            while (ne < n) {
                min = 999;
                for (int i = 1; i <= n; i++) {

                    for (int j = 1; j <= n; j++) {
                        if (tree.cost[i][j] < min) {
                            if (tree.visited[i] != 0) {

                                min = tree.cost[i][j];

                                a = u = i;

                                b = v = j;

                            }
                        }
                    }
                }

                if (tree.visited[u] == 0 || tree.visited[v] == 0) {
                    System.out.println("(" + a + "," + b + ")" + "edge cost: " + min);

                    ne++;

                    mincost += min;

                    tree.visited[b] = 1;

                }

                tree.cost[a][b] = tree.cost[b][a] = 999;

            }
            System.out.println("Total number of edges in Minimum Spanning trees:" + (ne - 1));
            System.out.println("Total cost of Minimum Spanning Tree:" + mincost);
            long stopTime = System.currentTimeMillis();
            long elapsedTime = stopTime - startTime;
            System.out.println("Total time :" + elapsedTime + " ms");

            Runtime runtime = Runtime.getRuntime();
            // Run the garbage collector
            runtime.gc();
            // Calculate the used memory
            long memory = runtime.totalMemory() - runtime.freeMemory();
            System.out.println("Used memory is bytes: " + memory);
            System.out.println("Used memory is megabytes: " + bytesToMegabytes(memory));
        }
    }

    public static long bytesToMegabytes(long bytes) {
        final long MEGABYTE = 1024L * 1024L;

        return bytes / MEGABYTE;
    }
}
