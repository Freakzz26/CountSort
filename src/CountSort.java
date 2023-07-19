import java.util.Scanner;

public class CountSort {
    static void count(int arr[],int n)
    {
        int max=Integer.MIN_VALUE;
        for (int i=0;i<n;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        int temp[]=new int[max+1];
        for (int i=0;i<n;i++)
        {
            temp[arr[i]]++;
        }
        for (int i=0;i<=max;i++)
        {
            int val=temp[i];
            for (int j=0;j<val;j++)
            {
                System.out.print(i+" ");

            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++)
        {
            arr[i]=scanner.nextInt();
        }
        count(arr,n);
    }
}
