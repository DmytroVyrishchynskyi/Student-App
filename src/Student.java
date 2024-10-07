import java.util.ArrayList;
import java.util.List;

public class Student {
    private int rating;
    private String name;
    private static List<Student> studentList = new ArrayList<>();

    public Student(String name) {
        this.name = name;
        this.rating = 0;
        studentList.add(this);
    }

    public static double getAvgRating() {
        if (studentList.isEmpty()) return 0;
        double totalRating = 0;
        for (Student student : studentList) {
            totalRating += student.rating;
        }
        return totalRating / studentList.size();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public boolean betterStudent(Student student) {
        return this.rating > student.rating;
    }

    public void changeRating(int rating) {
        this.rating = rating;
    }

    public static void removeStudent(Student student) {
        studentList.remove(student);
    }

    @Override
    public String toString() {
        return "Student Name: " + name + ", Rating: " + rating;
    }
}

