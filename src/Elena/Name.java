package Elena;

public class Name {
    private String name = "Elena";

    public Name(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return  "My name is " + name;
    }

    public static void main(String[] args) {
        Name name = new Name("Elena");
        System.out.println(name);
    }
}
