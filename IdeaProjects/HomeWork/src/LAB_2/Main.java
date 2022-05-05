package LAB_2;

public class Main {

    public static void main(String... args){

        Point_Int  InumOne = new Point_Double();
        Point_Int  InumTwo = new Point_Double(11.2,9.3);

        InumOne.processData();
        InumTwo.processData();

        InumOne = new Point_Int();
        InumTwo = new Point_Int(5,2);

        InumOne.processData();
        InumTwo.processData();



    }
}
