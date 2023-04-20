public class IntegerBase8 {
    int base10Value;
    String stringRep;

    public IntegerBase8() {
        this.base10Value = base10Value;
        this.stringRep = stringRep;
    }

    public IntegerBase8(int value) {
        this.base10Value = convert8To10(value);
        this.stringRep = convertToString(convert8To10(base10Value));
    }

    public IntegerBase8(String stringRep) {
        int octal = Integer.parseInt(stringRep);
        this.stringRep = convertToString(convert8To10(octal));

    }

    public static String convertToString(int value) {
        String str = Integer.toString(value);
        return str;
    }

    public static int convert8To10(int value) {
        int count = 0;
        int decimal = 0;
        while (value != 0) {
            decimal += Math.pow(8, count) * (value % 10);
            value /= 10;
            count++;
        }
        return decimal;
    }

    public static IntegerBase8 add(IntegerBase8 val1, IntegerBase8 val2) {
        IntegerBase8 result = new IntegerBase8();
        int res = 0;
        res = val1.base10Value + val2.base10Value;
        String octal = Integer.toOctalString(res);
        result.base10Value = res;
        result.stringRep = octal;
        return result;
    }

    public static IntegerBase8 subtract(IntegerBase8 val1, IntegerBase8 val2) {
        IntegerBase8 result = new IntegerBase8();
        int res = 0;
        res = Math.abs(val1.base10Value - val2.base10Value);
        String octal = Integer.toOctalString(res);
        result.base10Value = res;
        result.stringRep = octal;
        return result;
    }
    public static void main(String[] args) {

        IntegerBase8 val1 = new IntegerBase8(23);
        IntegerBase8 val2 = new IntegerBase8("14");

        IntegerBase8 resultAdd = add(val1,val2);
        IntegerBase8 subst = subtract(val1,val2);

        System.out.printf("Result of octal : %s \n",resultAdd.stringRep);
        System.out.printf("Result of decimal: %d \n",resultAdd.base10Value);


        System.out.printf("Result of octal : %s \n",subst.stringRep);
        System.out.printf("Result of decimal: %d \n",subst.base10Value);




    }
}
