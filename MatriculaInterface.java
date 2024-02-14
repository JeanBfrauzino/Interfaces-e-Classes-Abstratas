
import javax.xml.crypto.Data;

public interface MatriculaInterface{

    String getNomeAluno();
    void setNomeAluno(String nomeAluno);

    int getNumeroMatricula();
    void setNumeroMatricula(int numeroMatricula);

    String getNomeDisciplina();
    void setNomeDisciplina(String nomeDisciplina);

    Data getDataMatricula();
    void setDataMatricula(Data dataMatricula);

}