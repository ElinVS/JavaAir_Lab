import Plane.Plane;
import Plane.PlaneType;
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
        assertEquals(5, plane.getCapacity());
    }

    @Test
    public void hasAWeight(){
        assertEquals(200, plane.getWeight());
    }

}
