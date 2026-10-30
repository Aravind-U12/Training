class Paytm implements Payment {

    @Override
    public void pay(double amount) {

        System.out.println(
            "Payment through Paytm: " + amount
        );
    }
}