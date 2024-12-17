package hw;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean run = true;
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();
        setMenu(menu);

        while(run) {
            List<Integer> operandList;
            printStudentInfo();

            menu.printMenuList();
            int selectedMenu = scanner.nextInt();
            int n, r;

            switch(selectedMenu) {
                case 1 :
                    operandList = inputOperands(scanner, 2);
                    n = operandList.get(0);
                    r = operandList.get(1);
                    System.out.println("nPr = " + Math.permutation(n, r));
                    break;
                case 2 :
                    operandList = inputOperands(scanner, 2);
                    n = operandList.get(0);
                    r = operandList.get(1);
                    System.out.println("nCr = " + Math.combination(n, r));
                    break;
                case 3:
                    System.out.println("Quit.");
                    run = false;
                    break;

            }
        }
        scanner.close();
    }

    private static void printStudentInfo() {
        System.out.println("[ ID: 2012115 ]");
        System.out.println("[ Name: 이서연 ]");
    }

    private static void setMenu(Menu menu) {
        menu.appendMenu("Permutation (nPr)");
        menu.appendMenu("Combination (nCr)");
    }

    private static List<Integer> inputOperands(Scanner scanner, int operandCount) {
        List<Integer> operandList = new ArrayList<>();

        for (int i = 0; i < operandCount; i++) {
            System.out.println("Input n: ");
            int n = scanner.nextInt();
            operandList.add(n);
        }
        return operandList;
    }
}
