//package assignment3;
class student {
    int roll;
    String name;
    String mob;

    public void setStudent(int rl, String na, String mb) {
        roll = rl;
        name = na;
        mob = mb;
    }

    public void getStudent() {
        System.out.println("name of student : " + name);
        System.out.println("roll of student : " + roll);
        System.out.println("mobile num : " + mob);
    }
}

class teacher extends student {
    String nam;
    String teachingArea;

    public void setTeacher(String n, String t) {
        nam = n;
        teachingArea = t;
    }

    public void getTeacher() {
        System.out.println("name of teacher : " + nam);
        System.out.println("Area of teaching : " + teachingArea);

    }

    class science {
        int noStu;

        public void setScience(int a) {
            noStu = a;
        }

        public void getScience() {
            System.out.println("number of student taking science : " + noStu);

        }
    }

    class arts {
        int nS;

        public void setArts(int a) {
            nS = a;
        }

        public void getArts() {
            System.out.println("number of student taking science : " + nS);

        }
    }

    class commerce {
        int St;

        public void setCommerce(int a) {
            St = a;
        }

        public void getCommerce() {
            System.out.println("number of student taking science : " + St);

        }
    }
}

class staff extends student {
    String na;
    String work;

    public void setStaff(String s, String w) {
        na = s;
        work = w;
    }
    public void getStaff()
    {
        System.out.println("name of staff : "+ na);
        System.out.println("work : "+ work);

    }
}

public class problem1 {
    public static void main(String[] args) {
        student shankar=new student();
        shankar.setStudent(46, "shankar", "56453256");
        shankar.getStudent();
        System.out.println();
        teacher tech=new teacher();
        tech.setTeacher("john", "maths");
        tech.getTeacher();
        teacher.science sc=tech.new science();
        sc.setScience(50);
        sc.getScience();
        teacher.arts art=tech.new arts();
        art.setArts(46);
        art.getArts();
        teacher.commerce cm=tech.new commerce();
        cm.setCommerce(48);
        cm.getCommerce();

        System.out.println();

        staff stf=new staff();
        stf.setStaff("alias", "assistant");
        stf.getStaff();

    }
}