import java.util.ArrayList;

public class Skills {
    private ArrayList<String> skillsList;

    public Skills(ArrayList<String> skillsList) {
        this.skillsList = skillsList;
    }

    public ArrayList<String> getSkillsList() {
        return skillsList;
    }

    public void addSkills (String skill) {
        this.skillsList.add(skill);
    }
}
