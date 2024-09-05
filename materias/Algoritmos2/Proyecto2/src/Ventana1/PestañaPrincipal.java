package Ventana1;
import javax.swing.*;

public class PestañaPrincipal extends JFrame{
	
	 Catalogo c;
	
	 JTabbedPane pestaña ;
	
	 AgregarProd panelProd;
	 Modificacion panelModi;
	 
	 JPanel panel;
	
	public PestañaPrincipal( ) {
	
		c = new Catalogo();
		
		panelProd = new AgregarProd(c);
		panelModi = new Modificacion(c);
		
		pestaña = new JTabbedPane();
		
		pestaña.addTab("Agregar productos", panelProd);
		pestaña.addTab("Modoifcacion Prodcutos" , panelModi);
		
		add(pestaña);
		
	}
		
		
		
		
	}

