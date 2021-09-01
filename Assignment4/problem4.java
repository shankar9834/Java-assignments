class sort{
   static int []arr={1,2,5,6,8,9,21,14,7,15};
    public static void sorter()
    {
        for(int i=0;i<10;i++)
        {
            for(int j=i+1;j<10;j++)
            {
              if(arr[i]>arr[j]&&i!=j)
              {
                  int temp=arr[i];
                  arr[i]=arr[j];
                  arr[j]=temp;
              }
            }
        }
        for(int i=0;i<10;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    

}
class divide{
    static int []ar={10,20,30,40,50,60,70,80,90,100,110,120,130,140,150};
    public static void div()
    {
        for(int i=0;i<15;i++)
        {
           ar[i]=ar[i]/2;
        }
        System.out.println();
        for(int i=0;i<15;i++)
        {
            System.out.print(ar[i]+" ");
        }
    }

}
public class problem4{
    public static void main(String[] args) {
        sort.sorter();
        divide.div();
    }
}