import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String d;
        ArrayList<Integer> nombres = new ArrayList<>();
        do{
            System.out.println("Entrer la valeur :");
            Scanner scanner = new Scanner(System.in);

            int  v = scanner.nextInt();
            nombres.add(v);
            System.out.println("Voulez-vous ajouter un autre valeur :(o/n)");
            d = scanner.nextLine();

        }while(d == "o");
        int[] maxi = new int[2];
        int max = 0;
        for (int i = 0; i < nombres.size(); i++) {
                if(nombres.get(i) >max){
                    max = nombres.get(i);
                    maxi[0] = max;

                }
        }
    }
}