import java.util.ArrayList;
import java.util.List;

public abstract class MaterialFisico extends MaterialBibliografico{
    private int cantidadDeEjemplares;
    private int cantidadDisponible;
    private static List<LibroFisico> listaLibroFisico =new ArrayList<>();
    private static List<Revista> listaRevista =new ArrayList<>();



    public MaterialFisico(int codigo, String titulo, int anioPublicacion, String editorial,String idioma,
                          int cantidadPaginas, int cantidadDeEjemplares){
        super(codigo, titulo, anioPublicacion, editorial, idioma, cantidadPaginas );
        this.cantidadDeEjemplares = cantidadDeEjemplares;
        this.cantidadDisponible =cantidadDeEjemplares;
    }

    //getters

    public int getCantidadDeEjemplares() {
        return cantidadDeEjemplares;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }


    public void setCantidadDeEjemplares(int cantidadDeEjemplares) {
        this.cantidadDeEjemplares = cantidadDeEjemplares;
    }




}
