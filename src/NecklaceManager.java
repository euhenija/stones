import stones.stone.Stone;

import java.util.ArrayList;


public class NecklaceManager {

    private ArrayList<Stone> necklace;

    public NecklaceManager(){
        super();
    }

    public NecklaceManager(ArrayList<Stone> necklace) {
        this.necklace = necklace;
    }

    public ArrayList<Stone> getNecklace() {
        return necklace;
    }

    public NecklaceManager sortStonesFromNecklaceByPrice() {
        necklace.sort((o1, o2) -> (int) (o1.getStonePrice() - o2.getStonePrice()));
        return this;
    }


    public ArrayList<Stone> getStonesFromClarityRange(int minClarity, int maxClarity) {
        ArrayList<Stone> stonesFromClarityDiapason = new ArrayList<>();
        for (Stone stone : necklace) {
            if (stone.getStoneClarity() >= minClarity && stone.getStoneClarity() <= maxClarity) {
                stonesFromClarityDiapason.add(stone);
            }
        }
        return stonesFromClarityDiapason;
    }

    public double calculateWeightOfStonesInNecklace() {
        double totalWeightOfStonesInNecklace = 0;
        for (Stone stone : necklace) {
            totalWeightOfStonesInNecklace += stone.getStoneWeight();
        }
        return totalWeightOfStonesInNecklace;
    }

    public double calculateTotalNecklacePrice() {
        double totalNecklacePrice = 0;
        for (Stone stone : necklace) {
            totalNecklacePrice += stone.getStonePrice();
        }
        return totalNecklacePrice;
    }

    @Override
    public String toString() {
        return "" + necklace;
    }

}
