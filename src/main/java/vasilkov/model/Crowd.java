package vasilkov.model;


import lombok.*;


import java.util.Collections;
import java.util.HashSet;
import java.util.Set;


@Data
@NoArgsConstructor
public class Crowd{

    private int volume=50;

    private Set<Human> peopleInCrowd = new HashSet<>();

    public Crowd (Set<Human> list){
        this.peopleInCrowd = list;
    }

    @SneakyThrows
    public void exult(){
        if(this.peopleInCrowd.isEmpty()) throw new Exception("В толпе ноль человек!");
        if(this.volume >= 110) throw new Exception("Толпа не может говорить громче!");
        volume +=30;
    }

    @SneakyThrows
    public void listen(){
        if(this.peopleInCrowd.isEmpty()) throw new Exception("В толпе ноль человек!");
        if(this.volume <= 30) throw new Exception("Толпа и так слушает! Она не может говорить тише!");
        volume -=20;
    }

    public void addHuman(Human human){
        peopleInCrowd.add(human);
    }
    public static <T> Set<T> newHashSet(T... objs) {
        Set<T> set = new HashSet<T>();
        Collections.addAll(set, objs);
        return set;
    }
}
