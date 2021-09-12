package br.ufpb.dcx.aps.atividades.atv06;

public class Campo {

    private String id;
    private String nome;
    private String valor;
    private boolean obrigatorio;

    public Campo(String id) {
        this.id = id;
        this.nome = "";
        this.valor = "";
        this.obrigatorio = false;

    }

    public Campo(String id, boolean obrigatorio) {
        this.id = id;
        this.valor = "";
        this.obrigatorio = obrigatorio;

    }

    public Campo(String id, boolean obrigatorio, String nome) {
        this.id = id;
        this.nome = nome;
        this.valor = "";
        this.obrigatorio = obrigatorio;

    }

    public Campo(String id, String nome) {
        this.id = id;
        this.nome = nome;
        this.valor = "";
        this.obrigatorio = false;

    }

    public Campo(boolean obrigatorio) {
        this.obrigatorio = obrigatorio;
    }

    public String getId() {
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getValor() {
        return this.valor;
    }

    public void setValor(String valor) {
        this.valor = valor;

    }

    public void setObrigatorio(boolean obrigatorio) {
        this.obrigatorio = obrigatorio;

    }

    public boolean getObrigatorio() {
        return this.obrigatorio;

    }

    public boolean isPreenchido() {
        if (!getValor().equals("")) {
            return true;
        }

        return false;
    }

    public boolean isObrigatorio() {
        return this.obrigatorio;

    }

    public Resultado validar() {
        if (this.obrigatorio == true && this.valor == "") {
            return new Resultado(true, "Este campo é obrigatório e não foi preenchido");
        } else {
            return new Resultado(false);
        }

    }
}
