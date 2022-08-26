package ejerciciosTarea;

public class Hora {
    //palabras de instancia
    //se piden privadas
    private int hora;
    private int minuto;
    private int segundo;

    //Constructor
    public Hora(){}
    public Hora(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    //Getter y Setters
    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }
    //métodos para visualizar Hora
    public String visualizarHora(){
        String vacioHora="";
        String vacioMinuto="";
        String vacioSegundo="";
        if (getSegundo()>=60){//ej:362 segundos serían 6 minutos 2 segundos
            int minutoFinal1=getMinuto()+(getSegundo()/60);
            setSegundo(getSegundo()%60);
            setMinuto(minutoFinal1);
        }
        if (getMinuto()>=60){//ej:362 minutos serían 6 horas y 2 minutos
            int horaFinal1=getHora()+(getMinuto()/60);
            setMinuto(getMinuto()%60);
            setHora(horaFinal1);
        }
        if(getHora()>24){
            setHora(getHora()%24);
        }
        if (getHora()<10){
            vacioHora="0";
        }
        if (getMinuto()<10){
            vacioMinuto="0";
        }
        if (getSegundo()<10){
            vacioSegundo="0";
        }
        return vacioHora+getHora()+":"+vacioMinuto+getMinuto()+":"+vacioSegundo+getSegundo();
    }

}
