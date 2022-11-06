import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordsChecker {
    Set <String> setOfWords;
    public WordsChecker (String text) {
         setOfWords = new HashSet<>(List.of(text.split("\\P{IsAlphabetic}+")));
    }
    public boolean hasWord (String word) {
        return setOfWords.contains(word);
    }

}
