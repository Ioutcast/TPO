package vasilkov.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Human {
    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(final Object o) {
        if (!(o instanceof Human)) {
            return false;
        }
        Human other = (Human) o;
        return this.getName().equals(other.getName());
    }

    @Override
    public int hashCode() {
        int hash = 23;
        return this.getName().hashCode() + hash;
    }

    public String toString() {
        return "Human(name=" + this.getName() + ")";
    }
}