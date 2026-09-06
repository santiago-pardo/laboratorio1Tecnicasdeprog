import java.util.ArrayList;
import java.util.List;
import interfaces.Prestable;
import java.util.Scanner;

public class LibroFisico
        extends MaterialFisico
        implements Prestable {
    private String autor;
    private static int cantidad;
    private static List<LibroFisico> listaLibroFisico =new ArrayList<>();



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

    public static int getCantidad() {
        return cantidad;
    }

    //getters

    public String getAutor() {
        return autor;
    }
   //setters
    public void setAutor(String autor) {
        this.autor = autor;
    }

    //interface




    //metodos propios



    public  static LibroFisico registrar(Scanner sc) {


        System.out.print("codigo: ");
        int codigo = sc.nextInt();
        sc.nextLine();

        System.out.print("Título: ");
        String titulo = sc.nextLine();

        System.out.print("año de publicacion ");
        int anioPublicacion = sc.nextInt();
        sc.nextLine();


        System.out.print("editorial: ");
        String editorial = sc.nextLine();

        System.out.print("idioma: ");
        String idioma = sc.nextLine();

        System.out.print("cantidad de paginas ");
        int cantidadPaginas = sc.nextInt();


        System.out.print("cantidad de ejemplares: ");
        int cantidadDeEjemplares = sc.nextInt();
        int cantidadDisponible = cantidadDeEjemplares;
        sc.nextLine();

        System.out.print("autor: ");
        String autor = sc.nextLine();


        return new LibroFisico(codigo, titulo, anioPublicacion,editorial,idioma,cantidadPaginas,cantidadDeEjemplares,autor);
    }



    //sobreescritura
    public void enlistar(LibroFisico libroFisico){
        listaLibroFisico.add(libroFisico);
    }



    public static void mostrarLista () {
        for (LibroFisico libroFisico : listaLibroFisico) {
            System.out.println(libroFisico.getTitulo());
        }

    }


    public  void prestar(){
        if (getCantidadDisponible()> 0) {
            setCantidadDisponible(getCantidadDisponible()- 1);
            System.out.println("un ejemplar de"+ getTitulo() +" ha sido prestado");

        }

        System.out.println("quedan "+ getCantidadDisponible() +" ejemplares disponibles");

    }


    public  void devolver(){
        if (getCantidadDisponible()<=getCantidadDeEjemplares()) {
            setCantidadDisponible(getCantidadDisponible()- 1);
            System.out.println("un ejemplar de"+ getTitulo() +" ha sido devuelto");
            System.out.println("quedan "+ getCantidadDisponible() +" ejemplares disponibles");
        } else{
            System.out.println("no se puede devolver, ya hay"+ getCantidadDisponible() +" ejemplares disponibles, todos estan en biblioteca");

        }

    }






}
