public class Articulo {
    // Atributos
    private String nombre;
    private double precio;
    private String id;
    private String descripción;
    
    // Constructor

    public Articulo(String nombre, double precio, String id,String descripción) {
        this.nombre = nombre;
        this.precio = precio;
        this.id = id;
        this.descripción = descripción;

    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripción() {
        return descripción;
    }

    public void mostrar() {
        System.out.println("ID: " + this.id + ", Nombre: " + this.nombre + ", Precio: $" + this.precio + ", Descripción: " + this.descripción); 

    }
}