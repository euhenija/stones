import stones.stone.Stone;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        NecklaceManager manager = new NecklaceManager();
        ArrayList<Stone> necklace = manager.createNecklace();
        NecklaceManager accountant = new NecklaceManager(necklace);

        Scanner scanner = new Scanner(System.in);
        System.out.println("SELECT ACTION:\n 1 - Sort stones by price\n 2 - Get stones from clarity range\n 3 - Get stones total weight and price\n");

        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Stones in necklace sorted by price:\n" + accountant.sortStonesFromNecklaceByPrice().toString());
                break;
            case 2:
                System.out.println("Stones with asked clarity range:\n" + accountant.getStonesFromClarityRange(8, 11).toString());
                break;
            case 3:
                System.out.println("Total weight of stones in necklace is: " + accountant.calculateWeightOfStonesInNecklace() + " carat \nTotal price of necklace is: " + accountant.calculateTotalNecklacePrice() + " dollars");
                break;
            default:
                System.out.println("Incorrect choice!");
                break;
        }
    }

}
