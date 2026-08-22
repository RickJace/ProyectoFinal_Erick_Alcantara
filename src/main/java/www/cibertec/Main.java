package www.cibertec;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        //  Variables fijas (String, int, double, boolean)
        String alumno = "Erick Alcantara";
        double nota1 = 18.0;
        double nota2 = 16.5;
        double nota3 = 14.0;
        int faltas = 3;
        boolean aprobo;

        //   Método Calcular Promedio
        double promedio = calcularPromedio(nota1, nota2, nota3);

        //  Estructura condicional y multiple

        int condicionFinal;

        if (promedio >= 13 && faltas <= 4) {
            condicionFinal = 1; // Aprobado
            aprobo = true;
        } else if (promedio >= 10 && promedio < 13) {
            condicionFinal = 2; // Recuperación
            aprobo = false;
        } else {
            condicionFinal = 3; // Desaprobado
            aprobo = false;
        }

        // Imprimir resultados usando Switch Case
        System.out.println("\n=== RESULTADO FINAL ===");
        System.out.println("Alumno: " + alumno);
        System.out.println("Promedio: " + promedio);

        switch (condicionFinal) {
            case 1:
                System.out.println("Estado: ¡APROBADO FELICITACIONES!");
                break;
            case 2:
                System.out.println("Estado: PASA A EXAMEN DE RECUPERACIÓN");
                break;
            case 3:
                System.out.println("Estado: DESAPROBADO");
                break;
        }

        //  (while) - Un conteo simple de advertencia
        System.out.print("Alertas registradas: ");
        int i = 1;
        while (i <= faltas) {
            System.out.print("[Falta " + i + "] ");
            i++;
        }
        System.out.println();
    }

    //  Método - Operación básica con retorno
    public static double calcularPromedio(double n1, double n2, double n3) {
        return (n1 + n2 + n3) / 3.0;
    }
}
