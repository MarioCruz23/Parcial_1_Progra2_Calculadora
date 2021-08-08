package parcial1;

public class Avanzada {

    public Avanzada() {
    
    }
    public int potencia(int n1, int n2){
    int resultadoavanzada = 0;
    resultadoavanzada = (int) Math.pow(n1, n2);
    return resultadoavanzada;
    }
    public int raizcuadrada(int n1){
    int resultadoavanzada = 0;
    resultadoavanzada = (int) Math.sqrt(n1);
    return resultadoavanzada;
    }
    public double seno(int n1){
    double resultadoavanzada = 0;
    double Grados=n1;
    double radianes = Math.toRadians(Grados);
    resultadoavanzada = Math.sin(radianes);
    return resultadoavanzada;
    }
    public double coseno(int n1){
    double resultadoavanzada = 0;
    double Grados=n1;
    double radianes = Math.toRadians(Grados);
    resultadoavanzada = Math.cos(radianes);
    return resultadoavanzada;
    }
    public double tangente(int n1){
    double resultadoavanzada = 0;
    double Grados=n1;
    double radianes = Math.toRadians(Grados);
    resultadoavanzada = Math.tan(radianes);
    return resultadoavanzada;
    }
}
