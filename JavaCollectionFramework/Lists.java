// in java list can be implemented using ArrayList,Vector,LinkedList


//ArrayList class implements List interface and AarrayList is dynamic 
//Vector class implements List interface and vector is dynamic and thread safe,performance penalty due to synchronisation
//LinkedList implementation uses doubly linkedlist

//Arraylist vs LinkedList  -->{in c++ it is like comparing vector/array with linkedlist}
//when there is frequent inserting and deletion is performed then prefer linkedlist

// we can use ArrayList,Vector,LinkedList to create a list but
//ArrayList is best choice for create a list



//wrapper class for int is Integer
// float --> Float
// double --> Double  


import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;



public class Lists {
    
    public static void main(String[] args)
    {
        List<Integer>alist=new ArrayList<>();
         
        alist.add(4);
        alist.add(7);
        alist.add(15);
       // System.out.println(alist);
       for(int x:alist)
       {
        System.out.println(x);
       }

       int prev=alist.set(1, 23);

       System.out.println("privious element before change is "+ prev);
      
      /*  for(int x:alist)
       {
        System.out.println(x);
       }
 */


      List<Integer>alist2=new ArrayList<>(alist); // we can pass any collection
                                                  //alist2 is copy of alist1
      alist2.add(25);
      for(int x:alist2)
      {
        System.out.println(x);
      }
       

      List<Integer>alist3=new ArrayList<>();
      
      alist3.add(21);
      alist3.add(9);
      alist3.addAll(alist);  
      alist3.add(9);

      System.out.println("printing alist3");
       for(int x:alist3)
      {
        System.out.println(x);
      }

      System.out.println("index of 9 is"+alist3.indexOf(9));
      System.out.println("last index of 9 is"+alist3.lastIndexOf(9));
  
  
       List<Integer>alist4=alist3.subList(1, 4); // second argument index is excluded
                                                                   //sublist method doesnt create copy , so if original 
                                                                   //array is changed then obviously sublist will change
        
        System.out.println(alist4);
         alist3.set(1, 100);
        System.out.println(alist4);

       System.out.println("printing arr starts");
        Integer []arr=alist3.toArray(new Integer[0]);
        for(int x:arr)
        {
            System.out.println(x);
        }
        System.out.println("printing arr ends");



         
        List<Integer>lk=new LinkedList<>();
        lk.add(5);
        lk.add(11);
        lk.add(75);

        ListIterator<Integer> iterator=lk.listIterator();    // we can use iterators with all collections framework classes data structures

        System.out.println(iterator.next());      // its like  return items[index++]; 
        System.out.println(iterator.next());
        System.out.println(iterator.previous());   //its like  return items[--index];
        System.out.println(iterator.next());
        
      

   // next topic  58:07 queue 

       
    }
}
