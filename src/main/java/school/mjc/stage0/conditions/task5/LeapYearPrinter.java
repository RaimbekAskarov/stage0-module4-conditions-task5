package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
        year = year%4;
        switch (year){
            case 0:
                System.out.println("leap");
            default:
                System.out.println("not leap");
        }
    }
}
