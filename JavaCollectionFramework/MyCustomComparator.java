import java.util.Comparator;

/* 
public class MyCustomComparator implements Comparator<StudentMarks>{

    public int compare(StudentMarks s1 , StudentMarks s2)
    {

        if(s1.getMathsMarks()<s2.getMathsMarks()) return 1;
        else if(s1.getMathsMarks()>s2.getMathsMarks()) return -1;
        return 0;
    }
    
} */

public class MyCustomComparator implements Comparator<Integer>{

    public int compare(Integer s1 , Integer s2)
    {

        if(s1<s2) return 1;
        else if(s1>s2)return -1;
        return 0;
    }
    
}
