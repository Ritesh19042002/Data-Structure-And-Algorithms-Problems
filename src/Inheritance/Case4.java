package Inheritance;
class Base1{
    int a = 10;
    int b = 20;
    void fun(){
        System.out.println("Base1 Fun");
    }
    void  gun(){
        System.out.println("Base1 Gun");
    }
}
class Derived1 extends Base1{
    int a = 30;
    int b = 40;
    void fun(){
        System.out.println("Derived Fun");
    }
    void  sun(){
        System.out.println("Derived sun");
    }
}
public class Case4 {
    public static void main(String[] args) {
        Base1 bobj = new Base1();
        Derived1 dobj = new Derived1();
        bobj = dobj;

        bobj.fun();
        bobj.gun();
        dobj.sun();

        System.out.println(bobj.a);
        System.out.println(bobj.b);
        System.out.println(dobj.a);
        System.out.println(dobj.b);
    }
}
