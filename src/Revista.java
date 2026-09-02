import java.util.ArrayList;
import java.util.List;

public class Revista extends MaterialFisico{
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

    public void mostrarLista () {
        for (Revista revista : listaRevista) {
            System.out.println(revista.getTitulo());
        }

    }
}

