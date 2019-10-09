import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RomanAdditionsTest {
    @Test
    public void onePlusOneEqualsTwoButInRoman() {
        RomanNumber number = new RomanNumber("I");
        RomanNumber number2 = new RomanNumber("I");
        assertThat(number.add(number2).number).isEqualTo("II");
    }

    @Test
    public void IPlusIIEqualsIIIButInRoman() {
        RomanNumber number = new RomanNumber("I");
        RomanNumber number2 = new RomanNumber("II");
        assertThat(number.add(number2).number).isEqualTo("III");
    }

    @Test
    public void IIPlusIEqualsIIIButInRoman() {
        RomanNumber number = new RomanNumber("II");
        RomanNumber number2 = new RomanNumber("I");
        assertThat(number.add(number2).number).isEqualTo("III");
    }

    @Test
    public void IPlusIIIEqualsIVButInRoman() {
        RomanNumber number = new RomanNumber("I");
        RomanNumber number2 = new RomanNumber("III");
        assertThat(number.add(number2).number).isEqualTo("IV");
    }

    @Test
    public void IPlusIVEqualsVButInRoman() {
        RomanNumber number = new RomanNumber("I");
        RomanNumber number2 = new RomanNumber("IV");
        assertThat(number.add(number2).number).isEqualTo("V");
    }

    @Test
    public void IIPlusIIEqualsIVButInRoman() {
        RomanNumber number = new RomanNumber("II");
        RomanNumber number2 = new RomanNumber("II");
        assertThat(number.add(number2).number).isEqualTo("IV");
    }

    @Test
    public void IVPlusIEqualsVButInRoman() {
        RomanNumber number = new RomanNumber("IV");
        RomanNumber number2 = new RomanNumber("I");
        assertThat(number.add(number2).number).isEqualTo("V");
    }

    @Test
    public void VPlusIIEqualsVIIButInRoman() {
        RomanNumber number = new RomanNumber("V");
        RomanNumber number2 = new RomanNumber("II");
        assertThat(number.add(number2).number).isEqualTo("VII");
    }

    @Test
    public void IVPlusVEqualsIXButInRoman() {
        RomanNumber number = new RomanNumber("IV");
        RomanNumber number2 = new RomanNumber("V");
        assertThat(number.add(number2).number).isEqualTo("IX");
    }

    @Test
    public void IXPlusIXEqualsXVIIIButInRoman() {
        RomanNumber number = new RomanNumber("IX");
        RomanNumber number2 = new RomanNumber("IX");
        assertThat(number.add(number2).number).isEqualTo("XVIII");
    }

    @Test
    public void XIXPlusXXVIEqualsXLVButInRoman() {
        RomanNumber number = new RomanNumber("XIX");
        RomanNumber number2 = new RomanNumber("XXVI");
        assertThat(number.add(number2).number).isEqualTo("XLV");
    }

}
