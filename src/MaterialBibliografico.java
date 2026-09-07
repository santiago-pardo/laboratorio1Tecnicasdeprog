import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class MaterialBibliografico {
    private int codigo;
    private String titulo;
    private int anioPublicacion;
    private String editorial;
    private String idioma;
    private int cantidadPaginas;
    private static int contadorgeneral= 0;
    private static List<MaterialBibliografico> listaMaterialBibliografico =new ArrayList<>();

    public MaterialBibliografico(){
        enlistar(this);
        contadorgeneral++;
    }

    public MaterialBibliografico(int codigo, String titulo, int anioPublicacion,
                                 String editorial,String idioma, int cantidadPaginas){
        this.codigo=codigo;
        this.titulo=titulo;
        this.anioPublicacion=anioPublicacion;
        this.editorial=editorial;
        this.idioma= idioma;
        this.cantidadPaginas=cantidadPaginas;
        enlistar(this);
        contadorgeneral++;
    }

    public MaterialBibliografico(String titulo, int anioPublicacion){
        this.titulo=titulo;
        this.anioPublicacion=anioPublicacion;
    }

    public static int getContadorgeneral() {
        return contadorgeneral;
    }

    public void incremento(){
        contadorgeneral++;
    }




    //setters
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public void setCantidadPaginas(int cantidadPaginas) {
        this.cantidadPaginas = cantidadPaginas;
    }

    //getters

    public int getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getCantidadPaginas() {
        return  cantidadPaginas;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public String getEditorial() {
        return editorial;
    }

    public String getIdioma() {
        return idioma;
    }

    public static List<MaterialBibliografico> getListaMaterialBibliografico() {
        return listaMaterialBibliografico;
    }


    //metodos propios
    public void registrarMaterial(){
        //crear un metodo registrar material y sobreecribirlo() o especializarlo para que segun lo que reciba sea lo que registre
    }

    public void enlistar(MaterialBibliografico material){
        listaMaterialBibliografico.add(material);
    }

    public static void mostrarLista () {
        for (MaterialBibliografico material : listaMaterialBibliografico) {
            System.out.println(material.getTitulo());
        }

    }

    public static void mostarPorCategoria(){
        System.out.println("\n<< LIBROS FÍSICOS >>");
        LibroFisico.mostrarLista();
        System.out.println("\n<< REVISTAS >>");
        Revista.mostrarLista();
        System.out.println("\n << LIBROS DIGITALES >>");
        LibroDigital.mostrarLista();
    }

    public static void busqueda(){
        Scanner sc = new Scanner(System.in);

        System.out.println("\n    1. Libro Fisico\n    2. Revista\n    3. Libro Digital\n    0. Regresar al menú principal");
        int opc = sc.nextInt();
        sc.nextLine();

        switch(opc){
            case 1:
                System.out.println("Ingrese el título del libro: ");
                String titulo = sc.nextLine();
                LibroFisico libro = LibroFisico.existencia(titulo);

                if (libro != null){
                    libro.mostrarInformacion(); 
                }

                break;

            case 2:
                System.out.println("Ingrese el título de la revista: ");
                String tituloRevista = sc.nextLine();
                Revista revista = Revista.existencia(tituloRevista);

                if (revista != null){
                    revista.mostrarInformacion();
                }

                break;

            case 3:
                System.out.println("Ingrese el título del libro: ");
                String tituloLD = sc.nextLine();
                LibroDigital libroD = LibroDigital.existencia(tituloLD);

                if (libroD != null){
                    libroD.mostrarInformacion();
                }
            
                break;

            case 0:
                break;

            default:
                System.out.println("Opción no válida.");
        }
    }

    public static void prestamo(){
       Scanner sc = new Scanner(System.in);

        System.out.println("\n    1. Libro Fisico\n    2. Revista\n    0. Regresar al menú principal");
        int opc = sc.nextInt();
        sc.nextLine(); 

        switch(opc){
            case 1:
                System.out.println("Ingrese el título del libro: ");
                String titulo = sc.nextLine();
                LibroFisico libro = LibroFisico.existencia(titulo);

                if (libro != null){
                    libro.prestar();
                }
                break;

            case 2:
                System.out.println("Ingrese el título de la revista: ");
                String tituloRevista = sc.nextLine();
                Revista revista = Revista.existencia(tituloRevista);

                if (revista != null){
                    revista.prestar();
                }
                break;

            case 0:
                break;

            default:
                System.out.println("Opció no válida.");
        }

    }

    public static void devolucion(){
       Scanner sc = new Scanner(System.in);

        System.out.println("\n    1. Libro Fisico\n    2. Revista\n    0. Regresar al menú principal");
        int opc = sc.nextInt();
        sc.nextLine(); 

        switch(opc){
            case 1:
                System.out.println("Ingrese el título del libro: ");
                String titulo = sc.nextLine();
                LibroFisico libro = LibroFisico.existencia(titulo);

                if (libro != null){
                    libro.devolver();
                }
                break;

            case 2:
                System.out.println("Ingrese el título de la revista: ");
                String tituloRevista = sc.nextLine();
                Revista revista = Revista.existencia(tituloRevista);

                if (revista != null){
                    revista.devolver();
                }
                break;

            case 0:
                break;

            default:
                System.out.println("Opció no válida.");
        }

    }

    public static void descarga(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el título del libro: ");
        String titulo = sc.nextLine();
        LibroDigital libro = LibroDigital.existencia(titulo);

        if (libro != null){
            libro.descargar();
        }
    }

}
