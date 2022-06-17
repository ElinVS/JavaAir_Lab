import Aero.Plane;
import Aero.PlaneType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void before(){
        plane = new Plane(PlaneType.AIRBUS380);
    }

    @Test
    public void hasAPlaneType(){
        assertEquals(PlaneType.AIRBUS380, plane.getPlaneType());
    }

    @Test
    public void hasACapacity(){
        assertEquals(520, plane.getCapacity());
    }

    @Test
    public void hasAWeight(){
        assertEquals(220000, plane.getWeight());
    }

}
