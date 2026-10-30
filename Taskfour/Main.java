public class Main {

    public static void main(String[] args) {

        PaymentService service = new PaymentService();

        Payment googlePay = new GooglePay();
        Payment phonePe = new PhonePe();
        Payment paytm = new Paytm();

        service.processPayment(googlePay, 1000);

        service.processPayment(phonePe, 2000);

        service.processPayment(paytm, 3000);
    }
}