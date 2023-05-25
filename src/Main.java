import java.util.Objects;
import java.util.Scanner;
public class Main {
    Scanner sc = new Scanner(System.in);
    Calculator calculator;
    String op;
    int firstNum, secondNum;

    // 연산자를 입력받는 함수 생성
    public String oper() {
        System.out.print("연산자를 입력하세요( + | - | * | / ): ");
        op = sc.nextLine();
        return op;
    }
    // 피연산자를 입력받아 계산해주는 함수 생성
    public void cal(String op) {
        if ( Objects.equals(op, "+") || Objects.equals(op, "-") || Objects.equals(op, "*") || Objects.equals(op, "/")) {
            System.out.print("피연산자 두 개를 띄어쓰기로 입력하세요: ");
            firstNum = sc.nextInt();
            secondNum = sc.nextInt();
            switch (op) {
                case "+" :
                    calculator = new Calculator(new AddOperation());
                    System.out.println(firstNum + " + " + secondNum + " = " + calculator.calculate(firstNum, secondNum));
                    break;
                case "-" :
                    calculator = new Calculator(new SubstractOperation());
                    System.out.println(firstNum + " - " + secondNum + " = " + calculator.calculate(firstNum, secondNum));
                    break;
                case "*" :
                    calculator = new Calculator(new MultiplyOperation());
                    System.out.println(firstNum + " * " + secondNum + " = " + calculator.calculate(firstNum, secondNum));
                    break;
                case "/" :
                    calculator = new Calculator(new DivideOperation());
                    System.out.println(firstNum + " / " + secondNum + " = " + calculator.calculate(firstNum, secondNum));
                    break;
            } //switch문 종료
        } else {
            System.out.println("잘못된 연산자를 입력하셨습니다.");
        }
    }

    public static void main(String[] args) {
        // Main 객체 생성
        Main main = new Main();
        // cal 함수 안에서 oper 함수 호출
        main.cal(main.oper());
    } // main 메소드 종료
}
