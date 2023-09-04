package uniderp.loo.escola.dominio;
public class Baseidentificador {
    protected int codigo;

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public Baseidentificador(int codigo) {
        this.codigo = codigo;
    }
}
