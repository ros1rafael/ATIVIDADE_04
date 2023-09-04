package uniderp.loo.escola.dominio;

import java.time.LocalDate;

public class Passageiro extends BaseRegistro {
    private String numeroCartao;
    private String documento;
    private LocalDate dataNascimento;
    public String getNumeroCartao() {
        return numeroCartao;
    }
    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }
    public String getDocumento() {
        return documento;
    }
    public void setDocumento(String documento) {
        this.documento = documento;
    }
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public Passageiro(int codigo, String nome, String telefone, String email, String usuario, String registro,
            String numeroCartao, String documento, LocalDate dataNascimento) {
        super(codigo, nome, telefone, email, usuario, registro);
        this.numeroCartao = numeroCartao;
        this.documento = documento;
        this.dataNascimento = dataNascimento;
    }
}
