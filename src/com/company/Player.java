package com.company;

import java.util.Objects;

public class Player implements Comparable<Player> {
    private String name;
    private int age;
    private int weight;
    private int height;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Player)) return false;
        Player player = (Player) o;
        return getAge() == player.getAge() && getWeight() == player.getWeight() && getHeight() == player.getHeight() && getName().equals(player.getName()) && getLastname().equals(player.getLastname()) && getGender().equals(player.getGender());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), getWeight(), getHeight(), getLastname(), getGender());
    }

    private String lastname;
    private String gender;

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                ", lastname='" + lastname + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }
    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }


    public void setAge(int age) {


        this.age = age;

    }

    public Player(String name, int yas, int weight, int height, String lastname, String gender) {
        this.name = name;
        this.age = yas;
        this.weight = weight;
        this.height = height;
        this.lastname = lastname;
        this.gender = gender;
    }

            @Override
            public int compareTo(Player o) {
//        return this.getAge()- o.getAge();
                return this.getName().compareTo(o.getName());
//        return Boolean.compare(this.isInfected(), o.isInfected());
            }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }



    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
