package exercicios.exer_08.util;
import exercicios.exer_08.entities.Person;

public class PersonUtils {
    public static double mediaWidth(Person [] people){
        double sum = 0;
        for (int i = 0; i < people.length; i ++ ){
             sum+= people[i].getWidth();
        }
        return sum/people.length;
    }
     public static double _16yersUndersPercentual(Person [] people){
        double sum = 0;
        for(int i = 0; i < people.length; i ++){
            if(people[i].getAge() < 16) {
                sum++;
            }
        }
         return sum/ people.length * 100;


     }
}
