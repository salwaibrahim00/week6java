package week06;

public class Card {
    private int value;
    private String name;

    // ✅ Correct Constructor (note: should not have a return type like `void`)
    public Card(int value, String name) {
        this.value = value;
        this.name = name;
    }

    // ✅ Getters and Setters
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // ✅ Describe method — prints card details
    public void describe() {
        System.out.println(name + " (value: " + value + ")");
    }
}
