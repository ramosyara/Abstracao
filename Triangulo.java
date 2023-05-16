public class Triangulo extends Forma {

    private double base;
    private double altura;

    public void setBase(double base) {
        this.base = base;
    }
    public double getBase() {
        return base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getAltura() {
        return altura;
    }

    public double calcularArea(){
        return (base * altura) / 2.0;
    }

    public Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    
}