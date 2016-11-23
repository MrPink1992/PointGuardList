package at.fh.swengb.pointguardlist.model;

import java.io.Serializable;

/**
 * Created by MacS on 23.11.16.
 */

public class PointGuard implements Serializable{

    private String name;
    private int age;
    private int height;
    private int weight;
    private int assistsPerGame;
    private String url;



    public PointGuard(String name, int age, int height, int weight, int assistsPerGame, String url){
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.assistsPerGame = assistsPerGame;
        this.url = url;

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public int getAssistsPerGame() {
        return assistsPerGame;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setAssistsPerGame(int assistsPerGame) {
        this.assistsPerGame = assistsPerGame;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
