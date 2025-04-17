package ru.netology.servise;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class AviaSoulsTest {

    AviaSouls aviaSouls = new AviaSouls();

    Ticket ticket1 = new Ticket("Ростов", "Москва", 5000, 15, 17);
    Ticket ticket2 = new Ticket("Ростов", "Москва", 13000, 18, 20);
    Ticket ticket3 = new Ticket("Ростов", "Москва", 7000, 19, 22);
    Ticket ticket4 = new Ticket("Ростов", "Сочи", 4000, 8, 10);
    Ticket ticket5 = new Ticket("Москва", "Сочи", 6000, 12, 14);

    @Test
    public void shouldSearchTicketsSortedByPrice() {
        AviaSouls manager = new AviaSouls();
        manager.add(ticket2);
        manager.add(ticket1);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);

        Ticket[] expected = {ticket1, ticket3, ticket2};
        Ticket[] actual = manager.search("Ростов", "Москва");

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReturnEmptyArrayIfNoMatchInSearch() {
        AviaSouls manager = new AviaSouls();
        manager.add(ticket1);
        manager.add(ticket2);

        Ticket[] expected = {};
        Ticket[] actual = manager.search("Питер", "Москва");

        assertArrayEquals(expected, actual);
    }

        @Test
    public void shouldSearchAndSortByFlightTime_Empty() {
        AviaSouls manager = new AviaSouls();
        manager.add(ticket4);
        manager.add(ticket5);

        TicketTimeComparator comparator = new TicketTimeComparator();

        Ticket[] expected = {};
        Ticket[] actual = manager.searchAndSortBy("Ростов", "Москва", comparator);

        assertArrayEquals(expected, actual);
    }
}

