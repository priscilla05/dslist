package com.devsuperior.dslist.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.criteria.CriteriaBuilder;

import java.util.Objects;

@Entity
@Table(name = "tb_belonging")
public class Belonging {

    @EmbeddedId
    private BelongingPk id = new BelongingPk();

    private Integer position;

    public Belonging(){

    }

    public Belonging(Game game , GameList list, Integer position) {
        id.setGame(game);
        id.setList(list);
        this.position= position;
    }

    public BelongingPk getId() {
        return id;
    }

    public void setId(BelongingPk id) {
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
        if (!(o instanceof Belonging)) return false;
        Belonging belonging = (Belonging) o;
        return id.equals(belonging.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
