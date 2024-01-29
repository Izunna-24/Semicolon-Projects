import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class PeriodCycleForHerTest {

    @Test
    public void testThatPeriodCycleForHerExist (){
        PeriodCycleForHer periodCycleForHer = new PeriodCycleForHer();

        assertNotNull(periodCycleForHer);


    }

    @Test
    void knowYourMenstruationCycle() {
        LocalDate startOfPeriod = LocalDate.of(2024,4, 1);
        LocalDate endOfPeriod = LocalDate.of(2024, 4, 26);
        int cycleLength = 25;
        PeriodCycleForHer periodCycleForHer = new PeriodCycleForHer();

       String nextCycleEndDate = periodCycleForHer
               .knowYourMenstruationCycle(startOfPeriod, endOfPeriod, cycleLength);

        assertEquals("2024-05-21", nextCycleEndDate);


    }

    @Test
    void knowYourOvulationDay() {
        PeriodCycleForHer periodCycleForHer = new PeriodCycleForHer();
        LocalDate endOfPeriod = LocalDate.of(2024, 4, 26);

        String nextOvulationDay = periodCycleForHer.knowYourOvulationDay(endOfPeriod);

        assertEquals("2024-05-10", nextOvulationDay);
    }

    @Test
    void knowYourFreeTime() {
        //ArrayList<Integer> = new ArrayList
    }
}