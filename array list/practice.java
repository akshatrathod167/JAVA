import java.util.ArrayList;
import java.util.Scanner;

public class practice {
    // public static void main(String[] args){
    //     ArrayList<Integer> list = new ArrayList<>();
    //     list.add(10);
    //     list.add(20);
    //     list.add(30);
    //     list.add(40);
    //     list.add(50);
    //     System.out.print(list);
    //     list.remove(20);
    //     System.out.print(list);
    // }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            list.add(sc.nextInt());
        }
    }

}
