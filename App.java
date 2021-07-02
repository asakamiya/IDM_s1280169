import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Random ran = new Random();
        int dice1 = ran.nextInt(6) +1;
        int dice2 = ran.nextInt(6) +1;
        System.out.println("Rolling the Dice...");
        System.out.println("Dice 1: "+ dice1);
        System.out.println("Dice 2: "+ dice2);
        System.out.println("Total value: "+ (dice1 + dice2));
    }
}
