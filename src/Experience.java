import java.util.ArrayList;

public class Experience extends TitleDescription {
    public Experience(String title, String description) {
        super(title, description);
    }

    public String toString() {
        return getTitle() + "\n" +
                getDescription() + "\n";
    }

    public String expListString(ArrayList<Experience> experiences) {
        StringBuilder result = new StringBuilder();
        for (Experience experience : experiences) {
            result.append(experience.toString());
        }
        return result.toString();
    }

}
