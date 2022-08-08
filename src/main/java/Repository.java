public class Repository {
    private Ticket[] tickets = new Ticket[0];
    private TicketByTimeAscComparator[] tickets1 = new TicketByTimeAscComparator[0];

    public void add(Ticket ticket) {
        int length = tickets.length + 1;
        Ticket[] tmp = new Ticket[length];
        System.arraycopy(tickets, 0, tmp, 0, tickets.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = ticket;
        tickets = tmp;


    }

    public Ticket[] findAll() {
        return tickets;
    }
//    public TicketByTimeAscComparator[] findAll1() {
//        return tickets1;
//    }

    public void removeById(int id) {
        int length = tickets.length - 1;
        Ticket[] tmp = new Ticket[length];
        int index = 0;
        for (Ticket ticket : tickets) {
            if (ticket.getId() != id) {
                tmp[index] = ticket;
                index++;
            }

        }
        tickets = tmp;

    }
}
