package People;

public class CabinCrewMember extends Person{

    private RankType ranktype;

    public CabinCrewMember(String name, RankType rankType) {
        super(name);
        this.ranktype = rankType;
    }

    public RankType getRankType() {
        return ranktype;
    }

    public void setRankType(RankType ranktype) {
        this.ranktype = ranktype;
    }

    public String relayMessage() {
        return "Thank you for flying with JavaAir Today";
    }
}
