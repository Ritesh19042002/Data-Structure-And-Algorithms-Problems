package JavaClass;
import java.lang.*;
public class Demo5 {
    public static void main(String[] args) {
        int a,b=0;
        try {
            a = Integer.parseInt(args[0]);
            b = 10/b;
        }
        catch (ArithmeticException e){
            System.out.println("Denominator should not be zero");
        }
//        catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("please enter number or integer");
//        }
        catch (NumberFormatException e){
            System.out.println("please enter numeric value only");
        }
        catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(b);
    }
}
