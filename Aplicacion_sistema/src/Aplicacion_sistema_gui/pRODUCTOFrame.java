/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Aplicacion_sistema_gui;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import static javax.swing.JOptionPane.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import sistema.datos.BaseDatos;
import sistema.pojos.CategoriaProd;
import sistema.pojos.Producto;
import sistema.pojos.Proveedores;

/**
 *
 * @author Draw
 */
public class ProductoFrame extends javax.swing.JDialog {

    
    DefaultComboBoxModel <CategoriaProd>  modeloCategorias;
    DefaultComboBoxModel <Proveedores>  modeloProveedor;
    boolean estaActualizando;
    BaseDatos base ;
    String Infromacion = "";
    
    
    /**
     * Creates new form ArticuloFrame
     */
    public ProductoFrame(java.awt.Frame parent, boolean modal, Producto producto, ImageIcon icon, String titulo, boolean actualizado) {
        super(parent, modal);
        modeloCategorias = new DefaultComboBoxModel<CategoriaProd>();
        modeloProveedor = new DefaultComboBoxModel<Proveedores>();
        base = new BaseDatos();
        CargarModeloCat();
        CargarModeloProv();
        initComponents();
        this.estaActualizando = actualizado;
        this.setTitle(titulo);
        if(producto!=null){
        cargarProducto(producto,icon);
        
        }
    }
    
    
    private void cargarProducto(Producto producto, ImageIcon icono){
    
        //redimencionar la imagen
            Image imgProd = icono.getImage();
        int anchoEtiqueta = lblImagenArticulo.getWidth();
        int altoEtiqueta = lblImagenArticulo.getHeight();
        
        Image imgRedimencionada = imgProd.getScaledInstance(anchoEtiqueta, altoEtiqueta, Image.SCALE_DEFAULT);
        
        
        ImageIcon iconRedimensionado = new ImageIcon(imgRedimencionada);
        
        
        
    lblImagenArticulo.setIcon(iconRedimensionado);
    String clave = producto.getIdProducto();
    String nombre = producto.getNomProducto();
    String descripcion = producto.getDescProducto();
    Double stock = producto.getStockProducto();
    String unidad = producto.getUnidadProducto();
    Double precioCompra = producto.getPrecioCompraProducto();
    Double precioVenta = producto.getPrecioVentaProducto();
    Double existencia = producto.getExistenciasProducto();
    int idcategoria = producto.getIdCategoria();
    int idproveedor = producto.getIdProveedor();
    campoClave.setText(clave);
    campoNombre.setText(nombre);
    campoDescripcion.setText(descripcion);
    
    campoStock.setText(String.valueOf(stock));
    comboUnidades.setSelectedItem(unidad);
    campoPrecioCompra.setText(String.valueOf(precioCompra));
    campoPrecioVentas.setText(String.valueOf(precioVenta));
    
   campoClave.setEnabled(false);
   campoNombre.setEnabled(false);
    
    
    }
    

    private void CargarModeloCat(){
    ArrayList<CategoriaProd> listaCategorias;
        listaCategorias = base.ObtenerCategorias();
        for(CategoriaProd categoria: listaCategorias){
            modeloCategorias.addElement(categoria);
        }
    }
    
