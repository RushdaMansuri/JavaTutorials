public class Main {
    public static void main(String[] args) {
        System.out.println("Methods in Java.");
        int result = calculate(10,5);
        System.out.println("Result: " + result);

        int result2 = calculate(15,50);
        System.out.println("Result_2: " + result2);
    }

    public static int calculate(int a, int b){
        int c =0;
        if(a > b){
            c = a + b;
        }
        else{
            c = (a + b) * 5;
        }
        return  c; 
    }
}
