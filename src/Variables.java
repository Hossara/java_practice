public class Variables {
    /* Static variable */ static int num2 = 50;

    public static void main(String[] args) {

        /* Hello world */
        System.out.println("Hello, World!");


        /* Variables
        * -----------
        * There are three types of variables in Java:
        *   - Local
        *   - Instance
        *   - Static
        *
        * - Local variables -
        *   A variable declared inside the body of the method is called local variable. You can use this variable only
        *   within that method and the other methods in the class aren't even aware that the variable exists.
        *
        *   A local variable cannot be defined with "static" keyword.
        *
        * - Instance variables -
        *   A variable declared inside the class but outside the body of the method, is called an instance variable.
        *   It is not declared as static.
        *
        *   It is called an instance variable because its value is instance-specific and is not shared among instances.
        *
        * - Static variables -
        *   A variable that is declared as static is called a static variable. It cannot be local. You can create
        *   a single copy of the static variable and share it among all the instances of the class. Memory allocation
        *   for static variables happens only once when the class is loaded in the memory.
        */

        /* Instance variable */
        int num1 = 50;

        /* Math in variables */
        int num4 = num1 + num2;

        /* Widening in variables */
        int num5 = 50;
        float point1 = num5;

        /* Typecasting in variables */
        float point2 = 12.5f;
        int num6 = (int) point2;

        /* Overflow in variables */
        int num7 = 50;
        byte byte1 = (byte) num7;

        /* Adding lower type in variables */
        byte byte2 = 50;
        byte byte3 = 50;
        byte byte4 = (byte)(byte2 + byte3);  // byte c=a+b; Compile Time Error: because a+b=20 will be int
    }

    public void sayHello(){
        /* Local variable */
        int num3 = 50;
    }
}
