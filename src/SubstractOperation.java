public class SubstractOperation {

    int firstNumber, secondNumber;

    public double operate(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        return (double) this.firstNumber - this.secondNumber;
    }
}