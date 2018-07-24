package com.challenage.server.server.Entity;


import javax.persistence.*;

@Entity
@Table(name="locker")
public class Locker {
    private String location;
    private int electricity;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    public Locker(){
        super();
    }

    public Locker(String location,int electricity){
        this.location = location;
        this.electricity = electricity;
    }

    public Locker(String location){
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getElectricity() {
        return electricity;
    }

    public void setElectricity(int electricity) {
        this.electricity = electricity;
    }
    public void setId(Long id){
        this.id = id;
    }
    public Long getId(){
        return this.id;
    }
}
