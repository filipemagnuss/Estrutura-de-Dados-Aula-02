public class Pessoa {
    private String Nome;
    private String Email;

    public String getNome(){
        return Nome;
    }

    public void setNome(String nome){
        this.Nome = nome;
    }
    public void setEmail(String email) {
       this.Email = email;
    }

    public String getEmail() {
        return Email;
    }


    public void logar(){
        System.out.println("Usuário logado");
    }
}