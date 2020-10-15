import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        int freeSpace = width*length*height;
        String input = scanner.nextLine().toLowerCase();
        int boxes = 0;

        while (!input.equals("Done")){
            boxes = Integer.parseInt(input);
            freeSpace-=boxes;

            if(freeSpace<0){
                int needed = Math.abs(freeSpace);
                System.out.printf("No more free space! You need %s Cubic meters more.",needed);
                return;
            }
            input = scanner.nextLine();
        }
        System.out.printf("%s Cubic meters left.",freeSpace);
    }
}
