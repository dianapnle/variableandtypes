public class Variables {
    public static void main(String[] args) {
//        int dogCount = 94;
//        int catCount = 112;
//        int petCount = dogCount + catCount;
//        System.out.println(petCount); //206
//        int tacos = 12;
//        System.out.println(tacos);
//        tacos = 29;
//        System.out.println(tacos);

//        byte b = 56;
//        short s = 1024;
//        int i = 314; //int literal
//        long lng = -256; //long literal

        /* The following assignments fail.
        b = 1024;       // value is too big for a byte
        s = 75000;      // too big for a short
        i = 3000000000; // too big for an int
        */

//        float f = 3.14f; //32bit
//        double d = 3.14; // 64 bit

//        byte b = 8;
//        short s = 16;
//        int i = 32;
//        long lng = 64L;
//
//        //widening conversions (allowed)
//        s = b; //a byte fits in a short
//        i = s; //a short fits in an int
//        lng = i; //int fits in a long
//        lng = 32; //'32' is an integer literal, it fits in a long
//
//        //narrowing conversions(not allowed)
//        // b = s;   // compiler error: cannot convert from short to byte
//        // s = i;   // compiler error: cannot convert from int to short
//        // i = lng; // compiler error: cannot convert from long to int
//
//        //floating-point types:
//        float f = 32.0f; //float literal
//        double d = 64.0; //double literal

//        //widening conversion (allowed)
//        d = f; //a float fits into a double
//        f = i; //an int fits into a double
//        d = lng; //a long fits into a double

        //narrowing conversion(not allowed)
        // i = f; cannot convert from float to int
        // f = d; cannot convert from double to float
        //lng = d; cannot convert double to long


        int i = 25;
        int result = 100 / (2 + 3) * i % (20 - 3); // result is 7
        System.out.println(result); //206
    }
}
