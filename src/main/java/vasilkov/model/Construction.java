package vasilkov.model;


import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
public class Construction {

    private int windowLvl;

    private int floorLvl;

    Set<Human> humans = new HashSet<>();



}
