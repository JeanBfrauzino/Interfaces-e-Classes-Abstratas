package InterfacesEabstratas;

import javax.xml.crypto.Data;

public abstract class MatriculaABS {

    protected String nomeAluno;
    protected int numeroMatricula;
    protected String nomeDisciplina;
    protected Data dataMatricula;

    public abstract String getNomeAluno();
    public abstract void setNomeAluno(String nomeAluno);

    public abstract int getNumeroMatricula();
    public abstract void setNumeroMatricula(int numeroMatricula);

    public abstract String getNomeDisciplina();
    public abstract void setNomeDisciplina(String nomeDisciplina);

    public abstract Data getDataMatricula();
    public abstract void setDataMatricula(Data dataMatricula);

}