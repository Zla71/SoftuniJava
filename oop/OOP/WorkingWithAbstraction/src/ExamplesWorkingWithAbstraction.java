
public class ExamplesWorkingWithAbstraction {
    public static void main(String[] args) {

        // enumerations
        // специални класове
        // при създаването на нов клас -> Enum
        // той се грижи да запази предифинирана съвкупност от стойности

        // предназначение - характеристика на нашият обект

        // пример -> клас Month

        System.out.println(Month.JANUARY);

        printMonth(Month.NOVEMBER);

        // стойностите в енумерацията са подредени в масив, могат да бъдат обходени
        for (Month month : Month.values()) {
            System.out.println(month);

            // можем да вземем поредният номер на енум стойността, index в масива
            System.out.println(month.ordinal());

            int numberOfMonthInYear = month.ordinal() + 1;

            System.out.println(numberOfMonthInYear + " -> " + month + ", Average temperature: " + month.getAverageTemperature() + " born people: " + month.getBirthCount());
        }

        // пример класа -> Names
        System.out.println(Names.GOSHO);
        for (Names name : Names.values()) {
            System.out.println(name + " " + name.ordinal());
        }
    }

    public static void printMonth(Month month) {
        System.out.println("this month is: " + month);
    }
}