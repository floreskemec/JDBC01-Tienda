/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc01.tienda.entidades;
import java.util.Collection;
import jdbc01.tienda.persistencia.ProductoDaoExt;
import jdbc01.tienda.entidades.Producto;

/**
 *
 * @author Gonzalo Flores
 */
public class ProductoServicio {
    private ProductoDaoExt dao;

    public ProductoServicio() {
        this.dao = new ProductoDaoExt();
    }
public Collection<Producto> listarProducto() throws Exception {

        try {

            Collection<Producto> producto = dao.listarProductos();
            
            

            return producto;
        } catch (Exception e) {
            throw e;
        }
    }
public void imprimirProductos() throws Exception {

        try {

            //Listamos los productos
            Collection<Producto> productos = listarProducto();

            //Imprimimos los productos
            if (productos.isEmpty()) {
                throw new Exception("No existen productos para imprimir");
            } else {
                for (Producto p : productos) {
                    System.out.println(p);
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }

}
