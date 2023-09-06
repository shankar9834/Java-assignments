import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.List;

public class Sets{

    public static void main(String []args)
    {
        Set<Integer>st=new HashSet<>();  //contains only unique elements, but it is not sorted 
        
        st.add(4);
        st.add(7);
        st.add(11);
        st.add(4);
        st.add(2);
        System.out.println(st);
       
        System.out.println(st.contains(11));  //contains method checks whether element is present in the set or not
        System.out.println(st.contains(175));     // return 1 if present else 0
        st.remove(4);
        System.out.println(st);
        //st.clear();           // clears the set by removing all elements
        System.out.println(st);


        List<Integer>ls=new ArrayList<>();
        ls.add(11);
        ls.add(7);
        ls.add(11);
        ls.add(12);

        Set<Integer>st2=new HashSet<>(ls);

       System.out.println("before retain all method st and st2 are: "+st+" "+st2);  
       
       st.retainAll(st2);   // set intersection of two sets

       System.out.println(st);
       System.out.println("after retain all method st and st2 are: "+st+" "+st2); 
       
       

       st.removeAll(st2);    // set difference between sets
       System.out.println("after remove all method st and st2 are: "+st+" "+st2);  

       st.addAll(st2) ; // set union of sets
        System.out.println("after add all method st and st2 are: "+st+" "+st2);  




        //LinkedHash set    maintains the insertion order between elements unlike hashset

        Set<Integer>st3=new LinkedHashSet<>();
        st3.add(4);
        st3.add(7);
        st3.add(11);
        st3.add(4);
        st3.add(2);

         System.out.println(st3);




      //  TreeSet     sorted set

       //sorted set on the basis of physics marks
      Set<StudentMarks>stm=new TreeSet<>((s1,s2)-> s2.getPhysicsMarks()-s1.getPhysicsMarks());

        stm.add(new StudentMarks(90,75));
        stm.add(new StudentMarks(100,70));
        stm.add(new StudentMarks(87,89));
        stm.add(new StudentMarks(45,60));
        stm.add(new StudentMarks(72,71));
      
        System.out.println(stm);
        
    }
}