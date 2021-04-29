public class Celebrity {
    protected String clue;
    protected String name;
    protected String type;

    public Celebrity(String name, String clue, String type) {
        this.name = name;
        this.clue = clue;
        this.type = type;
    }

    public String toString() {
        return "Name: " + name + "\nClue: " + clue + "\nType: " + type;
    }

    public String getClue() {
        return clue;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}