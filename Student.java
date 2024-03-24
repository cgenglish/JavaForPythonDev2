import java.time.LocalDate;
import java.time.Period;

enum Major { COMPUTERSCIENCE, BUSINESS, PSYCHOLOGY, COMMUNICATIONS };

public class Student {
    String name = "Unknown Student";
    double GPA;
    boolean isVeteran;
    int luckyNumber;
    byte favoriteNumber;
    Major major; //CompSci, Business, Psychology, Communications
    LocalDate dateOfBirth;

    public String toString() {
        return name + " " + major;
    }

    public String toString(String additionalString) {
        return name + " " + major + " " + additionalString;
    }

    public int getAge() {
        return Period.between(dateOfBirth, LocalDate.now()).getYears();
    }
}
