package models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(	name = "subscription")
public class Subscription {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;
    private int type;
    private double price;
    @ManyToMany
    @JoinColumn(name = "user_id")
    private List<User> users;

    public Subscription(Long id, String name, int type, double price) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.price = price;
        this.users=new ArrayList<>();
    }

    public Subscription() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> user) {
        this.users = user;
    }
}
