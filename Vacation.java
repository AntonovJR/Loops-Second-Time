import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double price = Integer.parseInt(scanner.nextLine());
       double ownedMoney = Double.parseDouble(scanner.nextLine());

        int counterSpend = 0;
        int counterSave = 0;
        while (ownedMoney<price) {
            String input = scanner.nextLine().toLowerCase();
            double currentMoney = Double.parseDouble(scanner.nextLine());
            if (input.equals("spend")) {
                ownedMoney -= currentMoney;
                counterSpend++;
                counterSave++;
                if(ownedMoney<0){
                    ownedMoney=0;
                }
            } else {
                ownedMoney += currentMoney;
                counterSave++;
                counterSpend = 0;
            }
             if (counterSpend>=5){
                 System.out.println("You can't save the money.");
                 System.out.println(counterSave);
                 return;
            }

        }
        System.out.printf("You saved the money for %s days.", counterSave);
    }
}
