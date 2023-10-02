class InsertEle{
    void fun()
    {
        int arr[]={3,5,1,7,0,1,5};
        int ele=100;
        int pos=3;
        for(int i=arr.length-1;i>pos-1;i--)
        {
            arr[i]=arr[i-1];
        }
        arr[pos-1]=ele;
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    void fun1()
    {
        int arr[]={3,5,1,7,0,1,5};
        int del_ele=1;
        for(int i=0;i<arr.length; i++)
        {
            if(arr[i]==del_ele){
                for(int j=i;j<arr.length;j++)
                {
                    arr[j]=arr[j+1];
                }
                
            }
            break;
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}

public class Insert_ele_in_array{
    public static void main(String[] args) {
        InsertEle obj=new InsertEle();
        obj.fun1();
    }
}