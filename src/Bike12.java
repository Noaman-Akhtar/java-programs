class Bike3 {
    int speedlimit = 90;
}

class Bike12 extends Bike3 {
    int speedlimit = 150;
    void func() {
        System.out.println("speedLimit: " + speedlimit);
    }
    public static void main(String args[]) {
        Bike3 obj = new Bike12();
        System.out.println("speed limit " + obj.speedlimit);
    }
}
