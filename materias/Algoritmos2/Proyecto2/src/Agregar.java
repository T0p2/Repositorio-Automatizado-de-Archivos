//package Ventana;

import javax.swing.*;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.*;


public class Agregar extends JPanel{
	
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

	JLabel labelImgDvd;
	JLabel labelImgCd;
	
	JTextField textDvd = new JTextField();
	JTextField textCd = new JTextField();
	
	JComboBox<String> listaDvd;
	JComboBox<String> listaCd;
	
	


	public Agregar (Catalogo catalogo) {
	
		
		setSize(1200, 999);
		setLayout(null);
		
		
		iniciarComponentes();
		listaProductos(catalogo);
	
		
		labelImgDvd = new JLabel("");
		labelImgDvd.setBackground(Color.BLACK);
		labelImgDvd.setHorizontalAlignment(SwingConstants.CENTER);	
		labelImgDvd.setIcon(new ImageIcon());
		labelImgDvd.setBounds(28, 400, 130, 200);
		add(labelImgDvd);
		
		labelImgCd = new JLabel("");
		labelImgCd.setBackground(Color.BLACK);
		labelImgCd.setHorizontalAlignment(SwingConstants.CENTER);	
		labelImgCd.setIcon(new ImageIcon());
		labelImgCd.setBounds(993, 400, 130, 200);
		add(labelImgCd);
	
		boton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				if (boton1.isSelected()) {
					catalogo.agregarPeli(getTitulo(), getDir_Int() , getGenero(), getMinutos(),true, getComentario());
				}else if (boton2.isSelected()) {
					catalogo.agregarCd(getTitulo(), getDir_Int() , getGenero(), getMinutos(),true, getComentario());
				}
				guardarTexto(catalogo);
			}});
		
		
		
		
		
	listaDvd.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if(listaDvd.getSelectedItem().toString() != null)
					listaDvd = (JComboBox<String>) e.getSource();
					String selectedTitle = (String) listaDvd.getSelectedItem();
					if(catalogo.buscarTitulo(selectedTitle) != -1) {
						String dir_int = catalogo.getIdAtrib(catalogo.buscarTitulo(selectedTitle));
						String comentario = catalogo.getComentarioAtrib(catalogo.buscarTitulo(selectedTitle));
						String genero = catalogo.getGeneroAtrib(catalogo.buscarTitulo(selectedTitle));
						int minutos = catalogo.getMinutosAtrib(catalogo.buscarTitulo(selectedTitle));
						textDvd.setText("");
					colocarTextFieldAtributosDvd(dir_int, genero, comentario, minutos);
					switch(selectedTitle) {
					
					case "Club de la Pelea":
						crearimageLabelDvd("\\C:\\Users\\usuario\\OneDrive\\Escritorio\\facultad\\ALGORTIMOS 2\\ClubDeLaPelea.jpeg");
						break;
					
					case "El hoyo": 
						crearimageLabelDvd("C:\\Users\\usuario\\OneDrive\\Escritorio\\facultad\\ALGORTIMOS 2\\ElHoyo.jpeg");
						break;
						
					case "Batman" : 
						crearimageLabelDvd("C:\\Users\\usuario\\OneDrive\\Escritorio\\facultad\\ALGORTIMOS 2\\Batman.jpeg");
						break;
						
					case "Barbie" :
						crearimageLabelDvd("C:\\Users\\usuario\\OneDrive\\Escritorio\\facultad\\ALGORTIMOS 2\\Barbie.jpeg");
						break;
					}
					}
					
					}
		});
		
		
		listaCd.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
					listaCd = (JComboBox<String>) e.getSource();
					String selectedTitle = (String) listaCd.getSelectedItem();
					if(catalogo.buscarTitulo(selectedTitle) != -1) {
						String dir_int = catalogo.getIdAtrib(catalogo.buscarTitulo(selectedTitle));
						String comentario = catalogo.getComentarioAtrib(catalogo.buscarTitulo(selectedTitle));
						String genero = catalogo.getGeneroAtrib(catalogo.buscarTitulo(selectedTitle));
						int minutos = catalogo.getMinutosAtrib(catalogo.buscarTitulo(selectedTitle));
						textDvd.setText("");
					colocarTextFieldAtributosCd(dir_int, genero, comentario, minutos);
					
					switch(selectedTitle) {
					
					case "A-ha":
						crearimageLabelCd("C:\\Users\\usuario\\OneDrive\\Escritorio\\facultad\\ALGORTIMOS 2\\A-ha.jpeg");
						break;
					
					case "Muse": 
						crearimageLabelCd("C:\\Users\\usuario\\OneDrive\\Escritorio\\facultad\\ALGORTIMOS 2\\Muse.jpeg");
						break;
						
					case "Pink Floyd" : 
						crearimageLabelCd("C:\\Users\\usuario\\OneDrive\\Escritorio\\facultad\\ALGORTIMOS 2\\Pink Floys.jpeg");
						break;
						
					case "Tan Bionica" :
						crearimageLabelCd("C:\\Users\\usuario\\OneDrive\\Escritorio\\facultad\\ALGORTIMOS 2\\Tan bionica.jpeg");
						break;
					}
					}
					
					}
		});
		
		
		
		
	}
	
	private void guardarTexto(Catalogo c) {
		String item = textoTitulo.getText().toString();
		if(boton1.isSelected()) {
			listaDvd.addItem(item);}
		if(boton2.isSelected()) {
			listaCd.addItem(item);}
		textoTitulo.setText("");
		JOptionPane.showMessageDialog(this, "Producto guardado: " + item);
		}
	
	private void iniciarComponentes() {
		
//Lables: 
		
		
		JLabel label = new JLabel("Agrega tus productos: ");
		label.setBounds(25, 0, 500, 30);
		label.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 24));
		add(label);
		
		JLabel label2 = new JLabel("Titulo:  ");
		label2.setBounds(150, 65, 100, 25);
		add(label2);
		
		JLabel label3 = new JLabel("Director/ Interprete: ");
		label3.setBounds(281, 65, 150, 25);
		add(label3);
		
		JLabel label4 = new JLabel("Genero: ");
		label4.setBounds(441, 65, 150, 25);
		add(label4);
		
		JLabel label5 = new JLabel("Minutos: ");
		label5.setBounds(603, 65, 150, 25);
		add(label5);
		
		JLabel label6 = new JLabel("Tenemos: ");
		label6.setBounds(750, 65, 150, 25);
		add(label6);
		
		JLabel label7 = new JLabel("Comentarios: ");
		label7.setBounds(910, 65, 150, 25);
		add(label7);
		
