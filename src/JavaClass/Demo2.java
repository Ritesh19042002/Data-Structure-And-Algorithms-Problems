package JavaClass;

class Base{
    static void gun(){
        System.out.println("Gun of base");
    }
}
class Derived extends Base{
    static void gun(){
        System.out.println("Gun of base");
    }
}

public class Demo2 {
    public static void main(String[] args) {
        Base Bobj = new Derived();
        Base.gun();
    }
}
