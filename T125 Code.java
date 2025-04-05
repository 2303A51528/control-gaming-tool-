import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     
        int playerX = 0, playerY = 0;

       
        int targetX = 5, targetY = 5;

        System.out.println("Welcome to the Voice-Controlled Learning Game!");
        System.out.println("Your objective is to reach the target located at (" + targetX + ", " + targetY + ").");
        System.out.println("Simulate voice commands by typing 'up', 'down', 'left', or 'right'.\n");

        while (true) {
            System.out.println("Your current position: (" + playerX + ", " + playerY + ")");
            System.out.print("Enter your command: ");
            String command = scanner.nextLine().toLowerCase(); 

           
            switch (command) {
                case "up":
                    playerY++;
                    break;
                case "down":
                    playerY--;
                    break;
                case "left":
                    playerX--;
                    break;
                case "right":
                    playerX++;
                    break;
                default:
                    System.out.println("Invalid command! Please use 'up', 'down', 'left', or 'right'.");
                    continue;
            }

            
            if (playerX == targetX && playerY == targetY) {
                System.out.println("🎉 Congratulations! You reached the target at (" + targetX + ", " + targetY + ").");
                break;
            }
        }

        scanner.close();
        System.out.println("Game Over. Thanks for playing!");
    }
}
