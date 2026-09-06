import java.util.ArrayList;
import java.util.List;

public abstract class MaterialDigital extends MaterialBibliografico{
    private String formato;
    private static List<LibroDigital> listaLibroDigital =new ArrayList<>();

    public MaterialDigital(int codigo, String titulo, int anioPublicacion,
                           String editorial,String idioma, int cantidadPaginas,String formato){
        super(codigo,titulo,anioPublicacion,
        editorial,idioma,cantidadPaginas);

        this.formato=formato;
    }

    //getters
    public String getFormato() {
        return formato;
    }

    //setters
    public void setFormato(String formato) {
        this.formato = formato;
    }

    //metodos propios
    public void descargar(){
        System.out.println("material descargado");
    }
}
