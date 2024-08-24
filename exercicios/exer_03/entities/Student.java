package exercicios.exer_03.entities;

public class Student {

    public String name;
    public double note1;
    public double note2;
    public double note3;

    public double media(){
        return note1 + note2 + note3;
    }
    public boolean passOrNot(){
        double media = media();
        return media >= 60;
    }

    @Override
    public String toString() {
        if (!passOrNot()) {
            return name + "final grade: " + String.format("%.2f", media() ) + "\n"
                    + "failed" + "\n" + "missing: " +
                    String.format("%.2f", 60 - media()) + "points";
        }else {
            return name + " final grade: " + String.format("%.2f", media() ) + "\n" + "pass";
        }




    }
}
