package vasilkov.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CrowdTest {

    private Crowd crowd = new Crowd();

    @Nested
    class CheckNullCrowdTest {
        @BeforeEach
        public void init() {
            crowd = new Crowd();
        }

        @Test
        @DisplayName("Check Null Listen")
        public void crowdListen() {
            Throwable exception = assertThrows(Exception.class, () -> crowd.listen());
            assertEquals("В толпе ноль человек!", exception.getMessage());
        }

        @Test
        @DisplayName("Check Null Exult")
        public void crowdExult() {
            Throwable exception = assertThrows(Exception.class, () -> crowd.exult());
            assertEquals("В толпе ноль человек!", exception.getMessage());
        }
    }

    @BeforeEach
    public void init() {
        crowd.addHuman(new Human("name"));
    }

    @Test
    @DisplayName("Check exult with max volume")
    public void crowdExultMoreThenMaxVolumeError() {
        crowd.exult();
        crowd.exult();
        Throwable exception = assertThrows(Exception.class, () -> crowd.exult());
        assertEquals("Толпа не может говорить громче!", exception.getMessage());
    }

    @Test
    @DisplayName("Check listen with min volume")
    public void crowdListenMinVolumeError() {
        crowd.listen();
        Throwable exception = assertThrows(Exception.class, () -> crowd.listen());
        assertEquals("Толпа и так слушает! Она не может говорить тише!", exception.getMessage());
    }
}
