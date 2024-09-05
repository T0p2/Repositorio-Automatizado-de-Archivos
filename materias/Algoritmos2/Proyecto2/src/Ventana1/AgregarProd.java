package Ventana1;

import javax.swing.*;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.*;


public class AgregarProd extends JPanel{
	
	JButton boton;
	JRadioButton boton1;
	JRadioButton boton2;

	Font font = new Font("Tahoma", Font.BOLD, 14);
	Font font1 = new Font("Pacifico", Font.PLAIN, 24);
	
	JTextArea textoTitulo;
	JTextArea textoDir_int;
	JTextArea textoGenero;
	JTextArea textoMinutos;
	JTextArea textoTenemos;
	JTextArea textoComentario;

	JPanel panel;


	public AgregarProd (Catalogo catalogo) {
	
		
		setSize(500, 500);
		setLayout(null);
		
		iniciarComponentes();
		
		
		
		
		boton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				
				if (boton1.isSelected()) {
					catalogo.agregarPeli(getTitulo(), getDir_Int() , getGenero(), getMinutos(),true, getComentario());
					catalogo.listarPeli();
				}else if (boton2.isSelected()) {
					catalogo.agregarCd(getTitulo(), getDir_Int() , getGenero(), getMinutos(),true, getComentario());
					catalogo.listarCd();
				}
				guardarTexto();
			}
		});
	}

	
	private void guardarTexto() {
		String item = textoTitulo.getText().toString();
		if(boton1.isSelected()) {}
			//listaDvd.addItem(item);}
		if(boton2.isSelected()) {}
			//listaCd.addItem(item);}
		textoTitulo.setText("");
		JOptionPane.showMessageDialog(this, "Producto guardado: " + item);
		}
	
	

	
	
	private void iniciarComponentes() {
		
//Lables: 
		
		
		JLabel label = new JLabel("Agrega tus productos: ");
		label.setBounds(25, 0, 500, 30);
		label.setFont(font1);
		add(label);
		
		JLabel label2 = new JLabel("Titulo:  ");
		label2.setBounds(150, 45, 100, 25);
		add(label2);
		
		JLabel label3 = new JLabel("Director/ Interprete: ");
		label3.setBounds(275, 45, 150, 25);
		add(label3);
		
		JLabel label4 = new JLabel("Genero: ");
		label4.setBounds(450, 45, 150, 25);
		add(label4);
		
		JLabel label5 = new JLabel("Minutos: ");
		label5.setBounds(600, 45, 150, 25);
		add(label5);
		
		JLabel label6 = new JLabel("Tenemos: ");
		label6.setBounds(750, 45, 150, 25);
		add(label6);
		
		JLabel label7 = new JLabel("Comentarios: ");
		label7.setBounds(900, 45, 150, 25);
		add(label7);
		
// Textos: 
		
		
		textoTitulo = new JTextArea();
		textoTitulo.setBounds(150, 65, 100, 25);
		textoTitulo.setBackground(Color.LIGHT_GRAY);
		add(textoTitulo);
		
		textoDir_int = new JTextArea();
		textoDir_int.setBounds(300, 65, 100, 25);
		textoDir_int.setBackground(Color.LIGHT_GRAY);
		add(textoDir_int);
	
		textoGenero = new JTextArea();
		textoGenero.setBounds(450, 65, 100, 25);
		textoGenero.setBackground(Color.LIGHT_GRAY);
		add(textoGenero);
		
		textoMinutos = new JTextArea();
		textoMinutos.setBounds(600, 65, 100, 25);
		textoMinutos.setBackground(Color.LIGHT_GRAY);
		add(textoMinutos);
		
		textoTenemos = new JTextArea();
		textoTenemos.setBounds(750, 65, 100, 25);
		textoTenemos.setBackground(Color.LIGHT_GRAY);
		add(textoTenemos);
		
		textoComentario = new JTextArea();
		textoComentario.setBounds(900, 65, 100, 25);
		textoComentario.setBackground(Color.LIGHT_GRAY);
		add(textoComentario);
		
// Botones
		
		boton = new JButton("Agregar");
		boton.setBounds(1050, 60, 200, 30);
		boton.setBackground(Color.black);
		boton.setForeground(Color.yellow);
		add(boton);
		
		boton1 = new JRadioButton("DVD");
		boton1.setBounds(10, 50, 75, 30);
		boton1.setBackground(Color.LIGHT_GRAY);
		add(boton1);
		

		boton2 = new JRadioButton("Cd");
		boton2.setBounds(10, 70, 75, 30);
		boton2.setBackground(Color.LIGHT_GRAY);
		add(boton2);
	
		ButtonGroup grupoDeBotones = new ButtonGroup();
		grupoDeBotones.add(boton1);
		grupoDeBotones.add(boton2);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private String getTitulo() {return (textoTitulo.getText().toString());}
	private String getDir_Int() {return (textoDir_int.getText().toString());}
	private String getGenero() {return(textoGenero.getText().toString());}
	private int getMinutos() {return Integer.parseInt((textoMinutos.getText()));}
	private String getComentario() {return textoComentario.getText();	}
	
	
	
	
	
	
}
