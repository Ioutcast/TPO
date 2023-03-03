package vasilkov.model;

import lombok.*;

import static vasilkov.model.Construction.inConstrPeople;


@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@ToString
public class Speaker extends Human {

    private Crowd crowd = new Crowd();

    public Speaker(String name) {
        super(name);
    }

    public Speaker(String name,Crowd crowd) {
        super(name);
        this.crowd = crowd;
    }

    public void addSpeakerCrowd(Human human){
        crowd.addHuman(human);
    }

    @SneakyThrows
    public void speaks_to_the_crowd(){
        if (this.crowd.getPeopleInCrowd().isEmpty()) throw new Exception("Не к кому обращаться!");
        getCrowd().listen();
    }
}
