import stones.stone.Stone;

import java.util.ArrayList;


public class Meneger {

    private ArrayList<Stone> necklace;

    public Meneger(ArrayList<Stone> necklace) {
        this.necklace = necklace;
    }


    public ArrayList<Stone> getNecklace() {
        return necklace;
    }

    public Meneger sortStonesFromNecklceByPrice() {
        necklace.sort((o1, o2) -> (int) (o1.getStonePrice() - o2.getStonePrice()));
        return this;
    }

    public ArrayList<Stone> getStonesFromClarityDiapason(int maxClarity, int minClarity) {
        ArrayList<Stone> stonesFromClarityDiapason = new ArrayList<>();
        for (Stone stone : necklace) {
            if (stone.getStoneClarity() <= maxClarity && stone.getStoneClarity() >= minClarity) {
                stonesFromClarityDiapason.add(stone);
            }
        }
        return stonesFromClarityDiapason;
    }

    public double calculateWeightofstonesInNecklace() {
        double totalWeightOfStonesInNacklace = 0;
        for (Stone stone : necklace) {
            totalWeightOfStonesInNacklace += stone.getStoneWeight();
        }
        return totalWeightOfStonesInNacklace;
    }

    public double calculateTotalNeclacePrice() {
        double totalNeclacePrice = 0;
        for (Stone stone : necklace) {
            totalNeclacePrice += stone.getStonePrice();
        }
        return totalNeclacePrice;
    }

    @Override
    public String toString() {
        return "" + necklace;
    }

}
