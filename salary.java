abstract class employee
{
    abstract void calculate_salary();
}
class manager extends employee
{
    int bp,HRA,DA,salary;

    public manager(int bp,int HRA, int DA) {
        this.bp=bp;
        this.HRA=HRA;
        this.DA=DA;
    }

    void calculate_salary()
    {
        int salary = bp + HRA + DA;
        System.out.println("Salary "+salary);
    }
}
class clerk extends employee
{
    int bp,HRA,DA,salary;

    public clerk(int bp,int HRA, int DA) {
        this.bp=bp;
        this.HRA=HRA;
        this.DA=DA;
    }

    void calculate_salary()
    {
        int salary = bp + HRA + DA;
        System.out.println("Salary "+salary);
    }
}

public class salary {
    public static void main(String[] args) {
        employee m = new manager(100000,30000,500);
        employee c = new clerk(50000, 20000, 400);

        m.calculate_salary();
        c.calculate_salary();
    }
}
