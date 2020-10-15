import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double change = Double.parseDouble(scanner.nextLine());
        double leva = change*100;
        int counter = 0;

        while (leva>0){
            if(leva>=200){
                leva-=200;
            }else if(leva>=100){
                leva-=100;
            }else if(leva>=50){
                leva-=50;
            }else if(leva>=20){
                leva-=20;
            }else if(leva>=10){
                leva-=10;
            }else if(leva>=5){
                leva-=5;
            }else if(leva>=2){
                leva-=2;
            }else if(leva==1){
                leva-=1;
            }else {
                break;
            }
            counter++;
        }
        System.out.println(counter);

    }
}
