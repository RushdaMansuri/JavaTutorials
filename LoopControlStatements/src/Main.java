public class Main {
    public static void main(String[] args) {
        System.out.println("Loops Control Statements.");

        System.out.println("While loop:");
        int i = 100;
        while(i <= 200){
            System.out.println(i);
            i++;
        }

        System.out.println();
        System.out.println("Do-while loop:");
        int j = 100;
        do{
            System.out.println(j);
            j++;
        }while( j <= 200);

        System.out.println();
        System.out.println("For loop:");
        int k = 100;
        for( k = 100; k <= 200; k ++){
            System.out.println(k);
            k++;
        }
    }
}
