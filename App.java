public class App {


    public static void FindDiffArr(int[] arr){
        //first find the average
        int sum = 0;
        int avg = 0;
        for(int i = 0 ; i< arr.length;i++){
            sum += arr[i];
        }

        avg = (sum / arr.length);

        int[] differences = new int[arr.length];

        for(int i = 0; i < differences.length; i++){
            differences[i] = arr[i] - avg;
        }

        System.out.print("{");
        for(int i = 0; i < differences.length; i++){
            System.out.print(differences[i]);
            if(i != differences.length-1){
                System.out.print(",");
            }
        }
        System.out.println("}");
    }


    public static void main(String[] args) {

    }
}