package animerec1;

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;

public class App extends javax.swing.JFrame {

    
    static String [] AnimeNames;
    static String [] Ratings={"0","1","2","3","4","5","6","7","8","9","10"};
    static HashMap<Integer,HashMap<String,Integer>> Vector;
    static String [] Genre;
    static String [] Types;
    
    public App(String [] AnimeNamesData,HashMap<Integer,HashMap<String,Integer>> Vector1) {
        
        
        AnimeNames=AnimeNamesData;
        Vector=Vector1;
        
        initComponents();
        
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Anime1 = new javax.swing.JComboBox();
        Anime5 = new javax.swing.JComboBox();
        Anime2 = new javax.swing.JComboBox();
        Anime3 = new javax.swing.JComboBox();
        Anime4 = new javax.swing.JComboBox();
        Anime6 = new javax.swing.JComboBox();
        Anime7 = new javax.swing.JComboBox();
        Anime8 = new javax.swing.JComboBox();
        Anime9 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        Anime10 = new javax.swing.JComboBox();
        Rating1 = new javax.swing.JComboBox();
        Rating2 = new javax.swing.JComboBox();
        Rating3 = new javax.swing.JComboBox();
        Rating4 = new javax.swing.JComboBox();
        Rating5 = new javax.swing.JComboBox();
        Rating6 = new javax.swing.JComboBox();
        Rating7 = new javax.swing.JComboBox();
        Rating8 = new javax.swing.JComboBox();
        Rating9 = new javax.swing.JComboBox();
        Rating10 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        RecWindow = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 153, 255));

        Anime1.setModel(new javax.swing.DefaultComboBoxModel(AnimeNames));
        Anime1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Anime1ActionPerformed(evt);
            }
        });

        Anime5.setModel(new javax.swing.DefaultComboBoxModel(AnimeNames));
        Anime5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Anime5ActionPerformed(evt);
            }
        });

        Anime2.setModel(new javax.swing.DefaultComboBoxModel(AnimeNames));
        Anime2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Anime2ActionPerformed(evt);
            }
        });

        Anime3.setModel(new javax.swing.DefaultComboBoxModel(AnimeNames));
        Anime3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Anime3ActionPerformed(evt);
            }
        });

        Anime4.setModel(new javax.swing.DefaultComboBoxModel(AnimeNames));
        Anime4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Anime4ActionPerformed(evt);
            }
        });

        Anime6.setModel(new javax.swing.DefaultComboBoxModel(AnimeNames));
        Anime6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Anime6ActionPerformed(evt);
            }
        });

        Anime7.setModel(new javax.swing.DefaultComboBoxModel(AnimeNames));
        Anime7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Anime7ActionPerformed(evt);
            }
        });

        Anime8.setModel(new javax.swing.DefaultComboBoxModel(AnimeNames));
        Anime8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Anime8ActionPerformed(evt);
            }
        });

        Anime9.setModel(new javax.swing.DefaultComboBoxModel(AnimeNames));
        Anime9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Anime9ActionPerformed(evt);
            }
        });

        jLabel1.setText("Select Anime #1");

        jLabel11.setText("Select Anime #2");

        jLabel12.setText("Select Anime #3");

        jLabel13.setText("Select Anime #4");

        jLabel14.setText("Select Anime #5");

        jLabel15.setText("Select Anime #6");

        jLabel16.setText("Select Anime #7");

        jLabel17.setText("Select Anime #8");

        jLabel18.setText("Select Anime #9");

        jLabel19.setText("Select Anime #10");

        Anime10.setModel(new javax.swing.DefaultComboBoxModel(AnimeNames));
        Anime10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Anime10ActionPerformed(evt);
            }
        });

        Rating1.setModel(new javax.swing.DefaultComboBoxModel(Ratings);

            Rating2.setModel(new javax.swing.DefaultComboBoxModel(Ratings));

            Rating3.setModel(new javax.swing.DefaultComboBoxModel(Ratings));

            Rating4.setModel(new javax.swing.DefaultComboBoxModel(Ratings));

            Rating5.setModel(new javax.swing.DefaultComboBoxModel(Ratings));
            Rating5.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    Rating5ActionPerformed(evt);
                }
            });

            Rating6.setModel(new javax.swing.DefaultComboBoxModel(Ratings));

            Rating7.setModel(new javax.swing.DefaultComboBoxModel(Ratings));

            Rating8.setModel(new javax.swing.DefaultComboBoxModel(Ratings));

            Rating9.setModel(new javax.swing.DefaultComboBoxModel(Ratings));

            Rating10.setModel(new javax.swing.DefaultComboBoxModel(Ratings));

            jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
            jLabel2.setText("Anime No.");

            jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
            jLabel3.setText("Anime Name");

            jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
            jLabel4.setText("Rating");

            jButton1.setText("Recommend");
            jButton1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton1ActionPerformed(evt);
                }
            });

            jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
            jLabel5.setText("Anime Recommandations");

            jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            jLabel6.setText("Recommendations");

            RecWindow.setColumns(20);
            RecWindow.setRows(5);
            jScrollPane1.setViewportView(RecWindow);

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 277, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(151, 151, 151))
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(31, 31, 31)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel2))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Anime5, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Anime6, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Anime7, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Anime2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Anime3, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Anime4, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Anime8, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Anime9, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Anime10, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(26, 26, 26)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Rating2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Rating3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Rating4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Rating5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Rating6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Rating7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Rating8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Rating9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Rating10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Anime1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3))
                                    .addGap(26, 26, 26)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(Rating1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(205, 205, 205)
                            .addComponent(jButton1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(249, 249, 249)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(284, 284, 284)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jLabel5)
                    .addGap(44, 44, 44)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Anime1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1)
                                .addComponent(Rating1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Rating2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(Anime2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Rating3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Anime3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Rating4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Anime4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel13))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Rating5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Anime5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel14))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Rating6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Anime6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Rating7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Anime7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel16))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Rating8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel17)
                                .addComponent(Anime8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Rating9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Anime9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel18))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Rating10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Anime10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel19)))
                        .addComponent(jLabel12))
                    .addGap(18, 18, 18)
                    .addComponent(jButton1)
                    .addGap(26, 26, 26)
                    .addComponent(jLabel6)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(86, Short.MAX_VALUE))
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents

    private void Anime1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Anime1ActionPerformed
       

               
    }//GEN-LAST:event_Anime1ActionPerformed

    private void Anime5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Anime5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Anime5ActionPerformed

    private void Anime2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Anime2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Anime2ActionPerformed

    private void Anime3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Anime3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Anime3ActionPerformed

    private void Anime4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Anime4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Anime4ActionPerformed

    private void Anime6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Anime6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Anime6ActionPerformed

    private void Anime7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Anime7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Anime7ActionPerformed

    private void Anime8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Anime8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Anime8ActionPerformed

    private void Anime9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Anime9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Anime9ActionPerformed

    private void Anime10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Anime10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Anime10ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String [] Anime=new String[10];
        int [] Rating=new int[10];
        
        if(Rating1.getSelectedItem()!="Choose" && Anime1.getSelectedItem()!="Choose")
        {
          
            Rating[0]=Integer.valueOf((String)Rating1.getSelectedItem());
            Anime[0]=(String)Anime1.getSelectedItem();
            
        }    
        if(Anime2.getSelectedItem()!="Choose" && Rating2.getSelectedItem()!="Choose")
        {
          
            Rating[1]=Integer.valueOf((String)Rating2.getSelectedItem());
            Anime[1]=(String)Anime2.getSelectedItem();
            
        }    
        if(Anime3.getSelectedItem()!="Choose" && Rating3.getSelectedItem()!="Choose")
        {
          
            Rating[2]=Integer.valueOf((String)Rating3.getSelectedItem());
            Anime[2]=(String)Anime3.getSelectedItem();
            
        }   
        if(Anime4.getSelectedItem()!="Choose" && Rating4.getSelectedItem()!="Choose")
        {
          
            Rating[3]=Integer.valueOf((String)Rating4.getSelectedItem());
            Anime[3]=(String)Anime4.getSelectedItem();
            
        }   
        if(Anime5.getSelectedItem()!="Choose" && Rating5.getSelectedItem()!="Choose")
        {
          
            Rating[4]=Integer.valueOf((String)Rating5.getSelectedItem());
            Anime[4]=(String)Anime5.getSelectedItem();
            
        }   
        if(Anime6.getSelectedItem()!="Choose" && Rating6.getSelectedItem()!="Choose")
        {
          
            Rating[5]=Integer.valueOf((String)Rating6.getSelectedItem());
            Anime[5]=(String)Anime6.getSelectedItem();
            
        }   
        if(Anime7.getSelectedItem()!="Choose" && Rating7.getSelectedItem()!="Choose")
        {
          
            Rating[6]=Integer.valueOf((String)Rating7.getSelectedItem());
            Anime[6]=(String)Anime7.getSelectedItem();
            
        }   
        if(Anime8.getSelectedItem()!="Choose" && Rating8.getSelectedItem()!="Choose")
        {
          
            Rating[7]=Integer.valueOf((String)Rating3.getSelectedItem());
            Anime[7]=(String)Anime3.getSelectedItem();
            
        }   
        if(Anime9.getSelectedItem()!="Choose" && Rating9.getSelectedItem()!="Choose")
        {
          
            Rating[8]=Integer.valueOf((String)Rating9.getSelectedItem());
            Anime[8]=(String)Anime9.getSelectedItem();
            
        }   
        if(Anime10.getSelectedItem()!="Choose" && Rating10.getSelectedItem()!="Choose")
        {
          
            Rating[9]=Integer.valueOf((String)Rating10.getSelectedItem());
            Anime[9]=(String)Anime10.getSelectedItem();
            
        }   
        
        
        
        
        RecSystem Re=new RecSystem();
        float[] Scores=Re.EuclideanDistance(Vector, Rating, Anime);
        int[] SimilarUsers=Re.SimilarUsers(Scores);
        ArrayList<String> Recommendations=Re.Recommond(Vector, SimilarUsers,Anime);
       
        String Rec="";
        
        for(int i=0;i<Recommendations.size();i++)
        {
            
            Rec+=Recommendations.get(i);
            Rec+="\n";
            
        }
        
        RecWindow.setText(Rec);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Rating5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rating5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Rating5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App(AnimeNames,Vector).setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox Anime1;
    private javax.swing.JComboBox Anime10;
    private javax.swing.JComboBox Anime2;
    private javax.swing.JComboBox Anime3;
    private javax.swing.JComboBox Anime4;
    private javax.swing.JComboBox Anime5;
    private javax.swing.JComboBox Anime6;
    private javax.swing.JComboBox Anime7;
    private javax.swing.JComboBox Anime8;
    private javax.swing.JComboBox Anime9;
    private javax.swing.JComboBox Rating1;
    private javax.swing.JComboBox Rating10;
    private javax.swing.JComboBox Rating2;
    private javax.swing.JComboBox Rating3;
    private javax.swing.JComboBox Rating4;
    private javax.swing.JComboBox Rating5;
    private javax.swing.JComboBox Rating6;
    private javax.swing.JComboBox Rating7;
    private javax.swing.JComboBox Rating8;
    private javax.swing.JComboBox Rating9;
    private javax.swing.JTextArea RecWindow;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
