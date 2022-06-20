import People.CabinCrewMember;
import People.RankType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    CabinCrewMember cabinCrewMember;
    CabinCrewMember cabinCrewMember1;



   @Before
    public void before(){
       cabinCrewMember = new CabinCrewMember("Billie", RankType.FLIGHT_ATTENDANT);
       cabinCrewMember1 = new CabinCrewMember("Charles",RankType.PURSER);
   }

   @Test
    public void hasAName(){
       assertEquals("Billie", cabinCrewMember.getName());
   }

    @Test
    public void canUpdateNameOfPassenger(){
        cabinCrewMember1.setName("Larry");
        assertEquals("Larry", cabinCrewMember1.getName());
    }

   @Test
    public void hasARank(){
       assertEquals(RankType.PURSER, cabinCrewMember1.getRankType());
   }

   @Test
   public void canUpdateRankType(){
       cabinCrewMember.setRankType(RankType.PURSER);
       assertEquals(RankType.PURSER, cabinCrewMember.getRankType());
   }

   @Test
    public void canRelayMessages(){
       assertEquals("Thank you for flying with JavaAir Today", cabinCrewMember.relayMessage("Thank you for flying with JavaAir Today"));
   }

}
