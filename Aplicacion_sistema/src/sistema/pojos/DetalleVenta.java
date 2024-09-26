package sistema.pojos;

public class DetalleVenta {

private int idDetalleVenta;
private Long idVenta;
private String idProd;
private double cantidadVendida;

    public DetalleVenta(int idDetalleVenta, Long idVenta, String idProd, double cantidadVendida) {
        this.idDetalleVenta = idDetalleVenta;
        this.idVenta = idVenta;
        this.idProd = idProd;
        this.cantidadVendida = cantidadVendida;
    }
    
     public DetalleVenta( Long idVenta, String idProd, double cantidadVendida) {
        this.idVenta = idVenta;
        this.idProd = idProd;
        this.cantidadVendida = cantidadVendida;
    }

    public int getIdDetalleVenta() {
        return idDetalleVenta;
    }

    public void setIdDetalleVenta(int idDetalleVenta) {
        this.idDetalleVenta = idDetalleVenta;
    }

    public Long getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(Long idVenta) {
        this.idVenta = idVenta;
    }

    public String getIdProd() {
        return idProd;
    }

    public void setIdProd(String idProd) {
        this.idProd = idProd;
    }

    public double getCantidadVendida() {
        return cantidadVendida;
    }

    public void setCantidadVendida(double cantidadVendida) {
        this.cantidadVendida = cantidadVendida;
    }


    
}
