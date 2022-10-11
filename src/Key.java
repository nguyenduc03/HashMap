import lombok.Data;

public @Data class Key {
    int index;
    String name;

    public Key(int index, String name) {
        this.index = index;
        this.name = name;
    }

}
