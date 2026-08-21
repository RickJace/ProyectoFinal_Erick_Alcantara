package www.cibertec;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    // 1. Metodo
    public static double calcularPromedio(double n1, double n2) {
        return (n1 + n2) / 2.0;
    }

    public static void main(String[] args) {
        // 2. Variables Fijas
        String alumno = "Erick Alcantara";
        double promedioFinal = calcularPromedio(16.0, 11.0);

        System.out.println("El promedio final de " + alumno + " es: " + promedioFinal);
    }
}