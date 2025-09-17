import java.util.Scanner;

public class menu_driven_system {
    // ANSI Colors for text
    public static final String RESET = "\u001B[0m";
    public static final String CYAN = "\u001B[36m";
    public static final String YELLOW = "\u001B[33m";
    public static final String GREEN = "\u001B[32m";
    public static final String RED = "\u001B[31m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";

    // Loading Screen
    public static void loadingScreen() {
        System.out.print(CYAN + "\nLoading");
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(500);
                System.out.print(".");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(RESET + "\n" + GREEN + "Welcome to the Menu-Driven System Application!" + RESET);
    }

    // Calculator
    public static void calculator(Scanner sc) {
        System.out.println(YELLOW + "\n--- CALCULATOR ---" + RESET);
        System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        if (choice == 1) {
            System.out.println(GREEN + "Result = " + (a + b) + RESET);
        } else if (choice == 2) {
            System.out.println(GREEN + "Result = " + (a - b) + RESET);
        } else if (choice == 3) {
            System.out.println(GREEN + "Result = " + (a * b) + RESET);
        } else if (choice == 4) {
            if (b != 0)
                System.out.println(GREEN + "Result = " + (a / b) + RESET);
            else
                System.out.println(RED + "Error: Division by zero!" + RESET);
        } else {
            System.out.println(RED + "Invalid choice!" + RESET);
        }
    }

    // Conversion
    public static void conversion(Scanner sc) {
        System.out.println(BLUE + "\n--- CONVERSION ---" + RESET);
        System.out.println("1. mm/cm/m Conversion\n2. Odd or Even\n3. Area & Circumference of Circle");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.print("Enter millimeters: ");
            double mm = sc.nextDouble();
            double cm = mm / 10;
            double m = mm / 1000;
            System.out.println(GREEN + mm + " mm = " + cm + " cm = " + m + " m" + RESET);

        } else if (choice == 2) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            if (num % 2 == 0)
                System.out.println(GREEN + num + " is Even." + RESET);
            else
                System.out.println(GREEN + num + " is Odd." + RESET);

        } else if (choice == 3) {
            System.out.print("Enter radius: ");
            double r = sc.nextDouble();
            double area = Math.PI * r * r;
            double circumference = 2 * Math.PI * r;
            System.out.println(GREEN + "Area = " + area + ", Circumference = " + circumference + RESET);

        } else {
            System.out.println(RED + "Invalid choice!" + RESET);
        }
    }

    // About Us
    public static void aboutUs() {
        System.out.println(PURPLE + "\n--- ABOUT US ---" + RESET);
        String desc = "This project is a Java Menu-Driven System Application.\n"
                + "It includes a Calculator, Conversions, and basic info.\n"
                + "It demonstrates the use of loops, conditionals, and user input.";
        String devs = "Developers:\n- Student 1\n- Student 2\n- Student 3";
        
        // Example use of charAt
        System.out.println(desc);
        System.out.println(devs);

        // Printing project title one char at a time using for loop + charAt
        String title = "MENU-DRIVEN SYSTEM PROJECT";
        System.out.print(YELLOW + "Project Title Animation: ");
        for (int i = 0; i < title.length(); i++) {
            System.out.print(title.charAt(i));
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(RESET);
    }

    // Main Menu
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        loadingScreen();

        while (true) {
            System.out.println(CYAN + "\n==== MAIN MENU ====" + RESET);
            System.out.println("1. Calculator");
            System.out.println("2. Conversion");
            System.out.println("3. About Us");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                calculator(sc);
            } else if (choice == 2) {
                conversion(sc);
            } else if (choice == 3) {
                aboutUs();
            } else if (choice == 4) {
                System.out.println(RED + "Exiting... Goodbye!" + RESET);
                break;
            } else {
                System.out.println(RED + "Invalid choice! Try again." + RESET);
            }
        }
        sc.close();
    }
}