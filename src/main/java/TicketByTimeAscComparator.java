import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;


@NoArgsConstructor
@AllArgsConstructor
@Data

public class TicketByTimeAscComparator implements Comparator<Ticket> {
    private Ticket[] tickets = new Ticket[0];


    public int compare(Ticket o1, Ticket o2) {
        return o1.getTime() - o2.getTime();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TicketByTimeAscComparator that = (TicketByTimeAscComparator) o;
        return Arrays.equals(tickets, that.tickets);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(tickets);
    }
}

