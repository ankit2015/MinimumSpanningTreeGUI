package com;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Raman
 */
public class NewJFrame extends javax.swing.JFrame {

    int nodes=0;
    int cost[][];
    int visited[];
    int ivalue = 0;
    String arr[] = new String[10000];
    
    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
//        System.out.println("NewJFrame() constructor");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FindMST");

        jButton1.setText("MST of Graph G with N=10");
        jButton1.setToolTipText("MST of Graph G with N=10");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("MST of Graph G with N=20");
        jButton2.setToolTipText("MST of Graph G with N=20");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("MST of Graph G with N=50");
        jButton3.setToolTipText("MST of Graph G with N=50");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("MST of Graph G with N=100");
        jButton4.setToolTipText("MST of Graph G with N=100");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("MST of Graph G with N=1000");
        jButton5.setToolTipText("MST of Graph G with N=1000");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("MST of Graph G with N=10000");
        jButton6.setToolTipText("MST of Graph G with N=10000");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Step");
        jButton7.setToolTipText("press this button repeatedly and see (on the screen and print) the output result file line by line");
        jButton7.setEnabled(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton8.setText("Full MST");
        jButton8.setToolTipText("Display full minimum spanning tree");
        jButton8.setEnabled(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(125, 125, 125)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton5)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(354, 354, 354)
                        .addComponent(jButton7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton8)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jButton8))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Act(10);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Act(20);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Act(50);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Act(100);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Act(1000);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        Act(10000);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if ((ivalue < nodes-1)) {
            jTextArea1.append(arr[ivalue]+"\n");
            ivalue++;
        }
        if ((ivalue == nodes-1))
        {
            jButton7.setEnabled(false);
            jButton8.setEnabled(false);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        jButton7.setEnabled(false);
        jTextArea1.setText(null);
        for (int i = 0; i < nodes-1; i++) {
            jTextArea1.append(arr[i]+"\n");
            jButton8.setEnabled(false);
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void Act(int n)
    {
        jTextArea1.setText(null);
        nodes = n;
        cost = new int[nodes + 1][nodes + 1];
        visited = new int[nodes + 1];
        try {
            Main(nodes);
        } catch (IOException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (jTextArea1.getText().length()==0)
        {
            jButton7.setEnabled(rootPaneCheckingEnabled);
            jButton8.setEnabled(rootPaneCheckingEnabled);
        }
    }
    
    public void Main(int nodes) throws IOException {
        int n = nodes;
        FindMST tree = new FindMST(n);
        int ne = 1, mincost = 0;
        int a = 0, b = 0, u = 0, v = 0, min;
        int[] cost = new int[n * n];
        int k = 0;
        File file = null;
//		sc = new Scanner(System.in);

        int option = 0;
        switch (n) {
            case 10:
                file = new File("AdjacencyMatrix_of_Graph_G_N_10.txt");
                option = 1;
                break;
            case 20:
                file = new File("AdjacencyMatrix_of_Graph_G_N_20.txt");
                option = 1;
                break;
            case 50:
                file = new File("AdjacencyMatrix_of_Graph_G_N_50.txt");
                option = 1;
                break;
            case 100:
                file = new File("AdjacencyMatrix_of_Graph_G_N_100.txt");
                option = 1;
                break;
            case 1000:
                file = new File("AdjacencyMatrix_of_Graph_G_N_1000.txt");
                option = 1;
                break;
            case 10000:
                file = new File("AdjacencyMatrix_of_Graph_G_N_10000.txt");
                option = 1;
                break;
            default:
                System.out.println("Invalid choice. Program will now exit.");
                option = -1;
                break;
        }

        if (option == 1) {
//		System.out.println("Enter the adjacency matrix file location:");
//		String filename = sc.nextLine();
            // File file = new File("AdjacencyMatrix_of_Graph_G_N_10.txt");
            Scanner sc;
            sc = new Scanner(file);
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

            int needle=0;
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
                    arr[needle]="(" + a + "," + b + ")" + "edge cost: " + min ;
                    needle++;
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
    
     public long bytesToMegabytes(long bytes) {
        final long MEGABYTE = 1024L * 1024L;
        return bytes / MEGABYTE;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
//        System.out.println("main() method");
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
//                System.out.println("run() method");
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}