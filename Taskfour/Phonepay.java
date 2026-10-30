class PhonePe implements Payment {

    @Override
    public void pay(double amount) {

        System.out.println(
            "Payment through PhonePe: " + amount
        );
    }
}