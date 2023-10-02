class B 
{
    void sort(int arr[]) 
    {
        int temp;
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) 
        {
            int min = i;
            for (int j = i + 1; j < n; j++) 
            {
                if (arr[j] < arr[min]) 
                {
                    min = j;
                }
            }
            if (min != i) 
            {
                temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
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

public class Selection 
{

    public static void main(String[] args) 
    {
        B obj = new B();
        int arr[] = { 7, 1, 3, 2, 8 };
        obj.sort(arr);
        System.out.println("Sorted array");
        obj.printArray(arr);
    }
}
