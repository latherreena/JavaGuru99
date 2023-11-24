package DogFile;

import java.io.*;
class file1{
    public static void main(String[] args) throws IOException {
        try{
            FileWriter file = new FileWriter("c:\\Data1.txt");
            file.write("Guru99 is here and bablu is great");
            file.close();
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
