package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Vista.Vista;
import Modelo.Producto;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gioavna
 */
public class Controlador implements ActionListener {

    private Producto objProducto;
    private Vista objVista;
    public DefaultTableModel modelData;

    public Controlador() {
    }

    public void iniciarVista() {
        this.objVista = new Vista();
        this.objVista.setVisible(true);
    }

    public void insertProcto(String nombre, String cantidad, String categoria, String precio) {
        try {
            this.objProducto = new Producto(nombre, Integer.parseInt(cantidad), categoria, Float.parseFloat(precio));
            this.objProducto.insertProctoModel();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public boolean actualizarProducto(String id, String nombre, String cantidad, String precio, String categoria) {

        this.objProducto = new Producto();
        boolean retorno = false;
        try {

            int actId = 0;
            if (this.isNumeric(id)) {
                actId = Integer.parseInt(id);
            }

            int actCantidad = 0;
            if (this.isNumeric(cantidad)) {
                actCantidad = Integer.parseInt(cantidad);
            }

            float actPrecio = 0;
            if (this.isFloat(precio)) {
                actPrecio = Float.parseFloat(precio);
            }

            retorno = this.objProducto.actualizarProductoModel(actId, nombre, actCantidad, actPrecio, categoria);

        } catch (Exception ex) {
            System.out.println(ex);
        }

        return retorno;
    }
    
    public boolean eliminarProducto(String id) {
        this.objProducto = new Producto();
        boolean retorno = false;
        try {

            int actId = 0;
            if (this.isNumeric(id)) {
                actId = Integer.parseInt(id);
            }
            
            retorno = this.objProducto.eliminarProductoModel(actId);

        } catch (Exception ex) {
            System.out.println(ex);
        }

        return retorno;
    }

    public boolean isNumeric(String cadena) {
        boolean resultado;

        try {
            Integer.parseInt(cadena);
            resultado = true;
        } catch (NumberFormatException excepcion) {
            resultado = false;
        }
        return resultado;
    }

    public boolean isFloat(String cadena) {
        boolean resultado;
        try {
            Float.parseFloat(cadena);
            resultado = true;
        } catch (NumberFormatException e) {
            resultado = false;
        }
        return resultado;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

    }

}
