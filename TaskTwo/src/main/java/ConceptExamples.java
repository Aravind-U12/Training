/**
 * Entry point for all Java concept examples in this package.
 */
public class ConceptExamples {
    public static void main(String[] args) {
        runExample("Encapsulation", EncapsulationDemo::run);
        runExample("Constructor", ConstructorDemo::run);
        runExample("this keyword", ThisKeywordDemo::run);
        runExample("Method Overloading", MethodOverloadingDemo::run);
        runExample("Method Overriding", MethodOverridingDemo::run);
        runExample("Abstract Class", AbstractClassDemo::run);
    }

    private static void runExample(String name, Runnable example) {
        System.out.println("\n=== " + name + " ===");
        example.run();
    }
}
