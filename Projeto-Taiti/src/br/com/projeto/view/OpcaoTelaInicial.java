/*
 * To chang
    @Override
    public int getWidth(ImageObserver observer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getHeight(ImageObserver observer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ImageProducer getSource() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Graphics getGraphics() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getProperty(String name, ImageObserver observer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
e this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.view;

import java.awt.Color;
import java.util.TimerTask;
import javax.swing.UIManager;

/**
 *
 * @author Daylton
 */
public class OpcaoTelaInicial extends javax.swing.JFrame {

    /**
     * Creates new form OpcaoTelaInicial
     */
    
    public static final long TEMPO = (1000* 1);
    int i = 0;
    TimerTask tarefa;
    
    public OpcaoTelaInicial() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setSize(565, 350);
       
        pgLoading.setMaximum(100);    
        pgLoading.setMinimum(0);
        
        java.util.Timer timer = null;  
        if (timer == null) {  
            timer = new java.util.Timer();  
            tarefa = new TimerTask() {  
                public void run() {  
                    try {                        
                        if(i <= 100){                            
                            System.out.println(soma());
                            pgLoading.setValue(soma());    
                            pgLoading.isIndeterminate();                            
                        }else{
                            fechar();
                            tarefa.cancel();
                        }
                        
                    } catch (Exception e) {  
                        e.printStackTrace();  
                    }  
                }  
            };  
            timer.scheduleAtFixedRate(tarefa, TEMPO, TEMPO);  
        } 
        this.dispose();
    }
    
    public int soma(){
        return this.i = i + 10;        
    }
    
    public void fechar(){
        this.dispose();
        TelaPrincipal form1 = new TelaPrincipal();
        form1.setAlwaysOnTop(true);
        form1.setVisible(true);
        form1.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pgLoading = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(pgLoading);
        pgLoading.setBounds(10, 280, 530, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/projeto/image/Tela_Beta1.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 550, 310);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(OpcaoTelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OpcaoTelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OpcaoTelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OpcaoTelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OpcaoTelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JProgressBar pgLoading;
    // End of variables declaration//GEN-END:variables
}
