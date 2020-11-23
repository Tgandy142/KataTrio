package babysitter;

public class WageCalculator {
    private System system;

    public int calculateShiftWage(int startingHour, int endingHour, int bedtime) {
        int hoursWorked = 0, hoursBeforeBedtime = 0, hoursWorkedAfterTwelve = 0, wage = 0;
        if(endingHour < 5 && startingHour > 16) {
            hoursWorked = (24 - startingHour) + endingHour;
            hoursWorkedAfterTwelve = endingHour;
        }
        else{
            if(endingHour < 5)
                hoursWorkedAfterTwelve = endingHour-startingHour;
            hoursWorked = endingHour-startingHour;
        }
        if(bedtime > startingHour && startingHour > 16)
        {
            if(endingHour < startingHour && endingHour < bedtime)
                hoursBeforeBedtime = 0;
            else {
                hoursBeforeBedtime = bedtime - startingHour;
                hoursBeforeBedtime -= (bedtime - endingHour);
            }
        }
        else
            hoursBeforeBedtime = 0;

        hoursWorked = hoursWorked-hoursBeforeBedtime-hoursWorkedAfterTwelve;

        wage = wage + (hoursBeforeBedtime*12)+(hoursWorkedAfterTwelve*16)+(hoursWorked*8);

        return wage;
    }
}
