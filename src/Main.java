class Vector {
    private double x; //  x
    private double y; //  y

    // Конструктор без ініціалізації
    public Vector() {
        this.x = 0.0;
        this.y = 0.0;
    }

    // Конструктор з початковою ініціалізацією
    public Vector(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Операція присвоювання
    public void assign(Vector other) {
        this.x = other.x;
        this.y = other.y;
    }

    // Операція додавання
    public Vector add(Vector other) {
        double newX = this.x + other.x;
        double newY = this.y + other.y;
        return new Vector(newX, newY);
    }

    // Операція скалярного добутку
    public double skalDobutok(Vector other) {
        return this.x * other.x + this.y * other.y;
    }

    // Операція розпечатки координат
    public void printCoordinates() {
        System.out.println("x = " + this.x + ", y = " + this.y);
    }

    public double getX() {
        return this.x;
    }
    public double getY() {
        return this.y;
    }
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
}

public class Main {
    public static void main(String[] args) {
        Vector vector1 = new Vector(2.0, 3.0);
        Vector vector2 = new Vector(4.0, 5.0);

        Vector sum = vector1.add(vector2);
        double dobutok = vector1.skalDobutok(vector2);

        System.out.println("Вектор 1:");
        vector1.printCoordinates();

        System.out.println("Вектор 2:");
        vector2.printCoordinates();

        System.out.println("Сума векторів:");
        sum.printCoordinates();

        System.out.println("Скалярний добуток: " + dobutok);

        // Приклад використання операції присваювання
        Vector vector3 = new Vector();
        vector3.assign(vector1);

        System.out.println("Вектор 3 (який = Вектор 1):");
        vector3.printCoordinates();
    }
}