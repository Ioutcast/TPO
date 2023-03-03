package vasilkov.model;

import lombok.SneakyThrows;
import lombok.ToString;

import static vasilkov.model.Construction.inConstrPeople;


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
        if(!inConstrPeople.contains(this)) throw new Exception("Cпикер должен вещать из здания!");
        if (this.crowd.getPeopleInCrowd().isEmpty()) throw new Exception("Не к кому обращаться!");
        getCrowd().listen();
    }

    public Crowd getCrowd() {
        return this.crowd;
    }

    public void setCrowd(Crowd crowd) {
        this.crowd = crowd;
    }

    public boolean equals(final Human o) {
        return this.getName().equals(o.getName());
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Speaker;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $crowd = this.getCrowd();
        result = result * PRIME + ($crowd == null ? 43 : $crowd.hashCode());
        return result;
    }
}
