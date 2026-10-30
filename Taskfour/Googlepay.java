class GooglePay implements Payment {

    @Override
    public void pay(double amount) {

        System.out.println(
            "Payment through Google Pay: " + amount
        );
    }
}