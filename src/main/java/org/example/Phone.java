package org.example;

import java.util.ArrayList;
import java.util.Optional;

public class Phone {

    private ArrayList<human> friends = new ArrayList<human>();
    private String phoneNumber;

    public Phone(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void addFriend(human friend) {
        friends.add(friend);
    }

    public Optional<human> getFriend(String phoneNumber) {
        Optional<human> findFriend = Optional.empty();
        for (int i = 0; i < friends.size(); i++) {
            if (friends.get(i).getPhone().phoneNumber == phoneNumber) {
                findFriend = Optional.of(friends.get(i));
            }
        }

        return findFriend;
    }
}
