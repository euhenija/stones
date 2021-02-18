import stones.enums.PreciousStonesNames;
import stones.enums.SemipreciousStonesName;
import stones.enums.StoneColor;
import stones.stone.PreciousStone;
import stones.stone.SemiPreciousStone;
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


    public ArrayList<Stone> createNecklace() {
        ArrayList<Stone> createdNecklace = new ArrayList<>();
        createdNecklace.add(new PreciousStone(PreciousStonesNames.DIAMOND, StoneColor.BLUE, 23.33, 51112.11, 11));
        createdNecklace.add(new SemiPreciousStone(SemipreciousStonesName.AQUAMARINE, StoneColor.BLUE, 12.3, 254.66, 10));
        createdNecklace.add(new SemiPreciousStone(SemipreciousStonesName.TANZANITE, StoneColor.RED, 2.3, 254.65, 8));
        createdNecklace.add(new PreciousStone(PreciousStonesNames.RUBINE, StoneColor.RED, 3.33, 1112.11, 11));
        createdNecklace.add(new SemiPreciousStone(SemipreciousStonesName.OPAL, StoneColor.PINK, 2.3, 134.65, 7));
        createdNecklace.add(new PreciousStone(PreciousStonesNames.DIAMOND, StoneColor.WHITE, 23.33, 712.11, 6));

        return createdNecklace;
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
