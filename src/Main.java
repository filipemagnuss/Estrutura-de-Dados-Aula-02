public class Main {
    public static void main(String[] arg){

        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("João");
        pessoa1.setEmail("João@gmail.com");

        System.out.println("Nome" + pessoa1.getNome());
        System.out.println("Email" + pessoa1.getEmail());
        pessoa1.logar();


        Professor prof1 = new Professor("Albert", "Albert@gmail.com");
        System.out.println("O professor é" + prof1.getNome());

        Turma estuturaDados =
                new Turma("Estrutura de dados", prof1, 30);

        Aluno a1 = new Aluno();
        a1.setNome("Ana");
        Aluno a2 = new Aluno();
        a2.setNome("Patricia");
        estuturaDados.inserirAluno(a1);
        estuturaDados.inserirAluno(a2);
        estuturaDados.listarAlunos();
    }
}