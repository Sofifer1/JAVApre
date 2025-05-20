import java.util.ArrayList;
import java.util.List;
public class Pedido {
// Atributos
    private int idPedido;
    private String cliente;
    private List<Articulo> articulos;
    private boolean entregado;

    public Pedido(int idPedido, String cliente) {
        this.idPedido = idPedido;
        this.cliente = cliente;
        this.articulos = new ArrayList<>();
        this.entregado = false;
    }

    // Métodos para agregar artículos
    public void agregarArticulo(Articulo articulo) {
        articulos.add(articulo);
    }


    // Métodos para marcar como entregado
    public void entregar() {
        this.entregado = true;
    }
    // Getters
    public int getIdPedido() {
        return idPedido;
    }

    public String getCliente() {
        return cliente;
    }

    public List<Articulo> getArticulos() {
        return articulos;
    }

    public boolean isEntregado() {
        return entregado;
    }

      public void mostrar() {
        System.out.println("ID: " + this.idPedido + ", cliente: " + this.cliente + ", articulos: $" + this.articulos + ", entregado: " + this.entregado); 

    }
}

