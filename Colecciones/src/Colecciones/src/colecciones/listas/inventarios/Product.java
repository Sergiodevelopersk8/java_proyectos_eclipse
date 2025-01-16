
package colecciones.listas.inventarios;

public class Product {

    int id;
    String name;
    int existence;
    double price;
    
    
    
public Product(int id ){

    this.id = id;


}

    public Product(int id,String name, int existence, double price) {
        this.id = id;
        this.name = name;
        this.existence = existence;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExistence() {
        return existence;
    }

    public void setExistence(int existence) {
        this.existence = existence;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

   

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Product other = (Product) obj;
        return this.id == other.id;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", name=" + name + ", existence=" + existence + ", price=" + price + '}';
    }


    
    
    
    
}
