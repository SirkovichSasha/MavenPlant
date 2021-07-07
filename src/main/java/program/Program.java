package program;

import model.Plant;

public class Program {
    public static void main(String[] args) {
        Plant p1=new Plant();
        Plant p2=new Plant("Rose","Red");
        Plant p3=new Plant("Sole","Blue",1,2,5.75F);

        //================print all objects===============
        System.out.println(" Plant 1 : "+p1);
        System.out.println(" Plant 2 : "+p2);
        System.out.println(" Plant 3 : "+p3);

        //====================call all functions for all objects=======
        System.out.println("Price Plant 1 after Method 1 : "+p1.addPrice(0.25F));
        System.out.println("Field 'color' plant 1 : "+p1.getPlantColor());

        System.out.println("Price Plant 2 after Method 1 : "+p2.addPrice(0.25F));
        System.out.println("Field 'color' plant 2 : "+p2.getPlantColor());

        System.out.println("Price Plant 1 after Method 1 : "+p3.addPrice(0.25F));
        System.out.println("Field 'color' plant 3 : "+p3.getPlantColor());
    }
}
