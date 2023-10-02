class A
{
    int sort(int arr[],int lb,int ub)
    {
        int privot=arr[lb];
        int start=lb;
        int end=ub;
        if (start<end) {
            while (arr[start]<=privot) {
                start++;
            }
            while (arr[end]<privot) {
                end--;
            }
            if (start<end){
            int temp;
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
        }
    }
        else
        {
            int t;
            t=arr[lb];
            arr[lb]=arr[end];
            arr[end]=arr[t];
        }
        return end;
    }
    void quicksort(int arr[],int lb,int ub)
    {
        if (lb<ub) {
            int loc=sort(arr, lb,ub);
            quicksort(arr, lb, loc-1);
            quicksort(arr, loc+1, ub);
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

public class Quick {
    public static void main(String[] args) {
        int arr[]={4,1,3,6,2,5};
        int n=arr.length;
        A obj=new A();
        obj.quicksort(arr,0,n-1);
        System.out.println("Sorted array");
        obj.printArray(arr);
    }
    
}
