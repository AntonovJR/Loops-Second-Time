import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int failedThreshold = Integer.parseInt(scanner.nextLine());

        int failedTimes = 0;
        int solvedProblemsCount = 0;
        double gradesSum = 0;
        String lastProblem = "";
        boolean isFailed = true;
        while (failedTimes < failedThreshold) {
            String problemName = scanner.nextLine();
            if ("Enough".equals(problemName)) {
                isFailed = false;
                break;
            }
            int grade = Integer.parseInt(scanner.nextLine());
            if(grade<=4){
                failedTimes++;
            }
            gradesSum+=grade;
            solvedProblemsCount++;
            lastProblem= problemName;
        }
            if (isFailed){
                System.out.printf("You need a break, %s poor grades.",failedTimes);
            }else{
                System.out.printf("Average score: %.2f %nNumber of problems: %s %nLast problem: %s",gradesSum/solvedProblemsCount, solvedProblemsCount, lastProblem);
            }




    }

}