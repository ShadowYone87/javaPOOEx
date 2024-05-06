class MainConversionTemp{
    public static void main(String[] args) {
        ConversionTemp t1 = new ConversionTemp(20);
        System.out.println("Temperatura en Celsius: " + t1.getC());
        System.out.println("Temperatura en Fahrenheit: " + t1.celsiusAFahrenheit());
        System.out.println(t1);
    }
}