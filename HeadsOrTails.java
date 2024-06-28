import java.util.Random;
import java.util.Scanner;

public class HeadsOrTails{
    public static void main(String[] args){
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int headsCount = 0, tailsCount = 0;

        System.out.println("Who are you? ");
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println("Tossing a coin...");

        for(int i=1;i<=3;i++){
            boolean isHeads = rand.nextBoolean();
            if(isHeads){
                System.out.println("Round " + i + ": Heads");
                headsCount++;
            }else{
                System.out.println("Round " + i + ": Tails");
                tailsCount++;
            }
        }
        System.out.println("Heads: " + headsCount + ", Tails: " + tailsCount);
    }
}
