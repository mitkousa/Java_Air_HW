public class Pilot {
    private String name;
    private String rank;
    private String licenceNumber;
    private Plane plane;

    public Pilot(Plane plane) {
        this.plane = plane;
    }

    public Pilot(String name, String rank, String licenceNumber) {
        this.name = name;
        this.rank = rank;
        this.licenceNumber = licenceNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getLicenceNumber() {
        return licenceNumber;
    }

    public void setLicenceNumber(String licenceNumber) {
        this.licenceNumber = licenceNumber;
    }

    public String flyThePlane(){
        return this.name + " can fly " + Plane.BOEING747;
    }
}
