
class Passenger {
    private final String name;
    private final Ticket[] tickets; // Масив для збереження квитків
    private int ticketCount; // Поточна кількість квитків

    public Passenger(String name, int maxTickets) {
        this.name = name;
        this.tickets = new Ticket[maxTickets]; // Виділяємо місце під квитки
        this.ticketCount = 0;
    }

    public void buyTicket(TicketType type) {
        if (ticketCount < tickets.length) {
            tickets[ticketCount++] = new Ticket(name, type);
        } else {
            System.out.println("Cannot buy more tickets for " + name + ". Limit reached!");
        }
    }

    public int getTotalCost() {
        int total = 0;
        for (int i = 0; i < ticketCount; i++) {
            total += tickets[i].getPrice();
        }
        return total;
    }

    public void printTickets() {
        System.out.println("Passenger: " + name);
        for (int i = 0; i < ticketCount; i++) {
            System.out.println(tickets[i]);
        }
        System.out.println("Total Cost: $" + getTotalCost());
    }
}
