import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter name of student " + (i + 1) + ":");
            String name = scanner.nextLine();
            students[i] = new Student(name);
            System.out.println("Enter rating of student " + (i + 1) + ":");
            int rating = scanner.nextInt();
            students[i].setRating(rating);
            scanner.nextLine();
        }

        double averageRating = Student.getAvgRating();
        System.out.println("Average rating of all students: " + averageRating);

        System.out.println("Enter the index of the student whose rating you want to change (0-2):");
        int index = scanner.nextInt();
        System.out.println("Enter new rating for " + students[index].getName() + ":");
        int newRating = scanner.nextInt();
        students[index].changeRating(newRating);

        averageRating = Student.getAvgRating();
        System.out.println("New average rating of all students: " + averageRating);
    }
}