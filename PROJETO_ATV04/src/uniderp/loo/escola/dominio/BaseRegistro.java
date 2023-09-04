package uniderp.loo.escola.dominio;

public class BaseRegistro extends BasePessoa{
    protected String usuario;
    protected String registro;
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getRegistro() {
        return registro;
    }
    public void setRegistro(String registro) {
        this.registro = registro;
    }
    public BaseRegistro(int codigo, String nome, String telefone, String email, String usuario, String registro) {
        super(codigo, nome, telefone, email);
        this.usuario = usuario;
        this.registro = registro;
    }
}
