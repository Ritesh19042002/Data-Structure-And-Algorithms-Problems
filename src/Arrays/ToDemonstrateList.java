package Arrays;
import java.util.*;
public class ToDemonstrateList {
    public static void main(String[] args) throws Exception {
        try{
            String a[] = new String[]{"A","B","C","D"};

            List<String> list = Arrays.asList(a);

            System.out.println("The list is :"+list);
        }
        catch (NullPointerException e){
            System.out.println(e);
        }
    }
}
