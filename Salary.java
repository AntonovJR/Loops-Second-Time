import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tabs = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());


        for (int i = 0; i <tabs ; i++) {
            String website = scanner.nextLine().toLowerCase();
            if (website.equals("facebook")) {
                salary -= 150;
            }if (website.equals("instagram")) {
                salary -= 100;
            }if (website.equals("reddit")){
                        salary -= 50;
            }if (salary<=0){
                System.out.println("You have lost your salary.");
                return;
            }


        }
        System.out.println(salary);

    }
}
