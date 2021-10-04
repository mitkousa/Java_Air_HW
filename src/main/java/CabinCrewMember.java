import java.util.ArrayList;

public class CabinCrewMember{
    Rank rank;

    public CabinCrewMember(Rank rank) {
        this.rank = rank;
    }

    public Rank getRank() {
        return rank;
    }

    public String relayMessage(){
        return this.rank.getName() + " can relay message";
    }
}