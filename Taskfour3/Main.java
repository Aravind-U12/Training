public class Main {

    public static void main(String[] args) {

        Printer printer = new Printer();
        Scanner scanner = new Scanner();

        MultiFunctionPrinter machine = new MultiFunctionPrinter();

        printer.print();

        scanner.scan();

        machine.print();
        machine.scan();
    }
}