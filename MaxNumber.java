import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        int max = Integer.MIN_VALUE;
        while(counter<n){
            int currentNum = Integer.parseInt(scanner.nextLine());
            if (currentNum>max){
                max = currentNum;
            }
            counter++;
        }
        System.out.println(max);
    }
}
