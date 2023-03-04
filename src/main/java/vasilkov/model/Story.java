package vasilkov.model;


import lombok.Data;
import lombok.SneakyThrows;

import static vasilkov.model.Construction.inConstrPeople;
import static vasilkov.model.Crowd.newHashSet;


@Data
public class Story {

    private Artur artur ;
    private Crowd crowd ;
    private Speaker speaker ;
    private Construction construction ;

    private boolean isStorySet = false;


    public void initScene() {

        crowd = new Crowd(newHashSet(new Human("asd2"),new Human("asd1")));

        artur = new Artur("Artur",9,13);

        speaker = new Speaker( "Speaker");

        speaker.addSpeakerCrowd(new Human("name"));

        construction= new Construction(speaker);

        isStorySet = true;
    }

    @SneakyThrows
    public void startAction() {
        if (!isStorySet) throw new IllegalStateException("Все истории с чего-то начинаются");
    }


}
