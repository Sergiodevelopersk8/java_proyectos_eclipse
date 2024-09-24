/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Aplicacion_sistema_gui;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.*;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import sistema.datos.BaseDatos;
import sistema.pojos.Producto;

/**
 *
 * @author Draw
 */
public class InventariosFrame extends javax.swing.JInternalFrame {

  DefaultTableModel modeloTabla = new DefaultTableModel();
  BaseDatos base = new BaseDatos();
  Producto productoSeleccionado = null;
    public InventariosFrame() {
        initComponents();
        cargarColumnasTabla();
        cargarModeloTable();
    }

    private void cargarColumnasTabla(){
      modeloTabla.addColumn("clave");
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Unidad");
        modeloTabla.addColumn("Precio Compra");
        modeloTabla.addColumn("Precio Venta");
        modeloTabla.addColumn("Existencias");
    
    }
    
    //carga el modelo de la tabla de inventario
    public void cargarModeloTable(){
        
      
        
        ArrayList<Producto> listaProductos =  base.ObtenerProductos();
    
        int numeroProductos = listaProductos.size();
        modeloTabla.setNumRows(numeroProductos);
        
        for(int i = 0; i < numeroProductos; i++){
        
            Producto producto = listaProductos.get(i);
            String clave = producto.getIdProducto();
            String nombre = producto.getNomProducto();
            String unidad = producto.getUnidadProducto();
            Double precioCompra = producto.getPrecioCompraProducto();
            Double precioVenta = producto.getPrecioVentaProducto();
            Double existencias = producto.getExistenciasProducto();
            
            modeloTabla.setValueAt(producto,i,0);
            modeloTabla.setValueAt(nombre,i,1);
            modeloTabla.setValueAt(unidad,i,2);
            modeloTabla.setValueAt(precioCompra,i,3);
            modeloTabla.setValueAt(precioVenta,i,4);
            modeloTabla.setValueAt(existencias,i,5);
            
        
        }
        
        
        
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnNuevoArticulo = new javax.swing.JButton();
        btnCategoria = new javax.swing.JButton();
        btnProveedor = new javax.swing.JButton();
        campoClave = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        campoNombre = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        lblImagen = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        campoExistencia = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        campoAgregarEXISTENCIA = new javax.swing.JTextField();
        btnagregarExistencia = new javax.swing.JButton();
        btnModificarProd = new javax.swing.JButton();
        btnBorrarProd = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        campoBuscar = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        tablaProductos.getSelectionModel().addListSelectionListener(

            new ListSelectionListener(){
                public void valueChanged(ListSelectionEvent event){

                    if(!event.getValueIsAdjusting() && (tablaProductos.getSelectedRow()>= 0)){
                        int filaSeleccionada = tablaProductos.getSelectedRow();
                        Producto producto = (Producto)modeloTabla.getValueAt(filaSeleccionada, 1);
                        campoNombre.setText(producto.getNomProducto());
                        campoClave.setText(producto.getIdProducto());
                        String existencias = String.valueOf(producto.getExistenciasProducto());
                        campoExistencia.setText(existencias);
                        productoSeleccionado = producto;
                    }

                }        
            }

        );

        setTitle("Inventarios");
        getContentPane().setLayout(null);

        btnNuevoArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoArticuloActionPerformed(evt);
            }
        });
        getContentPane().add(btnNuevoArticulo);
        btnNuevoArticulo.setBounds(6, 6, 106, 85);

        btnCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoriaActionPerformed(evt);
            }
        });
        getContentPane().add(btnCategoria);
        btnCategoria.setBounds(166, 6, 104, 85);

        btnProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProveedorActionPerformed(evt);
            }
        });
        getContentPane().add(btnProveedor);
        btnProveedor.setBounds(343, 6, 104, 85);
        getContentPane().add(campoClave);
        campoClave.setBounds(42, 178, 140, 31);

        jLabel1.setText("Inventarios:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(42, 122, 61, 16);

        jLabel2.setText("Clave:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(48, 150, 32, 16);

        jLabel3.setText("Nombre:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(263, 150, 47, 16);

        campoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNombreActionPerformed(evt);
            }
        });
        getContentPane().add(campoNombre);
        campoNombre.setBounds(255, 178, 172, 31);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(718, 227, 50, 44);
        getContentPane().add(lblImagen);
        lblImagen.setBounds(494, 119, 218, 124);

        jLabel4.setText("Existencia");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(42, 227, 69, 16);
        getContentPane().add(campoExistencia);
        campoExistencia.setBounds(42, 249, 140, 30);

        jLabel5.setText("Ingresar al Inventario:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(250, 220, 113, 16);
        getContentPane().add(campoAgregarEXISTENCIA);
        campoAgregarEXISTENCIA.setBounds(250, 250, 133, 32);

        btnagregarExistencia.setText("Agregar");
        btnagregarExistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarExistenciaActionPerformed(evt);
            }
        });
        getContentPane().add(btnagregarExistencia);
        btnagregarExistencia.setBounds(410, 252, 72, 30);

        btnModificarProd.setText("Modificar");
        btnModificarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarProdActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificarProd);
        btnModificarProd.setBounds(600, 370, 88, 86);

        btnBorrarProd.setText("Borrar");
        btnBorrarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarProdActionPerformed(evt);
            }
        });
        getContentPane().add(btnBorrarProd);
        btnBorrarProd.setBounds(600, 470, 88, 82);

        jLabel6.setText("Buscar:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(40, 290, 38, 16);

        campoBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoBuscarActionPerformed(evt);
            }
        });
        campoBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campoBuscarKeyReleased(evt);
            }
        });
        getContentPane().add(campoBuscar);
        campoBuscar.setBounds(40, 330, 178, 30);

        jScrollPane3.setViewportView(jScrollPane2);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(24, 939, 4, 4);

        jToggleButton1.setText("jToggleButton1");
        getContentPane().add(jToggleButton1);
        jToggleButton1.setBounds(0, 0, 0, 0);

        jToggleButton2.setText("jToggleButton2");
        getContentPane().add(jToggleButton2);
        jToggleButton2.setBounds(0, 0, 0, 0);

        tablaProductos.setModel(modeloTabla);
        jScrollPane4.setViewportView(tablaProductos);

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(20, 370, 560, 402);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNombreActionPerformed

    private void btnNuevoArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoArticuloActionPerformed
        ProductoFrame articulo = new ProductoFrame(null,true, null, null, "Nuevo producto", false);
        articulo.setVisible(true);
        articulo.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        articulo.setLocation(600,150);
        articulo.setAlwaysOnTop(true);
    }//GEN-LAST:event_btnNuevoArticuloActionPerformed

    private void btnCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoriaActionPerformed
       CategoriaFrame categoria = new CategoriaFrame(null,true);
        categoria.setVisible(true);
        categoria.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        categoria.setLocation(600,150);
        categoria.setAlwaysOnTop(true);
    }//GEN-LAST:event_btnCategoriaActionPerformed

    private void btnProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProveedorActionPerformed
        ProveedorFrame proveedor = new ProveedorFrame(null,true);
        proveedor.setVisible(true);
        proveedor.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        proveedor.setLocation(600,150);
        proveedor.setAlwaysOnTop(true);
    }//GEN-LAST:event_btnProveedorActionPerformed

    private void btnagregarExistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarExistenciaActionPerformed
        
        double existencia = Double.parseDouble(campoAgregarEXISTENCIA.getText());
        System.out.println("existencia " + existencia);
        double cantidadActual = productoSeleccionado.getExistenciasProducto();
        double nuevaCantidad = cantidadActual + existencia;
        System.out.println("nueva cantidad  " + nuevaCantidad);
        base.actualizarInventario(productoSeleccionado, nuevaCantidad);
        
        cargarModeloTable();
        
        
        
        
    }//GEN-LAST:event_btnagregarExistenciaActionPerformed

    private void campoBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoBuscarKeyReleased
        limpiarTabla();
        
        String cadenaBusqueda = campoBuscar.getText();
        ArrayList<Producto> listaProductos = base.obtenerProductosPorCriterio(cadenaBusqueda);
        
        int numeroProductos = listaProductos.size();
        modeloTabla.setNumRows(numeroProductos);
        for(int i = 0; i < numeroProductos; i++){
        
            Producto producto = listaProductos.get(i);
            String clave = producto.getIdProducto();
            String nombre = producto.getNomProducto();
            String unidad = producto.getUnidadProducto();
            Double precioCompra = producto.getPrecioCompraProducto();
            Double precioVenta = producto.getPrecioVentaProducto();
            Double existencia = producto.getExistenciasProducto();
            
            modeloTabla.setValueAt(clave, i, 0);
            modeloTabla.setValueAt(producto, i, 1);
            modeloTabla.setValueAt(unidad, i, 2);
            modeloTabla.setValueAt(precioCompra, i, 3);
            modeloTabla.setValueAt(precioVenta, i, 4);
            modeloTabla.setValueAt(existencia, i, 5);
        
        
        
        }
        
        
        
        
    }//GEN-LAST:event_campoBuscarKeyReleased

    private void btnModificarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarProdActionPerformed

        String nombreProducto = productoSeleccionado.getNomProducto();
        ImageIcon imagenProducto = null;
        ProductoFrame frameProd = null;
        int opcion = JOptionPane.showConfirmDialog(this,"¿Estas seguro de modificar el articulo " + nombreProducto + " ?");
         if(opcion == 0){
        try{
        
        InputStream is = base.buscarFoto(productoSeleccionado);
        BufferedImage bi = ImageIO.read(is);
        imagenProducto = new ImageIcon(bi);
        
        
      frameProd = new ProductoFrame(null,true, productoSeleccionado, imagenProducto, "Actualizar producto", true);
      frameProd.setVisible(true);  
        if(frameProd != null){
        JOptionPane.showMessageDialog(this,"estoy en la linea 353");
            if(frameProd.getInformacion()!= " "){
            cargarModeloTable();
        JOptionPane.showMessageDialog(this,"estoy en la linea 356");
            
            }
        
        }
        }
        
        
        catch(IOException ex){
        ex.printStackTrace();
        
        }
        }
        

        
    }//GEN-LAST:event_btnModificarProdActionPerformed

    private void btnBorrarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarProdActionPerformed
        int opcion = JOptionPane.showConfirmDialog(this, "¿Estas seguro de borara el producto?");
        
        if(opcion == 0){
        
        modeloTabla.removeRow(tablaProductos.getSelectedRow());

        base.borrarProducto(productoSeleccionado);



        
        }
        
        
    }//GEN-LAST:event_btnBorrarProdActionPerformed

    private void campoBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoBuscarActionPerformed

    
    public void limpiarTabla(){
    
        int numFilas = modeloTabla.getRowCount();
        if(numFilas > 0){
        
        for(int i = numFilas - 1; i >= 0; i-- ){
    modeloTabla.removeRow(i);
        
        }
    }
        
    }
    
    
    
    public void Mensajes(String mensaje){
    
      JOptionPane.showMessageDialog(this,mensaje);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrarProd;
    private javax.swing.JButton btnCategoria;
    private javax.swing.JButton btnModificarProd;
    private javax.swing.JButton btnNuevoArticulo;
    private javax.swing.JButton btnProveedor;
    private javax.swing.JButton btnagregarExistencia;
    private javax.swing.JTextField campoAgregarEXISTENCIA;
    private javax.swing.JTextField campoBuscar;
    private javax.swing.JTextField campoClave;
    private javax.swing.JTextField campoExistencia;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JTable tablaProductos;
    // End of variables declaration//GEN-END:variables
}
