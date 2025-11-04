import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String d;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> nombres = new ArrayList<>();
        do{
            System.out.println("Entrer la valeur :");
            int  v = scanner.nextInt();
            nombres.add(v);
            System.out.println("Voulez-vous ajouter un autre valeur :(o/n)");
            d = scanner.next();

        }while(d.equals("o"));
        //int[] maxi = new int[2];
        int max = 0,k=0;
        for (int i = 0; i < nombres.size(); i++) {
            if (nombres.get(i) > max) {
                k= i;
            }
        }
        for (int j = 0; j < nombres.size(); j++) {
            if(j!=k){
                max=nombres.get(j);
            }
            }
        System.out.println(max);
        }
    }
