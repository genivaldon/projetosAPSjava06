package br.ufpb.dcx.aps.atividades.atv06;

import java.util.LinkedList;
import java.util.List;

public class Resultado {

    private boolean erro;
    private List<String> msg = new LinkedList<String>();

    public Resultado() {
        this.erro = false;
    }

    public Resultado(boolean erro) {
        this.erro = erro;

    }

    public Resultado(boolean erro, String msg) {
        this.erro = erro;
        this.msg.add(msg);

    }

    public boolean getErro() {
        return this.erro;
    }

    public void setErro(boolean erro) {
        this.erro = erro;

    }

    public boolean isErro() {
        if (!this.erro == true) {
            return false;
        } else {
            return true;
        }
    }

    public void addMensagem(String msg) {
        this.msg.add(msg);
    }

    public List<String> getMensagens() {
        return this.msg;
    }
    
}
