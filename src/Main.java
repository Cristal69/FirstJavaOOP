
public class Main {
    public static void main(String[] args) {
            Passenger alice = new Passenger("Alice", 3); // Макс. 3 квитки
            alice.buyTicket(TicketType.ECONOMY);
            alice.buyTicket(TicketType.BUSINESS);

            Passenger bob = new Passenger("Bob", 2);
            bob.buyTicket(TicketType.FIRST_CLASS);
            bob.buyTicket(TicketType.FIRST_CLASS);
            bob.buyTicket(TicketType.ECONOMY); // Цей квиток не буде додано, оскільки ліміт - 2

            alice.printTickets();
            System.out.println();
            bob.printTickets();


    }
}