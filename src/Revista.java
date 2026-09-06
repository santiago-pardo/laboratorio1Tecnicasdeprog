import java.util.ArrayList;
import java.util.List;
import interfaces.Prestable;

public class Revista
        extends MaterialFisico
        implements Prestable {
    private String numeroEdicion;
    private static int cantidad;
    private static List<Revista> listaRevista =new ArrayList<>();

    public Revista(int codigo, String titulo, int anioPublicacion, String editorial,String idioma,
                   int cantidadPaginas, int cantidadDeEjemplares, String numeroEdicion){
        super(codigo,titulo, anioPublicacion, editorial,idioma,cantidadPaginas,
                cantidadDeEjemplares);
        this.numeroEdicion=numeroEdicion;
        cantidad++;
        this.incremento();
        enlistar(this);

    }

    public static int getCantidad() {
        return cantidad;
    }


    //getters
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


    //
    @Override
    public  void prestar(){
        if (getCantidadDisponible()> 0) {
            setCantidadDisponible(getCantidadDisponible()- 1);
            System.out.println("un ejemplar de"+ getTitulo() +" ha sido prestado");

        }

        System.out.println("quedan "+ getCantidadDisponible() +" ejemplares disponibles");

    }
    @Override
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

