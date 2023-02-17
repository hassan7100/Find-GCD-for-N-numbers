import java.util.*;
public class Main {
    public static int MinN(int[]arr,int N){
        int min=arr[0];
        for(int x=0;x<N;x++){
            if(min>arr[x])
                min=arr[x];
        }
        return min;
    }
    public static int GCDN(int[]arr,int N){
        int gcd=1;
        int y=0;
        int min=MinN(arr,N);
        boolean flag=true;
        for(int x=min;x>1;x--){
            for(y=0;y<N;y++){
                if(arr[y]%x!=0) {
                    flag=false;
                    break;
                }
                }
            if(flag==true){
                gcd=min;
                break;
            }
        }
        return gcd;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the number of numbers you want to find GCD for:");
        int N=s.nextInt();
        int[] arr=new int[N];
        for(int x=0;x<N;x++){
            System.out.print("Number"+(x+1)+":");
            arr[x]=s.nextInt();
        }
        System.out.println(GCDN(arr,N));
    }
}