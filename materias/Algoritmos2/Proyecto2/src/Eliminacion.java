import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Rectangle;

public class Eliminacion extends JPanel {
	
	JTextArea textoTituloElim;
	JButton botonEliminacion;

	public Eliminacion(Catalogo catalogo, Agregar a) {
		setBackground(Color.WHITE);

		setLayout(null);
		
		iniciarComponentes();
		
		
		botonEliminacion.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				String title = textoTituloElim.getText().toString();
				int i = catalogo.buscarTitulo(title);
				if(i != -1) {
					catalogo.eliminar(title);
					a.eliminarItemDvd(title);
					a.eliminarItemCd(title);
					JOptionPane.showMessageDialog(null, "Eliminado :)  \n" + title);
				}else {
					JOptionPane.showMessageDialog(null, "NO existe ese titulo ");
				}
			}
			
		});
		
	}

	
	private void iniciarComponentes() {
			JLabel label = new JLabel("Eliminar productos:  ");
			label.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 24));
			label.setBounds(10, 28, 319, 45);
			add(label);
			
			JLabel label2 = new JLabel("Titulo:  ");
			label2.setBounds(242, 130, 100, 25);
			add(label2);
			
			textoTituloElim = new JTextArea();
			textoTituloElim.setBounds(252, 161, 100, 25);
			textoTituloElim.setBackground(Color.LIGHT_GRAY);
			add(textoTituloElim);
			
			botonEliminacion = new JButton ("Eliminar ");
			botonEliminacion.setBounds(214, 251, 200, 30);
			botonEliminacion.setBackground(Color.black);
			botonEliminacion.setForeground(Color.yellow);
			add(botonEliminacion);
		
			JLabel lblNewLabel = new JLabel("");
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setIcon(new ImageIcon("C:\\Users\\usuario\\OneDrive\\Escritorio\\facultad\\ALGORTIMOS 2\\OIP (1).jpeg"));
			lblNewLabel.setBounds(465, 11, 482, 465);
			add(lblNewLabel);
		
			
		
	}
}
