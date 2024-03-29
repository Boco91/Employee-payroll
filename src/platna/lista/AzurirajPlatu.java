/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package platna.lista;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class AzurirajPlatu extends javax.swing.JFrame {
    Connection conn=null;
    ResultSet rs=null;
    PreparedStatement pst=null;


    /**
     * Creates new form AzurirajPlatu
     */
    public AzurirajPlatu() {
        initComponents();
        conn=db.java_db();
        Toolkit toolkit = getToolkit();
         Dimension size = toolkit.getScreenSize();
         setLocation(size.width/2 - getWidth()/2, 
         size.height/2 - getHeight()/2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txt_trazi = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_rdkid = new javax.swing.JTextField();
        txt_ime = new javax.swing.JTextField();
        txt_prezime = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_odjeljenje = new javax.swing.JTextField();
        txt_radnom = new javax.swing.JTextField();
        txt_oplata = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        r_procent = new javax.swing.JRadioButton();
        r_iznos = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        txt_d1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_d2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Radnik ID:");

        txt_trazi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_traziActionPerformed(evt);
            }
        });
        txt_trazi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_traziKeyReleased(evt);
            }
        });

        jLabel2.setText("Radnik Id:");

        jLabel3.setText("Ime:");

        jLabel4.setText("Prezime:");

        txt_rdkid.setEditable(false);

        txt_ime.setEditable(false);
        txt_ime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_imeActionPerformed(evt);
            }
        });

        txt_prezime.setEditable(false);
        txt_prezime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_prezimeActionPerformed(evt);
            }
        });

        jLabel5.setText("Odjeljenje:");

        jLabel6.setText("Radno mjesto:");

        jLabel7.setText("Osnovna plata:");

        txt_odjeljenje.setEditable(false);

        txt_radnom.setEditable(false);

        txt_oplata.setEditable(false);

        jLabel8.setText("Azuriraj platu sa:");

        r_procent.setText("Procentom%");
        r_procent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_procentActionPerformed(evt);
            }
        });

        r_iznos.setText("Iznosom");
        r_iznos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_iznosActionPerformed(evt);
            }
        });

        jLabel9.setText("Procent:");

        txt_d1.setEditable(false);

        jLabel10.setText("Iznos:");

        txt_d2.setEditable(false);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("Azuriraj");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("NAZAD");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txt_trazi, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_rdkid)
                                    .addComponent(txt_ime)
                                    .addComponent(txt_prezime))))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(txt_oplata))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_odjeljenje)
                                    .addComponent(txt_radnom, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(r_procent)
                                .addGap(18, 18, 18)
                                .addComponent(r_iznos))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_d1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(txt_d2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE))))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_trazi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txt_rdkid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addComponent(txt_odjeljenje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(txt_ime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)
                                    .addComponent(txt_radnom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(txt_prezime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)
                                    .addComponent(txt_oplata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(53, 53, 53)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(r_procent)
                                    .addComponent(r_iznos))
                                .addGap(33, 33, 33))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txt_d1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(txt_d2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(43, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(28, 28, 28))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_imeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_imeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_imeActionPerformed

    private void txt_prezimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_prezimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_prezimeActionPerformed

    private void txt_traziKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_traziKeyReleased

        try{

            String sql ="select * from Zaposlenik where id=? ";

            pst=conn.prepareStatement(sql);
            pst.setString(1,txt_trazi.getText());
            rs=pst.executeQuery();
            
               String add1 =rs.getString("Id");
                txt_rdkid.setText(add1);

                String add2 =rs.getString("Ime");
                txt_ime.setText(add2);

                String add3 =rs.getString("Prezime");
                txt_prezime.setText(add3);

                String add4 =rs.getString("Odjeljenje");
                txt_odjeljenje.setText(add4);

                String add5 =rs.getString("Radnom");
                txt_radnom.setText(add5);

                String add8 =rs.getString("Osnovnap");
                txt_oplata.setText(add8);
            
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            
        }finally{
            try{
                
                rs.close();
                pst.close();

                
            }catch(Exception e){
                
            }
        }
            



    }//GEN-LAST:event_txt_traziKeyReleased

    private void txt_traziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_traziActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_traziActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try{
               int salary = Integer.parseInt(txt_oplata.getText());
          
       if(r_procent.isSelected()== true){
       int getPercentage = Integer.parseInt(txt_d1.getText());
       int calcPercentage = salary /100 * getPercentage + salary;
       String xP = String.valueOf(calcPercentage);
       txt_oplata.setText(xP);
       }
       
       else if(r_iznos.isSelected()==true){
       int getAmt = Integer.parseInt(txt_d2.getText());
       int calcAmount = salary + getAmt;
       String xA = String.valueOf(calcAmount);
       txt_oplata.setText(xA);
       }

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        try{
            
            String value1 = txt_rdkid.getText();
            String value2 = txt_oplata.getText();
            
            String sql= "update Zaposlenik set id='"+value1+"',Osnovnap='"+value2+"' where Id='"+value1+"'";
            pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Uspjesno azurirano");


            
            
            
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        finally {

                try{
                    rs.close();
                    pst.close();

                }
                catch(Exception e){

                }








    }//GEN-LAST:event_jButton1ActionPerformed
    }
    private void r_iznosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_iznosActionPerformed
     
        r_iznos.setSelected(true);
        r_procent.setSelected(false);
        txt_d1.setEnabled(false);
        txt_d2.setEditable(true);
        txt_d2.setEnabled(true);
        txt_d1.setText("");




    }//GEN-LAST:event_r_iznosActionPerformed

    private void r_procentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_procentActionPerformed
        
        r_procent.setSelected(true);
        r_iznos.setSelected(false);
        txt_d2.setEnabled(false);
        txt_d1.setEditable(true);
        txt_d1.setEnabled(true);
        txt_d2.setText("");
        
        
        
        
        
    }//GEN-LAST:event_r_procentActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         setVisible(false);
        GlavniMeni go = new GlavniMeni();
        go.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(AzurirajPlatu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AzurirajPlatu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AzurirajPlatu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AzurirajPlatu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AzurirajPlatu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton r_iznos;
    private javax.swing.JRadioButton r_procent;
    private javax.swing.JTextField txt_d1;
    private javax.swing.JTextField txt_d2;
    private javax.swing.JTextField txt_ime;
    private javax.swing.JTextField txt_odjeljenje;
    private javax.swing.JTextField txt_oplata;
    private javax.swing.JTextField txt_prezime;
    private javax.swing.JTextField txt_radnom;
    private javax.swing.JTextField txt_rdkid;
    private javax.swing.JTextField txt_trazi;
    // End of variables declaration//GEN-END:variables
}
