package enums;

public enum Day {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THRUSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    public static void main(String[] args) {
        Day today = Day.SUNDAY;

        System.out.println("Today is:  "+today);
        if(today==Day.MONDAY){
            System.out.println("Week starts today!");
        }
        switch (today){
            case MONDAY -> System.out.println("It's Monday");
            case FRIDAY -> System.out.println("weekend is coming");
            case SATURDAY -> System.out.println("Its saturday");
            case SUNDAY -> System.out.println("It's weekend");
            default -> System.out.println("Midweek day");

        }
        System.out.println("\n All days of the week: ");
        for (Day d:Day.values()){
            System.out.println(d);
        }

    }
}
