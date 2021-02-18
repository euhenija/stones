import stones.enums.PreciousStonesNames;
import stones.enums.SemipreciousStonesName;
import stones.enums.StoneColor;
import stones.stone.PreciousStone;
import stones.stone.SemiPreciousStone;
import stones.stone.Stone;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Stone> necklace = new ArrayList<>();
        necklace.add(new PreciousStone(PreciousStonesNames.DIAMOND, StoneColor.BLUE, 23.33, 51112.11, 11));
        necklace.add(new SemiPreciousStone(SemipreciousStonesName.AQUAMARINE, StoneColor.BLUE, 12.3, 254.66, 10));
        necklace.add(new SemiPreciousStone(SemipreciousStonesName.TANZANITE, StoneColor.RED, 2.3, 254.65, 8));
        necklace.add(new PreciousStone(PreciousStonesNames.RUBINE, StoneColor.RED, 3.33, 1112.11, 11));
        necklace.add(new SemiPreciousStone(SemipreciousStonesName.OPAL, StoneColor.PINK, 2.3, 134.65, 7));
        necklace.add(new PreciousStone(PreciousStonesNames.DIAMOND, StoneColor.WHITE, 23.33, 712.11, 6));

        NecklaceManager manager = new NecklaceManager(necklace);

        Scanner scanner = new Scanner(System.in);
        System.out.println("SELECT ACTION:\n 1 - Sort stones by price\n 2 - Get stones from clarity range\n 3 - Get stones total weight and price\n");

        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Stones in necklace sorted by price:\n" + manager.sortStonesFromNecklaceByPrice().toString());
                break;
            case 2:
                System.out.println("Stones with asked clarity range:\n" + manager.getStonesFromClarityRange(8, 11).toString());
                break;
            case 3:
                System.out.println("Total weight of stones in necklace is: " + manager.calculateWeightOfStonesInNecklace() + " carat \nTotal price of necklace is: " + manager.calculateTotalNecklacePrice() + " dollars");
                break;
            default:
                System.out.println("Incorrect choice!");
                break;
        }
    }

}
