package HashMap;
import java.util.HashMap;

public class Pratice {
    public class HashMapExample {
        public static void main(String[] args) {
            // Creating a HashMap where key is student name and value is grade
            HashMap<String, String> studentGrades = new HashMap<>();

            // Adding elements
            studentGrades.put("Krisdsdffsdfsdh", "A");
            studentGrades.put("Joy", "B");
            studentGrades.put("Ram", "A");
            studentGrades.put("Vishal", "C");

            // Printing all entries
            System.out.println("Student Grades: ");
            for (String student : studentGrades.keySet()) {
                System.out.println(student + ": " + studentGrades.get(student));
            }

            // Getting value for a key
            System.out.println("Grade of John: " + studentGrades.get("John"));

            // Removing an entry
            studentGrades.remove("Emma");
            System.out.println("After removing Emma: " + studentGrades);
        }
    }

}
