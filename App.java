
public class App {
    public static void main(String[] args) {
        findSums(int[]arr){
            int even = 0;
            int odd = 0;
            for(int i = 0; i < arr.length; i++){
                if (i % 2 == 0) {
                    even += arr[i];
                }else{
                    odd += arr[i];
                }
            }
            System.out.println("Sum of even numbers: " + even);
            System.out.println("Sum of odd numbers: " + odd);
        }
    }
}