import java.util.StringTokenizer;
public class TokenizationExample {
    public static void main(String[] args) {
        String code = "System.out.println(\"Hello, World!\");";
        StringTokenizer tokenizer = new StringTokenizer(code);
        System.out.println("A_43_Ritesh Amilkanthwar");
        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }
    }
}
