import java.io.Serializable;

public class Profiles implements Serializable {
    private String nameProfile;
    private int year;

    public Profiles(String nameProfile, int year) {
        this.nameProfile = nameProfile;
        this.year = year;
    }

    public String getNameProfile() {
        return nameProfile;
    }

    public void setNameProfile(String nameProfile) {
        this.nameProfile = nameProfile;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Profiles{" +
                "name='" + nameProfile + '\'' +
                ", year=" + year +
                '}';
    }

}
