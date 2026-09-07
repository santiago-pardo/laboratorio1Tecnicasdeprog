import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import interfaces.Descargable;

public class LibroDigital
        extends MaterialDigital implements Descargable{
    private String autor;
    private String tamanioArchivo;
    private static int cantidad;
    private static List<LibroDigital> listaLibroDigital =new ArrayList<>();

    public LibroDigital(){
        super();
        cantidad++;
        enlistar(this);
    }

    public LibroDigital(int codigo, String titulo, int anioPublicacion, String editorial,String idioma,
                        int cantidadPaginas,String autor,String tamanioArchivo, String formato){
        super( codigo, titulo,anioPublicacion, editorial,idioma,  cantidadPaginas,formato);
        this.autor=autor;
        this.tamanioArchivo=tamanioArchivo;
        cantidad++;
        enlistar(this);

    }
    public static int getCantidad() {
        return cantidad;
    }

    //getters

    public String getAutor() {
        return autor;
    }

    public String getTamanioArchivo() {
        return tamanioArchivo;
    }

    //setters
    public void setAutor(String autor) {
        this.autor = autor;
    }


    public void setTamanioArchivo(String tamanioArchivo) {
        this.tamanioArchivo = tamanioArchivo;
    }

    //metodos
    public void enlistar(LibroDigital libroDigital) {
        listaLibroDigital.add(libroDigital); 
    }

    public static void mostrarLista() {
        for (LibroDigital libroDigital : listaLibroDigital) {
            System.out.println(libroDigital.getTitulo());
        }
    }

    public void mostrarInformacion(){
        System.out.println("\ncódigo: "+ this.getCodigo()+
                            "\ntítulo: " + this.getTitulo()+
                            "\nautor: "+ this.getAutor()+
                            "\naño de publicación: "+ this.getAnioPublicacion()+
                            "\neditorial: "+ this.getEditorial()+
                            "\nidioma: "+ this.getIdioma()+
                            "\ncantidad de páginas: "+ this.getCantidadPaginas()+
                            "\nformato: "+ this.getFormato()+
                            "\ntamaño archivo: "+ this.getTamanioArchivo());
    }

    public static LibroDigital existencia(String target) {
        for(LibroDigital libroD : listaLibroDigital){
            if (target.equalsIgnoreCase( libroD.getTitulo())){
                    return  libroD;
            }
        }
        System.out.println("Material no registrado en biblioteca.");
        return null;
    }

    //Métodos sobreescritos
    @Override 
    public void descargar(){
        this.download();
    }

    @Override 
    public void registrar(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Código: ");
        int codigo = sc.nextInt();
        sc.nextLine();

        System.out.print("Título: ");
        String titulo = sc.nextLine();

        System.out.print("Año de Publicacion: ");
        int anioPublicacion = sc.nextInt();
        sc.nextLine();


        System.out.print("Editorial: ");
        String editorial = sc.nextLine();

        System.out.print("Idioma: ");
        String idioma = sc.nextLine();

        System.out.print("Cantidad de Páginas: ");
        int cantidadPaginas = sc.nextInt();
        sc.nextLine();

        System.out.print("Autor: ");
        String autor = sc.nextLine();


        System.out.print("Formato: ");
        String formato = sc.nextLine();

        System.out.print("Tamaño: ");
        String tamanio = sc.nextLine();

   

        this.setCodigo(codigo);
        this.setTitulo(titulo);
        this.setAnioPublicacion(anioPublicacion);
        this.setEditorial(editorial);
        this.setIdioma(idioma);
        this.setCantidadPaginas(cantidadPaginas);
        this.setAutor(autor);
        this.setFormato(formato);
        this.setTamanioArchivo(tamanio);
    }
}
