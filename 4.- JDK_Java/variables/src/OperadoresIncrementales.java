public class OperadoresIncrementales {
    public static void main(String[] args) {
        //pre incremento
        int i=1;
        int j=++i; //i=i+1
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //pos incremento
        i=2;
        j=i++;
        System.out.println(" i = " +i);
        System.out.println("j = " + j);

        //pre decremento
        i=1;
        j=--i;
        System.out.println(" pre i = " +i);
        System.out.println("pre j = " + j);

        //post decremento
        i=2;
        j=i--;
        System.out.println(" i = " +i);
        System.out.println("j = " + j);
    }
}
