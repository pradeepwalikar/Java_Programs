package Object_Class.equals;

public class Employee 
{
    String name;
    int sal;

    Employee(String name,int sal)
    {
        this.name=name;
        this.sal=sal;
    }

    public boolean equals(Object object)
    {
        Employee employee = (Employee) object;
        return this.sal == employee.sal;
    }

    public static void main(String[] args)
    {
        Employee employee = new Employee("stifan", 10);
        Employee employee2 = new Employee("jungle", 10);
        System.out.println(employee.equals(employee2));
    }
}
