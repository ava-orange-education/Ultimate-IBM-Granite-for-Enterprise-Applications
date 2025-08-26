import java.util.Scanner; // Import Scanner for user input handling

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // Optional: Add a simple input request to make the program interactive
        Scanner scanner = new Scanner(System.in);
        System.out.print("Press enter to exit or type something to continue: ");
        scanner.nextLine();
    }
}
