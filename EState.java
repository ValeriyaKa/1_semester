public enum EState {
    HAPPY ("очень рад"),
    FAINT ("обморок"),
    LOUGHT ("смеялся"),
    WINK ("подмигивать"),
    RECOVER (" едва придя в себя");
    private String attribute;
    EState(String state) {
        attribute=state;
    }
    public String toString() {
        return attribute;
    }
}