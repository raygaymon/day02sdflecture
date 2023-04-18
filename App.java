package sg.edu.nus.iss;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Mountainbike mountainbike = new Mountainbike(5, 10, 20);
        System.out.println(mountainbike.toString());

        Mountainbike mountainbike2 = new Mountainbike(7, 35, 20);
        Mountainbike mountainbike3 = new Mountainbike(1, 69, 20);
        Mountainbike mountainbike4 = new Mountainbike(8, 79, 20);

        RoadBike roadbike = new RoadBike(4, 23, 7);

        List<Bicycle> bicycles = new ArrayList<Bicycle>();
        bicycles.add(mountainbike);
        bicycles.add(mountainbike2);
        bicycles.add(mountainbike3);
        bicycles.add(mountainbike4);
        bicycles.add(roadbike);

        // for (int i = 0; i < bicycles.size(); i++) {
        // System.out.println(i+1 + ". " + bicycles.get(i).toString());}

        for (Bicycle bicycle : bicycles) {
            if (bicycle instanceof Mountainbike) {
                System.out.println(bicycle.hashCode() + " is a mountainbike\n");
            } else if (bicycle instanceof RoadBike) {
                System.out.println(bicycle.hashCode() + " is a roadbike\n");
            }
        }
        LinkedListExample fuckMe = new LinkedListExample();
        fuckMe.LinkedListEg();

    }

}
