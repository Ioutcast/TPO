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
        construction = new Construction(speaker);
        speaker.addSpeakerCrowd(new Human("a"));
        System.out.println(inConstrPeople.contains(speaker));
        if(!inConstrPeople.contains(speaker)) System.out.println("aaaaaa");
        Throwable exception = assertThrows(Exception.class, ()->speaker.speaks_to_the_crowd());
        assertEquals("Не к кому обращаться!",exception.getMessage());
    }

}
