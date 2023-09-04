package uniderp.loo.escola.dominio;
public class BasePessoa extends Baseidentificador {
    protected String nome;
    protected String telefone;
    protected String email;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public BasePessoa(int codigo, String nome, String telefone, String email) {
        super(codigo);
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }
}
