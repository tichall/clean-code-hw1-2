package hw;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean run = true;
        Scanner scanner = new Scanner(System.in);

        while(run) {
            List<Integer> operandList;
            printStudentInfo();

            // Menu 클래스 추가
            // 리스트?로 메뉴 텍스트? 관리?
            // 메뉴를 출력해주는 메서드
            // printMenu();

            System.out.println("1. Permutation (nPr)");
            System.out.println("2. Combination (nCr)");
            System.out.println("3. Quit");
            System.out.println("> ");
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
