package Util;

import java.util.Arrays;

public class SentenceUtil {
   private String sentence;

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    public  int countWords() {
        if (isEmptyString(sentence))
            return 0;
        return (int) Arrays.stream(sentence.trim().split("[ ,.']+")).map(String::toLowerCase).distinct().count();
    }

    private boolean isEmptyString(String sentence) {
        return sentence.trim().length() == 0;
    }
}
