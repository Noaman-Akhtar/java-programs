class SharedResource {
    synchronized void display(String message) {
        System.out.print(message + " ");
    }
}

class MyThread extends Thread {
    SharedResource resource;
    String[] messages;

    MyThread(SharedResource resource, String[] messages) {
        this.resource = resource;
        this.messages = messages;
    }

    public void run() {
        for (String message : messages) {
            resource.display(message);
        }
    }
}

public class multi2 {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();
        String[] messages1 = {"Thread 1: I", "Thread 1: Love", "Thread 1: Java", "Thread 1: Very", "Thread 1: Much"};
        String[] messages2 = {"Thread 2: I", "Thread 2: Love", "Thread 2: Java", "Thread 2: Very", "Thread 2: Much"};

        MyThread thread1 = new MyThread(resource, messages1);
        MyThread thread2 = new MyThread(resource, messages2);

        thread1.start();
        thread2.start();
    }
}
