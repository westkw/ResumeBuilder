import java.util.ArrayList;

public class Education extends TitleDescription {
    private String major;
    private String minor;
    private String gpa;
    private String city;
    private String state;
    private String endMonth;
    private String endYear;

    public Education(String title, String description, String major,
                     String minor, String gpa, String city, String state,
                     String endMonth, String endYear) {
        super(title, description);
        this.major = major;
        this.minor = minor;
        this.gpa = gpa;
        this.city = city;
        this.state = state;
        this.endMonth = endMonth;
        this.endYear = endYear;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getMinor() {
        return minor;
    }

    public void setMinor(String minor) {
        this.minor = minor;
    }

    public String getGpa() {
        return gpa;
    }

    public void setGpa(String gpa) {
        this.gpa = gpa;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getEndMonth() {
        return endMonth;
    }

    public void setEndMonth(String endMonth) {
        this.endMonth = endMonth;
    }

    public String getEndYear() {
        return endYear;
    }

    public void setEndYear(String endYear) {
        this.endYear = endYear;
    }

    public String toString() {
        if (!getGpa().equals("") && !getMinor().equals("")) {
            return getDescription() + " of " + getMajor() + ", " +
                    getEndMonth() + " " + getEndYear() + "\n" +
                    "Minor in " + getMinor() + "\n" +
                    "GPA: " + getGpa() + "\n" +
                    getTitle() + "\n";
        }
        else if (!getGpa().equals("")) {
            return getDescription() + " " + getMajor() + ", " +
                    getEndMonth() + " " + getEndYear() + "\n" +
                    "Minor in " + getMinor() + "\n" +
                    getTitle() + "\n";
        }
        else if (!getMinor().equals("")) {
            return getDescription() + " " + getMajor() + ", " +
                    getEndMonth() + " " + getEndYear() + "\n" +
                    "GPA: " + getGpa() + "\n" +
                    getTitle() + "\n";
        }
        else {
            return getDescription() + " " + getMajor() + ", " +
                    getEndMonth() + " " + getEndYear() + "\n" +
                    getTitle() + "\n";
        }

    }

    public String eduListString(ArrayList<Education> educations) {
        StringBuilder result = new StringBuilder();
        for (Education education : educations) {
            result.append(education.toString());
        }
        return result.toString();
    }

}
