import java.util.ArrayList;
import java.util.List;
import interfaces.Prestable;
import java.util.Scanner;

public class Revista
        extends MaterialFisico
        implements Prestable {
    private String numeroEdicion;
    private static int cantidad;
    private static List<Revista> listaRevista =new ArrayList<>();

    public Revista(){
        super();
        cantidad++;
        this.incremento();
        enlistar(this);
    }

    public Revista(int codigo, String titulo, int anioPublicacion, String editorial,String idioma,
                   int cantidadPaginas, int cantidadDeEjemplares, String numeroEdicion){
        super(codigo,titulo, anioPublicacion, editorial,idioma,cantidadPaginas,
                cantidadDeEjemplares);
        this.numeroEdicion=numeroEdicion;
        cantidad++;
        this.incremento();
        enlistar(this);
    }

    //getters
    public static int getCantidad() {
        return cantidad;
    }

    public String getNumeroEdicion() {
        return numeroEdicion;
    }

    //setters
    public void setNumeroEdicion(String numeroEdicion) {
        this.numeroEdicion = numeroEdicion;
    }


    //metodos
    public void enlistar(Revista revista){
        listaRevista.add(revista);
    }

    public static void mostrarLista () {
        for (Revista revista : listaRevista) {
            System.out.println(revista.getTitulo());
        }
    }

    public static Revista existencia(String target) {
        for(MaterialBibliografico material : getListaMaterialBibliografico()){
            if (target == material.getTitulo()){
                for(Revista revista : listaRevista) {
                    if (target == revista.getTitulo()){
                        return  revista;
                    }
                }
            }else{
                System.out.println("Material no registrado en biblioteca.");
                return null;
            }
        }
        return null;
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


        System.out.print("Cantidad de Ejemplares: ");
        int cantidadDeEjemplares = sc.nextInt();
        sc.nextLine();

        System.out.print("Número de edición: ");
        String nEdicion = sc.nextLine();

   

        this.setCodigo(codigo);
        this.setTitulo(titulo);
        this.setAnioPublicacion(anioPublicacion);
        this.setEditorial(editorial);
        this.setIdioma(idioma);
        this.setCantidadPaginas(cantidadPaginas);
        this.setCantidadDeEjemplares(cantidadDeEjemplares);
        this.setCantidadDisponible(cantidadDeEjemplares);
        this.setNumeroEdicion(nEdicion);
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

