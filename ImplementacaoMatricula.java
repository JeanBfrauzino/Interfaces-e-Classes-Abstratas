package InterfacesEabstratas;

import javax.xml.crypto.Data;

public class ImplementacaoMatricula implements MatriculaInterface {

    private String nomeAluno;
    private int numeroMatricula;
    private String nomeDisciplina;
    private Data dataMatricula;

    public ImplementacaoMatricula(String nomeAluno, int numeroMatricula, String nomeDisciplina, Data dataMatricula) {
        this.nomeAluno = nomeAluno;
        this.numeroMatricula = numeroMatricula;
        this.nomeDisciplina = nomeDisciplina;
        this.dataMatricula = dataMatricula;
    }

    @Override
    public String getNomeAluno() {
        return nomeAluno;
    }

    @Override
    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    @Override
    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    @Override
    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    @Override
    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    @Override
    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    @Override
    public Data getDataMatricula() {
        return dataMatricula;
    }

    @Override
    public void setDataMatricula(Data dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

}