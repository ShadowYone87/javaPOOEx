public class ConversionTemp {
    private int c;

    public ConversionTemp(int c) {
        this.c = c;
    }

    public int celsiusAFahrenheit() {
        return(c * 9/5) + 32;
    }
    
    public int getC() {
        return c;
    }
    
    public void setC(int c) {
        this.c = c;
    }
    @Override
    public String toString() {
        return "ConversionTemp [gradosCelsius=" + c + ", Fahrenheit=" + celsiusAFahrenheit() + "]";
    }
}    
     