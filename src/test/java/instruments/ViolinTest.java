package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ViolinTest {

    Violin violin;

    @Before
    public void before(){
        violin = new Violin(InstrumentFamilyType.STRINGS, MaterialType.MAPLE, 4);
    }

    @Test
    public void canPlay(){
        assertEquals("eeeeee", violin.play());
    }

    @Test
    public void canGetInstrumentFamily(){
        assertEquals(InstrumentFamilyType.STRINGS, violin.getInstrumentFamily());
    }

    @Test
    public void canGetMaterialType(){
        assertEquals(MaterialType.MAPLE, violin.getMaterial());
    }

    @Test
    public void canSetMaterialType(){
        violin.setMaterial(MaterialType.BRASS);
        assertEquals(MaterialType.BRASS, violin.getMaterial());
    }

    @Test
    public void canGetStrings(){
        assertEquals(4, violin.getStrings());
    }

    @Test
    public void canSetStrings(){
        violin.setStrings(7);
        assertEquals(7, violin.getStrings());
    }
}
