//package Ventana;

import java.awt.Component;

import javax.swing.JFrame;

import javax.swing.*;


public class Main  {

	
	
	public static void main(String[] args) {
		
		
		Catalogo catalogo = new Catalogo();

		
		catalogo.agregarPeli("Club de la Pelea", "Brad pitt", "accion", 300, false, "Excelente");
		catalogo.agregarPeli("El hoyo", "Brad pitt", "accion", 300, false, "Buena");
		catalogo.agregarPeli("Batman", "Jim", "accion", 250, true, "Muy buena");
		catalogo.agregarCd("Tan Bionica", "Chano", "pop", 5, false, "Muy bueno");
		catalogo.agregarPeli("Barbie", "James", "aventura y infantil", 100, false, "Mala");	
		catalogo.agregarCd("A-ha", "Jhonn", "pop", 5, false, "Bueno");
		catalogo.agregarCd("Muse", "Brad pitt", "indie", 9, true, "Excelente");
		catalogo.agregarCd("Pink Floyd", "Roger Water", "pop", 5, false, "Malo");
		
		
		PestañaPrincipal pestaña = new PestañaPrincipal(catalogo);
		pestaña.setSize(1700, 1000);
		pestaña.setVisible(true);
		
		
	}

}
