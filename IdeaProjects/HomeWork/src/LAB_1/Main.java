package LAB_1;

public class Main {

    public static void main(String...args){
        Point calculate = new Point();
        Point setCalculate = new Point(12,10,9,3);

        calculate.plus();
        calculate.minus();

        setCalculate.plus();
        setCalculate.minus();

    }
}
