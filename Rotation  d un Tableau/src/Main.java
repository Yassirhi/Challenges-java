import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String d="o";
        int j=0;


        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> nombres = new ArrayList<>();
        do{
            j++;
            System.out.println("Entrer la valeur :");
            int  v = scanner.nextInt();
            nombres.add(v);
            if(j!=1){
                System.out.println("Voulez-vous ajouter une autre valeur :(o/n)");
                d = scanner.next();}

        }while(d.equals("o"));
     //   System.out.println(nombres.size());
        int[] temp = new int[nombres.size()];
      //  System.out.println(temp.length);
        temp[0]=nombres.get(nombres.size()-1) ;
       //  System.out.println(nombres.get(nombres.size()-1));
        for(int i=0;i<nombres.size();i++){
            if(i!=nombres.size()-1){
                temp[i+1]=nombres.get(i);
            }

        }
        //temp[nombres.size()-1]=temp[0];
        for(int i=0;i<temp.length;i++){
            System.out.println(temp[i]);
        }

    }
}