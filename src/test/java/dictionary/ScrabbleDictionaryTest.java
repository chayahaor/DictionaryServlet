package dictionary;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScrabbleDictionaryTest {
    @Test
    void isWord_false() {
        //given
        ScrabbleDictionary dictionary = new ScrabbleDictionary();

        //then
        assertFalse(dictionary.isWord("happ"));
    }

    @Test
    void isWord_true() {
        //given
        ScrabbleDictionary dictionary = new ScrabbleDictionary();

        //then
        assertTrue(dictionary.isWord("happy"));
    }

    @Test
    void isWord_fragment() {
        //given
        ScrabbleDictionary dictionary = new ScrabbleDictionary();
        //then
        assertTrue(dictionary.isWord("hap"));
    }


    @Test
    void isWord_ZOOGEOGRAPHICAL() {
        //given
        ScrabbleDictionary dictionary = new ScrabbleDictionary();
        //then
        assertTrue(dictionary.isWord("ZOOGEOGRAPHICAL"));
    }

    @Test
    void getDefinition() {
        //given
        ScrabbleDictionary dictionary = new ScrabbleDictionary();
        //when
        String definition = dictionary.getDefinition("spacey");
        //then
        assertEquals(definition, "weird in behavior [adj SPACIER, SPACIEST]");
    }

}