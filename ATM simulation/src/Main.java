import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s=0;


    System.out.println("====== Bienvenue ======");
    System.out.println("1. Consulter votre solde ");
    System.out.println("2. Dépôt");
    System.out.println("3. Retrait ");
    System.out.println("4. Quitter ");
    System.out.println("Votre choix: ");

    int c = scanner.nextInt();
    if (c == 1) {
        System.out.print("Votre solde : " + s);
    } else if (c == 2) {
        System.out.println("Votre montant à déposer");
        int mon = scanner.nextInt();
        s = s + mon;
        System.out.print("Votre nouveau solde :" + s);
    } else if (c == 3) {
        System.out.print("Votre retrait :");
        int mon = scanner.nextInt();
        s = s - mon;
        System.out.print("Votre nouveau solde :" + s);
    } else {
        System.out.print("GoodBye! Spend it wisely ;)");
    }

    }
}