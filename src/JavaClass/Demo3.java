package JavaClass;

class Base1{
    int a = 10;
    int b = 20;
    void fun(){
        System.out.println("Base of fun");
    }
    void gun(){
        System.out.println("Base of gun");
    }
}
class Derived1 extends Base1{
    int a = 30;
    int b = 40;
    void fun(){
        System.out.println("Derived of fun");
    }
    void sun(){
        System.out.println("Derived of sun");
    }
}

public class Demo3 {
    public static void main(String[] args) {
        Base1 bobj = new Base1();
        bobj.fun();//Base of fun
        bobj.gun();//Base of gun
        System.out.println(bobj.a);//10
        System.out.println(bobj.b);//20
        System.out.println("///////////////////////////////' case 1 '///////////////////////////");

        Derived1 dobj = new Derived1();
        dobj.fun();//Derived of fun
        dobj.gun();//Base of gun
        System.out.println(dobj.a);//30
        System.out.println(dobj.b);//40
        System.out.println("///////////////////////////////' case 2 '///////////////////////////");

        Base1 bdoj = new Derived1();
        bdoj.fun();//Derived of fun
        bdoj.gun();//Base of gun
        System.out.println(bdoj.a);//10
        System.out.println(bdoj.b);//20
        System.out.println("///////////////////////////////' case 3 '///////////////////////////");

        Base1 bobdj = new Base1();
        Derived1 dobdj = new Derived1();
        bobdj.fun();//fun of base
        bobdj = dobdj;//upcasting
        bobdj.fun();//fun of derived
        System.out.println("///////////////////////////////' case 4 '///////////////////////////");
    }
}
