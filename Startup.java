import java.util.Arrays;
//USING THIS CODE AS CLASS NOTES

public class Startup {

    public static void main(String[] args) {
        
        //static int classLocal;

        Circle circle = new Circle();
        circle.radius = 5;
        System.out.println("Circle 1's radius: " + circle.radius);
        
        Circle circle2 = new Circle();
        //using this one to show that it prints at the specific memory destination versus the value
        System.out.println("Circle 2's radius: " + circle2);

        circle.radius = 10;

        int radius = 5;
        System.out.println("radius1 " + radius);

        int radius2 = radius;
        System.out.println("radius2 " + radius2);

        radius = 65;
        System.out.println("radius2 " + radius2);

        String name = "Connor";
        String name1 = "Connor";

        System.out.println(name == name1);
        //OR
        System.out.println(name.equals(name1));
        //OR --> this one gives value of 0 if true
        System.out.println(name.compareTo(name1));

        System.out.println(name.charAt(3));
        System.out.println(name.toUpperCase());
        
        Student student = new Student();
        System.out.println(student);
        System.out.println(student.name);
        
        student.name = "Melissa";
        System.out.println(student.name);
        
        student.GPA = 4.0;
        System.out.println("GPA " + student.GPA);

        Student Connor = new Student();
        Connor.name = "Connor";
        Connor.GPA = 3.7;
        //System.out.println(local); THIS doesn't work because of scoping

        System.out.println(returnVowelCount(name1));
        System.out.println(getVowels(name1));
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