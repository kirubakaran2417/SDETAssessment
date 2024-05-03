package words;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Words {
    public static List<String> getUniqueWordsFromSentence(String sentence) {
        return Arrays.stream(sentence.toLowerCase().split("\\W+"))
                .distinct()
                .collect(Collectors.toList());
    }
}
