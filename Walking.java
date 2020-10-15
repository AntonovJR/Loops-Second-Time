import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int steps = 0;

        while(!input.equals("Going home")) {
            steps += Integer.parseInt(input);
            if(steps >= 10000) {
                break;
            }
            input = scanner.nextLine();
        }

        if(input.equals("Going home")) {
            input = scanner.nextLine();
            steps += Integer.parseInt(input);
        }

        if(steps >= 10000) {
            System.out.println("Goal reached! Good job!");
        } else {
            System.out.printf("%d more steps to reach goal.", 10000 - steps);
        }
    }
}