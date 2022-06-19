import People.Pilot;
import People.RankType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void before(){
        pilot = new Pilot("Adam", RankType.FIRST_OFFICER, "ABC123");
    }

    @Test
    public void hasAName(){
        assertEquals("Adam", pilot.getName());
    }

    @Test
    public void canUpdateNameOfPassenger(){
        pilot.setName("Alex");
        assertEquals("Alex", pilot.getName());
    }

    @Test
    public void hasARank(){
        assertEquals(RankType.FIRST_OFFICER, pilot.getRankType());
    }

    @Test
    public void canUpdateRankType(){
        pilot.setRankType(RankType.CAPTAIN);
        assertEquals(RankType.CAPTAIN, pilot.getRankType());
    }

    @Test
    public void hasALicenceNumber(){
        assertEquals( "ABC123", pilot.getPilotLicenceNumber());
    }

    @Test
    public void canFlyPlane(){
        assertEquals("Cabin-crew prepare for landing", pilot.fly("landing"));
    }
}
