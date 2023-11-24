package DogFile;

class Demo{
    int  value1 = 6;
    int  value2 = 5;
    Demo(){
    // value1 = 1;
     //value2 = 2;
     System.out.println("Inside 1st Constructor");
   }
    Demo(int a){
        value1 = a;
        System.out.println("Inside 2nd Constructor");
    }
    Demo(int a,int b){
        value1 = a;
        value2 = b;
        System.out.println("Inside 3rd Constructor");
    }
    public void display(){
        System.out.println("Value1 === "+value1);
        System.out.println("Value2 === "+value2);
    }
    public static void main(String args[]){
        Demo d1 = new Demo();
        Demo d2 = new Demo();
        Demo d3 = new Demo();
        d1.display();
        d2.display();
        d3.display();
    }
}
