package arithmetic;
public class min{
   public int small(int arr[])
    {int a=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
          if(a>arr[i])
          {
              a=arr[i];
          }

        }
        return a;
    }
}
