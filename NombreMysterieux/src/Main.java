import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int m = random.nextInt(100);
        int num;
        System.out.println(m);
        do {

            System.out.print("Enter your guessed number: ");
            num = scanner.nextInt();
            if (num > m) {
                System.out.println("The number is bigger, try again !");
            } else if (num<m) {
                System.out.println("The number is smaller, try again !");
            }
            else {
                System.out.println("Bingo! You guessed the number ");
            }
        }while (num !=m);

    }
}