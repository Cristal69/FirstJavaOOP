
enum TicketType {
    ECONOMY(100),
    BUSINESS(250),
    FIRST_CLASS(500);

    private final int price;

    TicketType(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}

