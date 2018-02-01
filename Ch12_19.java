import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;


public class Ch12_19 {

    public static void main(String[] args) {

        String line = null;
        int word_ = 0;

        try {
            URL url = new URL("http://cs.armstrong.edu/liang/data/Lincoln.txt");
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));

            while ((line = reader.readLine()) != null) {

                String currentWord = line;
                System.out.println(currentWord);
                String[] words = line.split(" ");

                for (String word : words) {

                    if (word.matches("--"))
                        continue;
                    word_++;
                }
                word_++;
            }
            reader.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("Total words = " + word_);
    }
}