package instruments;

public class Saxophone extends Instrument {

    private SaxType style;
    private int keys;

    public Saxophone(InstrumentFamilyType instrumentFamily, MaterialType material, SaxType style, int keys){
        super(instrumentFamily, material);
        this.style = style;
        this.keys = keys;
    }

    public String play(){
        return "burrburrburr";
    }

    public SaxType getStyle() {
        return style;
    }

    public void setStyle(SaxType style) {
        this.style = style;
    }

    public int getKeys() {
        return keys;
    }

    public void setKeys(int keys) {
        this.keys = keys;
    }
}
