package exercicios.exer_16.model.entities;

import java.text.Format;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Instalments {
    private LocalDate data;
    private Double value;

    public Instalments(LocalDate data, Double value) {
        this.data = data;
        this.value = value;
    }

    @Override
    public String toString() {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatDate = data.format(df);
        return  formatDate + " - " + value;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
}
