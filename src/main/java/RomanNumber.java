import static woody.NumbersRepresentation.*;

public class RomanNumber {


    String number;

    public RomanNumber(String number) {
        this.number = number;
    }


    public RomanNumber add(RomanNumber added) {
        String thisNumber = this.toI();
        String addedNumber = added.toI();
        String concatenation = thisNumber + addedNumber;
        return new RomanNumber(fromI(concatenation));
    }

    private String toI() {
        String tempResult = this.number.replaceAll(FORTY.asRoman, FORTY.asIs);
        tempResult = tempResult.replaceAll(NINE.asRoman, NINE.asIs);
        tempResult = tempResult.replaceAll(TEN.asRoman, TEN.asIs);
        tempResult = tempResult.replaceAll(FOUR.asRoman, FOUR.asIs);
        tempResult = tempResult.replaceAll(FIVE.asRoman, FIVE.asIs);


        return tempResult;
    }

    private String fromI(String number) {
        String tempResult = number;
        tempResult = tempResult.replaceAll(FIVE.asIs, FIVE.asRoman);
        tempResult = tempResult.replaceAll(FOUR.asIs, FOUR.asRoman);
        tempResult = tempResult.replaceAll(TEN.asIs, TEN.asRoman);
        tempResult = tempResult.replaceAll(NINE.asIs, NINE.asRoman);
        tempResult = tempResult.replaceAll(FORTY.asIs, FORTY.asRoman);

        return tempResult;
    }
}
