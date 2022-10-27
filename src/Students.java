import java.io.Serializable;

public class Students implements Serializable {
    private String nameStudent;
    private String surname;
    private int indexNumber;
    private String profile;
    private int yearStudy;

    public Students(String nameStudent, String surname, int indexNumber, String profile, int yearStudy) {
        this.nameStudent = nameStudent;
        this.surname = surname;
        this.indexNumber = indexNumber;
        this.profile = profile;
        this.yearStudy = yearStudy;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getIndexNumber() {
        return indexNumber;
    }

    public void setIndexNumber(int indexNumber) {
        this.indexNumber = indexNumber;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public int getYearStudy() {
        return yearStudy;
    }

    public void setYearStudy(int yearStudy) {
        this.yearStudy = yearStudy;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + nameStudent + '\'' +
                ", surname='" + surname + '\'' +
                ", indexNumber=" + indexNumber +
                ", profile='" + profile + '\'' +
                ", yearStudy=" + yearStudy +
                '}';
    }
}
