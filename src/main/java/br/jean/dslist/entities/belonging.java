package br.jean.dslist.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
@Table(name = "tb_belonging")
public class belonging {

    @EmbeddedId
    private belongingPK id = new belongingPK();

    private Integer position;

    public belonging() {

    }

    public belonging(Game game, GameList list, Integer position) {
        id.setGame(game);
        id.setList(list);
        this.position = position;
    }

    public belongingPK getId() {
        return id;
    }

    public void setId(belongingPK id) {
        this.id = id;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof belonging belonging)) return false;
        return Objects.equals(getId(), belonging.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
