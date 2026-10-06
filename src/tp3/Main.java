package tp3;

public class Main {

    public static void main(String[] args) {

        // Crear estudiantes
        Estudiante juan = new Estudiante(
                "Juan",
                20,
                "Ingeniería en Sistemas"
        );

        Estudiante maria = new Estudiante(
                "María",
                22,
                "Diseño Gráfico"
        );

        Estudiante pedro = new Estudiante(
                "Pedro",
                21,
                "Medicina"
        );

        Estudiante lucia = new Estudiante(
                "Lucía",
                23,
                "Ingeniería en Sistemas"
        );

        Estudiante martin = new Estudiante(
                "Martín",
                24,
                "Programación"
        );

        // Crear cursos
        Curso estructurasDeDatos = new Curso(
                "Estructuras de Datos"
        );

        Curso programacionJava = new Curso(
                "Programación Java"
        );

        // Agregar estudiantes a los cursos
        estructurasDeDatos.agregarEstudiante(juan);
        estructurasDeDatos.agregarEstudiante(maria);
        estructurasDeDatos.agregarEstudiante(pedro);

        programacionJava.agregarEstudiante(lucia);
        programacionJava.agregarEstudiante(martin);
        programacionJava.agregarEstudiante(juan);

        // Mostrar los cursos
        System.out.println(estructurasDeDatos);

        System.out.println("----------------------------------------");

        System.out.println(programacionJava);
    }
}