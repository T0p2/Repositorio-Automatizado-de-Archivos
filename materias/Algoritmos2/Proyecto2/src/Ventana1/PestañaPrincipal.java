package Ventana1;
import javax.swing.*;

public class PestaņaPrincipal extends JFrame{
	
	 Catalogo c;
	
	 JTabbedPane pestaņa ;
	
	 AgregarProd panelProd;
	 Modificacion panelModi;
	 
	 JPanel panel;
	
	public PestaņaPrincipal( ) {
	
		c = new Catalogo();
		
		panelProd = new AgregarProd(c);
		panelModi = new Modificacion(c);
		
		pestaņa = new JTabbedPane();
		
		pestaņa.addTab("Agregar productos", panelProd);
		pestaņa.addTab("Modoifcacion Prodcutos" , panelModi);
		
		add(pestaņa);
		
	}
		
		
		
		
	}

