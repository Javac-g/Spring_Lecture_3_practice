package LAB_2;

import java.math.BigDecimal;

public class Point_Double extends Point_Int {
    Double a,b,x,y;
    Point_Double(){
        a = 22.4;
        b = 11.2;

    }
    Point_Double(double a,double b){
        this.a = a;
        this.b = b;
    }

    public void processData(){

        x = (a + b);
        y = (a - b);

        System.out.printf("%f + %f = %f%n", a, b, x);
        System.out.printf("%f - %f = %f%n", a, b, y);

    }


}
