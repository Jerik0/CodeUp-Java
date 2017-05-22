package Collections;

import java.util.List;
import java.util.ArrayList;

public class Student {

    private String name;
    private List<Double> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public void addGrade(double grade) {
        this.grades.add(grade);
    }

    double result;

    public double getGradeAverage() {
        for (Double gradeAvg : grades) {
            result = sum(grades) / this.grades.size();
        }
        return result;
    }

    public double sum(List<Double> list) {
        double sum = 0;
        for (double i : list) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {

        Student Jonathan = new Student("Jonathan");
        Student Mike = new Student("Mike");
        Student Dusty = new Student("Dusty");
        Student Jaime = new Student("Jaime");

        Jonathan.addGrade(95);
        Jonathan.addGrade(80);
        Jonathan.addGrade(70);
        Mike.addGrade(90);
        Jaime.addGrade(91);
        Dusty.addGrade(82);

        System.out.println(Jonathan.getGradeAverage());

    }

}
