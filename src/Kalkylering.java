public class Kalkylering {
    public static void main(String[] args) throws Exception {
        System.out.println("Uppgift A");
        int tal1 = 23;
        int tal2 = 45;
        int summa;
        int produkt;
        double kvot;

        summa = tal1 + tal2;
        System.out.println(tal1+"+"+tal2+"="+summa);
        
        System.out.println("Uppgift B");

        int tal3 = 23432;
        int tal4 = 3424;
        produkt = tal3 * tal4;
        System.out.println(tal3+"*"+tal4+"="+produkt);

        System.out.println("Uppgift C");

        double tal5 = 10.0;
        double tal6 = 3.0;
        kvot = tal5/tal6;
        System.out.println(tal5+"/"+tal6+"="+kvot);


    }
}
