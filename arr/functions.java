package arr;
import java.util.Scanner;
public class functions {

    //Swapping Two Numbers
    // static void swap(int a,int b){
    //     int temp = b;
    //     b=a;
    //     a=temp;
    //     System.out.println(a);
    //     System.out.print(b);
    // }
    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();
    //     swap(a,b);
    //}    

    //Add TWO NUMBERS
    // static void add(int a,int b){
    //     int c = a+b;
    //     System.out.print(c);
    // }
    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();
    //     add(a,b);
    // }

    //ADDING MULTIPLE NUMBERS
    // static void add(int[] nums ){
    //     int sum = 0;
    //     for(int i=0; i<nums.length; i++){
    //         sum=sum+nums[i];
    //     }
    //     System.out.print(sum);
    // }
    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     int[] nums = new int[n];
    //     for(int i=0; i<n; i++){
    //         nums[i] = sc.nextInt();
    //     }
    //     add(nums);
    // }

    // SWAP TWO NUMBERS IN ARRAY
    // static void swap(int[] nums){
    //   Scanner sc = new Scanner(System.in);
    //   int a = sc.nextInt();
    //   int b = sc.nextInt();
    //   int temp = nums[b];
    //   nums[b] = nums[a];
    //   nums[a] = temp;
    // }
    // public static void main() {
    //   Scanner sc = new Scanner(System.in);
    //   int N = sc.nextInt();
    //   int[] nums = new int[N];
    //   for(int i=0; i<N; i++){
    //     nums[i] = sc.nextInt();
    //   }

    //   swap(nums);
    //   for(int i=0;i<N;i++){
    //     System.out.print(nums[i]);
    //   }
    // }

    // static void reverse(int[] nums){
    //     int sp=0;
    //     int ep=nums.length - 1;
    //     for(int i=0; i<nums.length/2; i++){
    //         int t = nums[sp];
    //         nums[sp]=nums[ep];
    //         nums[ep]=t;
    //         sp++;
    //         ep--;
    //     }
    // }
    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
    //     int N = sc.nextInt();        
    //     int[] nums = new int[N];
    //     for(int i=0; i<N; i++){
    //         nums[i] = sc.nextInt();
    //     }
    //     reverse(nums);
    //     for(int i=0; i<N; i++){
    //         System.out.print(nums[i]);
    //     } 

    // }

    //SWAPPING PARTS OF ARRAY
    static void reverse(int[] nums){
        Scanner sc = new Scanner(System.in);
        int sp= sc.nextInt();
        int ep= sc.nextInt();
        for(int i=0; i<nums.length/2; i++){
            int t = nums[sp];
            nums[sp]=nums[ep];
            nums[ep]=t;
            sp++;
            ep--;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();        
        int[] nums = new int[N];
        for(int i=0; i<N; i++){
            nums[i] = sc.nextInt();
        }
        reverse(nums);
        for(int i=0; i<N; i++){
            System.out.print(nums[i]);
        } 

    }

}
