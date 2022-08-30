package com.epam.rd.autotasks.sprintplanning.tickets;

import java.util.Arrays;

public class UserStory extends Ticket {
    private final UserStory[] dependsOn;

    public UserStory(int id, String name, int estimate, UserStory... dependsOn) {
        super(id, name, estimate);
        this.dependsOn = dependsOn;
    }

    @Override
    public void complete() {
        super.setComplete(true);
        for (UserStory item : dependsOn) {
            if (!item.isCompleted()) {
                super.setComplete(false);
                break;
            }
        }
    }

    public UserStory[] getDependencies() {
        return Arrays.copyOf(dependsOn, dependsOn.length);
    }

    @Override
    public String toString() {
        return "[US " + super.getId() + "] " + super.getName();
    }
}
