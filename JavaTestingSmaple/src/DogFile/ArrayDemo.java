package DogFile;

import java.util.Arrays;

class ArrayDemo{
    public static void main(String args[]){
        //declare and construct
        int array[] = new int[70];
        for (int count=0;count<70; count++)
        {
            array[count]=count+1;

        }

        for (int count=0;count<70;count++)
        {
            System.out.println("array["+count+"] = "+array[count]);

        }
        System.out.println("Length of Array  =  "+ array.length);
         array[8] =10;
    }
}
