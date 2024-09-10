package exercicios.exer_17.model;

import java.util.ArrayList;
import java.util.List;

public class Courses {
    private String name;
    private List<Studants> studants = new ArrayList<>();

    public Courses(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void addStudant(Studants studant) {
        studants.add(studant);
    }

    public void removeStudants(Studants studant) {
        studants.remove(studant);
    }


    public List<Studants> getStudants() {
        return studants;
    }
}
