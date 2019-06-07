
public class Complex implements Cloneable {
   private double m_a;
   private double m_b;
    
    Complex(double a, double b) {
        m_a = a;
        m_b = b;
    }
    Complex(double a) {
        m_a = a;
        m_b = 0;
    }
    Complex() {
        m_a = 0;
        m_b = 0;
    }
    double getRealPart() {
        return m_a;
    }
    double getImaginaryPart() {
        return m_b;
    }
    String toString(double a, double b){
        return b == 0 ? a + "\n" : a + " + " + b + "i";
    }
    String add(double a, double b){
        System.out.print( "(" + toString(getRealPart(), getImaginaryPart()) + ") + ");
        System.out.print( "(" + toString(a, b) + ") = ");             
        return toString(getRealPart() + a, getImaginaryPart() + b) + "\n";
    }
    String subtract(double a, double b){
        System.out.print( "(" + toString(getRealPart(), getImaginaryPart()) + ") - ");
        System.out.print( "(" + toString(a, b) + ") = ");     
        return toString(getRealPart() - a, getImaginaryPart() - b) + "\n";
    }
    String multiply(double a, double b){
        double A = a;
        double B = b;
        double C = getRealPart();
        double D = getImaginaryPart();
        double E = (A * C) - (B * D);
        double F = (B * C) + (A * D);

        System.out.print( "(" + toString(getRealPart(), getImaginaryPart()) + ") * ");
        System.out.print( "(" + toString(a, b) + ") = ");     
        return toString(E, F) + "\n";
    }
    String divide(double a, double b){  
        double A = getRealPart();
        double B = getImaginaryPart();
        double C = a;
        double D = b;
        double G = Math.pow(C, 2) + Math.pow(D, 2);
        double E = ((A * C) + (B * D)) / G;
        double F = ((B * C) - (A * D)) /G;

        System.out.print( "(" + toString(getRealPart(), getImaginaryPart()) + ") / ");
        System.out.print( "(" + toString(a, b) + ") = ");     
       
        return toString(E, F) + "\n";
    }
    double abs(double a, double b){
        System.out.print("|(" +  toString(getRealPart(), getImaginaryPart()) + ")| = ");
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }
    
}