public class EjemploSaludo {
    public static void main(String[] args) {
        //Para hacer la instancia
        Saludo objSaludo;//declaración
        objSaludo= new Saludo();//Construcción
        objSaludo.saludar();//Llamada

        Saludo objSaludo0=new Saludo();

        System.out.println(objSaludo.saludar0());
        System.out.println("este es otro objeto: -> "+objSaludo0.saludar0());
        objSaludo.textoS="Hola";
        System.out.println(" objSaludo " +objSaludo);
        objSaludo0.a=4;
        System.out.println("objSaludo0 = " + objSaludo0);



    }
}
