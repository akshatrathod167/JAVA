import java.util.Scanner;
public class class2 {
    public static void main(){
        Scanner sc = new Scanner(System.in);
      int marks = sc.nextInt();

        if(marks>90) {
        System.out.println("excellent");
      } else if(marks<=90 && marks>80) {
        System.out.println("good");
      } else if(marks<=80 && marks>70) {
        System.out.println("average");
      } else if(marks<=70 && marks>60) {
        System.out.println("below average");
      } else {
        System.out.println("fail");
      }
      sc.close();
    }
}
