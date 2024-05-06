import java.util.Random;
class Password{
    private int longitud = 8;
    private String contraseña;

    public Password() {
        this.longitud = 8;
        this.generarPassword();
    }
    public Password(int longitud) {
            this.longitud = longitud;
            this.generarPassword();
    }
    public void generarPassword() {
        Random rnd = new Random();
        StringBuilder sb = new StringBuilder();
        String caracteres = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

        for (int i = 0; i < longitud; i++) {
            int index = rnd.nextInt(caracteres.length());
            sb.append(caracteres.charAt(index));
        }

        contraseña = sb.toString();
    }
    public boolean esFuerte() {
        int mayusculas = 0;
        int minusculas = 0;
        int numeros = 0;

        for (int i = 0; i < contraseña.length(); i++) {
            char c = contraseña.charAt(i);
            if (Character.isUpperCase(c)) {
                mayusculas++;
            } else if (Character.isLowerCase(c)) {
                minusculas++;
            } else if (Character.isDigit(c)) {
                numeros++;
            }
        }
        return(mayusculas > 2 && minusculas > 1 && numeros > 5);
    }
    public int getLongitud() {
        return longitud;
    }
    public void setLongitud(int longitud) {
        this.longitud = longitud;
        generarPassword();
    }
    public String getContraseña() {
        return contraseña;
    }
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    @Override
    public String toString() {
        return "Password [longitud=" + longitud + ", contraseña=" + contraseña + "]";
    }
}