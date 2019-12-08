package interf.entities;
import ru.vsu.lab.entities.IDivision;;

public class Division implements IDivision {
    private Integer id;
    private String name;

    public Division(Integer id, String name) {
        this.id = id;

        this.name = name;
    }

    public Division() {
    }

    @Override
    public Integer getId() {
        return this.id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
