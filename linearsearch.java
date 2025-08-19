// linearsearch.java
import java.util.Scanner;
class linearsearch{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        System.out.print("Enter element to search: ");
        int x=sc.nextInt();
        int result=sea(arr,x);
        if(result==-1){
            System.out.println("Element not found");
        } else{
            System.out.println("Element found at index: " +result);

        }
    }
    static int sea(int arr[], int x)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==x)
            { 
                return i;

            }
        }
        return -1;
    }
}