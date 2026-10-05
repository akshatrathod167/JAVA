import java.util.Scanner;

public class Class1 {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int N = sc.nextInt();
        // int nst = 1;
        // int nsp = N-1;
        // for(int m =1; m<=N;m++){
        //     for(int i = nsp; i>0; i--){
        //         System.out.print(" ");
        //     }
        //     for(int j =1; j<=nst;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        //     nst++;
        //     nsp--;
        // }
        // sc.close();
        // Scanner sc = new Scanner(System.in);
        // int N = sc.nextInt();
        // int nsp = N/2;
        // int nst = 1;
        // if(N%2==0){
        //     System.out.print("Invalid Input");
        // } else{
        //     for(int m = 1; m<=N-;m++){
        //         for(int s1 = nsp; s1>0;s1--){
        //             System.out.print(" ");
        //         }
        //         for(int i1 = 1;i1<=nst; i1++){
        //             System.out.print("*");
        //         }
        //         System.out.println();
        //         nst=nst+2;
        //         nsp--;
        //     }
        // }
        // sc.close();

        //Square Pattern Printing
        // Scanner sc = new Scanner(System.in);
        // int N = sc.nextInt();
        // for(int lines=1;lines<=N;lines++){
        //     for(int i = 1;i<=N;i++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // sc.close();

        //Hollow Square Printing
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 1; i<=N; i++){
            System.out.print("*");
        }
        System.out.println();
        int nsp = N-2;//Number of Spaces
        int nsl = N-2;//Number of Line
        for(int i=1; i<=nsl; i++){
            System.out.print("*");
            for(int s =1; s<=nsp; s++){
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
        for(int i = 1; i<=N; i++){
            System.out.print("*");
        }
        sc.close();
    }
 }
