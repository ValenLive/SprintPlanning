package com.epam.rd.autotasks.sprintplanning.tickets;

public class Ticket {

    private final int id;
    private final String name;
    private final int estimate;
    private boolean isComplete = false;

    public Ticket(int id, String name, int estimate) {
        this.id = id;
        this.name = name;
        this.estimate = estimate;
    }

    public void setComplete(boolean complete) {
        isComplete = complete;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getEstimate() {
        return estimate;
    }

    public boolean isCompleted() {
        return isComplete;
    }

    public void complete() {
        isComplete = true;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", estimate=" + estimate +
                ", isComplete=" + isComplete +
                '}';
    }
}
