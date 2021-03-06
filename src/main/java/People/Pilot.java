package People;

public class Pilot extends CabinCrewMember{

    private String pilotLicenceNumber;

    public Pilot(String name, RankType rankType, String pilotLicenceNumber) {
        super(name, rankType);
        this.pilotLicenceNumber = pilotLicenceNumber;
    }

    public String getPilotLicenceNumber() {
        return this.pilotLicenceNumber;
    }

    public String fly(String action) {
        return "Cabin-crew prepare for " + action;
    }
}

