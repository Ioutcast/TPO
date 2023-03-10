package vasilkov.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StoryTest {

    private Story story;

    @BeforeEach
    public void init() {
        story = new Story();
    }

    @Test
    @DisplayName("Check Story setup")
    public void testStorySetup() {
        Throwable exception = assertThrows(Exception.class, () -> story.startAction());
        assertEquals("Все истории с чего-то начинаются", exception.getMessage());
    }

    @Test
    @DisplayName("Check Story Speaker")
    public void testStorySpeaker() {
        story.initScene();
        story.getSpeaker().speaks_to_the_crowd();
        Throwable exception = assertThrows(Exception.class, () -> story.getSpeaker().speaks_to_the_crowd());
        assertEquals("Толпа и так слушает! Она не может говорить тише!", exception.getMessage());
    }


}
