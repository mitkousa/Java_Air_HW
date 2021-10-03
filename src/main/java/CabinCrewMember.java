public enum CabinCrewMember {
    CAPTAIN("John"),
    FIRST_OFFICER("Patric"),
    PURSER("Grace"),
    FLIGHT_ATTENDANT1("Emma"),
    FLIGHT_ATTENDANT2("Josh"),
    FLIGHT_ATTENDANT3("Bruce"),
    FLIGHT_ATTENDANT4("Suzy");

    private final String name;

    CabinCrewMember(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}