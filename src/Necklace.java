import stones.enums.PreciousStonesNames;
import stones.enums.SemipreciousStonesName;
import stones.enums.StoneColor;
import stones.stone.PreciousStone;
import stones.stone.SemiPreciousStone;
import stones.stone.Stone;

import java.util.ArrayList;


public class Necklace {

    private ArrayList<Stone> necklaceCreator;

    public Necklace() {

    }

    public Necklace(ArrayList<Stone> necklaceCreator) {
        this.necklaceCreator = necklaceCreator;
    }

    public ArrayList<Stone> getNecklaceCreator() {
        return necklaceCreator;
    }

    public ArrayList<Stone> createNecklace() {
        ArrayList<Stone> createdNecklace = new ArrayList<Stone>();
        createdNecklace.add(new PreciousStone(PreciousStonesNames.DIAMOND, StoneColor.BLUE, 23.33, 51112.11, 11));
        createdNecklace.add(new SemiPreciousStone(SemipreciousStonesName.AQUAMARINE, StoneColor.BLUE, 12.3, 234.65, 10));
        createdNecklace.add(new SemiPreciousStone(SemipreciousStonesName.TANZANITE, StoneColor.RED, 2.3, 254.65, 8));
        createdNecklace.add(new PreciousStone(PreciousStonesNames.RUBINE, StoneColor.RED, 3.33, 1112.11, 11));
        createdNecklace.add(new SemiPreciousStone(SemipreciousStonesName.OPAL, StoneColor.PINK, 2.3, 134.65, 7));
        createdNecklace.add(new PreciousStone(PreciousStonesNames.DIAMOND, StoneColor.WHITE, 23.33, 712.11, 6));

        return createdNecklace;
    }
}
