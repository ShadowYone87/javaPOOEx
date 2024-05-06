class Estudiante {
    private String name;
    private int age;
    private float score;

    public Estudiante(String name, int age, float score) {
        this.name = name;
    if (age < 0) {
        System.out.println("Edad inválida. Se asignará 0.");
        this.age = 0;
    } else {
        this.age = age;
    }
    if (score < 0) {
        System.out.println("Calificación inválida. Se asignará 0.");
        this.score = 0;
    } else {
        this.score = score;
    }
}
    public void imprimirDetalles() {
        System.out.println("Nombre: " + name);
        System.out.println("Edad: " + age);
        System.out.println("Calificación: " + score);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public double getScore() {
        return score;
    }
    public void setScore(float score) {
        this.score = score;
    }
    @Override
    public String toString() {
        return "Estudiante [name=" + name + ", age=" + age + ", score=" + score + "]";
    }
}