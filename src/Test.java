public interface Test {
    int y = 27;
    void gun();
    void run();
}class Ritesh implements Test{

    @Override
    public void gun() {

    }

    @Override
    public void run() {

    }

    public static void main(String[] args) {
        //Test tobj = new Ritesh();
        System.out.println(Test.y);
    }
}