//Textos: 
		
		
		textoTitulo = new JTextArea();
		textoTitulo.setBounds(150, 118, 100, 25);
		textoTitulo.setBackground(Color.LIGHT_GRAY);
		add(textoTitulo);
		
		textoDir_int = new JTextArea();
		textoDir_int.setBounds(302, 118, 100, 25);
		textoDir_int.setBackground(Color.LIGHT_GRAY);
		add(textoDir_int);
	
		textoGenero = new JTextArea();
		textoGenero.setBounds(454, 118, 100, 25);
		textoGenero.setBackground(Color.LIGHT_GRAY);
		add(textoGenero);
		
		textoMinutos = new JTextArea();
		textoMinutos.setBounds(603, 118, 100, 25);
		textoMinutos.setBackground(Color.LIGHT_GRAY);
		add(textoMinutos);
		
		textoTenemos = new JTextArea();
		textoTenemos.setBounds(750, 118, 100, 25);
		textoTenemos.setBackground(Color.LIGHT_GRAY);
		add(textoTenemos);
		
		textoComentario = new JTextArea();
		textoComentario.setBounds(900, 118, 100, 25);
		textoComentario.setBackground(Color.LIGHT_GRAY);
		add(textoComentario);
		
//Botones
		
		boton = new JButton("Agregar");
		boton.setBounds(474, 188, 200, 30);
		boton.setBackground(Color.black);
		boton.setForeground(Color.yellow);
		add(boton);
		
		boton1 = new JRadioButton("DVD");
		boton1.setBounds(10, 99, 75, 30);
		boton1.setBackground(SystemColor.controlHighlight);
		add(boton1);
		

		boton2 = new JRadioButton("Cd");
		boton2.setBounds(10, 132, 75, 30);
		boton2.setBackground(SystemColor.controlHighlight);
		add(boton2);
	
		ButtonGroup grupoDeBotones = new ButtonGroup();
		grupoDeBotones.add(boton1);
		grupoDeBotones.add(boton2);
		
		
		
	
	}
	
	public void listaProductos(Catalogo c){ 
		listaDvd = new JComboBox();
		listaCd = new JComboBox();
		for(int i = 0; i < c.catalogo.size(); i++) {
			if(c.catalogo.get(i) instanceof DVD) {
				listaDvd.addItem(c.catalogo.get(i).getTitulo() );
			}else {
				listaCd.addItem(c.catalogo.get(i).getTitulo());
		}}
		listaDvd.setBounds(248, 400, 150, 30);
		listaCd.setBounds(720, 400, 150, 30);
		add(listaDvd);
		add(listaCd);
		
		JLabel lblTusProductos = new JLabel("Tus productos:");
		lblTusProductos.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 24));
		lblTusProductos.setBounds(25, 309, 331, 30);
		add(lblTusProductos);
	}
	
	
	private void colocarTextFieldAtributosCd (String dir_int ,String genero, String comentario, int minutos) {
		
		textCd = new JTextField("Interprete: " + dir_int);
		textCd.setBounds(720, 450, 200, 20);
		textCd.setBackground(Color.LIGHT_GRAY);
		textCd.setFont(font);
		textCd.setEditable(false);
		add(textCd);
		
		JTextField textoGenero = new JTextField("Genero: " + genero);
		textoGenero.setBounds(720, 500, 200, 20);
		textoGenero.setBackground(Color.LIGHT_GRAY);
		textoGenero.setEditable(false);
		textoGenero.setFont(font);
		add(textoGenero);
		
		JTextField textoComentario = new JTextField("Comentario: " + comentario);
		textoComentario.setBounds(720, 550, 200, 20);
		textoComentario.setEditable(false);
		textoComentario.setBackground(Color.LIGHT_GRAY);
		textoComentario.setFont(font);
		add(textoComentario);
		
		JTextField textoMinutos = new JTextField("Minutos : " + minutos);
		textoMinutos.setBounds(720, 600, 200, 20);
		textoMinutos.setEditable(false);
		textoMinutos.setBackground(Color.LIGHT_GRAY);
		textoMinutos.setFont(font);
		add(textoMinutos);
	}
		
	
	private void colocarTextFieldAtributosDvd(String dir_int, String genero, String comentario, int minutos) {
		
		textDvd = new JTextField("Director: " + dir_int);
		textDvd.setBounds(248, 450, 200, 20);
		textDvd.setBackground(Color.LIGHT_GRAY);
		textDvd.setFont(font);
		textDvd.setEditable(false);
		add(textDvd);
		
		JTextField textoGenero0 = new JTextField("Genero: " + genero);
		textoGenero0.setBounds(248, 500, 200, 20);
		textoGenero0.setBackground(Color.LIGHT_GRAY);
		textoGenero0.setEditable(false);
		textoGenero0.setFont(font);
		add(textoGenero0);
		
		JTextField textoComentario0 = new JTextField("Comentario: " + comentario);
		textoComentario0.setBounds(248,550, 200, 20);
		textoComentario0.setEditable(false);
		textoComentario0.setBackground(Color.LIGHT_GRAY);
		textoComentario0.setFont(font);
		add(textoComentario0);
		
		JTextField textoMinutos0 = new JTextField("Minutos : " + minutos);
		textoMinutos0.setBounds(248, 600, 200, 20);
		textoMinutos0.setEditable(false);
		textoMinutos0.setBackground(Color.LIGHT_GRAY);
		textoMinutos0.setFont(font);
		add(textoMinutos0);
	}
	
	


	private void crearimageLabelDvd(String image) {labelImgDvd.setIcon(new ImageIcon(image));}
	
	private void crearimageLabelCd(String image) {labelImgCd.setIcon(new ImageIcon(image));}
	
	
	private String getTitulo() {return (textoTitulo.getText().toString());}
	private String getDir_Int() {return (textoDir_int.getText().toString());}
	private String getGenero() {return(textoGenero.getText().toString());}
	private int getMinutos() {return Integer.parseInt((textoMinutos.getText()));}
	private String getComentario() {return textoComentario.getText();	}
	
	public void setNewAtributesDvd(Catalogo c,int i , String title, String comentario, int minutos ) {
		listaDvd.removeItem(title);
		

		c.catalogo.get(i).setTitulo(title);
		c.catalogo.get(i).setComentario(comentario);
		c.catalogo.get(i).setMinutos(minutos);
		
		listaDvd.addItem(title);
	
	}
	
	public void setNewAtributesCd(Catalogo c,int i , String title, String comentario, int minutos ) {
		
		listaCd.removeItem(c.catalogo.get(i).getTitulo());

		c.catalogo.get(i).setTitulo(title);
		c.catalogo.get(i).setComentario(comentario);
		c.catalogo.get(i).setMinutos(minutos);
		
		
		listaCd.addItem(title);
		
	}
	
	public void eliminarItemDvd(String title) {listaDvd.removeItem(title);}
	public void eliminarItemCd(String title) {listaCd.removeItem(title);}
}

