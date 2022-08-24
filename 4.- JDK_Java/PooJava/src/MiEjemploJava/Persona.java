package MiEjemploJava;

public class Persona {
        private String nombre;
        private int edad;
        private int nss;
        //Constructor
        public Persona(String nombre, int edad, int nss) {
            this.nombre = nombre;
            this.edad = edad;
            this.nss = nss;
        }

        Persona(){

            }
            void caminar(){
                System.out.println("Caminando");
            }
            void dormir(){
                System.out.println("Durmiendo Zzz");
            }
    }
