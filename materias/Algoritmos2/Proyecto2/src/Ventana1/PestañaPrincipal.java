package Ventana1;
import javax.swing.*;

public class Pesta�aPrincipal extends JFrame{
	
	 Catalogo c;
	
	 JTabbedPane pesta�a ;
	
	 AgregarProd panelProd;
	 Modificacion panelModi;
	 
	 JPanel panel;
	
	public Pesta�aPrincipal( ) {
	
		c = new Catalogo();
		
		panelProd = new AgregarProd(c);
		panelModi = new Modificacion(c);
		
		pesta�a = new JTabbedPane();
		
		pesta�a.addTab("Agregar productos", panelProd);
		pesta�a.addTab("Modoifcacion Prodcutos" , panelModi);
		
		add(pesta�a);
		
	}
		
		
		
		
	}

