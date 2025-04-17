package Demo;

public interface Cashable {

    void payWithCash();


    // интерфейса мога да поддържа свои дефолтни методи, но не са добра практика
    default double getSum() {

        return 10;
    }

}
