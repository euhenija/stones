import stones.stone.Stone;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Stone> necklace = (new Necklace()).createNecklace();
        Meneger meneger = new Meneger(necklace);
        System.out.println("Stones in necklace sorted by price:\n" + meneger.sortStonesFromNecklceByPrice().toString());
        System.out.println("Stones with asked clarity diapasone:\n" + meneger.getStonesFromClarityDiapason(11, 11).toString());
        System.out.println("Total weight of stones in nrclace is: " + meneger.calculateWeightofstonesInNecklace() + " carat \nTotal price of necklace is: " + meneger.calculateTotalNeclacePrice() + " dollars");
    }

}
