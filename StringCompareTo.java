package MainPackage.String;

public class StringCompareTo {
    public static void main(String[] args) {
        String s1 = "Birthday2";
        String s2 = "Birthday";
        System.out.println(s1.compareTo(s2)); // o/p is +ve because s1>s2
//-------------------------------------------------------------------------------------------
        String s3 = "Birthday";
        String s4 = "Birthday";
        System.out.println(s3.compareTo(s4)); // o/p is zero because s3==s4
//-------------------------------------------------------------------------------------------
        String s5 = "Birthday";
        String s6 = "Birthday1";
        System.out.println(s5.compareTo(s6)); // o/p is negative because s5==s6
//-------------------------------------------------------------------------------------------
        String s7 = "I am Happy";
        String s8 = "I am too much Happy";
        System.out.println(s7.compareTo(s8)); // o/p is negative because s7<s8
        // It compares unicode value of each character
    }
}
