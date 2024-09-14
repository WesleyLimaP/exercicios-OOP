package exercicios.exer_18.program;
import exercicios.exer_18.entities.Candidate;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
       String path = "C:\\temp\\nomes.csv";
       List<Candidate> candidateList = new ArrayList<>();


       try(BufferedReader br = new BufferedReader(new FileReader(path))){
          String lines = br.readLine();
          while (lines != null){
                String[] candidates = lines.split(",");
                candidateList.add(new Candidate(candidates[0], Integer.parseInt(candidates[1])));
                lines = br.readLine();
          }
       }
       catch (IOException | NullPointerException e) {
           System.out.println(e.getMessage());
       }

        Map<String, Integer> candidateMap = new TreeMap<>();

        for(Candidate candidate: candidateList){
            candidateMap.put(candidate.getName(), 0);
       }
        for(String key: candidateMap.keySet()){
            int value = candidateMap.get(key);
            for(Candidate candidate: candidateList){
                if(key.equals(candidate.getName())){
                    candidateMap.replace(key, value += candidate.getVotes())  ;         }
            }

        }
        for(String key: candidateMap.keySet()){
            System.out.println(key + " " + candidateMap.get(key));
        }

    }
}
