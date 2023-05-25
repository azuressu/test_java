public class Calculator {
    // 추상 클래스 인스턴스 생성
    private AbstractOperation operation;
    // Calculator 생성자
    public Calculator (AbstractOperation operation) {
        this.operation = operation;
    }
    // private으로 선언한 operation을 set 할 수 있는 메소드 정의
    public void setOperation(AbstractOperation operation) {
        this.operation = operation;
    }
    // calculate 메소드
    public double calculate (int firstNum, int secondNum) {
        return operation.operate(firstNum, secondNum);
    }
}