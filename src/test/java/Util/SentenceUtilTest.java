package Util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SentenceUtilTest {
    SentenceUtil sentenceUtil=new SentenceUtil();
    @Test
    public void multipleWordsHaveCorrectNumberOfWords() {
        String sentence = "I am Zeinab Shajarkar";
        sentenceUtil.setSentence(sentence);
        assertEquals(4, sentenceUtil.countWords());
    }

    @Test
    public void multipleWordsWithExtraSpacesHaveCorrectNumberOfWords() {
        String sentence = "      I     am        Zeinab           Shajarkar";
        sentenceUtil.setSentence(sentence);
        assertEquals(4, sentenceUtil.countWords());
    }
    @Test
    public void emptyStringHasNoWords() {
        String sentence = "";
        sentenceUtil.setSentence(sentence);
        assertEquals(0, sentenceUtil.countWords());
    }
    @Test
    public void singleWordHasOneWord() {
        String sentence = "Sara";
        sentenceUtil.setSentence(sentence);
        assertEquals(1, sentenceUtil.countWords());
    }
    @Test
    public void countUniqueWords() {
        String sentence = "I am Zeinab Zeinab Shajarkar";
        sentenceUtil.setSentence(sentence);
        assertEquals(4, sentenceUtil.countWords());
    }

    @Test
    public void countUniqueWordsIgonreCase() {
        String sentence = "I am Zeinab zeinab Shajarkar";
        sentenceUtil.setSentence(sentence);
        assertEquals(4, sentenceUtil.countWords());
    }

    @Test
    public void countWordsEvenWithPunctuation() {
        String sentence = "I'm Zeinab zeinab Shajarkar, from. Tehran";
        sentenceUtil.setSentence(sentence);
        assertEquals(6, sentenceUtil.countWords());
    }

}