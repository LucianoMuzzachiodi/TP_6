
package tp_6.Entidades;

/**
 *
 * @author Admin
 */
public class Productos implements Comparable<Productos> {
    private int codigo;
    private String descripcion;
    private double precio;
    private String rubro;
    private int stock;

    public Productos() {
    }

    public Productos(int codigo, String descripcion, double precio, String rubro, int stock) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.rubro = rubro;
        this.stock = stock;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getRubro() {
        return rubro;
    }

    public void setRubro(String rubro) {
        this.rubro = rubro;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    } 
    
    @Override
    public int compareTo(Productos p) {
        if(codigo==p.codigo){
            return 0;
        }else if(codigo > p.codigo){
            return 1;
        }else{
            return -1;
        }
    }
    
}

    
