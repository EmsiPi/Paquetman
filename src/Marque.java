public enum Marque {
    YELLOWBALL("I^I"),
    CHERRY("ù"),
    TRAP("x");

    private String value;

    Marque(String value) {
        this.value = value;
    }

    public String getValue(){
        return value;
    }
}
