//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;



public class Main {
    public static void main(String[] args) {
        /*
        MaterialBibliografico libro = new LibroFisico(78, "NANA", 2017, "Castelle", "Español", 718, 2, "George Sphintons");
        LibroFisico material = LibroFisico.existencia("NANA");
        if (material != null) {
            System.out.println("Está y tengo el nombre del autor:" + material.getAutor());
        }else{
            System.out.println("No está");
        }*/

        //menu
        Scanner teclado = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("\n Biblioteca ");
            System.out.print("Seleccione una opción: ");
            System.out.println("1. Registrar libro");
            System.out.println("2. Registrar revista");
            System.out.println("3. Registrar libro digital");
            System.out.println("4. Mostrar materiales");
            System.out.println("5. Prestar material");
            System.out.println("6. Devolver material");
            System.out.println("7. Descargar material digital");
            System.out.println("8. Mostrar estadisticas");
            System.out.println("0. Salir");

            opcion = teclado.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("Ingrese los datos: ");
                    MaterialFisico libro = new LibroFisico();
                    libro.registrar();
                    //LibroFisico libro = registrar(sc);
                    //listaLibroFisico.add(registrar(sc));
                    System.out.println("Libro agregado a la colección bibliográfica.");

                    break;

                case 2:
                    System.out.println("Ingrese los datos: ");
                    MaterialFisico revista = new Revista();
                    revista.registrar();
                    System.out.println("Revista agregado a la colección bibliográfica.");

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
                    System.out.println("prestando material");
                    break;

                case 6:
                    System.out.println("devolviendo material");
                    break;

                case 7:
                    System.out.println("descargando material digital");
                    break;

                case 8:
                    System.out.println("mostrando estadisticas");
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

        MaterialBibliografico libro1 = new LibroFisico(3443, "cien años de seriedad", 2000, "libros al viento ", "español",
                540, 11, "pablo neruda");

        MaterialBibliografico libro2 = new LibroFisico(3444, "biblia", 2000, "libros al viento ", "español",
                540, 11, "pablo ");

        MaterialBibliografico libro3 = new LibroFisico(3445, "el principe", 2000, "libros al viento ", "español",
                540, 11, "pablo escobar");

        MaterialBibliografico libro4 = new LibroFisico(3446, "el principito", 2000, "libros al viento ", "español",
                540, 11, "pablito ");

        //revistas
        MaterialBibliografico revista1 = new Revista(3443, "chismes de la semana", 2000, "libros al viento ", "español",
                540, 11, "pablo neruda");

        MaterialBibliografico revista2 = new Revista(3444, "el escandalo de los famosos", 2000, "libros al viento ", "español",
                540, 11, "pablo ");

        MaterialBibliografico Revista3 = new Revista(3445, " como lucir fantastico", 2000, "libros al viento ", "español",
                540, 11, "pablo escobar");

        //MaterialBibliografico.mostrarLista();









        //MaterialBibliografico revista4 = new Revista(3243, "the new york times", 2023, "new york times", "ingles",
               // 23, 4, "250");


    }


}