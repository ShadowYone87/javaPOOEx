import java.util.Random;

class Password {
    // Atributos
    // * Longitud de la contraseña
    private int longitud = 8;
    // * caracteres de la contraseña
    private String contraseña;

    // Constructores
    /**
     * Crea una contraseña al azar
     */
    public Password() {
        this.longitud = 8;
        this.generarPassword();
    }

    /**
     * La contraseña sera la pasada por parametro
     * 
     * @param longitud
     */
    public Password(int longitud) {
        this.longitud = longitud;
        this.generarPassword();
    }

    // Metodos publicos
    /**
     * Genera una contraseña al azar con la longitud que este definida
     * 
     * @return contraseña
     */
    public void generarPassword() {
        Random rnd = new Random();
        StringBuilder sb = new StringBuilder();
        String caracteres = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

        for (int i = 0; i < longitud; i++) {
            // Generamos un numero aleatorio, segun este elige si añadir una minuscula,
            // mayuscula o numero
            int index = rnd.nextInt(caracteres.length());
            sb.append(caracteres.charAt(index));
        }

        contraseña = sb.toString();
    }

    /**
     * Comprueba la fortaleza de la contraseña
     * 
     * @return
     */
    public boolean esFuerte() {
        int mayusculas = 0;
        int minusculas = 0;
        int numeros = 0;
        // Vamos caracter a caracter y comprobamos que tipo de caracter es
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
        // Si la constraseña tiene mas de 5 numeros, mas de 1 minuscula y mas de 2
        // mayusculas
        return (mayusculas > 2 && minusculas > 1 && numeros > 5);
    }

    /**
     * Devuelve la longitud
     * 
     * @return longitud de la contraseña
     */
    public int getLongitud() {
        return longitud;
    }

    /**
     * Modifica la longitud de la contraseña
     * 
     * @param longitud a cambiar
     */
    public void setLongitud(int longitud) {
        this.longitud = longitud;
        generarPassword();
    }

    /**
     * Devuelve la contraseña
     * 
     * @return contraseña
     */
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