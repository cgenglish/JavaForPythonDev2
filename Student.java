import java.time.LocalDate;
import java.time.Period;

enum Major { COMPUTERSCIENCE, BUSINESS, PSYCHOLOGY, COMMUNICATIONS };

public class Student {
    String name;
    double GPA;
    boolean isVeteran;
    int luckyNumber;
    byte favoriteNumber;
    Major major; //CompSci, Business, Psychology, Communications
    LocalDate dateOfBirth;


    //if this is commented out, the original constructor goes away and forces us to provide a name for the student
    //this is due to the overload of the constructor we have below
    public Student() {
        name = "Unknown Student";
        GPA = 1.0f;
        isVeteran = true;
    }

    //Overloading constructor can use ctor as quick hand
    public Student(String name) {
        this.name = name;
    }

    //Overloading it again to now have dob available 
    public Student(String name, LocalDate dob) {
        this.name = name;
        dateOfBirth = dob;
    }

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
