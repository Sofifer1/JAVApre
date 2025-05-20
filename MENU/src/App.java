
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    // Variables globales
    static ArrayList<Articulo> lista = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Pedido> pedidos = new ArrayList<>();
    static int siguienteIdPedido = 1;

    public static void main(String[] args) {
        int opcion = 0;
        do {
            System.out.println("1 - Crear un artículo nuevo");
            System.out.println("2 - Consultar un artículo");
            System.out.println("3 - Listar artículos");
            System.out.println("4 - Modificar un artículo");
            System.out.println("5 - Borrar un artículo");
            System.out.println("6 - Listar pedidos");
            System.out.println("7 - Consultar un pedido");
            System.out.println("8 - Entregar un pedido");
            System.out.println("9 - Salir");
            System.out.print("Ingrese una opción: ");

            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    crearArticulo();
                    break;
                case 2:
                    consultarArticulo();
                    break;
                case 3:
                    listarArticulo();
                    break;
                case 4:
                    modificarArticulo();
                    break;
                case 5:
                    borrarArticulo();
                    break;
                case 6:
                    listarPedidos();
                    break;
                case 7:
                    consultarPedido();
                    break;
                case 8:
                    entregarPedido();
                    break;
                case 9:
                    System.out.println("Gracias por usar el programa.");
                    break;
                default:
                    System.out.println("Opción incorrecta. Intente nuevamente.");
            }
        } while (opcion != 6);
    } // fin del metodo que se ejecuta al iniciar el programa

    // ARTICULO metodo crearArticulo
    public static void crearArticulo() {
        System.out.print("Ingrese el nombre del artículo: ");
        String nombre = sc.next();
        System.out.print("Ingrese la descripción del artículo: ");
        String id = sc.nextLine();
        System.out.print("Ingrese el precio del artículo: ");
        double precio = sc.nextDouble();
        System.out.print("Ingrese la descripción del artículo: ");
        String descripción = sc.nextLine();
        // Crear un nuevo objeto Articulo y agregarlo a la lista
        Articulo nuevo = new Articulo(nombre, precio, id, descripción);
        lista.add(nuevo);
        System.out.println("Artículo creado con éxito.");
    }

    // metodo que lista los articulos
    public static void listarArticulo() {
        if (lista.isEmpty()) {
            System.out.println("No hay artículos en la lista.");
        } else {
            System.out.println("Lista de artículos:");
            for (Articulo articulo : lista) {
                articulo.mostrar();
            }
        }
    }

    // metodo que consulta un articulo
    public static void consultarArticulo() {
        System.out.print("Ingrese el ID del artículo a consultar: ");
        String id = sc.nextLine();

        // Buscar el artículo por ID
        boolean encontrado = false;
        for (Articulo a : lista) {
            if (a.getId().equals(id)) {
                a.mostrar();
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Artículo no encontrado.");
        }
    }

    // metodo que modifica un articulo
    public static void modificarArticulo() {
        System.out.print("Ingrese el ID del artículo a modificar: ");
        int id = sc.nextInt();
        sc.nextLine(); // Limpiar el buffer después de nextInt()

        for (Articulo a : lista) {
            if (a.getId().equals(String.valueOf(id))) {
                System.out.print("Ingrese el nuevo nombre del artículo: ");
                String nuevoNombre = sc.nextLine();
                a.setNombre(nuevoNombre);

                System.out.print("Ingrese el nuevo precio del artículo: ");
                Double nuevoPrecio = sc.nextDouble();
                a.setPrecio(nuevoPrecio);

                System.out.println("articulo modificado con exito");
                return;
            }

        }
        System.out.println("Artículo no encontrado.");
    }

    // metodo que borra un articulo
    public static void borrarArticulo() {
        System.out.print("Ingrese el ID del artículo a borrar: ");
        int id = sc.nextInt();
        lista.removeIf(a -> a.getId().equals(String.valueOf(id)));
        System.out.println("Artículo borrado con éxito.");
    }
    // PEDIDO metodo que lista los pedidos
    public static void listarPedidos() {
    if (pedidos.isEmpty()) {
        System.out.println("No hay pedidos.");
    } else {
        for (Pedido p : pedidos) {
            System.out.println(p);
        }
    }
}
// metodo consultar pedido
public static void consultarPedido() {
    System.out.print("Ingrese el ID del pedido: ");
    int idPedido = sc.nextInt();
    sc.nextLine(); 
    boolean encontrado = false;
    
    for (Pedido p : pedidos) {
        if (p.getIdPedido() == idPedido) {
            System.out.println(p);
            encontrado = true;
            break;
        }
    }

    if (!encontrado) {
        System.out.println("Pedido no encontrado.");
    }
}
// metodo que entrega6 un pedido
public static void entregarPedido() {
    System.out.print("Ingrese el ID del pedido a entregar: ");
    int idPedido = sc.nextInt();
    sc.nextLine(); 
    boolean encontrado = false;
    for (Pedido p : pedidos) {
        if (p.getIdPedido() == idPedido) {
            p.entregar();
            System.out.println("Pedido entregado con éxito.");
            encontrado = true;
            break;
        }
    }
    if (!encontrado) {
        System.out.println("Pedido no encontrado.");
    }

}
   
}

