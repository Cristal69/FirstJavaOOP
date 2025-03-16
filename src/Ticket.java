

class Ticket {
    private static int counter = 1; // Лічильник для унікальних номерів квитків
    private final int ticketNumber;
    private final String passengerName;
    private final TicketType ticketType;

    public Ticket(String passengerName, TicketType ticketType) {
        this.ticketNumber = counter++;
        this.passengerName = passengerName;
        this.ticketType = ticketType;
    }

    public int getPrice() {
        return ticketType.getPrice();
    }

    @Override
    public String toString() {
        return "Ticket #" + ticketNumber +
                " | Passenger: " + passengerName +
                " | Type: " + ticketType +
                " | Price: $" + getPrice();
    }
}