//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MaterialBibliografico libro1= new LibroFisico(3443, "cien años de seriedad",2000, "libros al viento ","español",
                540, 11, "pablo neruda");

        System.out.println(LibroFisico.getCantidad());
        System.out.println(MaterialBibliografico.getContadorgeneral());

        MaterialBibliografico revista1= new Revista(3243,"the new york times",2023,"new york times", "ingles",
                23,4, "250");

        System.out.println(MaterialBibliografico.getContadorgeneral());
        System.out.println(LibroFisico.getCantidad());
        System.out.println(Revista.getCantidad());
    }



}