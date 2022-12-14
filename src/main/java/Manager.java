import java.util.Arrays;

public class Manager {
    private Ticket[] tickets = new Ticket[0];

    private Repository repository;

    public Manager(Repository repository) {
        this.repository = repository;
    }

    public void add1(Ticket ticket) {
        repository.add(ticket);
    }


    public void removeById1(int id) {
        repository.removeById(id);
    }


    public Ticket[] findTickets(String from, String to) {

        Ticket[] result1 = new Ticket[0];

        for (Ticket ticket : repository.findAll()) {
            if (ticket.getDepartureAirport() == from || ticket.getArrivalAirport() == to) {
                Ticket[] tmp = new Ticket[result1.length + 1];
                for (int i = 0; i < result1.length; i++) {
                    tmp[i] = result1[i];

                }
                tmp[tmp.length - 1] = ticket;
                             result1 = tmp;

            }


        }

        Arrays.sort(result1);
        return result1;
    }
}











