import java.util.Scanner;

public class Main {
    //The main class that runs the resume builder

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("*First Name: ");
        String firstName = sc.nextLine();

        System.out.println("Middle Name: ");
        String middleName = sc.nextLine();

        System.out.println("*Last Name: ");
        String lastName = sc.nextLine();

        if (!middleName.equals("")) {
            Name name = new Name(firstName, middleName, lastName);
        }
        else {
            Name name = new Name(firstName, lastName);
        }
    }
}
