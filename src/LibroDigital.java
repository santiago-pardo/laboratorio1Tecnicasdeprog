import java.util.ArrayList;
import java.util.List;

public class LibroDigital
        extends MaterialDigital{
    private String autor;
    private String tamanioArchivo;
    private static int cantidad;
    private static List<LibroDigital> listaLibroDigital =new ArrayList<>();

    public LibroDigital(int codigo, String titulo, int anioPublicacion, String editorial,String idioma,
                        int cantidadPaginas,String autor,String tamanioArchivo, String formato){
        super( codigo, titulo,anioPublicacion, editorial,idioma,  cantidadPaginas,formato);
        this.autor=autor;
        this.tamanioArchivo=tamanioArchivo;
        cantidad++;
        this.incremento();
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
    public void enlistar(LibroDigital libroDigital){
        listaLibroDigital.add(libroDigital);
    }


    public static void mostrarLista () {
        for (LibroDigital libroDigital : listaLibroDigital) {
            System.out.println(libroDigital.getTitulo());
        }

    }
}
