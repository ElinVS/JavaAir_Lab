import People.Pilot;
import People.RankType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void before(){
        pilot = new Pilot("Adam", RankType.CAPTAIN, "ABC123");
    }

    @Test
    public void hasAName(){
        assertEquals("Adam", pilot.getName());
    }

    @Test
    public void hasARank(){
        assertEquals(RankType.CAPTAIN, pilot.getRankType());
    }

    @Test
    public void hasALicenceNumber(){
        assertEquals( "ABC123", pilot.getPilotLicenceNumber());
    }

    @Test
    public void Fly(){
        assertEquals("Cabin-crew prepare for landing", pilot.canFly("landing"));
    }
}
