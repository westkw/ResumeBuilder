import java.util.ArrayList;

public class Project extends TitleDescription {
    public Project(String title, String description) {
        super(title, description);
    }

    public String toString() {
        return getTitle() + "\n" +
                getDescription() + "\n";
    }

    public String projListString(ArrayList<Project> projects) {
        StringBuilder result = new StringBuilder();
        for (Project project: projects) {
            result.append(project.toString());
        }
        return result.toString();
    }
}
