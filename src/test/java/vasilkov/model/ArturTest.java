package vasilkov.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ArturTest {
    Artur artur;
    Construction construction;
    @BeforeEach
    public void init(){
        artur = new Artur("Atrur",10,10);
    }

    @Test
    @DisplayName("moveToConstruction test")
    public void alreadyInConstruction(){
        construction = new Construction();
        artur.moveToConstruction(construction);
        Throwable exception = assertThrows(Exception.class, ()->artur.moveToConstruction(construction));
        assertEquals("Артур уже в этом здании!",exception.getMessage());
    }
    @Test
    @DisplayName("spawnArturInConstruction test")
    public void spawnArturInConstruction(){
        construction = new Construction(10,10,artur);
        Throwable exception = assertThrows(Exception.class, ()->artur.moveToConstruction(construction));
        assertEquals("Артур уже в этом здании!",exception.getMessage());
    }

}
