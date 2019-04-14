package pro.edu;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

/**
 * Created by george on 14.04.19.
 */
@Entity
public class Stud {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private  String name;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "grupa_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Grupa grupa;

    public Stud() {
    }

    public Stud(int id, String name, Grupa grupa) {
        this.id = id;
        this.name = name;
        this.grupa = grupa;
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

    public Grupa getGrupa() {
        return grupa;
    }

    public void setGrupa(Grupa grupa) {
        this.grupa = grupa;
    }
}
