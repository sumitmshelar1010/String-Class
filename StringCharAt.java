package MainPackage.String;

public class StringCharAt {// THIS TO GET STRING CHARACTERS IN INDEX NUMBER
    public static void main(String[] args) {
        String s1 = "Birthday";
    for (int i=0; i<s1.length(); i++){ // "i" SHOULD BE "<" LESS THAN LENGTH OF STRING
        //IF "i" IS LESS THAN OR EQUAL TO "<=" THEN IT WILL GIVE "StringIndexOutOfBoundsException"
        System.out.println(s1.charAt(i));
      }
        System.out.println("/=========================================================/");
        String s ="Sumit Shelar";

        for (int i=s.length()-1; i>=0 ;i--){// To Get in Reverse
            System.out.println(s.charAt(i));
        }
    }
}



