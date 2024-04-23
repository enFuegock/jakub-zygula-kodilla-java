package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Forum {
    private final List<ForumUser> userList;

    public Forum(List<ForumUser> userList) {
        this.userList = new ArrayList<>(userList);
    }
    public List<ForumUser> getUserList() {
        return Collections.unmodifiableList(userList);
    }

    public void addUser(ForumUser user) {
        userList.add(user);
    }
    public Forum() {
        this.userList = new ArrayList<>();
    }
}
