import java.util.Scanner;

public class AccountBalance2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double total = 0;
        int counter = 0;

        while(counter<n){
            counter++;
            double currentMoney = Double.parseDouble(scanner.nextLine());
            if(currentMoney<0){
                System.out.println("Invalid operation!");
                break;
            }
            total+=currentMoney;
            System.out.printf("Increase: %.2f%n",currentMoney);
            }
        System.out.printf("Total: %.2f",total);
        }
    }
