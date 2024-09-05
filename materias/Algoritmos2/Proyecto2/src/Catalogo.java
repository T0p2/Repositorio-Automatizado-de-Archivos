//package Ventana;
import java.util.ArrayList;
import java.util.Collections;




public class Catalogo {
	

	public ArrayList<ItemsCatalogo> catalogo = new ArrayList<>();
	private int i = 0;
	 int cantTotDvd = 0;
	 int cantMiosDvd = 0;
	 int cantTotCd = 0;
	 int cantMiosCd = 0;

	public int getCantTotDvd() {return cantTotDvd;}
	public int getCantTotCd() {return cantTotCd;}
	public int getCantMisDvd() {return cantMiosDvd;}
	public int getCantMisCd() {return cantMiosCd;}
	
	
	public void agregarPeli(String titulo, String director, String genero, int minutos, boolean tenemos, String comentario) {
		DVD dvd = new DVD( titulo,  genero,  comentario, minutos,  tenemos, director);
		catalogo.add(dvd);
		Collections.sort(catalogo);
		cantTotDvd++;
		if (dvd.getTenemos()) {cantMiosDvd++;}
	}
	
	
	public void agregarCd(String titulo, String interprete, String genero, int minutos, boolean tenemos, String comentario) {
		Cd cd = new Cd( titulo,  genero,  comentario, minutos,  tenemos, interprete);
		catalogo.add(cd);
		Collections.sort(catalogo);
		cantTotCd++;
		if(cd.getTenemos()) {cantMiosCd++;}
		}
	
	
	public void eliminar(String titulo) {
		for(i = 0; i < catalogo.size(); i++) {
			if(titulo.compareTo(catalogo.get(i).getTitulo()) == 0) {
					if(catalogo.get(i) instanceof DVD) {
						System.out.println("Entro");
						cantTotDvd--;
						if(catalogo.get(i).getTenemos() == true) {cantMiosDvd--;}
					}else {
						cantTotCd--;
						if(catalogo.get(i).getTenemos() == true) {cantMiosCd--;}
					}
					System.out.println("Eliminando... " + titulo +" \n");
					catalogo.remove(i);
					System.out.println("Eliminado :)");}}}
	
	
	
	//paso 2 atributos para modifcar porque el texto no especiufca cuantos atributos o cuales debo modificar.
	public void modifcarAtrib(String titulo, String comentario, int minutos ) {
		for (i = 0; i < catalogo.size(); i++) {
			if (catalogo.get(i).getTitulo() == titulo) {
				System.out.println("Modificando atributos de "+ titulo + "....\n");
				catalogo.get(i).setComentario(comentario);
				catalogo.get(i).setMinutos(minutos);
				System.out.println("Modificado \n");
				break;}}
	}
	
	

	
	 public void listarPeli() {
		 for (i = 0; i < catalogo.size(); i++) {
			 if(catalogo.get(i) instanceof DVD) {
				 System.out.println("Titulo: "+ catalogo.get(i).getTitulo());
			 }}}
	 
	 public void listarCd() {
		 for (i = 0; i < catalogo.size(); i++) {
			 if(catalogo.get(i) instanceof Cd) {
				 System.out.println("Titulo: "+ catalogo.get(i).getTitulo().toString());
			 }}}
	 
	 
	 
	 public void listarMisDvds() {
		 for(i = 0; i < catalogo.size(); i++) {
			 if (catalogo.get(i).getTenemos() == true && catalogo.get(i) instanceof DVD ) {
				 System.out.println("titulo: " + catalogo.get(i).getTitulo().toString());}
		 } }
			 
	 
	 public void listarMisCds() {
		 for(i = 0; i < catalogo.size(); i++) {
			 if (catalogo.get(i).getTenemos() == true && catalogo.get(i) instanceof Cd) {
				 System.out.println("titulo: " + catalogo.get(i).getTitulo().toString());}}}
	 
	 
	 
	 public void listarMenosMinPeli(int minutos) {
		 System.out.println("Peliculas con menos de "+ minutos+ " minutos \n");
		for (i = 0; i < catalogo.size(); i++) {
			if (catalogo.get(i).getMinutos() < minutos && catalogo.get(i) instanceof DVD) {
				System.out.println("Titulo: "+ catalogo.get(i).getTitulo());
				}}}
	 
	 
	 
	 public void listarMenosMinCds(int minutos) {
		 System.out.println("Temas con menos de "+ minutos+ " minutos \n");
		for (i = 0; i < catalogo.size(); i++) {
			if (catalogo.get(i).getMinutos() < minutos && catalogo.get(i) instanceof Cd) {
				System.out.println("Titulo: "+ catalogo.get(i).getTitulo());
				}}}
	 
	 
	 public void listarXDir(String director) {
		 System.out.println("Peliculas de " + director + "\n");
		 for (i = 0; i < catalogo.size(); i++) {
			 if (catalogo.get(i).getID() == director && catalogo.get(i) instanceof DVD) {
				 System.out.println(catalogo.get(i).getTitulo()); 
				 }}
	 }
	 
	 
	 public void listarXInterprete(String interprete) {
		 System.out.println("Tema de " + interprete + ":\n" +"");
		 for (i = 0; i < catalogo.size(); i++) {
			 if (catalogo.get(i).getID() == interprete && catalogo.get(i) instanceof Cd) {
				 System.out.println(catalogo.get(i).getTitulo()); 
				 }}
	 }

	
	 public int buscarTitulo(String titulo) {
		 int s = -1;
		 for (int j = 0; j < catalogo.size(); j++) {
			 if (titulo.compareTo(catalogo.get(j).getTitulo()) == 0) {
				 s = j;
			 }
		 }
		 return (s);
	 }

	 
	 public String getIdAtrib(int i) {return this.catalogo.get(i).getID();}
	 public String getGeneroAtrib(int i) {return this.catalogo.get(i).getGenero();}
	 public String getComentarioAtrib(int i) {return this.catalogo.get(i).getComentario();}
	 public int getMinutosAtrib(int i) {return this.catalogo.get(i).getMinutos();}
}
	

