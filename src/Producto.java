
class Producto {
   
    String nombre;
    double precio;
    int stock;
    // Constructor con acceso default
    Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
    // Método de acceso default
    void mostrarInfo(){ 
        System.out.println("Nombre del producto: " + nombre);
        System.out.println("Precio del producto: " + precio);
        System.out.println("Stock del producto: " + stock);
    }
}
