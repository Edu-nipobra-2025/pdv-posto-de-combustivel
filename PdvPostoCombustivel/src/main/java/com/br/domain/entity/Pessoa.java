import java.util.Date;
package com.br.domain.entity;
//ordem: package, import, nome da classe.
public class Pessoa{
}
    //atributos
    //privados
private String nomeCompleto;
private String cpfCnpj;
private Date dataNascimento;
private Integer numeroCtps;

    //construtor
    //public?
   // public Identidade (String nomeCompleto){
    //this.nomeCompleto puxa private
    //nomecompleto puxa parametro
    public pessoa(String nomeCompleto, String cpfCnpj, Date dataNascimento, Integer numeroCtps){
        this.nomeCompleto = nomeCompleto;
        this.cpfCnpj = cpfCnpj;
        this.dataNascimento = dataNascimento;
        this.numeroCtps = numeroCtps;

    }
public String getNomeCompleto() {
    return nomeCompleto;
}

public void setNomeCompleto(String nomeCompleto) {
    this.nomeCompleto = nomeCompleto;
}

public String getCpfCnpj() {
    return cpfCnpj;
}
public void setCpfCnpj{
        this.cpfCnpj = cpfCnpj;
    }

public Date getDataNascimento() {
    return dataNascimento;
}
public void setDataNascimento
        this.dataNascimento = dataNascimento;
}
public Integer getNumeroCtps{
    this.numeroCtps = numeroCtps;
        }
