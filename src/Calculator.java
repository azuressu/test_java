public class Calculator {

    String operator;
    int firstNumber, secondNumber;

    public double calculate (String operator, int firstNumber, int secondNumber) {
        this.operator = operator;
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        // return이 있어서 break를 안해주어도 되는 것인가 ..
        switch (this.operator) {
            case "+": // 더하기
                AddOperation addOperation = new AddOperation();
                return addOperation.operate(this.firstNumber, this.secondNumber);
            case "-": // 빼기
                SubstractOperation substractOperation = new SubstractOperation();
                return substractOperation.operate(this.firstNumber, this.secondNumber);
            case "/": // 나누기
                DivideOpertaion divideOpertaion = new DivideOpertaion();
                return divideOpertaion.operate(this.firstNumber, this.secondNumber);
            case "*": // 곱하기
                MultiplyOperation multiplyOperation = new MultiplyOperation();
                return multiplyOperation.operate(this.firstNumber, this.secondNumber);
//            case "%": // 나머지
//                return (double) this.firstNumber % this.secondNumber;
            default: // default 값에 return 안해주면 오류남
                return 0;
        } // switch
    } // calculate


}

