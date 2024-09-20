package Arrays;

public class Frequency {
    static void occuranceOfElements(int[] arr){
        int[] freq = new int[arr.length];
        int visited = -1;
        for (int i = 0; i < arr.length; i++) {
            int count = 1; // jar element same asen tr ithe count hoen
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[i] == arr[j]){
                    count++;
                    // to avoid same element again
                    freq[j] = visited;
                }
            }
            if(freq[i] != visited ){
                freq[i] = count;
            }
        }
        System.out.println();
        System.out.println("---------------------------------------");
        System.out.println(" Element | Frequency");
        System.out.println("---------------------------------------");
        for(int i = 0; i < freq.length; i++){
            if(freq[i] != visited)
                System.out.println("    " + arr[i] + "    |    " + freq[i]);
        }
        System.out.println("----------------------------------------");

    }

    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 8, 3, 2, 2, 2, 1};
        System.out.println("Entered elements are");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        occuranceOfElements(arr);

    }
}
