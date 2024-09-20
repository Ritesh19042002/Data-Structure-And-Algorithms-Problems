package JavaClass;
import payroll.Salary;

public class Demo4 {
    public static void main(String[] args) {
        double bas = 10.0;
        Salary sobj = new Salary();
        System.out.println("Net Salary is :"+ sobj.calcNet(bas));
    }
}
