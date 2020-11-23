package babysitter;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class BabySitterTest {
    @Test
    public void oneHourPreBedTimeShouldPay12() {
        WageCalculator underTest = new WageCalculator();
        int wage = underTest.calculateShiftWage(17, 18, 20);
        assertThat(wage, is(12));
    }
    @Test
    public void twoHoursPreBedTimeShouldPay24() {
        WageCalculator underTest = new WageCalculator();
        int wage = underTest.calculateShiftWage(17, 19, 20);
        assertThat(wage, is(24));
    }
    @Test
    public void threeHoursPreBedTimeShouldPay36() {
        WageCalculator underTest = new WageCalculator();
        int wage = underTest.calculateShiftWage(17, 20, 20);
        assertThat(wage, is(36));
    }

    @Test
    public void oneHourPostBedTimeAndAfterMidnightShouldPay16() {
        WageCalculator underTest = new WageCalculator();
        int wage = underTest.calculateShiftWage(1, 2, 16);
        assertThat(wage, is(16));
    }
    @Test
    public void twoHoursPostBedTimeAndAfterMidnightShouldPay32() {
        WageCalculator underTest = new WageCalculator();
        int wage = underTest.calculateShiftWage(1, 3, 16);
        assertThat(wage, is(32));
    }
    @Test
    public void threeHoursPostBedTimeAndAfterMidnightShouldPay48() {
        WageCalculator underTest = new WageCalculator();
        int wage = underTest.calculateShiftWage(1, 4, 16);
        assertThat(wage, is(48));
    }

    @Test
    public void oneHourPostBedTimeShouldPay8() {
        WageCalculator underTest = new WageCalculator();
        int wage = underTest.calculateShiftWage(17, 18, 16);
        assertThat(wage, is(8));
    }
    @Test
    public void twoHoursPostBedTimeShouldPay16() {
        WageCalculator underTest = new WageCalculator();
        int wage = underTest.calculateShiftWage(17, 19, 16);
        assertThat(wage, is(16));
    }
    @Test
    public void threeHoursPostBedTimeShouldPay24() {
        WageCalculator underTest = new WageCalculator();
        int wage = underTest.calculateShiftWage(17, 20, 16);
        assertThat(wage, is(24));
    }
}
