package org.example;

public class SeongJo {

    int weight;
    int money;
    boolean fat;

    public SeongJo(int weight, int money) {
        this.weight = weight;
        this.money = money;
        this.fat = false;
    }

    public void buyFood(Food food) {
        this.money -= food.cost;
    }

    public void eatFood(Food food) {
        this.weight += food.weight;
        if (this.weight >= 150) {
            this.fat = true;
        }
    }
}