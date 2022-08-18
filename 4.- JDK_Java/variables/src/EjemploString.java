public class EjemploString {
    public static void main(String[] args) {
        //Variable creada directamente
        //Un tipo primitivo si se guarda dentro de la variable
        String curso="Curso en Java";
        String nombre="Olivia GT";
        //Variable creada por referenciación
        //cuando creamos un objeto, lo que se guarda dentro de la variable es la direccion en la memoria donde se encuentra el objeto
        String resultado=new String("Curso en Java");
        System.out.println("resultado = " + resultado);

        //Se compara un valor con un objeto referenciado, por eso nos da false
        boolean esigual=curso==resultado;
        System.out.println("esigual = " + esigual);
        //cuando vamos a comparar cadenas de texto, numeros, caracteres, etc se usa ==
        //cuando comparamos objetos se usa equals()
        esigual=curso.equals(resultado);
        System.out.println("esigual = " + esigual);

        //compara sólo que digan lo mismo, ignora mayusculas y minusculas
        esigual=curso.equalsIgnoreCase(resultado);
        System.out.println("esigual = " + esigual);
        
        String concat=curso+" "+nombre;
        System.out.println("concat = " + concat);
        String concat1=concat.concat(" los Martes").concat(" a las 12");
        System.out.println("concat1 = " + concat1);
        
    }
}