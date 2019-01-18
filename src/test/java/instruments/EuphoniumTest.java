package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EuphoniumTest {

    Euphonium euphonium;

    @Before
    public void before(){
        euphonium = new Euphonium(InstrumentFamilyType.BRASS, MaterialType.BRASS, 3, "B");
    }


    @Test
    public void canPlay(){
        assertEquals("boooobooor", euphonium.play());
    }

    @Test
    public void canGetInstrumentFamily(){
        assertEquals(InstrumentFamilyType.BRASS, euphonium.getInstrumentFamily());
    }

    @Test
    public void canGetMaterialType(){
        assertEquals(MaterialType.BRASS, euphonium.getMaterial());
    }

    @Test
    public void canSetMaterialType(){
        euphonium.setMaterial(MaterialType.MAPLE);
        assertEquals(MaterialType.MAPLE, euphonium.getMaterial());
    }

    @Test
    public void canGetValves(){
        assertEquals(3, euphonium.getValves());
    }

    @Test
    public void canSetValves(){
        euphonium.setValves(4);
        assertEquals(4, euphonium.getValves());
    }

    @Test
    public void canGetKey(){
        assertEquals("B", euphonium.getKey());
    }

    @Test
    public void canSetKey(){
        euphonium.setKey("C");
        assertEquals("C", euphonium.getKey());
    }

}
