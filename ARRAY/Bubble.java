class B
{
    void sort(int arr[])
    {   int temp; 
        int n = arr.length;
        for(int k=0;k<n-1;k++)
        {
            int flag=0;
            for(int l=0;l<n-1-k;l++)
            {
                if (arr[l]>arr[l+1]) 
                {
                    temp=arr[l];
                    arr[l]=arr[l+1];
                    arr[l+1]=temp;
                    flag=1;
                }
            }
            if(flag==0)
            break;
        }
    }
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
public class Bubble {

    public static void main(String[] args) {
        B obj=new B();
        int arr[] = { 7, 1, 3, 2, 8 };
        // obj.fun();
        obj.sort(arr);
        System.out.println("Sorted array");
        obj.printArray(arr);
    }
}
