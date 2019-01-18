package instruments;

public abstract class Instrument implements IPlay{

    private InstrumentFamilyType instrumentFamily;
    private MaterialType material;

    public Instrument(InstrumentFamilyType instrumentFamily, MaterialType material){
        this.instrumentFamily = instrumentFamily;
        this.material = material;
    }


    public InstrumentFamilyType getInstrumentFamily() {
        return instrumentFamily;
    }

    public void setInstrumentFamily(InstrumentFamilyType instrumentFamily) {
        this.instrumentFamily = instrumentFamily;
    }

    public MaterialType getMaterial() {
        return material;
    }

    public void setMaterial(MaterialType material) {
        this.material = material;
    }
}
