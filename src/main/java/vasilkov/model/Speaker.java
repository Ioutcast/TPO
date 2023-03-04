package vasilkov.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.SneakyThrows;

import static vasilkov.model.Construction.inConstrPeople;


@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public class Speaker extends Human {

    private Crowd crowd = new Crowd();

    public Speaker(String name) {
        super(name);
    }

    public Speaker(String name, Crowd crowd) {
        super(name);
        this.crowd = crowd;
    }

    public void addSpeakerCrowd(Human human) {
        crowd.addHuman(human);
    }

    @SneakyThrows
    public void speaks_to_the_crowd() {
        if (!containsSpeakerInConstruction(this)) throw new Exception("Cпикер должен вещать из здания!");
        if (this.crowd.getPeopleInCrowd().isEmpty()) throw new Exception("Не к кому обращаться!");
        getCrowd().listen();
    }

    private boolean containsSpeakerInConstruction(Speaker speaker) {
        for (Human h : inConstrPeople) {
            if (h.equals(speaker)) return true;
        }
        return false;
    }

    public String toString() {
        return "Speaker " + this.getName() + "(crowd=" + this.getCrowd() + ")";
    }
}
