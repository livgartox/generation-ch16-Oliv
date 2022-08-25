package MiFecha;

public class MainFecha {
    public static void main(String[] args) {
        Fecha fecha1=new Fecha();
        fecha1.setDia(19);
        fecha1.setMes(04);
        fecha1.setAnio(2022);
        System.out.println(fecha1.formato());
        System.out.println(fecha1.formatoC());
    }
}
