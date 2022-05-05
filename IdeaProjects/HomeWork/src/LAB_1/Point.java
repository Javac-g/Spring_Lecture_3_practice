package LAB_1;

public class Point {
    int x,y, a1,a2,b1,b2; // a - дествительная часть, b - мнимая

    Point(){
        a1 = 7;
        a2 = 3;
        b1 = 9;
        b2 = 6;

    }

    Point(int a1,int a2,int b1,int b2){

        this.a1 = a1;
        this.a2 = a2;
        this.b1 = b1;
        this.b2 = b2;

    }

    public void plus(){
        x = a1 + a2;
        y = b1 + b2;
        System.out.printf("%d + j%d    +    %d + j%d = %d + j%d%n", a1, b1, a2, b2, x, y);
    }
    public void minus(){
        x = a1 - a2;
        y = b1 - b2;
        System.out.printf("%d + j%d    -    %d + j%d = %d + j%d%n", a1, b1, a2, b2, x, y);
    }


}
