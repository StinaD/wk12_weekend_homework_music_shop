package instruments;

public class Euphonium extends Instrument{

    private int valves;
    private String key;

    public Euphonium(InstrumentFamilyType instrumentFamily, MaterialType material, int valves, String key){
        super(instrumentFamily, material);
        this.valves = valves;
        this.key = key;
    }


    public String play(){
        return "boooobooor";
    }

    public int getValves() {
        return valves;
    }

    public void setValves(int valves) {
        this.valves = valves;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
