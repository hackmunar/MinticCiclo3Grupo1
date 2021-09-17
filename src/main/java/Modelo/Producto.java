package Modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gioavna
 */
public class Producto {

    private int id;
    private String nombre;
    private int cantidad;
    private String categoria;
    private float precio;
    private ConexionBD conecDb = new ConexionBD();

    public Producto(String nombre, int cantidad, String categoria, float precio) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.categoria = categoria;
        this.precio = precio;
    }
    
    public void insertProctoModel() {
        try {
            Connection conexion = this.conecDb.getConnection();
            this.conecDb.insertarBD("INSERT INTO productos (nombre, cantidad, categoria, precio) VALUES (" + "'" + this.nombre + "'," + this.cantidad + "," + "'" + this.categoria + "'," + this.precio + ")");
            this.conecDb.closeConnection(conexion);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public List<Producto> obtenerListadoProductos() {
        ResultSet result = null;
        List<Producto> listProd = new ArrayList<>();

        try {
            Connection conexion = this.conecDb.getConnection();
            result = this.conecDb.consultarBD("SELECT id ,nombre ,cantidad ,categoria ,precio FROM productos");
            while (result.next()) {
                Producto obj = new Producto(
                        result.getString("nombre"), result.getInt("cantidad"), result.getString("categoria"), result.getFloat("precio")
                );
                obj.setId(result.getInt("id"));
                listProd.add(obj);
            }
            this.conecDb.closeConnection(conexion);

        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return listProd;
    }

    public boolean actualizarProductoModel(int id, String nombre, int cantidad, float precio, String categoria) {
        try {
            Connection conexion = this.conecDb.getConnection();
            this.conecDb.actualizarBD("UPDATE productos SET nombre='" + nombre + "', cantidad=" + cantidad + ", categoria='" + categoria + "', precio=" + precio + " WHERE id=" + id);
            this.conecDb.closeConnection(conexion);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return true;
    }

    public boolean eliminarProductoModel(int id) {
        try {
            Connection conexion = this.conecDb.getConnection();
            this.conecDb.actualizarBD("DELETE FROM productos WHERE id=" + id);
            this.conecDb.closeConnection(conexion);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return true;
    }
    
    public Producto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public ConexionBD getConecDb() {
        return conecDb;
    }

    public void setConecDb(ConexionBD conecDb) {
        this.conecDb = conecDb;
    }

    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", nombre=" + nombre + ", cantidad=" + cantidad + ", categoria=" + categoria + ", precio=" + precio + '}';
    }
}
