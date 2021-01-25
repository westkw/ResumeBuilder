import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    //The main class that runs the resume builder

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("*First Name: ");
        String firstName = sc.nextLine();

        System.out.print("Middle Name: ");
        String middleName = sc.nextLine();

        System.out.print("*Last Name: ");
        String lastName = sc.nextLine();
        Name name;
        if (!middleName.equals("")) {
            name = new Name(firstName, middleName, lastName);
        } else {
            name = new Name(firstName, lastName);
        }


        String finished = "n";
        StringBuilder summary = new StringBuilder();
        while (finished.equals("n")) {
            System.out.println("Summary: ");
            summary.append(sc.nextLine());
            System.out.println("Finished with summary? (y or n)");
            finished = sc.nextLine();
        }
        Summary sum = new Summary(summary.toString());

        ArrayList<Education> educations = new ArrayList<>();
        finished = "n";
        while (finished.equals("n")) {
            Education education;
            System.out.print("Add Education: ");
            System.out.print("*Degree: ");
            String degree = sc.nextLine();

            System.out.print("*Major: ");
            String major = sc.nextLine();

            System.out.print("*Graduation Month: ");
            String month = sc.nextLine();

            System.out.print("*Graduation Year: ");
            String year = sc.nextLine();

            System.out.print("Minor: ");
            String minor = sc.nextLine();

            System.out.print("GPA: ");
            String gpa = sc.nextLine();

            System.out.print("*University: ");
            String university = sc.nextLine();

            System.out.print("*Univ City");
            String city = sc.nextLine();

            System.out.print("*Univ State");
            String state = sc.nextLine();

            education = new Education(university, degree, major, minor, gpa,
                    city, state, month, year);

            educations.add(education);

            System.out.println("Finished with education? (y or n)");
            finished = sc.nextLine();
        }

        System.out.println(name.toString());
        System.out.println(sum.toString());
        System.out.println(eduString(educations));
    }

    private static String eduString(ArrayList<Education> educations) {
        StringBuilder result = new StringBuilder();
        for (Education education : educations) {
            result.append(education.toString());
        }
        return result.toString();
    }
}
