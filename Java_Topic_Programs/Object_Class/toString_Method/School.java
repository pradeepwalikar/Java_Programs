package Object_Class.toString_Method;

public class School 
{
    String s_name;
    int s_strength;
    char s_grade;

    School(String s_name, int s_strength, char s_grade)
    {
        this.s_name=s_name;
        this.s_strength=s_strength;
        this.s_grade=s_grade;
    }

    public String toString()
    {
        return s_name+" "+s_strength+" "+s_grade;
    }

    public static void main(String[] args)
    {
        School school = new School("jsp", 150, 'a');
        System.out.println(school);
    }
}
