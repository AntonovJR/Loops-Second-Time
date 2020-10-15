import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        double price = Double.parseDouble(scanner.nextLine());
        int priceToys = Integer.parseInt(scanner.nextLine());
        int savedMoney = 0;
        int savedToys = 0;
        int pari = 10;
        int total = 0;


        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0) {
                savedMoney += pari - 1;
                pari += 10;

            } else {
                savedToys += priceToys;

            }

            total = savedMoney + savedToys;
        }

        if(total>=price){
            double diff = total-price;
            System.out.printf("Yes! %.2f",diff);

        }else{
            double diff = price-total;
            System.out.printf("No! %.2f",diff);
        }

    }
}


