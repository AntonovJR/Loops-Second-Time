import java.util.Scanner;

public class Sequence2k1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int result = 0;
        while(result<=n){
            result = result*2+1;
            if(result<=n) {
                System.out.println(result);
            }

        }
    }
}
