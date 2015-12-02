
package co.calcutronica.gui;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;

public class VentanaCalculos extends javax.swing.JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public VentanaCalculos() {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        BotonOHM = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        BotonResistencia = new javax.swing.JButton();
        BotonCalculos = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuInicio = new javax.swing.JMenu();
        Cerrar = new javax.swing.JMenuItem();
       

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Ventana 2 "); // NOI18N
        setResizable(false);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 204));
        jLabel3.setText("Calculadora");

        BotonOHM.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        BotonOHM.setForeground(new java.awt.Color(0, 102, 102));
        BotonOHM.setText("Calculos OHM");
        BotonOHM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HandlerCalculos(evt);
            }
        });
        BotonOHM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonOHMActionPerformed(evt);
            }
        });

        jLabel1.setText("Versión 1.0");

        BotonResistencia.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        BotonResistencia.setForeground(new java.awt.Color(0, 102, 102));
        BotonResistencia.setText("Valor de Resistencia");
        BotonResistencia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HandlerResistor(evt);
            }
        });
        BotonResistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonResistenciaActionPerformed(evt);
            }
        });

        BotonCalculos.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        BotonCalculos.setForeground(new java.awt.Color(0, 102, 102));
        BotonCalculos.setText("Calculos Resistencias");
        BotonCalculos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HandlerResistencias(evt);
            }
        });
        BotonCalculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCalculosActionPerformed(evt);
            }
        });

        jButton2.setText("Atrás");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HandlerAtras(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BotonCalculos, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonResistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonOHM, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 55, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(54, 54, 54))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addGap(28, 28, 28)
                .addComponent(BotonOHM, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotonResistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotonCalculos, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton2)))
        );

        MenuInicio.setText("Inicio");

        Cerrar.setText("Cerrar");
        Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarActionPerformed(evt);
            }
        });
        MenuInicio.add(Cerrar);

        jMenuBar1.add(MenuInicio);

         setJMenuBar(jMenuBar1);

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

    protected void CerrarActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
    	System.exit(0);
	}


	private void BotonOHMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonOHMActionPerformed
        
    }//GEN-LAST:event_BotonOHMActionPerformed


    private void HandlerAtras(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HandlerAtras
        Ventana abrir = new Ventana();
        abrir.setVisible(true);
        this.setVisible(false);     
    }//GEN-LAST:event_HandlerAtras

    private void HandlerResistor(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HandlerResistor
        VentanaResistor abrir = new VentanaResistor();
        abrir.setVisible(true);
        this.setVisible(false);     
    }//GEN-LAST:event_HandlerResistor

    private void HandlerCalculos(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HandlerCalculos
        VentanaOhm abrir = new VentanaOhm();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_HandlerCalculos

    private void HandlerResistencias(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HandlerResistencias
        VentanaResistencias abrir = new VentanaResistencias();
        abrir.setVisible(true);
        this.setVisible(false);  
    }//GEN-LAST:event_HandlerResistencias

  

    private void BotonResistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonResistenciaActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_BotonResistenciaActionPerformed

    private void BotonCalculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCalculosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonCalculosActionPerformed

  
    // Variables declaration - do not modify//GEN-BEGIN:variables
   
    private javax.swing.JButton BotonCalculos;
    private javax.swing.JButton BotonOHM;
    private javax.swing.JButton BotonResistencia;
    private javax.swing.JMenuItem Cerrar;
    private javax.swing.JMenu MenuInicio;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
