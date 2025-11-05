import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int j=0,i;
        String d="o";

        ArrayList<Integer> nombres = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, Integer> occurrences = new HashMap<>();


        do{
            j++;
            System.out.println("Entrer la valeur :");
            int  v = scanner.nextInt();
            nombres.add(v);
            if(j!=1){
                System.out.println("Voulez-vous ajouter une autre valeur :(o/n)");
                d = scanner.next();}

        }while(d.equals("o"));

        for(int element:nombres ){
            if (occurrences.containsKey(element)){
                occurrences.put(element, occurrences.get(element) + 1);
            } else {
                occurrences.put(element, 1);
            }
        }

        System.out.println(occurrences);








    }
}