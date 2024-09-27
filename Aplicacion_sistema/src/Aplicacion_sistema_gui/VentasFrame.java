/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Aplicacion_sistema_gui;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import sistema.datos.BaseDatos;
import sistema.pojos.DetalleVenta;
import sistema.pojos.Producto;
import sistema.pojos.Venta;

/**
 *
 * @author Draw
 */
public class VentasFrame extends javax.swing.JInternalFrame {

    BaseDatos base = new BaseDatos();
    DefaultTableModel modeloTablaProductos = new DefaultTableModel(){
    
    
    @Override
    public boolean isCellEditable(int row, int column){
    
    return false;
    }
    
    
    
    };
    
    
    
    
    DefaultListModel <Producto> modeloListaProductos = new DefaultListModel<Producto>();
    
    /**
     * constructor
     */
    public VentasFrame() {
        initComponents();
        cargarColumnasTabla();
       cargarListenerModeloTabla();
    }

    
    private void cargarListenerModeloTabla(){
    
    modeloTablaProductos.addTableModelListener(new TableModelListener(){
    
    @Override
    public void tableChanged(TableModelEvent e){
    int numFilas =  modeloTablaProductos.getRowCount();
    double sumatoria = 0;
    for(int i = 0; i< numFilas; i++){
    
    String importe = (String) modeloTablaProductos.getValueAt(i, 4);
    sumatoria += Double.parseDouble(importe);
    
    }
    lblsumatoria.setText(String.valueOf(sumatoria));
    
    }
    
    });
    
    
    }
    
    
    
    
    private void cargarColumnasTabla(){
    
       String [] columnas = {"Clave del Producto","Nombre del Producto","Precio Venta","Cantidad","Importe"};
        
        
        for(int i = 0; i< columnas.length; i++){
        modeloTablaProductos.addColumn(columnas[i]);
        
        }
        
    }
    
    
    
   
    
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TablaVentas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        campoBuscarPorducto = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        lblsumatoria = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnRealizarVenta = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        campoPagacon = new javax.swing.JTextField();
        btnCancelarVenta = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblImagen = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaBusquedas = new javax.swing.JList<>();
        btnCortedia = new javax.swing.JButton();
        btnQuitarProducto = new javax.swing.JButton();

        setTitle("Ventas");
        getContentPane().setLayout(null);

