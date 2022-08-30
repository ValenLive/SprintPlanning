package com.epam.rd.autotasks.sprintplanning.application;

import com.epam.rd.autotasks.sprintplanning.Sprint;
import com.epam.rd.autotasks.sprintplanning.tickets.Ticket;
import com.epam.rd.autotasks.sprintplanning.tickets.UserStory;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /**
         * TODO: User input using Generics for int and strings
         * TODO: Reading file
         * TODO: Custom Exception
         * TODO: Enums
         * TODO: Interface
         * TODO: Streams
         * TODO: Sprint tasks
         */
        Sprint sprint = new Sprint(40, 3);

        sprint.addUserStory(new UserStory(1, "User Registration Entity", 8));
        sprint.addUserStory(new UserStory(2, "User Registration Form", 16));
        sprint.addUserStory(new UserStory(3, "User Registration. Apply Captcha", 16));

        Ticket[] tickets = sprint.getTickets();
        Arrays.stream(tickets).forEach(System.out::println);
//        assertEquals(3, tickets.length);
//        assertEquals(tickets[0].toString(), "[US 1] User Registration Entity");
//        assertEquals(tickets[1].toString(), "[US 2] User Registration Form");
//        assertEquals(tickets[2].toString(), "[US 3] User Registration. Apply Captcha");
//
//        assertEquals(40, sprint.getTotalEstimate());
    }
}
