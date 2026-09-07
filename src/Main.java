//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;



public class Main {
    public static void main(String[] args) {
        
        //Libros Fisicos
        MaterialBibliografico libro1 = new LibroFisico(3443, "Veinte Poemas de Amor", 2000, "Tornamesa", "español",
                540, 11, "pablo neruda");

        MaterialBibliografico libro3 = new LibroFisico(3445, "Ficciones", 2000, "libros al viento ", "español",
                540, 11, "Jorge Luis Borges");
        
        //Libros Digitales
        MaterialBibliografico libro4 = new LibroDigital(3446, "El Principito", 2000, "libros al viento ", "español",
                540, "Antoine", "123kb", "PDF");
        
        MaterialBibliografico libro5 = new LibroDigital(485, "Vuelo 126", 1995, "Castillana", "Español", 
                1523, "Jean Pieere", "456kb", "EPUB");

        //revistas
        MaterialBibliografico revista1 = new Revista(3443, "Time", 2000, "Time USA", "español",
                30, 2, "5");

        MaterialBibliografico revista2 = new Revista(3444, "Wired", 2000, "COndé Nast", "español",
                25, 11, "1");

        MaterialBibliografico Revista3 = new Revista(3445, "Voge", 2000, "Condé Nast", "español",
                540, 11, "3");

        //menu
        Scanner teclado = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("\n **** *** ** * BIBLIOTECA * ** *** **** ");
            System.out.print("Bienvenido a la Biblioteca, para interactuar seleccione una opción: \n");
            System.out.println(" | 1. Registrar libro");
            System.out.println(" | 2. Registrar revista");
            System.out.println(" | 3. Registrar libro digital");
            System.out.println(" | 4. Mostrar materiales");
            System.out.println(" | 5. Consultar material específico");
            System.out.println(" | 6. Prestar material");
            System.out.println(" | 7. Devolver material");
            System.out.println(" | 8. Descargar material digital");
            System.out.println(" | 9. Mostrar estadisticas");
            System.out.println(" | 0. Salir");

            opcion = teclado.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("Ingrese los datos: ");
                    MaterialFisico libro = new LibroFisico();
                    libro.registrar();
                    System.out.println("Libro agregado a la colección bibliográfica.");

                    break;

                case 2:
                    System.out.println("Ingrese los datos: ");
                    MaterialFisico revista = new Revista();
                    revista.registrar();
                    System.out.println("Revista agregada a la colección bibliográfica.");

                    break;

                case 3:
                    System.out.println("Ingrese los Datos: ");
                    MaterialDigital libroD = new LibroDigital();
                    libroD.registrar();
                    System.out.println("Libro Digital agregado a la colección bibliográfica.");
                    
                    break;

                case 4:
                    System.out.println("Materiales bibliográficos de la biblioteca.");
                    MaterialBibliografico.mostarPorCategoria();
                    break;

                case 5:
                    System.out.println("Hacer una búsqueda específica");
                    MaterialBibliografico.busqueda();
                    break;

                case 6:
                    System.out.println("Seleccione el tipo de material");
                    MaterialBibliografico.prestamo();
                    break;

                case 7:
                    System.out.println("Dovolución de material");
                    MaterialBibliografico.devolucion();
                    break;

                case 8:
                    System.out.println("Descarga de libro electrinico");
                    MaterialBibliografico.descarga();
                    break;

                case 9:

                    //double lb = LibroFisico.getCantidad();
                    float pLF = ((float)(LibroFisico.getCantidad()) * 100)/MaterialBibliografico.getContadorgeneral();
                    float pLD = ((float)(LibroDigital.getCantidad()) * 100)/MaterialBibliografico.getContadorgeneral();
                    float pR = ((float)(Revista.getCantidad() * 100))/MaterialBibliografico.getContadorgeneral();

                    System.out.println("Estadísticas\n");
                    System.out.println("Cantidad total de material bibliografico: " + MaterialBibliografico.getContadorgeneral());
                    System.out.println("Cantidad de libros fisicos: " + LibroFisico.getCantidad());
                    System.out.println("Cantidad de libros digitales: " + LibroDigital.getCantidad());
                    System.out.println("Cantidad de revistas: " + Revista.getCantidad());
                    System.out.println("Porcentaje de libros fisicos: " + String.format("%.3f", pLF) + "%");
                    System.out.println("Porcentaje de libros digitales: " + String.format("%.3f", pLD) + "%");
                    System.out.println("Porcentaje de revistas: " + String.format("%.3f", pR) + "%");

                    break;

                case 0:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida");
            }

        } while (opcion != 0);

        
        teclado.close();


        //fin del menu

    }


}