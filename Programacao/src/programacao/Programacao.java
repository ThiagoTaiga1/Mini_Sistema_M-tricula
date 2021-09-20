/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacao;

import classe.Aluno;
import classe.Disciplina;
import constantes.StatusAluno;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.JOptionPane;

public class Programacao {

    public static void main(String[] args) {

        
            String login = JOptionPane.showInputDialog("Informe o login");
             String senha = JOptionPane.showInputDialog("Informe o senha");
             
             if(login.equalsIgnoreCase("admin") &&
                     senha.equalsIgnoreCase("admin")){
// new Aluno() é uma instancia (Criação de Objeto)
//aluno1 é uma referencia para o objeto aluno
        List<Aluno> alunos = new ArrayList<Aluno>();
//        List<Aluno> alunosAprovados = new  ArrayList<Aluno>();
//        List<Aluno> alunosRecuperacao = new  ArrayList<Aluno>();
//        List<Aluno> alunosReprovados = new  ArrayList<Aluno>();

//        lista dentro dela tem uma key que indentifica uma sequencia de valores
        HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

        for (int qtd = 1; qtd <= 5; qtd++) {

            String nome = JOptionPane.showInputDialog("Qual nome do Aluno " + qtd + "");
//String idade = JOptionPane.showInputDialog("Qual a idade?");
//String dataNascimento = JOptionPane.showInputDialog("Data de Nascimento?");
//String rg = JOptionPane.showInputDialog("Registro Geral?");
//String cpf = JOptionPane.showInputDialog("Qual o Cpf?");
//String mae = JOptionPane.showInputDialog("Nome da Mãe?");
//String pai = JOptionPane.showInputDialog("Nome do Pai?");
//String matricula = JOptionPane.showInputDialog("Data de Matricula");
//String serie = JOptionPane.showInputDialog("Qual a série ");
//String escola = JOptionPane.showInputDialog("Nome da Escola");

            Aluno aluno1 = new Aluno();

            aluno1.setNome(nome);
//aluno1.setIdade(Integer.valueOf(idade));
//aluno1.setDataNasciemento(dataNascimento);
//aluno1.setRegistroGeral(rg);
//aluno1.setNumeroCpf(cpf);
//aluno1.setNomeMae(mae);
//aluno1.setNomePai(pai);
//aluno1.setDataMatricula(matricula);
//aluno1.setSerieMatriculado(serie);
//aluno1.setNomeEscola(escola);

//metodo de remover alunos 
            for (int pos = 1; pos <= 1; pos++) {
                String nomeDisciplina = JOptionPane.showInputDialog("Nome da Disciplina? " + pos + " ");
                String NotaDisciplina = JOptionPane.showInputDialog("Nota da Disciplina? " + pos + "");

                Disciplina disciplina = new Disciplina();
                disciplina.setDisciplina(nomeDisciplina);
                disciplina.setNota1(Double.valueOf(NotaDisciplina));

                aluno1.getDisciplinas().add(disciplina);

            }
            int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina ?");
            int continuarRemover = 0;
            int posicao = 1;
            if (escolha == 0) {/*opção sim e zero*/


                while (continuarRemover == 0) {
                    String disciplinaRemover = JOptionPane.showInputDialog(null, "Qual a Disciplina 1 , 2 ,3 ,4 ? ");
                    aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
                    posicao++;
                    continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover?");
                }
            }
            alunos.add(aluno1);
        }
        maps.put(StatusAluno.APROVADO, new ArrayList<>());
        maps.put(StatusAluno.REPROVADO, new ArrayList<>());
        maps.put(StatusAluno.RECUPERACAO, new ArrayList<>());

        for (Aluno aluno : alunos)/*Separei em listas*/ {
            if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
                maps.get(StatusAluno.APROVADO).add(aluno);
            } else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
                maps.get(StatusAluno.RECUPERACAO).add(aluno);

            } else {
                maps.get(StatusAluno.REPROVADO).add(aluno);/*Reprovados*/
            }
        }
        System.out.println("---------------Lista dos Aprovados-------");
        for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
            System.out.println("Resultado = " + aluno.getAlunoAprovado2() + " com média de = " + aluno.getMediaNota());

        }
        System.out.println("---------------Lista dos Recuperação-------");
        for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
            System.out.println("Resultado = " + aluno.getAlunoAprovado2() + " com média de = " + aluno.getMediaNota());
        }
        System.out.println("---------------Lista dos Reprovados-------");
        for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
            System.out.println("Resultado = " + aluno.getAlunoAprovado2() + " com média de = " + aluno.getMediaNota());
        }
    }
}
}

        
        
        
        
        
////        metodo lista posições 
//        for (int pos = 0; pos < alunos.size();pos ++){
//            Aluno aluno = alunos.get(pos);
//            
//            if(aluno.getNome().equalsIgnoreCase("Thiago")){
//                Aluno trocar = new Aluno();
//                trocar.setNome("Aluno foi trocado");
//                
//                Disciplina disciplina = new Disciplina();
//                disciplina.setDisciplina("Matematica");
//                disciplina.setNota1(96);
//                
//                trocar.getDisciplinas().add(disciplina);
//                alunos.set(pos, trocar);
//                aluno = alunos.get(pos);
//            }
//            System.out.println("Aluno = " + aluno.getNome());
//            System.out.println("Média do aluno = " + aluno.getMediaNota());
//            System.out.println("Resultado = " + aluno.getAlunoAprovado2());
//            System.out.println("---------------------------------------" );
//            
//        for (Disciplina disc : aluno.getDisciplinas()){
//            System.out.println("materia = " + disc.getClass() + "Nota = " + disc.getNota1());
//        }
            
        
        
//        lista com remoção de alunos e alunos que sobraram !! 
//    for(Aluno aluno : alunos){ 
//        
//        if(aluno.getNome().equalsIgnoreCase("Thiago")){
//            alunos.remove(aluno);
//            break;
//        
//   }else{
//        System.out.println("aluno"); /*descrição do objeto na memoria*/
//        System.out.println("Média do aluno " + aluno.getMediaNota());
//        System.out.println("Resultado: " + aluno.getAlunoAprovado2());
//        System.out.println("----------------------------------------");
//        }
//    
//    }
//        for (Aluno aluno : alunos) {
//            System.out.println("Aluno que sobraram na lista");
//            System.out.println(aluno.getNome());
//            System.out.println("Sua Mterias são");
//            
//            for (Disciplina disciplina : aluno.getDisciplinas()) {
//                System.out.println(disciplina.getDisciplina());
//            }
        
