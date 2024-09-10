package exercicios.exer_17.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Studants {
    private int id;


    public Studants( int id) {
        this.id = id;
    }


    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Studants studants)) return false;
        return id == studants.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
