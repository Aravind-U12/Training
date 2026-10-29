import java.util.Objects;

class EqualHashStudent {
    private int id;
    private String name;

    public EqualHashStudent(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof EqualHashStudent)) {
            return false;
        }

        EqualHashStudent other = (EqualHashStudent) obj;

        return this.id == other.id
                && Objects.equals(this.name, other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}

public class equalandhash {
    public static void main(String[] args) {
        EqualHashStudent s1 = new EqualHashStudent(1, "Rahul");
        EqualHashStudent s2 = new EqualHashStudent(1, "Rahul");

        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}