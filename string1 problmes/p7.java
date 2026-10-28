import java.util.Scanner;
public class p7 {
    public static String reverse(String str){
        char[] string = new char[str.length()];
        for(int i=str.length()-1; i>=0; i--){
            char t = str.charAt(i);
            string[i] = t;
        }
        int sp = 0;
        int ep = string.length-1;
        while(sp<ep){
            char t=string[sp];
            string[sp] = string[ep];
            string[ep] = t;
            sp++;
            ep--;
        }
        return new String(string);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // sc.nextLine();
        // String s1 = sc.next();
        // String s2 = sc.next();
        // System.out.println(n);
        // System.out.print(s1);
        // System.out.print(s2);

        //REVERSE STRING
        // String str = sc.next();
        // System.out.println(reverse(str));

        //timepass
        String s1 = "hello";
        String s2 = "hello";
        String s3 = "hello";
        String s4 = new String("hello");
        if(s1==s2){
            System.out.print("true");
        }

    }
}
