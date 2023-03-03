package vasilkov.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StoryTest {

    private Story story;

    @BeforeEach
    public void init(){
        story = new Story();
    }

    @Test
    @DisplayName("Check Story setup")
    public void testStorySetup() {
        Throwable exception = assertThrows(Exception.class, ()->story.startAction());
        assertEquals("Story must be set first",exception.getMessage());
    }
    @Test
    @DisplayName("Check Story Speaker")
    public void testStorySpeaker() {
        story.initScene();
        story.getSpeaker().getCrowd().listen();
        Throwable exception = assertThrows(Exception.class, ()->story.getSpeaker().speaks_to_the_crowd());
        assertEquals("Толпа и так слушает! Она не может говорить тише!",exception.getMessage());
    }


}
