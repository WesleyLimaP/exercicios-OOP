package exercicios.exer_17.model;

import java.util.ArrayList;
import java.util.List;

public class Instructor {
    private String name;
    private List<Courses> coursesList = new ArrayList<>();

    public Instructor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void add (Courses courses) {
        coursesList.add(courses);
    }

    public List<Courses> getCoursesList() {
        return coursesList;
    }

    public void remove(Courses course) {
       coursesList.remove(course);
    }
}
