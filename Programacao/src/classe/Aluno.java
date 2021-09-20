/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classe;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

    private String nome;
    private int idade;
    private String dataNasciemento;
    private String numeroCpf;
    private String RegistroGeral;
    private String nomeMae;
    private String nomePai;
    private String dataMatricula;
    private String nomeEscola;
    private String serieMatriculado;
    
    private List<Disciplina> disciplinas = new ArrayList<Disciplina>();

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", idade=" + idade + ", dataNasciemento=" + dataNasciemento + ", numeroCpf=" + numeroCpf + ", RegistroGeral=" + RegistroGeral + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai + ", dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola + ", serieMatriculado=" + serieMatriculado + ", disciplinas=" + disciplinas + '}';
    }



    public Aluno() {/* cria os dados na memoria */

    }
    

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    
    public Aluno(String nomePadrao) {
        nome = nomePadrao;
    }

    public Aluno(String nomePadrao, int idadePadrao) {
        nome = nomePadrao;
        idade = idadePadrao;
    }

    /*Veremos o metodos SETTERS e GETTERS do objetos*/
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getDataNasciemento() {
        return dataNasciemento;
    }

    public void setDataNasciemento(String dataNasciemento) {
        this.dataNasciemento = dataNasciemento;
    }

    public String getNumeroCpf() {
        return numeroCpf;
    }

    public void setNumeroCpf(String numeroCpf) {
        this.numeroCpf = numeroCpf;
    }

   

  
    /**
     * @return the RegistroGeral
     */
    public String getRegistroGeral() {
        return RegistroGeral;
    }

    /**
     * @param RegistroGeral the RegistroGeral to set
     */
    public void setRegistroGeral(String RegistroGeral) {
        this.RegistroGeral = RegistroGeral;
    }

    /**
     * @return the nomeMae
     */
    public String getNomeMae() {
        return nomeMae;
    }

    /**
     * @param nomeMae the nomeMae to set
     */
    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    /**
     * @return the nomePai
     */
    public String getNomePai() {
        return nomePai;
    }

    /**
     * @param nomePai the nomePai to set
     */
    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    /**
     * @return the dataMatricula
     */
    public String getDataMatricula() {
        return dataMatricula;
    }

    /**
     * @param dataMatricula the dataMatricula to set
     */
    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    /**
     * @return the nomeEscola
     */
    public String getNomeEscola() {
        return nomeEscola;
    }

    /**
     * @param nomeEscola the nomeEscola to set
     */
    public void setNomeEscola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
    }

    /**
     * @return the serieMatriculado
     */
    public String getSerieMatriculado() {
        return serieMatriculado;
    }

    /**
     * @param serieMatriculado the serieMatriculado to set
     */
    public void setSerieMatriculado(String serieMatriculado) {
        this.serieMatriculado = serieMatriculado;
    }
    
    
//    media do aluno
 public double getMediaNota(){
       double somaNotas  = 0.0;
         
     for (Disciplina disciplina : disciplinas) {
         somaNotas += disciplina.getNota1();
         
     }
             return somaNotas / disciplinas.size();
     }
 
// aprovação do aluno 
    public boolean getAlunoAprovado2(){
        double media = this.getMediaNota();
                if(media >= 70){
                    return true;
                }else {
                    return false;
                }
    }
}
