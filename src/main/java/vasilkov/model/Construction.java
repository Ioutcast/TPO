package vasilkov.model;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.HashSet;
import java.util.Set;

@Data
@ToString
@NoArgsConstructor
public class Construction {

    private int x = 10;

    private int y = 10;

    public static Set<Human> inConstrPeople = new HashSet<>();

    public Construction(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Construction(Human human) {
        inConstrPeople.add(human);
    }

    public Construction(int x, int y, Human human) {
        this.x = x;
        this.y = y;
        inConstrPeople.add(human);
    }

}
