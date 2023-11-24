package DogFile;

abstract class Shape{
    final int b = 20;
    public void display(){
        System.out.println("This is display method");
    }
    abstract public void calculateArea();
}

public class Rectangle1 extends Shape{
    public static void main(String args[]){
        Rectangle1 obj = new Rectangle1();
        obj.display();
        obj.calculateArea();
        //obj.b=200;
    }
    public void calculateArea(){
        System.out.println("this is a method");
    }
}

