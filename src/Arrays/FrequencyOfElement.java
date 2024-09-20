package Arrays;
//Count frequency of each element in the array
public class FrequencyOfElement {

    public static void countFrequencyOfElement(int[] arr){
        boolean visited[] = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {

            // Skip this element if already processed
            if (visited[i] == true)
                continue;

            // Count frequency
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + " " + count);
        }
    }
    public static void main(String[] args) {
        int[] arr = {10,5,10,15,10,5};
        countFrequencyOfElement(arr);
    }
}
