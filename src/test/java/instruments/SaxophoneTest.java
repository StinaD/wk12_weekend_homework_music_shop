package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaxophoneTest {

    Saxophone saxophone;

    @Before
    public void before(){
        saxophone = new Saxophone(InstrumentFamilyType.WOODDWIND, MaterialType.BRASS, SaxType.ALTO, 20);
    }

    @Test
    public void canPlay(){
        assertEquals("burrburrburr", saxophone.play());
    }

    @Test
    public void canGetInstrumentFamily(){
        assertEquals(InstrumentFamilyType.WOODDWIND, saxophone.getInstrumentFamily());
    }

    @Test
    public void canGetMaterialType(){
        assertEquals(MaterialType.BRASS, saxophone.getMaterial());
    }

    @Test
    public void canSetMaterialType(){
        saxophone.setMaterial(MaterialType.MAPLE);
        assertEquals(MaterialType.MAPLE, saxophone.getMaterial());
    }

    @Test
    public void canGetStyle(){
        assertEquals(SaxType.ALTO, saxophone.getStyle());
    }

    @Test
    public void canSetStyle(){
        saxophone.setStyle(SaxType.BARITONE);
        assertEquals(SaxType.BARITONE, saxophone.getStyle());
    }

    @Test
    public void canGetKeys(){
        assertEquals(20, saxophone.getKeys());
    }

    @Test
    public void canSetKeys(){
        saxophone.setKeys(23);
        assertEquals(23, saxophone.getKeys());
    }

}
