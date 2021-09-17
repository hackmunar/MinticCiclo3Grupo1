package Vista;

import Controlador.Controlador;
import Modelo.Producto;
import static Vista.Vista.jTableListadoProductos;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gioavna
 */
public class Vista extends javax.swing.JFrame {

    private Controlador objController;
    public DefaultTableModel modelData;

    public Vista() {
        initComponents();
        objController = new Controlador();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTPConsultar = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabelRMombre = new javax.swing.JLabel();
        jLabelRCantidad = new javax.swing.JLabel();
        jLabelRPrecio = new javax.swing.JLabel();
        jLabelRCategoria = new javax.swing.JLabel();
        jTFRegistrarNombre = new javax.swing.JTextField();
        jTFRegistrarCantidad = new javax.swing.JTextField();
        jTFRegistrarPrecio = new javax.swing.JTextField();
        jCBRegistrarCategoria = new javax.swing.JComboBox<>();
        jButtonRegistrarProducto = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableListadoProductos = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTConsulId = new javax.swing.JTextField();
        jTConsultarNombre = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTConsulCantidad = new javax.swing.JTextField();
        jTConsulPrecio = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jCBConsultarCategoria = new javax.swing.JComboBox<>();
        jBEliminar = new javax.swing.JButton();
        jBConsultarProductos = new javax.swing.JButton();
        jActualizar = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelRMombre.setText("Nombre");

        jLabelRCantidad.setText("Cantidad");

        jLabelRPrecio.setText("Precio");

        jLabelRCategoria.setText("Categoria");

        jTFRegistrarCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFRegistrarCantidadKeyTyped(evt);
            }
        });

        jTFRegistrarPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFRegistrarPrecioKeyTyped(evt);
            }
        });

        jCBRegistrarCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ASEO", "VIVERES" }));

        jButtonRegistrarProducto.setText("Guardar");
        jButtonRegistrarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarProductoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelRCategoria)
                    .addComponent(jLabelRPrecio)
                    .addComponent(jLabelRCantidad)
                    .addComponent(jLabelRMombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFRegistrarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButtonRegistrarProducto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                        .addComponent(jCBRegistrarCategoria, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTFRegistrarPrecio, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTFRegistrarCantidad, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(505, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelRMombre)
                    .addComponent(jTFRegistrarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelRCantidad)
                    .addComponent(jTFRegistrarCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelRPrecio)
                    .addComponent(jTFRegistrarPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelRCategoria)
                    .addComponent(jCBRegistrarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jButtonRegistrarProducto)
                .addContainerGap(292, Short.MAX_VALUE))
        );

        jTPConsultar.addTab("Registrar", jPanel1);

        jTableListadoProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableListadoProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableListadoProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableListadoProductos);

        jLabel5.setText("Id");

        jLabel6.setText("Nombre");

        jLabel7.setText("Cantidad");

        jLabel8.setText("Precio");

        jLabel9.setText("Categoria");

        jCBConsultarCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ASEO", "VIVERES" }));

        jBEliminar.setText("Eliminar");
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });

        jBConsultarProductos.setText("Consultar");
        jBConsultarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConsultarProductosActionPerformed(evt);
            }
        });

        jActualizar.setText("Actualizar");
        jActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 832, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jTConsulId, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(331, 331, 331)
                        .addComponent(jBEliminar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(26, 26, 26)
                        .addComponent(jTConsultarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jBConsultarProductos))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(4, 4, 4))
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jCBConsultarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTConsulPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTConsulCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(244, 244, 244)
                        .addComponent(jActualizar))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel5))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTConsulId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBEliminar))))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel6))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jTConsultarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jBConsultarProductos))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jActualizar)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jTConsulCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTConsulPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))))
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jCBConsultarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(99, 99, 99))
        );

        jTPConsultar.addTab("Consultar", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTPConsultar)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTPConsultar)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRegistrarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarProductoActionPerformed
        try {
            this.objController.insertProcto(
                    jTFRegistrarNombre.getText(),
                    jTFRegistrarCantidad.getText(),
                    String.valueOf(jCBRegistrarCategoria.getSelectedItem()),
                    jTFRegistrarPrecio.getText()
            );
            jTFRegistrarNombre.setText("");
            jTFRegistrarCantidad.setText("");
            jTFRegistrarPrecio.setText("");
            JOptionPane.showMessageDialog(null, "Registro realizado con éxito");
            this.jBConsultarProductosActionPerformed(evt);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jButtonRegistrarProductoActionPerformed

    private void jBConsultarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConsultarProductosActionPerformed
        try {
            String[] titulosCabecera = {"Id", "Nombre", "Categoria", "Cantidad", "Precio"};
            this.modelData = new DefaultTableModel(null, titulosCabecera);
            jTableListadoProductos.setModel(this.modelData);

            Producto objProducto = new Producto();
            List<Producto> listProd = objProducto.obtenerListadoProductos();
            for (Producto value : listProd) {
                Object[] productos = {
                    value.getId(), value.getNombre(), value.getCategoria(), value.getCantidad(), value.getPrecio()
                };
                modelData.addRow(productos);
            }
            this.limpiarCampos();
        } catch (Exception ex) {
            System.out.println(ex);
        }

    }//GEN-LAST:event_jBConsultarProductosActionPerformed

    private void jTableListadoProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableListadoProductosMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 1) {
            try {

                String id = jTableListadoProductos.getValueAt(jTableListadoProductos.getSelectedRow(), 0).toString();
                String nombre = jTableListadoProductos.getValueAt(jTableListadoProductos.getSelectedRow(), 1).toString();
                String cantidad = jTableListadoProductos.getValueAt(jTableListadoProductos.getSelectedRow(), 3).toString();
                String precio = jTableListadoProductos.getValueAt(jTableListadoProductos.getSelectedRow(), 4).toString();
                String categoria = jTableListadoProductos.getModel().getValueAt(jTableListadoProductos.getSelectedRow(), 2).toString();

                jTConsulId.setText(id);
                jTConsultarNombre.setText(nombre);
                jTConsulCantidad.setText(cantidad);
                jTConsulPrecio.setText(precio);
                jCBConsultarCategoria.setSelectedItem(categoria);

            } catch (Exception ex) {
                System.out.println(ex);
            }

        }
    }//GEN-LAST:event_jTableListadoProductosMouseClicked

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed
        try {
            boolean result = this.objController.eliminarProducto(jTConsulId.getText());
            if (result) {
                this.limpiarCampos();
                this.jBConsultarProductosActionPerformed(evt);
                JOptionPane.showMessageDialog(null, "Registro elimina con éxito");
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }

    }//GEN-LAST:event_jBEliminarActionPerformed

    private void jActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jActualizarActionPerformed
        try {
            boolean result = this.objController.actualizarProducto(
                    jTConsulId.getText(),
                    jTConsultarNombre.getText(),
                    jTConsulCantidad.getText(),
                    jTConsulPrecio.getText(),
                    String.valueOf(jCBConsultarCategoria.getSelectedItem())
            );
            if (result) {
                this.limpiarCampos();
                this.jBConsultarProductosActionPerformed(evt);
                JOptionPane.showMessageDialog(null, "Registro actualizado con éxito");
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jActualizarActionPerformed

    private void jTFRegistrarCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFRegistrarCantidadKeyTyped
        //Validar que la entrada solo sean numero enteros
        char textValidar = evt.getKeyChar();
        if ((textValidar < '0' || textValidar > '9'))
            evt.consume();
    }//GEN-LAST:event_jTFRegistrarCantidadKeyTyped

    private void jTFRegistrarPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFRegistrarPrecioKeyTyped
        //Validar que la entrada solo sean numero decimales
        char textValidar = evt.getKeyChar();
        if ((textValidar < '0' || textValidar > '9') && textValidar < '.')
            evt.consume();
    }//GEN-LAST:event_jTFRegistrarPrecioKeyTyped

    private void limpiarCampos() {
        jTConsulId.setText("");
        jTConsultarNombre.setText("");
        jTConsulCantidad.setText("");
        jTConsulPrecio.setText("");
        jCBConsultarCategoria.setSelectedItem("ASEO");
    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jActualizar;
    public javax.swing.JButton jBConsultarProductos;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jButtonRegistrarProducto;
    public javax.swing.JComboBox<String> jCBConsultarCategoria;
    public javax.swing.JComboBox<String> jCBRegistrarCategoria;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelRCantidad;
    private javax.swing.JLabel jLabelRCategoria;
    private javax.swing.JLabel jLabelRMombre;
    private javax.swing.JLabel jLabelRPrecio;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTextField jTConsulCantidad;
    public static javax.swing.JTextField jTConsulId;
    public javax.swing.JTextField jTConsulPrecio;
    public static javax.swing.JTextField jTConsultarNombre;
    public javax.swing.JTextField jTFRegistrarCantidad;
    public javax.swing.JTextField jTFRegistrarNombre;
    public javax.swing.JTextField jTFRegistrarPrecio;
    public javax.swing.JTabbedPane jTPConsultar;
    public static javax.swing.JTable jTableListadoProductos;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    public void setModel(DefaultTableModel modelData) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
