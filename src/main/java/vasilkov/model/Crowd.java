package vasilkov.model;


import lombok.*;

@Data
public class Crowd {

    private int volume=50;

    public Crowd() {
    }

    @SneakyThrows
    public void exult(){
        if(this.volume > 90) throw new Exception("Толпа не может говорить громче!");
        volume +=10;
    }

    @SneakyThrows
    public void listen(){
        if(this.volume < 30) throw new Exception("Толпа не может говорить тише!");
        volume -=30;
    }

}
