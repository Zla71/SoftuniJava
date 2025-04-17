// енумерация - дават възможност да дефинираме съвкупност от стойности, които можем да използваме в нашият код
public enum Month {

    // константни стойности // обекти от класа Month
    // не могат да бъдат списъци, те са само имена на обекти
    JANUARY(5, 189),
    FEBRUARY(7, 89),
    MARCH(10, 200),
    APRIL(12, 48),
    MAY(25, 88),
    JUNE(30, 205),
    JULY(35, 86),
    AUGUST(35, 66),
    SEPTEMBER(20, 99),
    OCTOBER(10, 100),
    NOVEMBER(5, 77),
    DECEMBER(1, 25);

    // полета
    private int averageTemperature;
    private int birthCount;



    // конструктор
    // той е само private, защото тези обекти се дефинират само тук, вътре в класа
    private Month(int averageTemperature, int birthCount) {
        this.averageTemperature = averageTemperature;
        this.birthCount = birthCount;
    }

    // методи
    public int getAverageTemperature() {
        return this.averageTemperature;
    }

    public int getBirthCount() {
        return birthCount;
    }
}
