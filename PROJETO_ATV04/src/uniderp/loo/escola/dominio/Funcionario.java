package uniderp.loo.escola.dominio;
public class Funcionario extends BaseRegistro {
    private String contaCorrente;
    private String cracha;
    private String senha;
    public String getContaCorrente() {
        return contaCorrente;
    }
    public void setContaCorrente(String contaCorrente) {
        this.contaCorrente = contaCorrente;
    }
    public String getCracha() {
        return cracha;
    }
    public void setCracha(String cracha) {
        this.cracha = cracha;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public Funcionario(int codigo, String nome, String telefone, String email, String usuario, String registro,
            String contaCorrente, String cracha, String senha) {
        super(codigo, nome, telefone, email, usuario, registro);
        this.contaCorrente = contaCorrente;
        this.cracha = cracha;
        this.senha = senha;
    }
}