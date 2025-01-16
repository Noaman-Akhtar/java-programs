class Plate {
    double length;
    double width;

    Plate(double length, double width) {
        this.length = length;
        this.width = width;
        System.out.println("Plate constructor called");
    }
}

class Box1 extends Plate {
    double height;

    Box1(double length, double width, double height) {
        super(length, width);
        this.height = height;
        System.out.println("Box1 constructor called");
    }
}

class WoodBox extends Box1 {
    double thickness;

    WoodBox(double length, double width, double height, double thickness) {
        super(length, width, height);
        this.thickness = thickness;
        System.out.println("WoodBox constructor called");
    }
}

public class lab4_2 {
    public static void main(String[] args) {
        WoodBox woodBox = new WoodBox(10, 5, 8, 2);
    }
}
