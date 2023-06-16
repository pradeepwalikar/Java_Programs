package Java_Topic_Programs;

public class School {
    
    String name;
    int str;
    
    School(String name, int str)
    {
        this.name=name;
        this.str=str;
    }

    public static void main(String[] args) {
        School school = new School("wali", 20);
        System.out.println(school.name);
        System.out.println(school.str);
    }
}
