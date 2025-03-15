import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 1. Lungimea segmentului de dreaptă
        SegmentDeDreapta segment = new SegmentDeDreapta("Negru", 5);
        System.out.println("Lungimea segmentului: " + segment.getPerimetru());

        // 2. Lista de pătrate și cercuri -> calcul perimetru total
        List<Shape2D> forme2D = new ArrayList<>();
        forme2D.add(new Patrat("Albastru", 4));
        forme2D.add(new Cerc("Roșu", 3));

        double perimetruTotal = 0;
        for (Shape2D forma : forme2D) {
            perimetruTotal += forma.getPerimetru();
        }
        System.out.println("Perimetrul total al formelor 2D: " + perimetruTotal);

        // 3. Lista de forme 2D și 3D -> calcul arie totală
        List<Shape> forme = new ArrayList<>();
        forme.add(new Patrat("Verde", 5));
        forme.add(new Cerc("Galben", 2));
        forme.add(new Cub("Mov", 3));
        forme.add(new Sfera("Portocaliu", 2));

        double ariaTotala = 0;
        for (Shape forma : forme) {
            if (forma instanceof Shape2D) {
                ariaTotala += ((Shape2D) forma).getAria();
            } else if (forma instanceof Shape3D) {
                ariaTotala += ((Shape3D) forma).getAria();
            }
        }
        System.out.println("Aria totală a formelor: " + ariaTotala);

        // 4. Lista de sfere și cuburi -> calcul volum total
        List<Shape3D> forme3D = new ArrayList<>();
        forme3D.add(new Sfera("Argintiu", 3));
        forme3D.add(new Cub("Aur", 4));

        double volumTotal = 0;
        for (Shape3D forma : forme3D) {
            volumTotal += forma.getVolum();
        }
        System.out.println("Volumul total al formelor 3D: " + volumTotal);
    }
}