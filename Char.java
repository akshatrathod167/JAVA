import java.util.Scanner;
public class Char{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //BASICS
        // int n = sc.nextInt();
        // char[] list = new char[n];
        // for(int i=0; i<n; i++){
        //     list[i] = sc.next().charAt(0);
        // }
        // for(int i=0; i<list.length; i++){
        //     System.out.print(list[i]);
        // }
        // System.out.print(list);

        int n = sc.nextInt();
        char[] alpha = new char[n];
        for(int i=0; i<n; i++){
            alpha[i] = sc.next().charAt(0);
        }


    }
}