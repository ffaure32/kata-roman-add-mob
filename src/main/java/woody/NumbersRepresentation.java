package woody;

public enum NumbersRepresentation {
    FOUR("IIII","IV"),
    FIVE("IIIII", "V"),
    NINE("IIIIIIIII", "IX"),
    TEN("IIIIIIIIII", "X"),
    FORTY("XXXX","XL");

    public final String asIs;
    public final String asRoman;

    NumbersRepresentation(String asIs, String asRoman) {
        this.asIs = asIs;
        this.asRoman = asRoman;
    }
}
