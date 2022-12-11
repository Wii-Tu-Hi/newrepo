import java.util.*;

public class Test {
    public static final Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        String quit;
        System.out.println("Want to quit? Y/N");
        quit = keyboard.nextLine();

        while (quit.trim().length() != 1) {
            System.out.println("ERROR: Please enter only one character.");
            quit = keyboard.nextLine();
        }
        while (quit.charAt(0) != 110 || quit.charAt(0) != 121) {
            System.out.println("ERROR: Please enter either y or n");
            quit = keyboard.nextLine();
            while (quit.trim().length() != 1) {
                System.out.println("ERROR: Please enter only one character.");
                quit = keyboard.nextLine();
            }
        }
    }
}