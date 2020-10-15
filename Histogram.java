import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double twoHundred = 0;
        double fourHundred = 0;
        double sixHundred = 0;
        double eightHundred = 0;
        double thousand = 0;
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number < 200) {
                twoHundred++;
            }
            if (number >= 200 && number < 400) {
                fourHundred++;
            }
            else if (number >= 400 && number < 600) {
                sixHundred++;
            }
            else if (number >= 600 && number < 800) {
                eightHundred++;
            }
            else if (number >= 800 && number <= 1000) {
                thousand++;
            }


        }

        System.out.printf("%.2f",(twoHundred/n)*100);
        System.out.println("%");
        System.out.printf("%.2f",(fourHundred/n)*100);
        System.out.println("%");
        System.out.printf("%.2f",(sixHundred/n)*100);
        System.out.println("%");
        System.out.printf("%.2f",(eightHundred/n)*100);
        System.out.println("%");
        System.out.printf("%.2f",(thousand/n)*100);
        System.out.println("%");

    }
}
