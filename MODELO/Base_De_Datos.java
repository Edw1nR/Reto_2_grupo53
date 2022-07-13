package MODELO;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;

public class Base_De_Datos {

    Connection connection;
    String driver = "com.mysql.cj.jdbc.Driver";
    String cadenaConexion = "jdbc:mysql://localhost:3306/reto_1_c2";
    String usuario = "root";
    String contrasena = "";

    public Base_De_Datos() {

        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(cadenaConexion, usuario, contrasena);
            if (connection != null) {
                System.out.println("CONEXION EXITOSA CON LA BASE DE DATOS");
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("NO SE PUDO ESTABLECER CONEXION CON LA BASE DE DATOS");
        }
    }

    public Connection getCConnection() {
        return connection;
    }
}
