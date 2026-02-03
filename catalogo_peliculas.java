import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class Pelicula {
    String titulo;
    int year;
    String genero;

    public Pelicula(String titulo, int year, String genero) {
        this.titulo = titulo;
        this.year = year;
        this.genero = genero;
    }
}

public class OrdenarPeliculas {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Pelicula> peliculas = new ArrayList<>();

        System.out.print("Cantidad de peliculas: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            peliculas.add(leerPelicula());
        }

        ordenarPorYear(peliculas);
        mostrarPeliculas(peliculas);
    }

    public static Pelicula leerPelicula() {
        scanner.nextLine();

        System.out.print("Titulo: ");
        String titulo = scanner.nextLine();

        System.out.print("Year de lanzamiento: ");
        int year = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Genero: ");
        String genero = scanner.nextLine();

        return new Pelicula(titulo, year, genero);
    }

    public static void ordenarPorYear(ArrayList<Pelicula> peliculas) {
        peliculas.sort(Comparator.comparingInt(p -> p.year));
    }

    public static void mostrarPeliculas(ArrayList<Pelicula> peliculas) {
        System.out.println("\n--- LISTA ORDENADA POR YEAR ---");
        for (Pelicula p : peliculas) {
            System.out.println(p.year + " - " + p.titulo + " (" + p.genero + ")");
        }
    }
}