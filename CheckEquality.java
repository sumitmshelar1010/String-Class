package MainPackage.String;

public class CheckEquality { // "==" operator for reference comparison,
                             // ".equals() for contain comparison,
    public static void main(String[] args) {
//        MainPackage.String s1 = new MainPackage.String("Happy Birthday");
//        MainPackage.String s2 = new MainPackage.String("Happy Birthday");
//        System.out.println(s1==s2);                    //false
//        System.out.println(s1.equals(s2));             //true
// //-----------------------------------------------------------------------------------
//        MainPackage.String s3 = "Happy Birthday";
//        System.out.println(s1==s3);                     //false
//        System.out.println(s1.equals(s3));              //true
        String s4 = "Happy Birthday";
//        System.out.println(s3==s4);                     //true
//        System.out.println(s3.equals(s4));              //true
        String s5 = "Happy"+" "+"Birthday";
        System.out.println(s4==s5);                     //false
        System.out.println(s4.equals(s5));               //false
    }}
