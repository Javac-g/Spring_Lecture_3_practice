package LAB_2;

public class Point_Int {
    int a,b, x,y;

    Point_Int(){
        a = 12;
        b = 4;
    }
    Point_Int(int a, int b){

        this.a = a;
        this.b = b;

    }

    public void processData(){
        x = a + b;
        y = a - b;
        System.out.printf("%d + %d = %d%n", a, b, x);
        System.out.printf("%d - %d = %d%n", a, b, y);

    }

}
