class A
{
    void merge(int a[],int lb,int mid,int ub)
    {
        int b[]={};
        int i,j,k;
        i=lb;
        j=mid+1;
        k=lb;
        while (i<=mid && j<=ub) {
            if (a[i]<=a[j]) {
               b[k]=a[i];
               i++;
            }
            else
            {
                b[k]=a[j];
                j++;
            }
            k++;
        }
        if (i>mid) {
            while (j<=ub) {
                b[k]=a[j];
                j++;
                k++;
            }
        }
        else
        {
            while (i<=mid) {
                b[k]=a[i];
                i++;
                k++;
            }
        }
        for(k=lb;k<=ub;k++)
        {
            a[k]=b[k];
        }
    }
    void sort(int a[],int lb,int ub)
    {
        if (lb<ub) {
            int mid=(lb+ub)/2;
            sort( a, lb,mid);
            sort(a, mid+1,ub);
            merge(a, lb, mid, ub);
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

public class Mergesort {    
    public static void main(String[] args) {
        int a[]={4,2,3,1,5};
        int n=a.length;
        A obj=new A();
        obj.sort(a,0,n-1);
        System.out.println("Sorted array");
        obj.printArray(a);
    } 
}
