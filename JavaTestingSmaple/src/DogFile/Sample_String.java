package DogFile;

public class Sample_String {
    public static void main(String[] args) {

        String str_Sample = "e";
        System.out.println("Compare To 'a' b is : " + str_Sample.compareTo("c"));
        str_Sample = "c";
        System.out.println("Compare To 'b' a is : " + str_Sample.compareTo("a"));
        str_Sample = "b";
        System.out.println("Compare To 'b' b is : " + str_Sample.compareTo("b"));
    }

}
