package woody;

public enum NumbersRepresentation {
    FOUR("IIII","IV"),
    FIVE("IIIII", "V"),
    NINE("VIV", "IX"),
    TEN("VV", "X"),
    FORTY("XXXX","XL"),
    FIFTY("XXXXX","L");

    public final String asIs;
    public final String asRoman;

    NumbersRepresentation(String asIs, String asRoman) {
        this.asIs = asIs;
        this.asRoman = asRoman;
    }
}
