import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        int min = Integer.MAX_VALUE;
        while(counter<n){
            int currentNum = Integer.parseInt(scanner.nextLine());
            if (currentNum<min){
                min = currentNum;
            }
            counter++;
        }
        System.out.println(min);
    }
}
