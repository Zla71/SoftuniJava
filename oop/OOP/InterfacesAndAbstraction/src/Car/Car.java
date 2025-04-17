package Car;

import java.io.Serializable;

public interface Car extends Serializable {
    //+TIRES: Integer

    int TIRES = 4;

    //+getModel(): String
    String getModel();

    //+getColor(): String
    String getColor();

    //+getHorsePower(): Integer
    Integer getHorsePower();

    //+countryProduced(): String
    String countryProduced();

}
