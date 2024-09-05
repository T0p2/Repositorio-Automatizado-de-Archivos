package Ventana1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;

public class Modificacion extends JPanel{
	JButton botonModif;
	
	JTextArea textoTitulo1;
	JTextArea textoMinutos1;
	JTextArea textoComentario1;
	
	JTextArea textoAtributo;
	JTextArea atributoDir_Int;
	JTextArea atributoComentario;
	
	JPanel panel;
	
	
	public Modificacion (Catalogo catalogo) {
		
		panel = new JPanel();
		panel.setLayout(null);
		
		iniciarComponentes();
		
		
		botonModif.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				if(catalogo.buscarTitulo(textoTitulo1.getText().toString()) != -1) {
					catalogo.modifcarAtrib(textoTitulo1.getText().toString(), textoComentario1.getText().toString(), Integer.parseInt(textoMinutos1.getText()));
					JOptionPane.showMessageDialog(null, "Modificado :)");
				}else {
					JOptionPane.showMessageDialog(null, "No existe el titulo ");
				}
					
			}
		});
		
		
	}
	
	
	
	
	private void iniciarComponentes(){
		
	//Labels: 
		
		JLabel label8 = new JLabel("Modificar Atributos: ");
		//label8.setFont(font);
		label8.setBounds(600, 300, 150, 250);
		panel.add(label8);
		
		JLabel label9 = new JLabel("Titulo:  ");
		label9.setBounds(600, 500, 100, 25);
		panel.add(label9);
		
		JLabel label10 = new JLabel("Minutos: ");
		label10.setBounds(750, 500, 150, 25);
		panel.add(label10);
		
		JLabel label11 = new JLabel("Comentarios: ");
		label11.setBounds(900, 500, 150, 25);
		panel.add(label11);
		
	//Texto: 
		
		textoTitulo1 = new JTextArea();
		textoTitulo1.setBounds(600, 525, 100, 25);
		panel.add(textoTitulo1);
		
		textoMinutos1 = new JTextArea();
		textoMinutos1.setBounds(750, 525, 100, 25);
		panel.add(textoMinutos1);
		
		textoComentario1 = new JTextArea();
		textoComentario1.setBounds(900, 525, 100, 25);
		panel.add(textoComentario1);
		
	//Botones
		
		botonModif = new JButton("Modificar ");
		botonModif.setBounds(700, 600, 200, 30);
		botonModif.setBackground(Color.black);
		botonModif.setForeground(Color.yellow);
		panel.add(botonModif);
		
	}
}
