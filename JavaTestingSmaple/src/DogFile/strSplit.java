package DogFile;

public class strSplit {
            public static void main(String []args){
            String strMain = "Alpha Beta, Delta, Gamma, Sigma";
            String[] arrSplit_2 = strMain.split("\\s");
            for (int i=0; i < arrSplit_2.length; i++){
                System.out.println(arrSplit_2[i]);
            }
        }
    }

