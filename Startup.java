import java.time.LocalDate;
import java.util.Arrays;
//USING THIS CODE AS CLASS NOTES

public class Startup {

    public static void main(String[] args) {
        
        // //static int classLocal;

        // Circle circle = new Circle();
        // circle.radius = 5;
        // System.out.println("Circle 1's radius: " + circle.radius);
        
        // Circle circle2 = new Circle();
        // //using this one to show that it prints at the specific memory destination versus the value
        // System.out.println("Circle 2's radius: " + circle2);

        // circle.radius = 10;

        // int radius = 5;
        // System.out.println("radius1 " + radius);

        // int radius2 = radius;
        // System.out.println("radius2 " + radius2);

        // radius = 65;
        // System.out.println("radius2 " + radius2);

        // String name = "Connor";
        // String name1 = "Connor";

        // System.out.println(name == name1);
        // //OR
        // System.out.println(name.equals(name1));
        // //OR --> this one gives value of 0 if true
        // System.out.println(name.compareTo(name1));

        // System.out.println(name.charAt(3));
        // System.out.println(name.toUpperCase());
        
        // Student student = new Student();
        // System.out.println(student);
        // System.out.println(student.name);
        
        // student.name = "Melissa";
        // System.out.println(student.name);
        
        // student.GPA = 4.0;
        // System.out.println("GPA " + student.GPA);

        // Student Connor = new Student();
        // Connor.name = "Connor";
        // Connor.GPA = 3.7;
        // //System.out.println(local); THIS doesn't work because of scoping

        // System.out.println(returnVowelCount(name1));
        // System.out.println(getVowels(name1));

        Student student = new Student();
        student.major = Major.COMPUTERSCIENCE;
        System.out.println(student);
        student.dateOfBirth = LocalDate.of(1990, 01, 10);
        System.out.println(student.getAge());
        Student student2 = new Student();
        student2.major = Major.PSYCHOLOGY;
        
        if (student.major == Major.COMPUTERSCIENCE) {
            System.out.println("Computers are the best" + student.major);

        Car car1 = new Car();
        car1.setHorsePower(450);
        car1.setCarStyle(CarStyle.SUV);
        car1.setPowerType(PowerType.UNLEADED);
        
        Car car2 = new Car();
        car2.setHorsePower(195);

        System.out.println(car1.getHorsePower());
        teacher.email = "mhegney@stmartin.edu";
        System.out.println(car2.getHorsePower());

        Instructor teacher = new Instructor();
        Instructor teacher2 = new Instructor();
        
        }
    }

    public static double harmonic(int n) {
        int local = 0;
        System.out.println(local);
        return n;
    }
//Tyler's Example for slide 14
    public static int returnVowelCount(String testString) {
        int count = 0;
        char[] vowelArr = {'a', 'e', 'i', 'o', 'u'};

        for(char c: testString.toLowerCase().toCharArray()) {
            if (Arrays.binarySearch(vowelArr, c) > 0) {
                count++;               
            }
        }
        return count;
    }

    public static int getVowels(String term) {
        String lowerCased = term.toLowerCase();
        int count = 0;

        for(int i = 0; i < lowerCased.length(); i++) {
            char letter = lowerCased.charAt(i);

            if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                count++;
            } 
        }
        return count;
    }
}