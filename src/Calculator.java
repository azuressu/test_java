import java.util.Objects;

public class Calculator {
    private final AddOperation addOperation;
    private final SubstractOperation substractOperation;
    private final MultiplyOperation multiplyOperation;
    private final DivideOperation divideOperation;

    public Calculator(AddOperation addOperation, SubstractOperation substractOperation,
                      MultiplyOperation multiplyOperation, DivideOperation divideOperation) {
        this.addOperation = addOperation;
        this.substractOperation = substractOperation;
        this.multiplyOperation = multiplyOperation;
        this.divideOperation = divideOperation;
    }
    public double calculate (String operator, int firstNumber, int secondNumber) {
        // return이 있어서 break를 안해주어도 되는 것인가 ..
        switch (operator) {
            case "+": // 더하기
                return addOperation.operate(firstNumber, secondNumber);
            case "-": // 빼기
                return substractOperation.operate(firstNumber, secondNumber);
            case "/": // 나누기
                return divideOperation.operate(firstNumber, secondNumber);
            case "*": // 곱하기
                return multiplyOperation.operate(firstNumber, secondNumber);
//            case "%": // 나머지
//                return (double) this.firstNumber % this.secondNumber;
            default: // default 값에 return 안해주면 오류남
                return 0;
        } // switch
    } // calculate

//    public double calculate(String s, int firstNum, int secondNum) {
//        if (Objects.equals(s, "+")) {
//            return addOperation.operate(firstNum, secondNum);
//        } else if (Objects.equals(s, "-")) {
//            return substractOperation.operate(firstNum, secondNum);
//        } else if (Objects.equals(s, "*")) {
//            return multiplyOperation.operate(firstNum, secondNum);
//        } else if (Objects.equals(s, "/")) {
//            return divideOperation.operate(firstNum, secondNum);
//        } else {
//            return 0; // if문 종료
//        }
//    } // calculate 메소드

}

