package Inheritance;
class Base{
    int a = 10;
    int b = 20;
    void fun(){
        System.out.println("Base Fun");
    }
    void  gun(){
        System.out.println("Base Gun");
    }
}
class Derived extends Base{
    int a = 30;
    int b = 40;
    void fun(){
        System.out.println("Derived Fun");
    }
    void  sun(){
        System.out.println("Derived sun");
    }
}
public class Case1 {
    public static void main(String[] args) {
        Derived bobj = new Derived();
        bobj.fun();
        bobj.gun();
        bobj.sun();

        System.out.println(bobj.a);
        System.out.println(bobj.b);
    }
}
