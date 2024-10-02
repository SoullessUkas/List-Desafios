package Set.ordenacao;

import java.util.Comparator;

public class Aluno implements Comparable<Aluno> {
private String nome;
private long matricula;
private Double nota;
public Aluno(String nome, long matricula, Double nota) {
    this.nome = nome;
    this.matricula = matricula;
    this.nota = nota;
}
public String getNome() {
    return nome;
}
public long getMatricula() {
    return matricula;
}
public Double getNota() {
    return nota;
}
@Override
public String toString() {
    return "Aluno [nome=" + nome + ", matricula=" + matricula + ", nota=" + nota + "]\n";
}
@Override
public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + (int) (matricula ^ (matricula >>> 32));
    return result;
}
@Override
public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (obj == null)
        return false;
    if (getClass() != obj.getClass())
        return false;
    Aluno other = (Aluno) obj;
    if (matricula != other.matricula)
        return false;
    return true;
}
@Override
public int compareTo(Aluno a) {
    return nome.compareToIgnoreCase(a.getNome());
    
}

}
/**
 * InnerAluno
 */
class ComparaPorNota implements Comparator<Aluno>{

    @Override
    public int compare(Aluno a1, Aluno a2) {
        return Double.compare(a1.getNota(), a2.getNota());
       
    }

    
}
