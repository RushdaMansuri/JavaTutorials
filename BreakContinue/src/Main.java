public class Main {
    public static void main(String[] args) {
        System.out.println("Break & Continue Statements.");

        //break
        for(int i = 0; i < 10; i ++){
            System.out.println("i: " + i);
            if(i == 5)
            {
                System.out.println("Breaking loop at i: " + i);
                break;
            }
        }
        System.out.println();
        //continue
        for(int i = 0; i < 10; i ++)
        {
            if(i % 2 == 0)
            {
                System.out.println("Continuing loop at i: " + i);
                continue;
            }
            System.out.println("i: " + i);
        }
    }
}
