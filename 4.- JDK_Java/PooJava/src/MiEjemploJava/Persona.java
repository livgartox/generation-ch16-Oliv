package MiEjemploJava;

public class Persona {
        private String nombre;
        private int edad;
        private int nss;
        //Constructor

        public Persona(){

        }
        public Persona(String nuevonombre, int nuevaedad, int nuevonss) {
            this.nombre = nuevonombre;
            this.edad = nuevaedad;
            this.nss = nuevonss;
        }

        //métodos accesores
    //Método accesor Set


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNss(int nss) {
        this.nss = nss;
    }

    //Método accesor getter
    //Permite entrar al método privado
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getNss() {
        return nss;
    }

    void caminar(){
                System.out.println("Caminando");
            }
            void dormir(){
                System.out.println("Durmiendo Zzz");
            }
    }
