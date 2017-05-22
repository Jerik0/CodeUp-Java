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

    public String getName() {
        return this.name;
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

    }

}
