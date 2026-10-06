package tp3;

import java.util.ArrayList;
import java.util.List;

public class Curso {

    private String nombre;
    private List<Estudiante> listaDeEstudiantes;

    public Curso(String nombre) {
        this.nombre = nombre;
        this.listaDeEstudiantes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Estudiante> getListaDeEstudiantes() {
        return listaDeEstudiantes;
    }

    public void agregarEstudiante(Estudiante estudiante) {
        listaDeEstudiantes.add(estudiante);
    }

    @Override
    public String toString() {

        StringBuilder resultado = new StringBuilder();

        resultado.append("Curso: ")
                .append(nombre)
                .append("\n");

        resultado.append("Cantidad de alumnos: ")
                .append(listaDeEstudiantes.size())
                .append("\n");

        resultado.append("Estudiantes:\n");

        for (int i = 0; i < listaDeEstudiantes.size(); i++) {
            resultado.append("  ")
                    .append(i + 1)
                    .append(". ")
                    .append(listaDeEstudiantes.get(i))
                    .append("\n");
        }

        return resultado.toString();
    }
}