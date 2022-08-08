
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

public class TicketTest {


    private Repository repository = new Repository();
    private Manager manager = new Manager(repository);

    Ticket ticket1 = new Ticket(1, 25, "MOW", "OGZ", 165);
    Ticket ticket2 = new Ticket(2, 35, "KUF", "GOJ", 120);
    Ticket ticket3 = new Ticket(3, 45, "LED", "RVH", 180);
    Ticket ticket4 = new Ticket(4, 65, "FRU", "EKB", 180);
    Ticket ticket5 = new Ticket(5, 100, "LED", "TRY", 300);
    Ticket ticket6 = new Ticket(6, 75, "MSK", "RVH", 250);
    Ticket ticket7 = new Ticket(7, 15, "MOW", "OGZ", 100);
    Ticket ticket8 = new Ticket(8, 50, "LED", "TRY", 190);


    @Test

    public void findTickets1() {

        repository.add(ticket1);
        repository.add(ticket2);
        repository.add(ticket3);
        repository.add(ticket4);
        repository.add(ticket5);
        repository.add(ticket6);
        repository.add(ticket7);
        repository.add(ticket8);


        Ticket[] actual = manager.findTickets("LED", "RVH");
        Ticket[] expected = {ticket3, ticket6, ticket5};

        assertArrayEquals(expected, actual);
    }


    @Test

    public void findTickets2() {

        repository.add(ticket1);
        repository.add(ticket2);
        repository.add(ticket3);
        repository.add(ticket4);
        repository.add(ticket5);
        repository.add(ticket6);
        repository.add(ticket7);
        repository.add(ticket8);


        Ticket[] actual = manager.findTickets("MOW", "OGZ");
        Ticket[] expected = {ticket7, ticket1};

        assertArrayEquals(expected, actual);
    }

    @Test

    public void findTickets3() {

        repository.add(ticket1);
        repository.add(ticket2);
        repository.add(ticket3);
        repository.add(ticket4);
        repository.add(ticket5);
        repository.add(ticket6);
        repository.add(ticket7);
        repository.add(ticket8);


        Ticket[] actual1 = manager.findTickets1("MOW", "OGZ", Ticket::compareTo);
        Ticket[] expected1 = {ticket7, ticket1};

        assertArrayEquals(expected1, actual1);
    }

    @Test

    public void findTickets4() {

        repository.add(ticket1);
        repository.add(ticket2);
        repository.add(ticket3);
        repository.add(ticket4);
        repository.add(ticket5);
        repository.add(ticket6);
        repository.add(ticket7);
        repository.add(ticket8);


        Ticket[] actual2 = manager.findTickets1("LED", "RVH", Ticket::compareTo);
        Ticket[] expected2 = {ticket3, ticket8, ticket6, ticket5};

        assertArrayEquals(expected2, actual2);
    }
}
