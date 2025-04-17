package ClassBoxAgain;

public class Box {

    //length: double
    //width:  double
    //height:  double
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        this.setLength(length);
        this.setWidth(width);
        this.setHeight(height);
    }

    private void setLength(double length) {
        if (0 >= length) {
            throw new IllegalArgumentException("Length cannot be zero or negative.");
        }
        this.length = length;
    }

    private void setWidth(double width) {
        if (0 >= width) {
            throw new IllegalArgumentException("Width cannot be zero or negative.");
        }
        this.width = width;
    }

    private void setHeight(double height) {
        if (0 >= height) {
            throw new IllegalArgumentException("Height cannot be zero or negative.");
        }
        this.height = height;
    }


    //+	calculateSurfaceArea (): double
    //Surface Area = 2lw + 2lh + 2wh
    public double calculateSurfaceArea() {
        return (2 * length * width) + (2 * length * height) + (2 * width * height);
    }
    //+	calculateLateralSurfaceArea (): double
    //Lateral Surface Area = 2lh + 2wh
    public double calculateLateralSurfaceArea() {
        return 2 * length * height + 2 * width * height;
    }

    //+	calculateVolume (): double
    //Volume = lwh
    public double calculateVolume() {
        return length * height * width;
    }

}
