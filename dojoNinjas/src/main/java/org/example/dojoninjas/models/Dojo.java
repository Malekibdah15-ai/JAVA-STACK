package org.example.dojoninjas.models;

import jakarta.persistence.*;
import org.antlr.v4.runtime.misc.NotNull;


import java.util.Date;
import java.util.List;


@Entity
@Table(name= "dojos")
public class Dojo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String name;
    @Column(updatable = false)
    private Date createdAt;
    private Date apdatedAt;
    @OneToMany(mappedBy = "dojo", fetch = FetchType.LAZY)
    private List<Ninja> ninja;

    public Dojo() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public Date getApdatedAt() {
        return apdatedAt;
    }

    public List<Ninja> getNinja() {
        return ninja;
    }
}
