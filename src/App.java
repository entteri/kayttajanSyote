import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String userNumber1;
        String userNumber2;
        int sum = 0;

        String toiminto;

        System.out.print("Kirjoita 1. numero: ");
        userNumber1 = scanner.nextLine();

        System.out.print("Kirjoita 2. numero: ");
        userNumber2 = scanner.nextLine();

        System.out.print("Haluatko laskea luvut yhteen vai vähentää? Kirjoita plus tai miinus. ");
        toiminto = scanner.nextLine();

        if (toiminto.equals("plus")) {
            sum = Integer.valueOf(userNumber1) + Integer.valueOf(userNumber2);
            System.out.println("Tulos on " + sum + ".");
        } else if (toiminto.equals("miinus")) {
            sum = Integer.valueOf(userNumber1) - Integer.valueOf(userNumber2);
            System.out.println("Tulos on " + sum + ".");
        }
    }
}
