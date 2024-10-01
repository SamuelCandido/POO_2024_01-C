 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import Model.Turno;
import java.util.ArrayList;

/**
 *
 * @author samue
 */
public class Turma {
    private String disciplina;
    private Professor professor;
    private Turno turno;
    private ArrayList<Aluno> alunos;
    
    
    public Turma() {
        alunos = new ArrayList<>();
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }
        
    public void incluirAluno(Aluno alunos){
        this.alunos.add(alunos);
   
    }
  
    public void removerAluno(Aluno alunos){
        this.alunos.remove(alunos);
   
    }

    public void obterAlunoMelhorNotaEnem(){
        
    }
}
