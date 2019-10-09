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
        String tempResult = this.number.replace(FOUR.asRoman, FOUR.asIs);
        tempResult = tempResult.replace(FIVE.asRoman, FIVE.asIs);
        tempResult = tempResult.replace(NINE.asRoman, NINE.asIs);
        tempResult = tempResult.replace(TEN.asRoman, TEN.asIs);

        return tempResult;
    }

    private String fromI(String number) {
        String tempResult = number;

        tempResult = tempResult.replace(FORTY.asIs, FORTY.asRoman);
        tempResult = tempResult.replace(TEN.asIs, TEN.asRoman);
        tempResult = tempResult.replace(NINE.asIs, NINE.asRoman);
        tempResult = tempResult.replace(FIVE.asIs, FIVE.asRoman);
        tempResult = tempResult.replace(FOUR.asIs, FOUR.asRoman);
        return tempResult;
    }
}
