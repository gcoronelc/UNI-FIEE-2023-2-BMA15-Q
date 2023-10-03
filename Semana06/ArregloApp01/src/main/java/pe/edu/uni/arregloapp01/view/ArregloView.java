/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pe.edu.uni.arregloapp01.view;

import javax.swing.JTextField;
import pe.edu.uni.arregloapp01.service.ArregloService;

/**
 *
 * @author PROFESOR
 */
public class ArregloView extends javax.swing.JFrame {

	/**
	 * Creates new form ArregloView
	 */
	public ArregloView() {
		initComponents();
		this.setLocationRelativeTo(null);
	}

	/**
	 * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      jPanel1 = new javax.swing.JPanel();
      jLabel1 = new javax.swing.JLabel();
      txtTamanio = new javax.swing.JTextField();
      jPanel2 = new javax.swing.JPanel();
      btnProcesar = new javax.swing.JButton();
      btnLimpiar = new javax.swing.JButton();
      btnSalir = new javax.swing.JButton();
      jPanel3 = new javax.swing.JPanel();
      jLabel2 = new javax.swing.JLabel();
      txtArreglo = new javax.swing.JTextField();
      txtArregloSuma = new javax.swing.JTextField();
      jLabel3 = new javax.swing.JLabel();
      txtPares = new javax.swing.JTextField();
      txtParesSuma = new javax.swing.JTextField();
      jLabel4 = new javax.swing.JLabel();
      txtImpares = new javax.swing.JTextField();
      txtImparesSuma = new javax.swing.JTextField();
      jLabel5 = new javax.swing.JLabel();

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
      setTitle("APLICANDO ARREGLOS - PROYECTO 1");

      jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DATOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(0, 51, 255))); // NOI18N

      jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
      jLabel1.setText("Tamaño del arreglo:");

      txtTamanio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

      javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
      jPanel1.setLayout(jPanel1Layout);
      jPanel1Layout.setHorizontalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(15, 15, 15)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(txtTamanio, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(24, Short.MAX_VALUE))
      );
      jPanel1Layout.setVerticalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(34, 34, 34)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jLabel1)
               .addComponent(txtTamanio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(49, Short.MAX_VALUE))
      );

      jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ACCIONES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(0, 51, 255))); // NOI18N

      btnProcesar.setBackground(new java.awt.Color(153, 204, 255));
      btnProcesar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
      btnProcesar.setText("Procesar");
      btnProcesar.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnProcesarActionPerformed(evt);
         }
      });

      btnLimpiar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
      btnLimpiar.setText("Limpiar");

      btnSalir.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
      btnSalir.setText("Salir");

      javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
      jPanel2.setLayout(jPanel2Layout);
      jPanel2Layout.setHorizontalGroup(
         jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel2Layout.createSequentialGroup()
            .addGap(27, 27, 27)
            .addComponent(btnProcesar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(27, 27, 27)
            .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(27, 27, 27)
            .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );
      jPanel2Layout.setVerticalGroup(
         jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel2Layout.createSequentialGroup()
            .addGap(20, 20, 20)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(btnProcesar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(30, Short.MAX_VALUE))
      );

      jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "REPORTE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(0, 51, 255))); // NOI18N

      jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
      jLabel2.setText("Arreglo:");

      txtArreglo.setBackground(new java.awt.Color(204, 255, 204));
      txtArreglo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
      txtArreglo.setDisabledTextColor(new java.awt.Color(0, 51, 153));
      txtArreglo.setEnabled(false);

      txtArregloSuma.setBackground(new java.awt.Color(204, 204, 204));
      txtArregloSuma.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
      txtArregloSuma.setDisabledTextColor(new java.awt.Color(0, 51, 153));
      txtArregloSuma.setEnabled(false);

      jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
      jLabel3.setText("Pares:");

      txtPares.setBackground(new java.awt.Color(204, 255, 204));
      txtPares.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
      txtPares.setDisabledTextColor(new java.awt.Color(0, 51, 153));
      txtPares.setEnabled(false);

      txtParesSuma.setBackground(new java.awt.Color(204, 204, 204));
      txtParesSuma.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
      txtParesSuma.setDisabledTextColor(new java.awt.Color(0, 51, 153));
      txtParesSuma.setEnabled(false);

      jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
      jLabel4.setText("Impares:");

      txtImpares.setBackground(new java.awt.Color(204, 255, 204));
      txtImpares.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
      txtImpares.setDisabledTextColor(new java.awt.Color(0, 51, 153));
      txtImpares.setEnabled(false);

      txtImparesSuma.setBackground(new java.awt.Color(204, 204, 204));
      txtImparesSuma.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
      txtImparesSuma.setDisabledTextColor(new java.awt.Color(0, 51, 153));
      txtImparesSuma.setEnabled(false);

      jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
      jLabel5.setForeground(new java.awt.Color(102, 102, 102));
      jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      jLabel5.setText("Suma");

      javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
      jPanel3.setLayout(jPanel3Layout);
      jPanel3Layout.setHorizontalGroup(
         jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel3Layout.createSequentialGroup()
            .addGap(14, 14, 14)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel3Layout.createSequentialGroup()
                  .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(txtPares, javax.swing.GroupLayout.PREFERRED_SIZE, 667, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                  .addComponent(txtParesSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addGroup(jPanel3Layout.createSequentialGroup()
                  .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(txtImpares, javax.swing.GroupLayout.PREFERRED_SIZE, 667, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                  .addComponent(txtImparesSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addGroup(jPanel3Layout.createSequentialGroup()
                  .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(txtArreglo, javax.swing.GroupLayout.PREFERRED_SIZE, 667, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                  .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(txtArregloSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addContainerGap(17, Short.MAX_VALUE))
      );
      jPanel3Layout.setVerticalGroup(
         jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel3Layout.createSequentialGroup()
            .addGap(23, 23, 23)
            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(txtArreglo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(txtArregloSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(txtPares, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(txtParesSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(txtImpares, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(txtImparesSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(18, Short.MAX_VALUE))
      );

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                  .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
               .addGroup(layout.createSequentialGroup()
                  .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(0, 0, Short.MAX_VALUE)))
            .addContainerGap())
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())
      );

      pack();
   }// </editor-fold>//GEN-END:initComponents

   private void btnProcesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcesarActionPerformed
      // Dato
		int n = Integer.parseInt(txtTamanio.getText());
		// Proceso
		ArregloService service = new ArregloService(n);
		int[] arreglo = service.getArreglo();
		int[] arregloPares = service.obtenerArregloPares();
		int[] arregloImpares = service.obtenerArregloImpares();
		int sumaArreglo = service.sumaArreglo();
		int sumaPares = service.sumaPares();
		int sumaImpares = service.sumaImpares();
		// Reporte
		pintarArreglo(arreglo,txtArreglo);
		pintarArreglo(arregloPares,txtPares);
		pintarArreglo(arregloImpares,txtImpares);
		txtArregloSuma.setText("" + sumaArreglo);
		txtParesSuma.setText("" + sumaPares);
		txtImparesSuma.setText("" + sumaImpares);
   }//GEN-LAST:event_btnProcesarActionPerformed

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
			java.util.logging.Logger.getLogger(ArregloView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(ArregloView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(ArregloView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(ArregloView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new ArregloView().setVisible(true);
			}
		});
	}

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JButton btnLimpiar;
   private javax.swing.JButton btnProcesar;
   private javax.swing.JButton btnSalir;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel2;
   private javax.swing.JLabel jLabel3;
   private javax.swing.JLabel jLabel4;
   private javax.swing.JLabel jLabel5;
   private javax.swing.JPanel jPanel1;
   private javax.swing.JPanel jPanel2;
   private javax.swing.JPanel jPanel3;
   private javax.swing.JTextField txtArreglo;
   private javax.swing.JTextField txtArregloSuma;
   private javax.swing.JTextField txtImpares;
   private javax.swing.JTextField txtImparesSuma;
   private javax.swing.JTextField txtPares;
   private javax.swing.JTextField txtParesSuma;
   private javax.swing.JTextField txtTamanio;
   // End of variables declaration//GEN-END:variables

	private void pintarArreglo(int[] arreglo, JTextField caja) {
		String cadena = "";
		for (int dato : arreglo) {
			cadena += dato + ",";
		}
		caja.setText(cadena);
	}
}
