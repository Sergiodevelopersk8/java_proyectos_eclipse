/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema.pojos;

/**
 *
 * @author Draw
 */
public class CategoriaProd {
private int idCategoriaProd;
private String NomCategoriaProd;
private String DescCategoriaProd;

    public CategoriaProd(int idCategoriaProd, String NomCategoriaProd, String DescCategoriaProd) {
        this.idCategoriaProd = idCategoriaProd;
        this.NomCategoriaProd = NomCategoriaProd;
        this.DescCategoriaProd = DescCategoriaProd;
    }

    public int getIdCategoriaProd() {
        return idCategoriaProd;
    }

    public void setIdCategoriaProd(int idCategoriaProd) {
        this.idCategoriaProd = idCategoriaProd;
    }

    public String getNomCategoriaProd() {
        return NomCategoriaProd;
    }

    public void setNomCategoriaProd(String NomCategoriaProd) {
        this.NomCategoriaProd = NomCategoriaProd;
    }

    public String getDescCategoriaProd() {
        return DescCategoriaProd;
    }

    public void setDescCategoriaProd(String DescCategoriaProd) {
        this.DescCategoriaProd = DescCategoriaProd;
    }

   
    
}
