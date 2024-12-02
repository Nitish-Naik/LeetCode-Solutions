import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
public class LE1455 {

    public static int isPrefixOfWord(String sentence, String searchWord) {
        String ca[] = sentence.split(" ");
        // System.out.println(ca.toString());
        // Arrays.stream(ca).forEach(System.out::println);

        for(int i=0; i<ca.length; i++) {
            if(ca[i].startsWith(searchWord)) {
                return i+1;
            }
        }
        return -1;
    }
    public static void main(String args[]) {
        try {
            File inputFile = new File("input.txt");
            Scanner sc = new Scanner(inputFile);

            try( PrintWriter p = new PrintWriter("output.txt")) {
                while (sc.hasNextLine()) {
                    String sentence = sc.nextLine();

                    if(!sc.hasNextLine()) {
                        p.write("Missing search word for sentence: " + sentence);
                        break;
                    }

                    String searchWord = sc.nextLine();
                    int result= isPrefixOfWord(sentence, searchWord);
                    p.println("Sentence: " + sentence);
                    p.println("Search Word: " + searchWord);
                    p.println("Result: " + result);
                    p.println();
                }
            }
            sc.close();
        }
        catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
        String sentence = "i am tired", searchWord = "you";
        System.out.println(isPrefixOfWord(sentence, searchWord));
    }
}