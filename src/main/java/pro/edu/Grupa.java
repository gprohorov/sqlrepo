package pro.edu;



import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

/**
 * Created by george on 14.04.19.
 */
@Entity
public class Grupa {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="id")
    private Integer id;
    private String name;
    private String chief;

    public Grupa() {
    }

    public Grupa(String name, String chief) {
        this.id = 0;
        this.name = name;
        this.chief = chief;
    }

    public Grupa(int id, String name, String chief) {
        this.id = id;
        this.name = name;
        this.chief = chief;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getChief() {
        return chief;
    }

    public void setChief(String chief) {
        this.chief = chief;
    }

    @Override
    public String toString() {
        return "Grupa{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", chief='" + chief + '\'' +
                '}';
    }
}
