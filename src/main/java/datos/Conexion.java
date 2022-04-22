package datos;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/reto_juego_preguntas";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "";
    private Connection conexion = null;

    public Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = (Connection) DriverManager.getConnection(this.JDBC_URL, this.JDBC_USER, this.JDBC_PASSWORD);
        } catch (SQLException e) {
            System.err.println(e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conexion;
    }

}
