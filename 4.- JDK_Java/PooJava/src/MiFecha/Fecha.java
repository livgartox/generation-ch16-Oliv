package MiFecha;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha(){}

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String formato(){
        String fecha=dia+"/"+mes+"/"+anio;
        return fecha;
    }

    public String formatoC(){
        String vaciomes="";
        String vaciodia="";
        if (mes<10){
            vaciomes="0";
        }
        if (dia<10){
            vaciodia="0";
        }
        String fecha=vaciodia+dia+"/"+vaciomes+mes+"/"+anio;
        return fecha;
    }
}
