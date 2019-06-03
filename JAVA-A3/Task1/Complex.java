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
        double real = (getRealPart() * a) + (getImaginaryPart() * a);
        return toString(getRealPart() + a, getImaginaryPart() + b);
    }
    /*
    double divide(double a, double b){
        double divide;
        return divide;
    }
    double abs(double a, double b){
        double abs;
        return abs;
    }
    */
}