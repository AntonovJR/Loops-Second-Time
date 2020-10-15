import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double money = 0;
        double total = 0;
        for (int i = 1; i <=n; i++) {
            money = Double.parseDouble(scanner.nextLine());
            if(money>0) {
                System.out.printf("Increase: %.2f%n", money);
                total += money;
            }else{
                System.out.println("Invalid operation!");
                System.out.println("Total: "+total);
                return;
            }

        }
        System.out.printf("Total: %.2f",total);
    }
}
