package vasilkov.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static vasilkov.model.Construction.*;

public class SpeakerTest {

    private Speaker speaker;

    @BeforeEach
    public void init(){
        speaker = new Speaker("speaker");
    }

    @Test
    @DisplayName("Check speaker w/o crowd")
    public void speakerWoCrowd(){
        Construction construction = new Construction(speaker);
        Throwable exception = assertThrows(Exception.class, ()->speaker.speaks_to_the_crowd());
        assertEquals("Не к кому обращаться!",exception.getMessage());
    }

}
