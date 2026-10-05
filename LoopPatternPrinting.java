import java.util.Scanner;

public class LoopPatternPrinting {
    public static void main(String[] args){
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
        // Scanner sc = new Scanner(System.in);
        // int N = sc.nextInt();
        // for(int i = 1; i<=N; i++){
        //     System.out.print("*");
        // }
        // System.out.println();
        // int nsp = N-2;//Number of Spaces
        // int nsl = N-2;//Number of Line
        // for(int i=1; i<=nsl; i++){
        //     System.out.print("*");
        //     for(int s =1; s<=nsp; s++){
        //         System.out.print(" ");
        //     }
        //     System.out.print("*");
        //     System.out.println();
        // }
        // for(int i = 1; i<=N; i++){
        //     System.out.print("*");
        // }
        // sc.close();

        //Right Triangle Pattern
        // Scanner sc = new Scanner(System.in);
        // int N = sc.nextInt();
        // for(int m =1; m<=N; m++){
        //     for(int i =1; i<=m; i++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // sc.close();

        //Left Triangle Pattern
        // Scanner sc = new Scanner(System.in);
        // int N = sc.nextInt();
        // int nsp = N-1;
        // int nst = 1;
        // for(int i =1; i<=N; i++){
        //     for(int s=nsp;s>=0; s--){
        //         System.out.print(" ");
        //     }
        //     for(int st=1; st<=nst; st++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        //     nsp--;
        //     nst++;
        // }
        // sc.close();

        //Inverted Right Triangle
        // Scanner sc = new Scanner(System.in);
        // int N = sc.nextInt();
        // int nst = N;
        // for(int i=1; i<=N; i++){
        //     for(int n = nst; n>0;n--){
        //         System.out.print("*");
        //     }
        //     System.out.println(" ");
        //     nst--;
        // }
        // sc.close();

        //Inverted Left Triangle
        // Scanner sc = new Scanner(System.in);
        // int N = sc.nextInt();
        // int nsp = 1;
        // int nst = N-1;
        // for(int d=1; d<=N;d++){
        //     System.out.print("*");
        // }
        // System.out.println();
        // for(int i = 1; i<=(N-1); i++){
        //     for(int s=1; s<=nsp;s++){
        //         System.out.print(" ");
        //     }
        //     for(int st=nst;st>0;st--){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        //     nsp++;
        //     nst--;
        // }
        // sc.close();

        //Pyramid Star Pattern


        //Inverted Pyramid Pattern
        // Scanner sc = new Scanner(System.in);
        // int N = sc.nextInt();
        // int nsp=0;
        // int nst=N*2-1;
        // for(int i=1;i<=N;i++){
        //     for(int s=0; s<=nsp; s++){
        //         System.out.print(" ");
        //     }
        //     for(int st=nst; st>0;st--){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        //     nsp++;
        //     nst=nst-2;
        //     }
        // sc.close();

        //Diamond Star Pattern 1
        // Scanner sc = new Scanner(System.in);
        // int N = sc.nextInt();
        // int nsp = N-1;
        // int nst = 1;
        // for(int i=1; i<=N; i++){
        //     for(int s=nsp; s>0; s--){
        //         System.out.print(" ");
        //     }
        //     for(int st=1; st<=nst; st++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        //     nsp--;
        //     nst=nst+2;
        // }
        // int N2 = N-1;
        // int nsp2=1;
        // int nst2=N2*2-1;
        // for(int i=1; i<=N2; i++){
        //     for(int s=1; s<=nsp2; s++){
        //         System.out.print(" ");
        //     }
        //     for(int st=nst2; st>0; st--){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        //     nsp2++;
        //     nst2=nst2-2;
        // }
        // sc.close();

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int nsp=N-1;
        int nst=1;
        for(int i=1; i<=2*N-1; i++){
            for(int j=1;j<=nsp; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=nst; j++){
                System.out.print("*");
            }
            System.out.println();
            if(i<N){
                nsp--;
                nst=nst+2;
            } else{
                nsp++;
                nst=nst-2;
            }
        }
      

    
    }
}