        TablaVentas.setModel(modeloTablaProductos);
        TablaVentas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TablaVentasKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(TablaVentas);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(28, 265, 759, 266);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel1.setText("Buscar producto:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(28, 16, 116, 22);

        campoBuscarPorducto.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        campoBuscarPorducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoBuscarPorductoActionPerformed(evt);
            }
        });
        campoBuscarPorducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campoBuscarPorductoKeyReleased(evt);
            }
        });
        getContentPane().add(campoBuscarPorducto);
        campoBuscarPorducto.setBounds(28, 44, 262, 36);

        lblsumatoria.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        lblsumatoria.setText("0.00");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("Venta total:");

        btnRealizarVenta.setBackground(new java.awt.Color(204, 0, 0));
        btnRealizarVenta.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btnRealizarVenta.setText("Realizar Venta");
        btnRealizarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRealizarVentaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Pago con :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(campoPagacon, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(lblsumatoria)
                    .addComponent(btnRealizarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel3)
                .addGap(23, 23, 23)
                .addComponent(lblsumatoria)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campoPagacon, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addGap(45, 45, 45)
                .addComponent(btnRealizarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(843, 251, 408, 362);

        btnCancelarVenta.setText("Cancelar venta");
        btnCancelarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarVentaActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelarVenta);
        btnCancelarVenta.setBounds(192, 554, 115, 55);

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setForeground(new java.awt.Color(153, 153, 153));
        jPanel2.setLayout(null);

        lblImagen.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(lblImagen);
        lblImagen.setBounds(52, 45, 437, 161);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(829, 16, 0, 0);

        listaBusquedas.setModel(modeloListaProductos);
        listaBusquedas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                listaBusquedasMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(listaBusquedas);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(30, 100, 256, 130);

        btnCortedia.setText("Corte del dia");
        getContentPane().add(btnCortedia);
        btnCortedia.setBounds(350, 30, 240, 50);

        btnQuitarProducto.setText("Quitar Producto");
        btnQuitarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarProductoActionPerformed(evt);
            }
        });
        getContentPane().add(btnQuitarProducto);
        btnQuitarProducto.setBounds(50, 550, 120, 60);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoBuscarPorductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoBuscarPorductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoBuscarPorductoActionPerformed

    
    
    
    private void campoBuscarPorductoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoBuscarPorductoKeyReleased
    limpiarListaProductos();
    
    String cadenaBusqueda = campoBuscarPorducto.getText();

    if(cadenaBusqueda.isEmpty()){
    
       limpiarListaProductos();
    
    }
    else{
     ArrayList<Producto> listaProductos = base.obtenerProductosPorCriterio(cadenaBusqueda);
        
      
        for(Producto prod: listaProductos){
        
        modeloListaProductos.addElement(prod);
        
        }
    
    }
    
       
        
        
    }//GEN-LAST:event_campoBuscarPorductoKeyReleased

    private void listaBusquedasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaBusquedasMousePressed
      JList list = (JList)evt.getSource();
      
      if(evt.getClickCount()== 2){
      int index = list.locationToIndex(evt.getPoint());
      System.out.println("El indice es : " + index);
      Producto product = (Producto)list.getSelectedValue();
      System.out.println("El producto es : " + product);
      
      AddProductoaVenta(product);
      
      
      
      }
      
      
      
    }//GEN-LAST:event_listaBusquedasMousePressed

    private void TablaVentasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TablaVentasKeyReleased
        if(evt.getKeyCode()== KeyEvent.VK_F2){
        
            int filaSeleccionada = TablaVentas.getSelectedRow();
            String cantidad = JOptionPane.showInputDialog("Modificar cantidad:");
            String precioVenta = (String)modeloTablaProductos.getValueAt(filaSeleccionada, 2);
            double importe = Double.parseDouble(cantidad) * Double.parseDouble(precioVenta);
            String importeString = String.valueOf(importe);
        modeloTablaProductos.setValueAt(cantidad,filaSeleccionada,3);
        modeloTablaProductos.setValueAt(importeString,filaSeleccionada,4);
        }
    }//GEN-LAST:event_TablaVentasKeyReleased

    private void btnQuitarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarProductoActionPerformed
        int filaSeleccionada = TablaVentas.getSelectedRow();
        int cantidadfilas = modeloTablaProductos.getRowCount();
        if(cantidadfilas > 0){
        int opcion = JOptionPane.showConfirmDialog(this,"Estas Seguro de borarr el producto");
        if(opcion == 0){
        modeloTablaProductos.removeRow(filaSeleccionada);
        
        
        }//fin del if de la opcion
        
        }// fin del if de cantidad de filas 
    }//GEN-LAST:event_btnQuitarProductoActionPerformed

    private void btnCancelarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarVentaActionPerformed
        int cantidadFilas = modeloTablaProductos.getRowCount();
          int cantidadfilas = modeloTablaProductos.getRowCount();
        if(cantidadfilas > 0){
          
          int opcion = JOptionPane.showConfirmDialog(this,"Estas Seguro de cancelar la venta");
if(opcion == 0 ){

        for(int i = cantidadFilas - 1 ; i >=0; i--){
        
        modeloTablaProductos.removeRow(i);
        
        
        }//fin del for
}//fin del if de la opcion
        }//fin del if de cantidad de filas 
    }//GEN-LAST:event_btnCancelarVentaActionPerformed

    private void btnRealizarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRealizarVentaActionPerformed
        
       ArrayList <DetalleVenta> detalles = new ArrayList<DetalleVenta>(); 
        String sumatoriaStr = lblsumatoria.getText();
       double montoVenta = Double.parseDouble(sumatoriaStr);
       
       String pagoConStr = campoPagacon.getText();

       double cambio = 0;
       if(!pagoConStr.isEmpty()){
           
           double montoPago = Double.parseDouble(pagoConStr);
           cambio = montoPago - montoVenta;
           
       }


       
       //obtenemos la fecha actual y creamos un objeto date sql
         // Obtiene la instancia del calendario
        Calendar calendarioLocal = Calendar.getInstance();
        
        // Obtiene la fecha actual
        java.util.Date fechaActual = calendarioLocal.getTime();
        
        // Convierte la fecha a milisegundos
        long fechaMilisegundos = fechaActual.getTime();
        
        // Crea un objeto java.sql.Date usando los milisegundos
        java.sql.Date fecha = new java.sql.Date(fechaMilisegundos);
       Venta venta = new Venta(montoVenta, fecha);
       Long idventa = base.InsertarVenta(venta);
       
       int numRows = modeloTablaProductos.getRowCount();
       
       for(int i = 0; i< numRows; i++){
       
       String idProducto = (String) modeloTablaProductos.getValueAt(i, 0);
       String cantidadStr = (String) modeloTablaProductos.getValueAt(i, 3);
       double cantidad = Double.parseDouble(cantidadStr);
       DetalleVenta detalle = new DetalleVenta(idventa,idProducto,cantidad);
       base.InsertardetallesVentas(detalle);
       
       detalles.add(detalle);
       }
       
         for(int i = numRows - 1 ; i >=0; i--){
        
        modeloTablaProductos.removeRow(i);
        
        
        }//fin del for
       lblsumatoria.setText("0.0");
       
       if(!pagoConStr.isEmpty()){
       JOptionPane.showMessageDialog(this,"<html><h1 style='font-size:200 px; color:blue;'>" + cambio+ " </h1></html>", "usted debe de dar este cambio: ",1);
       
        campoPagacon.setText("");
       
       
       }
       
       
    }//GEN-LAST:event_btnRealizarVentaActionPerformed

    
    
    private void AddProductoaVenta(Producto prod)
    {
    
    String claveProducto = prod.getIdProducto();
    String nombreProducto = prod.getNomProducto();
    String precioVenta = String.valueOf(prod.getPrecioVentaProducto());
    String importe = String.valueOf(prod.getPrecioVentaProducto());
    
    String [] datosProducto = {claveProducto,nombreProducto,precioVenta,"1",importe};
    modeloTablaProductos.addRow(datosProducto);
    
    
    
    }
    
    
    
    private void limpiarListaProductos(){
    
    modeloListaProductos.clear();
    
    
    }
    
    
    
    
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaVentas;
    public javax.swing.JButton btnCancelarVenta;
    private javax.swing.JButton btnCortedia;
    private javax.swing.JButton btnQuitarProducto;
    private javax.swing.JButton btnRealizarVenta;
    private javax.swing.JTextField campoBuscarPorducto;
    private javax.swing.JTextField campoPagacon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblsumatoria;
    private javax.swing.JList<Producto> listaBusquedas;
    // End of variables declaration//GEN-END:variables
}
