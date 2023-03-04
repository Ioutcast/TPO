package vasilkov.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.SneakyThrows;
import lombok.ToString;
import org.jetbrains.annotations.NotNull;

import static vasilkov.model.Construction.inConstrPeople;

@Data
@ToString
@EqualsAndHashCode(callSuper = true)
public class Artur extends Human {

    private int x;

    private int y;

    public Artur(String name, int x, int y) {
        super(name);
        this.x = x;
        this.y = y;
    }

    @SneakyThrows
    public void moveToConstruction(@NotNull Construction construction) {
        int constructionX = construction.getX();
        int constructionY = construction.getY();

        if (constructionX == getX() && constructionY == getY()) {
            if (inConstrPeople.contains(this)) throw new Exception("Артур уже в этом здании!");
            inConstrPeople.add(this);
            return;
        }

        if (constructionX == getX()) {
            setY(constructionY < getY() ? getY() - 1 : getY() + 1);
            return;
        }

        if (constructionY == getY()) {
            setX(constructionX < getX() ? getX() - 1 : getX() + 1);
            return;
        }

        setY(constructionY < getY() ? getY() - 1 : getY() + 1);
        setX(constructionX < getX() ? getX() - 1 : getX() + 1);
    }

}
