import java.util.Scanner;

public class ReadText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toLowerCase();
        int counter=0;
        while (!input.equals("stop")){
            input = scanner.nextLine().toLowerCase();
            counter++;
        }
        System.out.println(counter);
    }
}
