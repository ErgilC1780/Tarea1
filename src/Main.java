// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Producto producto_1 = new Producto(1, "Escoba", 20, 2);
        Electronico producto_2 = new Electronico(2, "Television", 15000,1, "Samsung");

        System.out.println("Descuento aplicado al Telefono: "+producto_2.Calculardescuento(10)+"Q");

        Orden orden = new Orden();
        orden.Agregar(producto_1);
        orden.Agregar(producto_2);

        orden.Mostrar();

        }
    }
