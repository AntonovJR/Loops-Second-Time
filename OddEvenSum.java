import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int odd = 0;
        int even = 0;
        for (int i = 0; i <n ; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (i % 2 == 0){
                even+=number;
            }else{
                odd+=number;
            }

        }
        if(odd==even){
            System.out.println("Yes");
            System.out.println("Sum = "+ odd);

        }else {
            int diff = Math.abs(odd-even);
            System.out.println("No");
            System.out.println("Diff = "+diff);
        }

    }
}
