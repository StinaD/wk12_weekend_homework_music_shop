package instruments;

public class Violin extends Instrument {

    private int strings;


    public Violin(InstrumentFamilyType instrumentFamily, MaterialType material, int strings){
        super(instrumentFamily, material);
        this.strings = strings;
    }

    public String play(){
        return "eeeeee";
    }

    public int getStrings() {
        return strings;
    }

    public void setStrings(int strings) {
        this.strings = strings;
    }


}
