
public class Complex {
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
        return b == 0 ? a + "\n" : a + " + " + b + "i" + "\n";
    }
    String add(double a, double b){
        //String x = "(" + getRealPart() + " + " + getImaginaryPart() + "i) + (" + a + " + " + b + "i) = ";  
        return toString(getRealPart() + a, getImaginaryPart() + b);
    }
    
    String subtract(double a, double b){
      //  String x = "(" + getRealPart() + " + " + getImaginaryPart() + "i) - (" + a + " + " + b + "i) = ";  
        return toString(getRealPart() - a, getImaginaryPart() - b);
    }
    String multiply(double a, double b){
        //double real = (getRealPart() * a) + (getImaginaryPart() * a);
        
        double A = a;
        double B = b;
        double C = getRealPart();
        double D = getImaginaryPart();
        double E = (A * C) - (B * D);
        double F = (B * C) + (A * D);
        return toString(E, F);
    }
    String divide(double a, double b){  
        double A = getRealPart();
        double B = getImaginaryPart();
        double C = a;
        double D = b;
        double G = Math.pow(C, 2) + Math.pow(D, 2);
        double E = ((A * C) + (B * D)) / G;
        double F = ((B * C) - (A * D)) /G;
       
       // System.out.println(E);
        System.out.println(A + " " + B + " " + C + " " + D + " "+G);
       // System.out.println(G);
        return toString(E, F);
    }
    double abs(double a, double b){
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }
    
}