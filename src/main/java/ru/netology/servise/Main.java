package ru.netology.servise;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TicketTimeComparator comparator = new TicketTimeComparator();

        Ticket ticket1 = new Ticket("Ростов",
                "Москва",
                5000,
                15,
                17);

        Ticket ticket2 = new Ticket("Ростов",
                "Москва",
                13000,
                18,
                20);

        Ticket ticket3 = new Ticket("Ростов",
                "Москва",
                7000,
                19,
                22);

        Ticket[] tickets = {ticket1, ticket2, ticket3};

        System.out.println(ticket1.compareTo(ticket3));

        Arrays.sort(tickets);
  //      Arrays.sort(tickets, comparator);
    }
}