import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SommedeSousTableaux {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            int j = 0;
            String d = "o";
            ArrayList<Integer> nombres = new ArrayList<>();

            do {
                j++;
                System.out.println("Entrer la valeur :");
                int v = scanner.nextInt();
                nombres.add(v);
                if (j != 1) {
                    System.out.println("Voulez-vous ajouter une autre valeur :(o/n)");
                    d = scanner.next();
                }
            } while (d.equals("o"));
        int s=0;
            ArrayList<ArrayList<Integer>> sommes = new ArrayList<>();
            System.out.println("Entrer la somme que voulez vous chercher: ");
            int v = scanner.nextInt();
            for (int i = 0; i < nombres.size()-1; i++) {
                for (int k = 0; k < nombres.size()-1; k++) {
                    if (i != k) {
                        s=nombres.get(i)+ nombres.get(k);
                        if (s==v){
                            sommes.add(new ArrayList<>(List.of(nombres.get(i),nombres.get(k))));
                        }
                    }
                }
            }
            System.out.println(sommes);
        }
}


