 class Main {
    public static void main(String[] args) {

        Forno f1 = new Forno();
        Carne c1 = new Carne("Fraldinha");
        Pizza p1 = new Pizza("Portuguesa");
        Pao pa1 = new Pao("Baguete");

        f1.assar(p1);
        f1.assar(c1);
        f1.assar(pa1);


    }
}