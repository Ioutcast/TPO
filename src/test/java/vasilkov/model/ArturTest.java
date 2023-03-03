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
        construction = new Construction();
    }

//    @Test
//    @DisplayName("checkNullConstruction test")
//    public void checkNullConstruction(){
//        Throwable exception = assertThrows(Exception.class, ()->artur.moveToConstruction(null));
//        assertEquals("Argument for @NotNull parameter 'construction' of vasilkov/model/Artur.moveToConstruction must not be null",exception.getMessage());
//    }
    @Test
    @DisplayName("alreadyInConstruction test")
    public void alreadyInConstruction(){
        artur.moveToConstruction(construction);
        Throwable exception = assertThrows(Exception.class, ()->artur.moveToConstruction(construction));
        assertEquals("Артур уже в этом здании!",exception.getMessage());
    }

}
