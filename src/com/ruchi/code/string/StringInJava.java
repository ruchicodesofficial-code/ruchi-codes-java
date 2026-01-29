package com.ruchi.code.string;

public class StringInJava {
    public static void main(String[] args) {

        String num = "122344";
        //System.out.println(num);
//        System.out.println(s);
//        s = s+" programming"; //new object created
//        s = s+" hello";
        //        System.out.println(s);
        String firstName = "Ruchi";
        String lastName = "raghuwanshi";
//        System.out.println(firstName+" "+lastName);
        String s = "java";
        //.length()
       // System.out.println(firstName.length());

        //.charAt()
//        System.out.println(s.charAt(0));

        //.substring()
        String name = "   Riya Gupta   ";
        //System.out.println(name.substring(0,4));

        //equals()
        String s1 = "hello";
//        System.out.println(s1.equals("hello"));
//        System.out.println(s1.equalsIgnoreCase("Hello"));
//        System.out.println(s1.toUpperCase());
        String n1 = "    Hello World   ";
//        System.out.println(n1.trim());
        //System.out.println(s1.concat("world"));
        String a = "java";
        String b = "java";
//        System.out.println(a==b);
        String n = new String("java");//goes to heap
        String s2 = n.intern();
//        System.out.println(a==s2);

//       //d/w == vs .equals()
//       String var1 = "hello";
//       String var2 = new String("hello");
//        System.out.println(var1.equals(var2));//true
//        System.out.println(var1==var2);//false

        StringBuffer sb = new StringBuffer("java");
        sb.append(" programming");
        System.out.println(sb);
        StringBuilder sbuilder = new StringBuilder("Hello");
        sbuilder.append("\nHow R you??");



    }
}
