import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.*;
import Conection;
//package Ventana;
import javax.swing.*;

public class PestañaPrincipal extends JFrame{
	
	public static void main(String[] args) throws SQLException {
		try {
		  //  Class.forName("com.mysql.jdbc.Driver");

		    // Establece la conexión a la base de datos
		    Connection conexion = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/prueba", "root", "");
		    Statement sentencia = (Statement) conexion.createStatement();

		    String sql = "INSERT INTO alumnos VALUES (2, 'Juan')";
		    sentencia.executeUpdate(sql);
		    String sql1 = "SELECT * FROM alumnos";
		    ResultSet resultado = sentencia.executeQuery(sql1);

		    while (resultado.next()) {
		        // Obtén los valores de las columnas
		        int columna1 = resultado.getInt("Id");
		        String columna2 = resultado.getString("nombre");

		        // Imprime los valores por pantalla
		        System.out.println("columna1: " + columna1 + ", columna2: " + columna2);
		    }

		    resultado.close(); // Cierra el ResultSet
		    sentencia.close(); // Cierra la declaración
		    conexion.close(); // Cierra la conexión
		} catch (SQLException e) {
		    e.printStackTrace();
		}}





	 Catalogo c;
	
	 JTabbedPane pestaña ;
	
	 Agregar panelProd;
	 Modificacion panelModi;
	 Eliminacion panelElim;
	 
	 JPanel panel;
	
	public PestañaPrincipal(Catalogo c ) {
	
		ImageIcon image  = new ImageIcon ("file:///C:/Users/usuario/eclipse-workspace/Proyecto2/src/OIP.jpeg");
		
		
		
		panelProd = new Agregar(c);
		panelElim = new Eliminacion(c, panelProd);
		panelModi = new Modificacion(c, panelProd);
		
		pestaña = new JTabbedPane();
		
		
		
		pestaña.addTab("Agregar productos", panelProd);
		pestaña.addTab("Modoifcacion prodcutos" , panelModi);
		pestaña.addTab("Elimnacion productos", panelElim );
		
		add(pestaña);
		
		
		
		
		
		
	}
}
