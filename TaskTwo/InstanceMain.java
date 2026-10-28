class instance {    // Instance variables
    String name;
    int age;

    // Instance method
    void display() {
        System.out.println(name + " - " + age);
    }
}

public class InstanceMain {
    public static void main(String[] args) {
        instance s1 = new instance();
        s1.name = "Nani";
        s1.age = 23;

        instance s2 = new instance();
        s2.name = "Lakshmi";
        s2.age = 22;

        s1.display();
        s2.display();
    }
}
