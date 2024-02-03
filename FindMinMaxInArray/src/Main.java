public class Main {
    public static void main(String[] args) {
        System.out.println("Min and Max in an Array.");
        int [] arr = {22,7,33,56,72,5,20,54};
        int min = arr[0] , max = arr[0];

        //min
        for(int e: arr){
            if(e < min){
                min = e;
            }
        }
        System.out.println("Minimum: " + min);

        //max
        for(int e: arr){
            if(e > max){
                max = e;
            }
        }
        System.out.println("Maximum: " + max);
    }
}
