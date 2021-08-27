package EjemploSobrecarga;

public class EjemploSobrecargaDeMetodos {
    
    private double a;
    private double b;
    private double c;


    public EjemploSobrecargaDeMetodos(double a, double b) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public double operar(){
        
        c=a+b;
        
        return c;        
    }
    
    //la sobre carga se aplica por que se utilizo el mismo nombre de un metodo, pero recibio diferentes tipos de parametros
    public double operar(double a, double b){
        
        c=Math.pow(b,1/a);
        
        return c;        
    }
    
}
