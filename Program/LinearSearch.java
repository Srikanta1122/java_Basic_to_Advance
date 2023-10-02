public class LinearSearch
{
   static int SearchElement(int arr[],int x)
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
    public static void main(String[] args) {
        int arr[]={2,4,3,1,6};
        int x=30;
       int result = SearchElement(arr,x);
       if(result==-1){
        System.out.println("Ele not found");
       }
       else{
        System.out.println("Ele found at index : "+result);
       }
    }
}
