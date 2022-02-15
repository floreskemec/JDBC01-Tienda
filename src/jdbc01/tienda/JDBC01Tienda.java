
package jdbc01.tienda;

import jdbc01.tienda.entidades.ProductoServicio;


public class JDBC01Tienda {

  
    public static void main(String[] args) {
     ProductoServicio productoServicio = new ProductoServicio();
        
        try {

          //Mostramos Producto
           productoServicio.imprimirProductos();

     } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error del sistema por \n" + e.getMessage());
        }

    }
    
}
