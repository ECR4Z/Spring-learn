package com.ming.pojo;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @Author: ECRZ
 * Data:2021-09
 * @Description:
 */
public class Workman {
    private String name;
    private Address address;
    private String[] hobby;
    private List friends;
    private Map card;
    private Set games;
    private Properties info;

    public String getGoal() {
        return goal;
    }

    public void setGoal(String goal) {
        this.goal = goal;
    }

    private String goal;

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public String[] getHobby() {
        return hobby;
    }

    public List getFriends() {
        return friends;
    }

    public Map getCard() {
        return card;
    }

    public Set getGames() {
        return games;
    }

    public Properties getInfo() {
        return info;
    }

    public void setHobby(String[] hobby) {
        this.hobby = hobby;
    }

    public void setFriends(List friends) {
        this.friends = friends;
    }

    public void setCard(Map card) {
        this.card = card;
    }

    public void setGames(Set games) {
        this.games = games;
    }

    public void setInfo(Properties info) {
        this.info = info;
    }

    public void show() {
        System.out.printf("name:%s,address:%s\n", this.name, this.address);
        System.out.println("hobby:");
        for (String h : this.hobby) {
            System.out.print(h+" ");
        }
        System.out.println();
        System.out.println("friends:"+this.friends);
        System.out.println("card:"+this.card);
        System.out.println("games:"+this.games);
        System.out.println("info:"+this.info);
    }
}