    private void CargarModeloProv(){
        
        ArrayList<Proveedores> listaproveedores;
        listaproveedores = base.ObtenerProveedores();
        for(Proveedores proveedores : listaproveedores){
        
        modeloProveedor.addElement(proveedores);
        
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

        jLabel1 = new javax.swing.JLabel();
        campoClave = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        campoDescripcion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        campoStock = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        ComboCategorias = new javax.swing.JComboBox<>();
        btnNuevaCategoriProducto = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        comboUnidades = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        campoPrecioCompra = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        campoPrecioVentas = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnGuardarProducto = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        ComboProveedores = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        campoNombre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        lblImagenArticulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Clave:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(19, 224, 32, 25);
        getContentPane().add(campoClave);
        campoClave.setBounds(6, 255, 293, 36);

        jLabel2.setText("Descripción:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 412, 65, 16);
        getContentPane().add(campoDescripcion);
        campoDescripcion.setBounds(10, 430, 279, 129);

        jLabel3.setText("Stock requerido:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(317, 228, 86, 16);
        getContentPane().add(campoStock);
        campoStock.setBounds(317, 255, 137, 33);

        jLabel4.setText("Categorias:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(520, 228, 59, 16);

        ComboCategorias.setModel(modeloCategorias);
        getContentPane().add(ComboCategorias);
        ComboCategorias.setBounds(520, 255, 199, 33);

        btnNuevaCategoriProducto.setText("Nueva Categoria");
        getContentPane().add(btnNuevaCategoriProducto);
        btnNuevaCategoriProducto.setBounds(745, 255, 118, 33);

        jLabel5.setText("Unidad de medida:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(339, 309, 181, 16);

        comboUnidades.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kilogramo", "Pieza", "Litro" }));
        getContentPane().add(comboUnidades);
        comboUnidades.setBounds(310, 340, 203, 31);

        jLabel6.setText("Precio de compra:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(550, 310, 96, 16);
        getContentPane().add(campoPrecioCompra);
        campoPrecioCompra.setBounds(530, 340, 143, 34);

        jLabel7.setText("Precio de venta:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(701, 309, 84, 16);
        getContentPane().add(campoPrecioVentas);
        campoPrecioVentas.setBounds(700, 340, 159, 31);

        jLabel8.setText("Proveedor :");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(346, 425, 60, 16);

        btnGuardarProducto.setText("Guardar");
        btnGuardarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarProductoActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardarProducto);
        btnGuardarProducto.setBounds(20, 590, 127, 36);

        jButton3.setText("Cancelar");
        getContentPane().add(jButton3);
        jButton3.setBounds(160, 590, 127, 36);

        ComboProveedores.setModel(modeloProveedor);
        getContentPane().add(ComboProveedores);
        ComboProveedores.setBounds(324, 453, 196, 34);

        jLabel9.setText("Nombre");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(22, 309, 44, 16);
        getContentPane().add(campoNombre);
        campoNombre.setBounds(10, 340, 277, 39);

        jPanel1.setBackground(new java.awt.Color(0, 0, 255));

        lblImagenArticulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblImagenArticuloMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImagenArticulo, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblImagenArticulo, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jPanel1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(29, 6, 325, 178);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    File imgArticleFile;
    
    private void lblImagenArticuloMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImagenArticuloMousePressed
    JFileChooser chooser = new JFileChooser();       
    
    FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de imagen jpg, gif o png", "jpg","gif","png");
    
    chooser.setFileFilter(filter);
    
    
    int returnVal = chooser.showOpenDialog(this);
    if(returnVal == JFileChooser.APPROVE_OPTION){
    
    int anchoImage = lblImagenArticulo.getWidth();
    int altoImage = lblImagenArticulo.getHeight();
    
     imgArticleFile = chooser.getSelectedFile();
    ImageIcon icono = new ImageIcon(imgArticleFile.getAbsolutePath());
    Image imagen = icono.getImage();
    Image  imagenRedimencionada = imagen.getScaledInstance(anchoImage, altoImage, Image.SCALE_DEFAULT);
    ImageIcon iconoRedimensionado = new ImageIcon(imagenRedimencionada);
    
    lblImagenArticulo.setIcon(iconoRedimensionado);
    
    
    }
    
    
    
    }//GEN-LAST:event_lblImagenArticuloMousePressed

    private void btnGuardarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarProductoActionPerformed
   
        String codigo = campoClave.getText().toLowerCase();
      String nombre = campoNombre.getText().toLowerCase();
      String descripcion = campoDescripcion.getText().toLowerCase();
      String stockstr = campoStock.getText().toLowerCase();
      String precioComprastr  = campoPrecioCompra.getText().toLowerCase();
      String precioVentasstr  = campoPrecioVentas.getText().toLowerCase();
      double stock = 0, precioCompra = 0,precioVentas = 0;
       String unidad = comboUnidades.getSelectedItem().toString().toLowerCase();
      CategoriaProd categorias = (CategoriaProd)ComboCategorias.getSelectedItem();
      Proveedores proveedores = (Proveedores)ComboProveedores.getSelectedItem();
      
      if(estaActualizando){
        if(!stockstr.isEmpty() || !precioComprastr.isEmpty() || !precioVentasstr.isEmpty()){
      stock = Double.parseDouble(stockstr);
      precioCompra  = Double.parseDouble(precioComprastr);
      precioVentas  = Double.parseDouble(precioVentasstr);
      }

      if(imgArticleFile == null){
      Producto producto = new Producto(codigo,nombre,descripcion,stock, null, unidad,precioCompra, precioVentas,0.0, 
              categorias.getIdCategoriaProd(), proveedores.getIdProveedor());
              
      base.actualizarProducto(producto, false);
       
     
              }
      else{
            Producto producto = new Producto(codigo,nombre,descripcion,stock, imgArticleFile,
                    unidad,precioCompra, precioVentas,0.0, 
              categorias.getIdCategoriaProd(), proveedores.getIdProveedor());
              
      base.actualizarProducto(producto, true);
    

   
      }
        JOptionPane.showMessageDialog(this,"se actualizo el producto");
     this.dispose();
      Infromacion = "1";
      
      
      }
     else if(!estaActualizando){
      if(!stockstr.isEmpty() || !precioComprastr.isEmpty() || !precioVentasstr.isEmpty()){
      stock = Double.parseDouble(stockstr);
      precioCompra  = Double.parseDouble(precioComprastr);
      precioVentas  = Double.parseDouble(precioVentasstr);
      }

     
      if(imgArticleFile == null  ){
   JOptionPane.showMessageDialog(this,"No a elegido una fotografia de producto");
  
      }
      else{
      Producto producto = new Producto(codigo,nombre, descripcion,stock,imgArticleFile,unidad,precioCompra,
              precioVentas,0.0,categorias.getIdCategoriaProd(),proveedores.getIdProveedor());
      try{
       base.insertarProducto(producto);
          
   JOptionPane.showMessageDialog(this,"El producto se guardo con exito");
this.dispose();
      
      }
     catch(Exception error){
     System.out.printf("el al insertar es   " + error.toString());
     } 
      
      
         
          
      } //fin dle else de insertar
      
      }//else de actualizar
     
     
     

    
     
      
     //fin del metodo 
    }//GEN-LAST:event_btnGuardarProductoActionPerformed

    
    public String getInformacion(){
    
        return this.Infromacion;
    
    }
    
   
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
            java.util.logging.Logger.getLogger(CategoriaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CategoriaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CategoriaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CategoriaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //ProductoFrame dialog = new ProductoFrame(new javax.swing.JFrame(),true, null, null, "producto", true);
                ProductoFrame dialog = new ProductoFrame(new javax.swing.JFrame(), true, null, null, null, false);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<CategoriaProd> ComboCategorias;
    private javax.swing.JComboBox<Proveedores> ComboProveedores;
    private javax.swing.JButton btnGuardarProducto;
    private javax.swing.JButton btnNuevaCategoriProducto;
    private javax.swing.JTextField campoClave;
    private javax.swing.JTextField campoDescripcion;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JTextField campoPrecioCompra;
    private javax.swing.JTextField campoPrecioVentas;
    private javax.swing.JTextField campoStock;
    private javax.swing.JComboBox<String> comboUnidades;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblImagenArticulo;
    // End of variables declaration//GEN-END:variables
}
