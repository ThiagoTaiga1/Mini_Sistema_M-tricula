/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classe;

import java.util.Objects;

/**
 *
 * @author thiag
 */
public class Disciplina {
 private String disciplina;
private double nota1;

//essa classe servira para todos os obj e istancias
    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.disciplina);
        hash = 11 * hash + (int) (Double.doubleToLongBits(this.nota1) ^ (Double.doubleToLongBits(this.nota1) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Disciplina other = (Disciplina) obj;
        if (Double.doubleToLongBits(this.nota1) != Double.doubleToLongBits(other.nota1)) {
            return false;
        }
        if (!Objects.equals(this.disciplina, other.disciplina)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Disciplina{" + "disciplina=" + disciplina + ", nota1=" + nota1 + '}';
    }



}
