import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

class Read {
    public int readNumber() {
        Scanner sc = new Scanner(System.in);
        int number = 0;
        boolean incorrectEnter = true;
        while (incorrectEnter) {
            try {
                System.out.print("Enter a number: ");
                number = sc.nextInt();
                incorrectEnter = false;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                sc.nextLine();
            }
        }
        return number;
    }
    public float readFloat() {
        Scanner sc = new Scanner(System.in);
        float number = 0;
        boolean incorrectEnter = true;
        while (incorrectEnter) {
            try {
                System.out.print("Enter a float: ");
                number = sc.nextFloat();
                incorrectEnter = false;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid float.");
                sc.nextLine();
            }
        }
        return number;
    }
    public double readDouble() {
        Scanner sc = new Scanner(System.in);
        double number = 0;
        boolean incorrectEnter = true;
        while (incorrectEnter) {
            try {
                System.out.print("Enter a double: ");
                number = sc.nextDouble();
                incorrectEnter = false;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid double.");
                sc.nextLine();
            }
        }
        return number;
    }
    public long readLong() {
        Scanner sc = new Scanner(System.in);
        long number = 0;
        boolean incorrectEnter = true;
        while (incorrectEnter) {
            try {
                System.out.print("Enter a long: ");
                number = sc.nextLong();
                incorrectEnter = false;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid long.");
                sc.nextLine();
            }
        }
        return number;
    }
    public boolean readBoolean() {
        Scanner sc = new Scanner(System.in);
        boolean value = false;
        boolean incorrectEnter = true;
        while (incorrectEnter) {
            try {
                System.out.print("Enter a boolean value (true/false): ");
                value = sc.nextBoolean();
                incorrectEnter = false;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter either true or false.");
                sc.nextLine();
            }
        }
        return value;
    }
    public char readChar() {
        Scanner sc = new Scanner(System.in);
        char value = ' ';
        boolean incorrectEnter = true;
        while (incorrectEnter) {
            try {
                System.out.print("Enter a character value: ");
                String input = sc.next();
                if (input.length() == 1) {
                    value = input.charAt(0);
                    incorrectEnter = false;
                } else {
                    System.out.println("Invalid input. Please enter only one character.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid character.");
                sc.nextLine();
            }
        }
        return value;
    }
    public  int[] getNumbersFromKeyboard(int size) {
        Scanner keyboard = new Scanner(System.in);
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            while (true) {
                try {
                    System.out.print("Enter a number: ");
                    numbers[i] = keyboard.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Please enter numbers");
                    keyboard.next();
                }
            }
        }
        return numbers;
    }
    public ArrayList<Integer> readNumbers() {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                int number = Integer.parseInt(scanner.nextLine());
                numbers.add(number);
            } catch (NumberFormatException e) {
                break;
            }
        }
        return numbers;
    }








}


















