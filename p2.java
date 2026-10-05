import java.util.Scanner;
public class p2 {
    public static void main(String[] args){
        //square
        // Scanner sc = new Scanner(System.in);
        // int N = sc.nextInt();
        // for(int i=1; i<=N; i++){
        //     for(int j=1; j<=N; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //right triangle
        // Scanner sc = new Scanner(System.in);
        // int N = sc.nextInt();
        // int nst=1;
        // for(int i=1; i<=N; i++){
        //     for(int j=1; j<=nst; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        //     nst++;
        // }

        //opposite right triangle
        // Scanner sc = new Scanner(System.in);
        // int N = sc.nextInt();
        // int nsp=N-1;
        // int nst=1;
        // for(int i=1; i<=N; i++){
        //     for(int j=1; j<=nsp; j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1; j<=nst; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        //     nsp--;
        //     nst++;
        // }

        //inverted triangle
        // Scanner sc = new Scanner(System.in);
        // int N = sc.nextInt();
        // int nst=N;
        // for(int i=1; i<=N; i++){
        //     for(int j=1; j<=nst;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        //     nst--;
        // }

        //number triangle
        // Scanner sc = new Scanner(System.in);
        // int N = sc.nextInt();
        // int row=1;
        // for(int i=1; i<=N; i++){
        //     int num=1;
        //     for(int j=1; j<=row; j++){
        //         System.out.print(num);
        //         num++;
        //     }
        //     System.out.println();
        //     row++;
        // }

        //right align triangle
        // Scanner sc = new Scanner(System.in);
        // int N = sc.nextInt();
        // int nsp=N-1;
        // int nst=1;
        // for(int i=1; i<=N; i++){
        //     for(int j=1; j<=nsp; j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1; j<=nst; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        //     nsp--;
        //     nst++;
        // }

        //inverted right aligned triangle
        // Scanner sc = new Scanner(System.in);
        // int N = sc.nextInt();
        // int nsp=1;
        // int nst=N;

        // for(int i=1; i<=N; i++){
        //     for(int j=1; j<nsp; j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1; j<=nst; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        //     nsp++;
        //     nst--;
        // }

        //pyramid
        // Scanner sc = new Scanner(System.in);
        // int N = sc.nextInt();
        // int nsp=N-1;
        // int nst=1;
        // for(int i=1; i<=N; i++){
        //     for(int j=1; j<=nsp; j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1; j<=nst; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        //     nsp--;
        //     nst=nst+2;
        // }

        //inverted pyramid
        // Scanner sc = new Scanner(System.in);
        // int N = sc.nextInt();
        // int nsp=1;
        // int nst=2*N-1;
        // for(int i=1; i<=N; i++){
        //     for(int j=1; j<nsp; j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1; j<=nst; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        //     nsp++;
        //     nst=nst-2;
        // }

        //diamond
        // Scanner sc = new Scanner(System.in);
        // int N = sc.nextInt();
        // int nsp=N-1;
        // int nst=1;
        // for(int i=1; i<=2*N-1; i++){
        //     for(int j=1; j<=nsp; j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1; j<=nst; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        //     if(i<N){
        //         nsp--;
        //         nst=nst+2;
        //     } else{
        //         nsp++;
        //         nst=nst-2;
        //     }
        // }

        //hollow square
        // Scanner sc = new Scanner(System.in);
        // int N = sc.nextInt();
        // for(int i=1; i<=N; i++){
        //     System.out.print("*");
        // }
        // System.out.println();
        // for(int i=1; i<=N-2; i++){
        //     System.out.print("*");
        //     for(int j=1; j<=N-2; j++){
        //         System.out.print(" ");
        //     }
        //     System.out.print("*");
        //     System.out.println();
        // }
        // for(int i=1; i<=N; i++){
        //     System.out.print("*");
        // }

        //hollow triangle
        // Scanner sc = new Scanner(System.in);
        // int N = sc.nextInt();
        // System.out.println("*");
        // for(int i=1; i<=N-2; i++){
        //     System.out.print("*");
        //     for(int j=0; j<i-1; j++){
        //         System.out.print(" ");
        //     }
        //     System.out.println("*");
        // }
        // for(int i=1; i<=N; i++){
        //     System.out.print("*");
        // }

        //number pyramid
        // Scanner sc = new Scanner(System.in);
        // int N = sc.nextInt();
        // int nsp=N-1; //number of numbers
        // int nmn=1;
        // for(int i=1; i<=N; i++){
        //     int num=1;
        //     for(int j=1; j<=nsp; j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1; j<=nmn; j++){
        //         System.out.print(num);
        //         num++;
        //     }
        //     nmn=nmn+2;
        //     nsp--;
        //     System.out.println();
        // }

        // Scanner sc = new Scanner(System.in);
        // int N = sc.nextInt();
        // int nst=1;
        // for(int i=1; i<=2*N-1; i++){
        //     for(int j=1; j<=nst; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        //     if(i<N){
        //         nst+=2;
        //     } else{
        //         nst-=2;
        //     }

        // }

    
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int nsp=0;
      int non=N/2-1;
      for(int i=1; i<=2*N; i++){
        for(int j=1; j<=nsp; j++){
          System.out.print(" ");
        }
        for(int j=1; j<=non; j++){
          System.out.print(j);
        }
        System.out.println();
        if(i<=N){
          nsp++;
          non-=2;
        } else{
          nsp--;
          non+=2;
        }
      }
    }
}
