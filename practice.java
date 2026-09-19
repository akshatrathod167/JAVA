import java.util.Scanner;
public class practice {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        //DIGIT SUM
        // long num = sc.nextLong();
        // long digit =0;
        // long sum=0;
        // while(num>0){
        //     digit=num%10;
        //     sum=sum+digit;
        //     num=num/10;
        // }
        // System.out.print(sum);
        // sc.close();

        //NUMBER REVERSE
        // int num = sc.nextInt();
        // int reverse = 0;
        // int digit = 0;
        // while(num>0){
        //     digit = num % 10;
        //     reverse = reverse*10 + digit;
        //     num = num/10;
        // }
        // System.out.print(reverse);
        // sc.close();

        //PALINDROME IDENTIFICATION
        // int num = sc.nextInt();
        // int num1 = num;
        // int reverse = 0;
        // int digit = 0;
        // while(num1>0){
        //     digit = num1%10;
        //     reverse = reverse*10 + digit;
        //     num1 = num1/10;
        // }
        // if(reverse==num){
        //     System.out.print("palindrome");
        // } else{
        //     System.out.print("Not Palindrome");
        // }
        // sc.close();

        //PRIME NUMBER IDENTIFICATION
        int n = sc.nextInt();
        boolean prime = true;

        if (n <= 1) {
            prime = false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                prime = false;
                break;
            }
        }

        if (prime) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }


        
    }
}
