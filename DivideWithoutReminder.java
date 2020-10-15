import java.util.Scanner;

public class DivideWithoutReminder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double twoHundred = 0;
        double fourHundred = 0;
        double sixHundred = 0;

        for (int i = 0; i < n; i++) {
            double number = Double.parseDouble(scanner.nextLine());
            if (number%2==0) {
                twoHundred++;
            }
            if (number%3==0) {
                fourHundred++;
            }
            if (number%4==0) {
                sixHundred++;
            }



        }

        System.out.printf("%.2f",(twoHundred/n)*100);
        System.out.println("%");
        System.out.printf("%.2f",(fourHundred/n)*100);
        System.out.println("%");
        System.out.printf("%.2f",(sixHundred/n)*100);
        System.out.println("%");


    }
}
