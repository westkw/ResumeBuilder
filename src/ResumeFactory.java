import java.util.ArrayList;
import java.util.Scanner;

public class ResumeFactory {

    public Name getName(Scanner sc) {
        System.out.print("*First Name: ");
        String firstName = sc.nextLine();

        System.out.print("Middle Name: ");
        String middleName = sc.nextLine();

        System.out.print("*Last Name: ");
        String lastName = sc.nextLine();

        if (!middleName.equals("")) {
            return new Name(firstName, middleName, lastName);
        } else {
            return new Name(firstName, lastName);
        }
    }

    public Summary getSummary(Scanner sc) {
        String finished = "n";
        StringBuilder summary = new StringBuilder();
        while (finished.equals("n")) {
            System.out.println("Summary: ");
            summary.append(sc.nextLine());
            System.out.println("Finished with summary? (y or n)");
            finished = sc.nextLine();
        }
        return new Summary(summary.toString());
    }

    public ArrayList<Education> getEducation(Scanner sc) {
        ArrayList<Education> educations = new ArrayList<>();
        String finished = "n";
        while (finished.equals("n")) {
            Education education;
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

            System.out.print("*Univ City: ");
            String city = sc.nextLine();

            System.out.print("*Univ State: ");
            String state = sc.nextLine();

            education = new Education(university, degree, major, minor, gpa,
                    city, state, month, year);

            educations.add(education);

            System.out.println("Finished with education? (y or n)");
            finished = sc.nextLine();
        }
        return educations;
    }

    public ArrayList<Experience> getExperience(Scanner sc) {
        String finished = "n";
        StringBuilder experience = new StringBuilder();
        ArrayList<Experience> experiences = new ArrayList<>();
        while (finished.equals("n")) {
            System.out.print("Experience Title: ");
            String title = sc.nextLine();
            System.out.println("Experience Description: ");
            String description = sc.nextLine();
            experiences.add(new Experience(title, description));
            System.out.println("Finished with experiences? (y or n)");
            finished = sc.nextLine();
        }
        return experiences;
    }

    public ArrayList<Project> getProject(Scanner sc) {
        String finished = "n";
        StringBuilder project = new StringBuilder();
        ArrayList<Project> projects = new ArrayList<>();
        while (finished.equals("n")) {
            System.out.print("Project Title: ");
            String title = sc.nextLine();
            System.out.println("Project Description: ");
            String description = sc.nextLine();
            projects.add(new Project(title, description));
            System.out.println("Finished with projects? (y or n)");
            finished = sc.nextLine();
        }
        return projects;
    }
}
