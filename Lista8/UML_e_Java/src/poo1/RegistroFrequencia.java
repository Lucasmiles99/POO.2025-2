package poo1;

import java.time.LocalDate;

public class RegistroFrequencia {
    private LocalDate data;
    private boolean presente;
    private Professor professor;

    public RegistroFrequencia(LocalDate data, boolean presente, Professor professor) {
        this.data = data;
        this.presente = presente;
        this.professor = professor;
    }

    @Override
    public String toString() {
        return data + " - " + (presente ? "Presente" : "Faltou") + " (Registrado por " + professor.getNome() + ")";
    }
}