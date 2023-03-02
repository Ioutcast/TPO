package vasilkov.model;

import lombok.SneakyThrows;

import static vasilkov.model.Construction.people;

public class Speaker extends Human {

    private final Crowd crowd;

    public Speaker(String name,Crowd crowd) {
        super(name);
        this.crowd  = crowd;
    }

    @SneakyThrows
    public void speaks_to_the_crowd(Human h){

    }
}
