package MainPackage.String;

public class StringSplit { // THIS METHOD IS USED TO DIVIDE OR SPLIT THR STRING

    public static void main(String[] args) {
        String a="Happy birthday to you ";
        String[] b= a.split(" ",3);

        for (String name : b) {
            System.out.println(name);
        }
//------------------------------------------------------------------------------------------------
        String d="Sumit";
        String[] s1 = d.split("",0);

        for (String s2 :s1){
            System.out.println(s2);
        }
    }
}
