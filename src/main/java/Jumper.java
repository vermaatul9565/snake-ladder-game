package main.java;

public class Jumper {
    int startPoint;
    int endPoint;

    public Jumper(int startPoint, int endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }
    public void showSnakeOnBoard(){
        System.out.print(startPoint +","+endPoint+" ");
    }

}
