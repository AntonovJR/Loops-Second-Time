import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int books = Integer.parseInt(scanner.nextLine());
        int counter=0;
        while(counter<books){
            String currentBook=scanner.nextLine();
            if(currentBook.equals(input)){
                System.out.printf("You checked %s books and found it.",counter);
                return;
            }
            counter++;
        }
        System.out.printf("The book you search is not here!%nYou checked %s books.",books);

    }
}
