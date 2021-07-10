package program;

import model.Garden;
import model.Plant;

public class Program {
    public static void main(String[] args) {
        Plant p1 = new Plant();
        Plant p2 = new Plant("Rose", "Red");
        Plant p3 = new Plant("Sole", "Blue", 1, 2, 5.75F);
        Plant p4 = new Plant("Grace", "Green");

        Garden garden = new Garden(3);
        System.out.println(garden.add(p1) ? "Plant 1 added" : "Plant 1 not added");
        System.out.println("Count of plants " + garden.count());
        System.out.println(garden.add(p2) ? "Plant 2 added" : "Plant 2 not added");
        System.out.println("Count of plants " + garden.count());
        System.out.println(garden.add(p3) ? "Plant 3 added" : "Plant 3 not added");
        System.out.println("Count of plants " + garden.count());
        System.out.println(garden.add(p4) ? "Plant 4 added" : "Plant 4 not added");
        System.out.println("Count of plants " + garden.count());

        System.out.println(garden.allPlants());

        System.out.println("Plant get 2 " + garden.get(2));

        System.out.println("Plant search Grace " + garden.search("Grace"));
        System.out.println("Plant search Rose " + garden.search("Rose"));

        System.out.println("Insert plant Grace on 0 index : " + (garden.insert(0, p4) ? "Grace is inserted" : "Grace is NOT inserted"));
        System.out.println(garden.allPlants());

        garden.delete(p3);
        System.out.println("Count of plants after delete plant 3 : " + garden.count());
        System.out.println(garden.allPlants());

        garden.insert(2, p3);
        System.out.println("Count of plants after inserting plant 3 : " + garden.count());
        System.out.println(garden.allPlants());

    }
}
