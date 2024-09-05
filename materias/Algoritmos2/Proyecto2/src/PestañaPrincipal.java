import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.*;
import Conection;
//package Ventana;
import javax.swing.*;

public class Pesta�aPrincipal extends JFrame{
	
	public static void main(String[] args) throws SQLException {
		try {
		  //  Class.forName("com.mysql.jdbc.Driver");

		    // Establece la conexi�n a la base de datos
		    Connection conexion = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/prueba", "root", "");
		    Statement sentencia = (Statement) conexion.createStatement();

		    String sql = "INSERT INTO alumnos VALUES (2, 'Juan')";
		    sentencia.executeUpdate(sql);
		    String sql1 = "SELECT * FROM alumnos";
		    ResultSet resultado = sentencia.executeQuery(sql1);

		    while (resultado.next()) {
		        // Obt�n los valores de las columnas
		        int columna1 = resultado.getInt("Id");
		        String columna2 = resultado.getString("nombre");

		        // Imprime los valores por pantalla
		        System.out.println("columna1: " + columna1 + ", columna2: " + columna2);
		    }

		    resultado.close(); // Cierra el ResultSet
		    sentencia.close(); // Cierra la declaraci�n
		    conexion.close(); // Cierra la conexi�n
		} catch (SQLException e) {
		    e.printStackTrace();
		}}





	 Catalogo c;
	
	 JTabbedPane pesta�a ;
	
	 Agregar panelProd;
	 Modificacion panelModi;
	 Eliminacion panelElim;
	 
	 JPanel panel;
	
	public Pesta�aPrincipal(Catalogo c ) {
	
		ImageIcon image  = new ImageIcon ("file:///C:/Users/usuario/eclipse-workspace/Proyecto2/src/OIP.jpeg");
		
		
		
		panelProd = new Agregar(c);
		panelElim = new Eliminacion(c, panelProd);
		panelModi = new Modificacion(c, panelProd);
		
		pesta�a = new JTabbedPane();
		
		
		
		pesta�a.addTab("Agregar productos", panelProd);
		pesta�a.addTab("Modoifcacion prodcutos" , panelModi);
		pesta�a.addTab("Elimnacion productos", panelElim );
		
		add(pesta�a);
		
		
		
		
		
		
	}
}
