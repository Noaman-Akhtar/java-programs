
class CounterThread extends Thread {
    private int lowerRange;
    private int upperRange;

    public CounterThread(String name, int lowerRange, int upperRange) {
        super(name);
        this.lowerRange = lowerRange;
        this.upperRange = upperRange;
    }

    @Override
    public void run() {
        System.out.println("Thread - " + this.getName());
        for (int i = lowerRange; i <= upperRange; i++) {
            System.out.println("Counter - " + i);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }
    }
}

public class multi_threadind {
    public static void main(String[] args) {
        String threadName = "First";
        int lowerRange = 10;
        int upperRange = 15;

        CounterThread thread = new CounterThread(threadName, lowerRange, upperRange);
        thread.start();
    }
}