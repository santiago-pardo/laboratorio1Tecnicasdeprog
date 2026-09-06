import java.util.ArrayList;
import java.util.List;
import interfaces.Prestable;
import java.util.Scanner;

public class LibroFisico extends MaterialFisico implements Prestable {
    private String autor;
    private static int cantidad;
    private static List<LibroFisico> listaLibroFisico =new ArrayList<>();

    public LibroFisico(){
        super();
        cantidad++;
        this.incremento();
        enlistar(this);
    }

    public LibroFisico(int codigo, String titulo, int anioPublicacion, String editorial,String idioma, int cantidadPaginas,
                       int cantidadDeEjemplares, String autor){
        super(codigo,titulo,anioPublicacion, editorial,idioma, cantidadPaginas, cantidadDeEjemplares);
        this.autor=autor;
        cantidad++;
        this.incremento();
        enlistar(this);
    }

    /*implementar otra forma de crear un objeto si algun dato opcional no esta disponible
    public LibroFisico(int codigo, String titulo, int anioPublicacion, String editorial,String idioma, int cantidadPaginas,
                       int cantidadDeEjemplares, String autor){
        super(codigo,titulo,anioPublicacion, editorial,idioma, cantidadPaginas, cantidadDeEjemplares);
        this.autor=autor;
        cantidad++;
        this.incremento();
        enlistar(this);
    }*/

    //getters
    public static int getCantidad() {
        return cantidad;
    }

    public String getAutor() {
        return autor;
    }

   //setters
    public void setAutor(String autor) {
        this.autor = autor;
    }

    //métodos sobreescritos de la clase padre
    @Override 
    public void registrar() {
        
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


        System.out.print("Cantidad de Ejemplares: ");
        int cantidadDeEjemplares = sc.nextInt();
        sc.nextLine();

        System.out.print("Autor: ");
        String autor = sc.nextLine();


        this.setCodigo(codigo);
        this.setTitulo(titulo);
        this.setAnioPublicacion(anioPublicacion);
        this.setEditorial(editorial);
        this.setIdioma(idioma);
        this.setCantidadPaginas(cantidadPaginas);
        this.setCantidadDeEjemplares(cantidadDeEjemplares);
        this.setCantidadDisponible(cantidadDeEjemplares);
        this.setAutor(autor);
    }
 
    public void enlistar(LibroFisico libroFisico) {
        listaLibroFisico.add(libroFisico);
    }

    public static void mostrarLista () {
        for (LibroFisico libroFisico : listaLibroFisico) {
            System.out.println(libroFisico.getTitulo());
        }
    }

    public static LibroFisico existencia(String target) {
        for(MaterialBibliografico material : getListaMaterialBibliografico()){
            if (target == material.getTitulo()){
                for(LibroFisico libro : listaLibroFisico) {
                    if (target == libro.getTitulo()){
                        return  libro;
                    }
                }
            }else{
                System.out.println("Material no registrado en biblioteca.");
                return null;
            }
        }
        return null;
    }

    //Implementación de Interfaz Prestable
    @Override 
    public  void prestar() {
        if (getCantidadDisponible()> 0) {
            setCantidadDisponible(getCantidadDisponible()- 1);
            System.out.println("Un ejemplar de '"+ getTitulo() +"' ha sido prestado.");
        }else{
            System.out.println("No hay ejemplares disponibles de '"+ getTitulo() +"' en este momento.");
        }
    }

    @Override 
    public  void devolver(){
        if (getCantidadDisponible()<=getCantidadDeEjemplares()) {
            setCantidadDisponible(getCantidadDisponible() + 1);
            System.out.println("El ejemplar de '"+ getTitulo() +"' ha sido devuelto.");
            System.out.println("Quedan "+ getCantidadDisponible() +" ejemplares disponibles.");
        } else{
            System.out.println("Devolución no aceptada, todos los ejemplares que dispone la biblioteca de '"+ getTitulo() +"' se encuentran en completos.");
        }

    }






}
