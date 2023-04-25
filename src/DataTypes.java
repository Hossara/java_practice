public class DataTypes {
    public static void main(String[] args) {
        /* Data Types
        * -----------
        * Data types specify the different sizes and values that can be stored in the variable.
        * There are two types of data types in Java:
        *   - Primitive data types
        *   - Non-primitive data types
        *
        * - Primitive data types -
        *   The primitive data types include boolean, char, byte, short, int, long, float and double.
        *
        * - Non-primitive data types -
        *   The non-primitive data types include Classes, Interfaces, and Arrays.
        */

        /* Boolean */
        Boolean bool1 = true;

        /* Bytes */
        // Its minimum value is -128 and maximum value is 127. Its default value is 0.
        // The byte data type is used to save memory in large arrays where the memory savings is most required.
        // It saves space because a byte is 4 times smaller than an integer. It can also be used in place of "int" data type.
        byte byte1 = 10;
        byte byte2 = -20;

        /* Short */
        // Its minimum value is -32,768 and maximum value is 32,767. Its default value is 0.
        // The short data type can also be used to save memory just like byte data type.
        // A short data type is 2 times smaller than an integer.
        short short1 = 10000;
        short short2 = -5000;

        /* Int */
        // Its minimum value is - 2,147,483,648and maximum value is 2,147,483,647. Its default value is 0.
        int int1 = 100000;
        int int2 = -200000;

        /* Long */
        // Its minimum value is - 9,223,372,036,854,775,808and maximum value is 9,223,372,036,854,775,807.
        // Its default value is 0. The long data type is used when you need a range of values more than those provided by int.
        long long1 = 100000L;
        long long2 = -200000L;

        /* Float */
        // The float data type is a single-precision 32-bit IEEE 754 floating point.Its value range is unlimited.
        // It is recommended to use a float if you need to save memory in large arrays of floating point numbers.
        // The float data type should never be used for precise values, such as currency. Its default value is 0.0F.
        float float1 = 234.5f;

        /* Double */
        // The double data type is a double-precision 64-bit IEEE 754 floating point. Its value range is unlimited.
        // The double data type is generally used for decimal values just like float.
        // The double data type also should never be used for precise values, such as currency. Its default value is 0.0d.
        double double1 = 12.3;

        /* Char */
        // The char data type is a single 16-bit Unicode character.
        // Its value-range lies between '\u0000' (or 0) to '\uffff' (or 65,535 inclusive).
        // The char data type is used to store characters.
        char charA = 'A';
    }
}
