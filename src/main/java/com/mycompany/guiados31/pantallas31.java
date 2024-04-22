
package com.mycompany.guiados31;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


public class pantallas31 extends javax.swing.JFrame {
BotonContador btnBotonA;
BotonContador btnBotonB;
BotonContador btnIniciar;
    public pantallas31() {
        initComponents();
        CreacionVentana();
    }
    
    public void CreacionVentana(){
        
    this.setTitle("Ejercicio de Herencia");
    this.setSize(250,300);
    
    btnBotonA=new BotonContador();
    btnBotonA.setText("Boton A");
    btnBotonA.setBounds(10,10,100,30);
    this.getContentPane().add(btnBotonA);
    
    btnBotonB=new BotonContador();
    btnBotonB.setText("Boton B");
    btnBotonB.setBounds(130,10,100,30);
    this.getContentPane().add(btnBotonB);
    
    btnIniciar=new BotonContador();
    btnIniciar.setText("Iniciar");
    btnIniciar.setBounds(150,180,100,30);
    this.getContentPane().add(btnIniciar);
    
    btnBotonA.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent evt){
            PulsacionBotonA(evt);
        }
    });
    
     btnBotonB.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent evt){
            PulsacionBotonB(evt);
        }
    });
     
        btnIniciar.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent evt){
            PulsacionIniciar(evt);
        }
    });
    }
    public void PulsacionBotonA(ActionEvent evt){
      btnBotonA.incrementa();
    }
    public void PulsacionBotonB(ActionEvent evt){
      btnBotonB.incrementa(); 
    }
     public void PulsacionIniciar(ActionEvent evt){
      btnIniciar.incrementa(); 
    }

 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnPulsaciones = new javax.swing.JButton();
        btnReiniciar = new javax.swing.JButton();
        datobtn = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnPulsaciones.setText("Ver pulsaciones");
        btnPulsaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPulsacionesActionPerformed(evt);
            }
        });

        btnReiniciar.setText("Reiniciar");
        btnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarActionPerformed(evt);
            }
        });

        datobtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnPulsaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnReiniciar))
                    .addComponent(datobtn, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(178, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPulsaciones)
                    .addComponent(btnReiniciar))
                .addGap(26, 26, 26)
                .addComponent(datobtn, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(93, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPulsacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPulsacionesActionPerformed
      String info;
      info="El boton A se ha pulsado"+btnBotonA.getPulsaciones()+"\n";
      info=info +"El boton B se ha pulsado"+btnBotonB.getPulsaciones()+"\n";
      info=info +"El boton C se ha pulsado"+btnIniciar.getPulsaciones()+"\n";
      JOptionPane.showMessageDialog(null, info);
    }//GEN-LAST:event_btnPulsacionesActionPerformed

    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarActionPerformed
     btnBotonA.reiniciar();
     btnBotonB.reiniciar();
     btnIniciar.reiniciar();
    }//GEN-LAST:event_btnReiniciarActionPerformed
 private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {  
 }  

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pantallas31().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPulsaciones;
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JTextField datobtn;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
