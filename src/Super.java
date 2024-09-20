 class sum{
        int a, b;
        sum(int x, int y){
             a= x;
             b = y;
        }
    }
    class avarage extends sum{
        int c;
        avarage(int x, int y, int z){
            super(x,y);
            c = z;
            float avg = a+b+c/3.0f;
            System.out.println(avg);
        }
    }
    public class Super {
    public static void main(String[] args) {
        avarage a = new avarage(10,20,30);
    }
}
