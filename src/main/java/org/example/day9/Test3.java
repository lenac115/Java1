package org.example.day9;

public class Test3 {

    public static void main(String[] args) {
        ZooKeeper zooKeeper = new ZooKeeper();

        Tiger tiger = new Tiger();
        zooKeeper.feed(tiger);

        Lion lion = new Lion();
        zooKeeper.feed(lion);

        Rabbit rabbit = new Rabbit();
        zooKeeper.feed2(rabbit);

        Deer deer = new Deer();
        zooKeeper.feed2(deer);
    }
}
