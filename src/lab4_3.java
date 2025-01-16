import java.util.Scanner;

class Interest {
    double principal;
    double rate;
    double time;

    Interest(double principal, double rate, double time) {
        this.principal = principal;
        this.rate = rate;
        this.time = time;
    }

    void display() {
        System.out.println("Interest class display method");
    }
}

class SimpleInterest extends Interest {

    SimpleInterest(double principal, double rate, double time) {
        super(principal, rate, time);
    }

    @Override
    void display() {
        double simpleInterest = (principal * rate * time) / 100;
        System.out.println("Simple Interest: Rs " + simpleInterest);
    }
}

class CompoundInterest extends Interest {

    CompoundInterest(double principal, double rate, double time) {
        super(principal, rate, time);
    }

    @Override
    void display() {
        double compoundInterest = principal * Math.pow((1 + rate / 100), time) - principal;
        System.out.println("Compound Interest: Rs " + compoundInterest);
    }
}

public class lab4_3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        System.out.println("Enter the rate of interest: ");
        double rate = scanner.nextDouble();

        System.out.println("Enter the time period (in years): ");
        double time = scanner.nextDouble();

        System.out.println("Choose the type of interest to calculate (simple/compound): ");
        String choice = scanner.next();

        Interest interest;

        if (choice.equalsIgnoreCase("simple")) {
            interest = new SimpleInterest(principal, rate, time);
        } else if (choice.equalsIgnoreCase("compound")) {
            interest = new CompoundInterest(principal, rate, time);
        } else {
            System.out.println("Invalid choice.");
            scanner.close();
            return;
        }

        interest.display();

        scanner.close();
    }
}
