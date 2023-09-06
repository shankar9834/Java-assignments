import java.lang.Comparable;
import java.lang.System;

public class StudentMarks implements Comparable<StudentMarks> {

    private int maths;
    private int physics;

    public StudentMarks(int maths,int physics)
    {
        this.maths=maths;
        this.physics=physics;
    }

    public int getMathsMarks()
    {
        return maths;
    }

    public int getPhysicsMarks()
    {
        return physics;
    }
    
    public String toString()
    {
          return "StudentMarks [maths="+maths+", physics="+physics+"]";
    }

    public int compareTo(StudentMarks o)   // inherited from Comparable interface
    {
        

        //here we are comparing students on there maths marks

       /*
        //for ascending order  
        
        //  case 1: current object(this) < other object(o)  return -1 (or any negative value)
        // case 2: current object > other object           return 1 (or any positive value) 
        //  case 3: current object == other object          return 0
        

        //use either one of (i or ii) the both 

        //i
       if(this.maths<o.maths) return -1;

        else if(this.maths>o.maths) return 1;
        
        else return 0;
        
        //ii
         return this.maths - o.maths;
        
        */
      
        //descending order
       // System.out.println(o.maths+" : "+ this.maths);
        return o.maths - this.maths;
        
    }
}
