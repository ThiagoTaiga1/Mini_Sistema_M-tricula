/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacao;

import classe.Aluno;
import classe.Disciplina;
import javax.swing.JOptionPane;

public class Programacao {

    public static void main(String[] args) {
        
// new Aluno() é uma instancia (Criação de Objeto)
//aluno1 é uma referencia para o objeto aluno
        
        
String nome = JOptionPane.showInputDialog("Qual nome do Aluno");
String idade = JOptionPane.showInputDialog("Qual a idade?");
String dataNascimento = JOptionPane.showInputDialog("Data de Nascimento?");
String rg = JOptionPane.showInputDialog("Registro Geral?");
String cpf = JOptionPane.showInputDialog("Qual o Cpf?");
String mae = JOptionPane.showInputDialog("Nome da Mãe?");
String pai = JOptionPane.showInputDialog("Nome do Pai?");
String matricula = JOptionPane.showInputDialog("Data de Matricula");
String serie = JOptionPane.showInputDialog("Qual a série ");
String escola = JOptionPane.showInputDialog("Nome da Escola");







Aluno aluno1 = new Aluno();


aluno1.setNome(nome);
aluno1.setIdade(Integer.valueOf(idade));
aluno1.setDataNasciemento(dataNascimento);
aluno1.setRegistroGeral(rg);
aluno1.setNumeroCpf(cpf);
aluno1.setNomeMae(mae);
aluno1.setNomePai(pai);
aluno1.setDataMatricula(matricula);
aluno1.setSerieMatriculado(serie);
aluno1.setNomeEscola(escola);
   
Disciplina disciplina1 = new Disciplina();
disciplina1.setDisciplina("Banco de dados");
disciplina1.setNota1(90);

aluno1.getDisciplinas().add(disciplina1);

Disciplina disciplina2 = new Disciplina();
disciplina1.setDisciplina("Java");
disciplina1.setNota1(80);

Disciplina disciplina3 = new Disciplina();
disciplina1.setDisciplina("Javasript");
disciplina1.setNota1(70);

aluno1.getDisciplinas().add(disciplina3);
 

Disciplina disciplina4 = new Disciplina();
disciplina1.setDisciplina("Sistemas");
disciplina1.setNota1(60);



aluno1.getDisciplinas().add(disciplina1);
aluno1.getDisciplinas().add(disciplina2);
aluno1.getDisciplinas().add(disciplina3);
aluno1.getDisciplinas().add(disciplina4);
 

        System.out.println("aluno1"); 
        System.out.println("Média do aluno " + aluno1.getMediaNota());
         System.out.println("Resultado: " + aluno1.getAlunoAprovado2());
        
   }
    
}
