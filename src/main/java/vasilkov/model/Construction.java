package vasilkov.model;


import lombok.Data;
import lombok.ToString;


import java.util.HashSet;
import java.util.Set;

@Data
@ToString
public class Construction {

    private int floorLvl;

    public static Set<Human> people = new HashSet<>();

    public Construction(int floorLvl,Human human){
        this.floorLvl = floorLvl;
        people.add(human);
    }


}
