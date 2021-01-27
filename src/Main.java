import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    //The main class that runs the resume builder
    public static void main(String[] args) {
        ResumeFactory resumeFactory = new ResumeFactory();
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to ResumeBuilder!");
        System.out.println();
        System.out.println("Please type in what oder you would like " +
                "to create your resume.");
        System.out.println("Your options are: ");
        System.out.println("1. Name");
        System.out.println("2. Personal Summary");
        System.out.println("3. Educations");
        System.out.println("4. Experience");
        System.out.println("5. Projects");
        System.out.println("6. Skills");
        System.out.println("Input format should be in the form " +
                "of a spaced list.");
        System.out.println("Example \"1 2 3 4 5 6\"");
        System.out.println("Each part of the resume is optional.");
        System.out.println("Example \"1 3 5 6\" also works.");

        System.out.print("You're resume order: ");
        String userOrder = sc.nextLine();

        String[] numberStrs = userOrder.split(" ");
        int[] numbers = new int[numberStrs.length];
        for(int i = 0;i < numberStrs.length;i++)
        {
            numbers[i] = Integer.parseInt(numberStrs[i]);
        }
        for (int number : numbers) {
            switch (number) {
                case 1:
                    resumeFactory.getName(sc);
                    break;
                case 2:
                    resumeFactory.getSummary(sc);
                    break;
                case 3:
                    resumeFactory.getEducation(sc);
                    break;
                case 4:
                    ArrayList<Experience> experiences = resumeFactory.getExperience(sc);
                    break;
                case 5:
                    System.out.println("Project");
                    break;
                case 6:
                    System.out.println("Skills");
                    break;
            }
        }
        sc.close();
    }
}
