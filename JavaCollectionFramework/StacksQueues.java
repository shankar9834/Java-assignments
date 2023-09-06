// queues    -->use LinkedList to instanciate 
// stacks   
// deques

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class StacksQueues {
    
    public static void main(String []args)
    {
        //FIFO   -->Queues
         Queue<Integer> q =new LinkedList<Integer>();
         q.offer(5);
         q.offer(7);

         System.out.println(q.peek());
         System.out.println(q.poll());
         System.out.println(q.peek());
         System.out.println(q.isEmpty());


         //LIFO  -->Stacks

         Stack<Integer> stack=new Stack<>();
         
         stack.push(25);
         stack.push(47);

         while(!stack.isEmpty())
         {
            System.out.println(stack.peek());
            stack.pop();
         }


        
        // Deques
        
        Deque<Integer> deque=new ArrayDeque<>();

        deque.offerFirst(5);
        deque.offerFirst(7);
        deque.offerLast(11);

        System.out.println(deque);
        
        System.out.println(deque.peekFirst());  // prints first element from front
        System.out.println(deque.peekLast());    //prints first element from last
        System.out.println(deque.isEmpty());

        deque.pollFirst() ;   //removes first element from front
        System.out.println(deque);  
        deque.pollLast();    //removes first element from last
        System.out.println(deque);



        //Priority Queues

        PriorityQueue<Integer>pq=new PriorityQueue<>();   //(by default its like a min heap in c++) 

        pq.offer(51);
        pq.offer(100);
        pq.offer(72);
        pq.offer(48);
        pq.offer(35);

        List<Integer>top2=new ArrayList<>();   
        int index=0;
        while(!pq.isEmpty()&&index<2)
        {
             top2.add(pq.poll());
             index++;
        }

        System.out.println(pq);
        System.out.println(top2);


      
        List<StudentMarks> stMarks=new ArrayList<>();
        stMarks.add(new StudentMarks(90,75));
        stMarks.add(new StudentMarks(100,70));
        stMarks.add(new StudentMarks(87,89));
        stMarks.add(new StudentMarks(45,60));
        stMarks.add(new StudentMarks(72,71));
       
       // System.out.println(stMarks);


        PriorityQueue<StudentMarks> spq=new PriorityQueue<>(stMarks);

        int ind=0;
        while(!spq.isEmpty()&&ind<2)
        {
              System.out.println(spq.poll());
              ind++;
        }



  // using custom comparators

    PriorityQueue<Integer> pqc=new PriorityQueue<>(new MyCustomComparator());   // we can pass anonymous class or lambas in java
   
   // PriorityQueue<Integer> pqc=new PriorityQueue<>((a,b)-> b-a);   //using lamba 
   
    pqc.offer(45);
    pqc.offer(100);
    pqc.offer(75);
    pqc.offer(90);
    pqc.offer(15);
   int ind3=0;
   System.out.println("printing top(max) 2 elements");
    while(!pqc.isEmpty()&&ind3<2)
    {
        System.out.println(pqc.poll());
        ind3++;
        
    }

 
     


     List<StudentMarks> stMarks2=new ArrayList<>();
        stMarks2.add(new StudentMarks(90,75));
        stMarks2.add(new StudentMarks(100,70));
        stMarks2.add(new StudentMarks(87,89));
        stMarks2.add(new StudentMarks(45,60));
        stMarks2.add(new StudentMarks(72,71));
     
        //ordering descending order on the basis of physics marks
        PriorityQueue<StudentMarks>pqp=new PriorityQueue<>((s1,s2)-> s2.getPhysicsMarks()-s1.getPhysicsMarks());
         
        for(StudentMarks s : stMarks2 )
        {
            pqp.offer(s);
        }


        int ind4=0;
        while(!pqp.isEmpty()&&ind4<2)
        {
            System.out.println(pqp.poll());
            ind4++;
        }
      

        
        // next topic 1:51
    }
    
}
