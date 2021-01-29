import java.util.ArrayList;

public class ArrayListStringConstructor {
    public String eduListString(ArrayList<Education> educations) {
        StringBuilder result = new StringBuilder();
        for (Education education : educations) {
            result.append(education.toString());
        }
        return result.toString();
    }

    public String expListString(ArrayList<Experience> experiences) {
        StringBuilder result = new StringBuilder();
        for (Experience experience : experiences) {
            result.append(experience.toString());
        }
        return result.toString();
    }

    public String projListString(ArrayList<Project> projects) {
        StringBuilder result = new StringBuilder();
        for (Project project : projects) {
            result.append(project.toString());
        }
        return result.toString();
    }
}
