package InterfacesEabstratas;

import javax.xml.crypto.Data;

public class Principal {

    public static void main(String[] args) {

        MatriculaInterface matricula = new ImplementacaoMatricula("zé", 12345655, "Programação Java", new Data(14, 02, 2024));

        System.out.println("Nome do Aluno: " + matricula.getNomeAluno());
        System.out.println("Número da Matrícula: " + matricula.getNumeroMatricula());
        System.out.println("Nome da Disciplina: " + matricula.getNomeDisciplina());
        System.out.println("Data da Matrícula: " + matricula.getDataMatricula());

    }

}