public class Main {

    public static void main(String [] args) {
        int score = 75;
        char grade = 'B';
        char gradeResult = 'D';

        System.out.println(score >= 50 ? "Passed" : "Passed");

        if (score >= 90)
            gradeResult = 'A';
        else if(score >= 75)
            gradeResult = 'B';
        else if(score >= 60)
            gradeResult = 'C';
        else
            gradeResult = 'D';

        System.out.println("Grade: " + gradeResult);
    }
}
