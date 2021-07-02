import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Random ran = new Random();
        Scanner scn= new Scanner(System.in);
        int dice1 = ran.nextInt(6) +1;
        int dice2 = ran.nextInt(6) +1;
        

        System.out.println("What is your name?");
        String name = scn.nextLine();
        System.out.println("Hello, " + name + "!");

        System.out.println("Rolling the dice...");
        System.out.println("Die 1: "+ dice1);
        System.out.println("Die 2: "+ dice2);
        System.out.println("Total value: "+ (dice1 + dice2));
        System.out.println(name + " won!");
    }
}
