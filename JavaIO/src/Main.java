import java.io.*;
import java.util.ArrayList;

public class Main {
    static void searchingWord(String fileName, String keyword) throws IOException {
        ArrayList<String> lines = new ArrayList<>();
        ArrayList<String> sentences = new ArrayList<>();
        FileReader fr = new FileReader("ProgrammingHistory.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        String sentence;
        while ((line = br.readLine()) != null) {
            lines.add(line);
        }
        int pos = 0;
        int posEG = 0;
        for (int i = 0; i < lines.size(); i++) {
            String l = lines.get(i);
            if (l.indexOf("e.g.") != -1) {
                posEG = l.indexOf("e.g.");
                for (int k = posEG + 4; k < l.length(); k++) {

                    if (l.substring(k, k + 1).equals(".")) {
                        sentences.add(l.substring(pos, k + 1));
                        pos = k + 1;
                    }
                }
            } else {
                for (int k = 0; k < l.length(); k++) {

                    if (l.substring(k, k + 1).equals(".")) {
                        sentences.add(l.substring(pos, k + 1));
                        pos = k + 1;
                    }
                }
            }
            pos = 0;
        }

        for (String s : sentences) {
            if (s.contains(keyword)){
                System.out.println("The work you are searching for is in sentence number: " +sentences.indexOf(s));
            }

            String[] words = s.split("\\s|\\W+");
            for(int i=0; i<words.length;i++){
                if(words[i].equals(keyword)){
                    System.out.println("Index position of your word in the sentence: " +i);
                    System.out.println("---------------------------------------------------");
                }
            }

        }

       fr.close();
        br.close();


        }




    public static void main(String[] args) throws IOException {
        searchingWord("ProgrammingHistory.txt","two");

    }
}
        //tell the index position of a word



