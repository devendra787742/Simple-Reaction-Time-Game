import java.util.*;

public class ReactionGame {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("🎮 Reaction Time Game");
        System.out.println("Wait for 'GO!' and press ENTER as fast as you can...");
        
        System.out.println("Get ready...");
        
        // Random delay (2 to 5 seconds)
        Thread.sleep(rand.nextInt(3000) + 2000);

        System.out.println("GO!");

        long startTime = System.currentTimeMillis();

        sc.nextLine(); // user presses enter

        long endTime = System.currentTimeMillis();

        long reactionTime = endTime - startTime;

        System.out.println("⏱ Your reaction time: " + reactionTime + " ms");
    }
}