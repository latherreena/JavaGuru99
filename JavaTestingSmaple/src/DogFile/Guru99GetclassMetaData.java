package DogFile;

import java.lang.reflect.Modifier;
public class Guru99GetclassMetaData {

    public static void main (String [] args) throws ClassNotFoundException {
        // Create Class object for Guru99Base.class
        Class guru99ClassObj = Guru99Base.class;

        // Print name of the class
        system.out.println("Name of the class is : " +guru99ClassObj.getName());

        // Print Super class name
        system.out.println("Name of the super class is : " +guru99ClassObj.getSuperclass().getName());

        // Get the list of implemented interfaces in the form of Class array using getInterface() method
        class[] guru99InterfaceList = guru99classObj.getInterfaces();

        // Print the implemented interfaces using foreach loop
        system.out.print("Implemented interfaces are : ");
        for (Class guru99class1 : quru99 InterfaceList)	{
            system.out.print guru99class1. + " ");
        }
        system.out.println();

        //Get access modifiers using get Modifiers() method and toString() method of java.lang.reflect.Modifier class
        int guru99AccessModifier= guru99classObj.getModifiers();
        // Print the access modifiers
        System.Out.println("Access modifiers of the class are : " +Modifier.tostring(guru99AccessModifier));

    }
}