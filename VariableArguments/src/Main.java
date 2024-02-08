public class Main {

    static int sum(int ...arr){
        int result = 0;
        for(int a: arr){
            result += a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Variable Arguments.");
        System.out.println("4 + 5 = " + sum(4, 5));
        System.out.println("3 + 4 + 5 = " + sum(3, 4, 5));
        System.out.println("2 + 3 + 4 + 5 = " + sum(2, 3, 4, 5));
    }
}
