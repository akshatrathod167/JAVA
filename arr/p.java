package arr;
import java.util.*;

public class p {
    static int count(int[] arr){
        int ans = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(arr[i]<arr[j]){
                    ans++;
                } else{
                    continue;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args){
        //Print all the elements of the array in separate lines.
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int[] arr = new int[n];
        // for(int i=1; i<=n-1; i++){
        //   arr[i]= sc.nextInt();
        // }
        // for(int i=1; i<=n-1; i++){
        //     System.out.println(arr[i]);
        // } 

        //Print the average of the array elements.
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int arr[] = new int[n];
        // for(int i=0; i<=n-1; i++){
        //     arr[i]=sc.nextInt();
        // }
        // int sum = 0;
        // for(int i=0; i<=n-1; i++){
        //     sum=sum+arr[i];
        // }
        // System.out.print(sum);

        //Print average of array
        // Scanner sc = new Scanner(System.in);
        // int sum = 0;
        // int n = sc.nextInt();
        // int arr[] = new int[n];
        // for(int i=0; i<=n-1; i++){;
        //     arr[i]=sc.nextInt();
        //     sum=sum+arr[i];
        // }
        // double av = (double)sum/n;
        // System.out.print(av);

        //Finding Largest Integer in Array
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int arr[] = new int[n];
        // for(int i=0; i<=n-1; i++){
        //     arr[i]=sc.nextInt();
        // }
        // int largest = Integer.MIN_VALUE;
        // for(int i=0; i<=n-1; i++){
        //      if(arr[i]>=largest){
        //         largest=arr[i];
        //      }
        // }
        // System.out.print(largest);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        
       
        


    }
}
