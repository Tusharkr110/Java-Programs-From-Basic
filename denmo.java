public class denmo {
    public static void main(String[] args) {
        char[] arr={'t','u','s'};

        String s = new String(arr);

        String s4 ="  कोप  Tushar Kumar";
        char[] charArray = s4.toCharArray();

        System.out.println(charArray);

        // System.out.println(s);

        StringBuilder sb = new StringBuilder("I am String Builder");
        // StringBuilder sb1 = new StringBuffer("I am String Buffer");
        StringBuffer sb2 = new StringBuffer("I am String Buffer");

        String s1 = new String(sb);
        String s12 = new String(sb2);

        System.out.println(s1);
        System.out.println(s12);

        String abc = "Aditya-Tushar-Akash-Vikash-kishan";

        String arr2[] = abc.split("-");

        for(String spliting: arr2){
            System.out.println(spliting);
        }

        String s22="";
        String s23="    ";
        
        System.out.println(s4.contains("Tushar"));
        System.out.println(s4.replace('T', 'R'));
        System.out.println(s4.substring(4));
        System.out.println(s4.substring(4,7));
        System.out.println(s4.trim());
        System.out.println(s4.strip());
        System.out.println(s4.compareTo(abc));
        System.out.println(s22.isBlank());
        System.out.println(s23.isBlank());
        System.out.println(s22.isEmpty());
        System.out.println(s23.isEmpty());
        System.out.println(s4.toLowerCase());
        System.out.println(s4.toUpperCase());
        System.out.println(s4.endsWith("args"));
        System.out.println(s4.startsWith("args"));
        System.out.println(s4.equalsIgnoreCase(abc));
        System.out.println(s4.equals(abc));

        System.out.println(String.join("-","a","sd","fuck You", "bitch"));

        String s564 = String.valueOf(434);
        String s565 = String.copyValueOf(arr);
        System.out.println(s564);
        System.out.println(s565);
        byte[] arrrr = s1.getBytes();
        for(byte i :arrrr){
            System.out.print(i+" , ");
        }

        String ss ="Tushar";
        int age = 23;

        System.out.println(String.format("Hello %s your age is %s. \n How u Doin' ", ss, age));

    }

}
