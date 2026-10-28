class constructor {
    String name;
    int age;

    constructor (){
    name = "Aravind";
    age = 25;
    
}
void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class ConstructorMain {
    public static void main(String[] args){
        constructor s1 = new constructor();
        s1.display();
    }

}