public enum Marque {
    YELLOWBALL("I^I"),
    CHERRY("ù"),
    TRAPHIDE(" ");

    private String value;

    Marque(String value) {
        this.value = value;
    }

    public String getValue(){
        return value;
    }
}
