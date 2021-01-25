import java.util.ArrayList;
import java.util.Arrays;

//Comma separated list of skills
public class Skills {
    private ArrayList<String> skillsList;

    public Skills(String skills) {
        this.skillsList = new ArrayList<>(Arrays.asList(skills.split(", ")));
    }

    public ArrayList<String> getSkillsList() {
        return skillsList;
    }

    public void addSkills (String skill) {
        this.skillsList.add(skill);
    }

    public void removeSkill (String skill) {
        this.skillsList.remove(skill);
    }
}
