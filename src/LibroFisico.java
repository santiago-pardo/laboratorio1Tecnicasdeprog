import java.util.ArrayList;
import java.util.List;

public class LibroFisico extends MaterialFisico{
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
        mostrarLista();


    }

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


    //metodos propios

    public void enlistar(LibroFisico libro){
        listaLibroFisico.add(libro);
    }

    public void mostrarLista (){
        for (LibroFisico libro:listaLibroFisico){
            System.out.println(libro.getTitulo());
        }

    }
}
