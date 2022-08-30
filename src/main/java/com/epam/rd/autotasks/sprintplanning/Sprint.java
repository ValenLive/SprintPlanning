package com.epam.rd.autotasks.sprintplanning;

import com.epam.rd.autotasks.sprintplanning.tickets.Bug;
import com.epam.rd.autotasks.sprintplanning.tickets.Ticket;
import com.epam.rd.autotasks.sprintplanning.tickets.UserStory;

public class Sprint {

    private int capacity;
    private int ticketsLimit;

    private final Ticket[] tickets;
    private int total;

    private int i = 0;

    public Sprint(int capacity, int ticketsLimit) {
        this.capacity = capacity;
        this.ticketsLimit = ticketsLimit;
        this.tickets = new Ticket[ticketsLimit];
    }

    public boolean addUserStory(UserStory userStory) {

        if (userStory == null) return false;
        if (userStory.isCompleted()) return false;

        if (ticketsLimit - 1 < 0) return false;
        if (capacity - userStory.getEstimate() < 0) return false;

        for (UserStory story : userStory.getDependencies()) {
            if (!story.isCompleted()) return false;
        }

        tickets[i] = userStory;
        i++;

        total += userStory.getEstimate();

        ticketsLimit--;
        capacity -= userStory.getEstimate();

        return true;
    }

    public boolean addBug(Bug bugReport) {

        if (bugReport == null) return false;
        if (bugReport.isCompleted()) return false;

        if (ticketsLimit - 1 < 0) return false;
        if (capacity - bugReport.getEstimate() < 0) return false;

        tickets[i] = bugReport;
        i++;

        total += bugReport.getEstimate();

        ticketsLimit--;
        capacity -= bugReport.getEstimate();

        return true;
    }

    public Ticket[] getTickets() {
        int targetIndex = 0;
        for (int sourceIndex = 0; sourceIndex < tickets.length; sourceIndex++) {
            if (tickets[sourceIndex] != null)
                tickets[targetIndex++] = tickets[sourceIndex];
        }
        Ticket[] newArray = new Ticket[targetIndex];
        System.arraycopy(tickets, 0, newArray, 0, targetIndex);
        return newArray;
    }

    public int getTotalEstimate() {
        return this.total;
    }
}
