package com.br.domain.entity;
import java.util.Date;

public class Custo{
    private Double imposto;
    private Double custoVariavel;
private Double custoFixo;
private Double margemLucro;
private Date dataProcessamento;

public Custo(Double imposto, Double custoVariavel, Double custoFixo, Double margemLucro Date dataProcessamento){
    this.imposto = imposto;
    this.custoVariavel = custoVariavel;
    this.custoFixo = custoFixo;
    this.margemLucro = margemLucro;
    this.dataProcessamento = dataProcessamento;

}
public Double getImposto(){
    return imposto;
    //puxa um get e volta o private

}
public void setImposto (Double imposto){
this.imposto = imposto;
}
public Double getCustoVariavel(){
    return custoVariavel
}

    public void setCustoVariavel(Double custoVariavel) {
        this.custoVariavel = custoVariavel;
    }

    public Double getCustoFixo() {
        return custoFixo;
    }

    public void setCustoFixo(Double custoFixo) {
        this.custoFixo = custoFixo;
    }

    public Double getMargemLucro() {
        return margemLucro;
    }

    public void setMargemLucro(Double margemLucro) {
        this.margemLucro = margemLucro;
    }

    public Date getDataProcessamento() {
        return dataProcessamento;
    }

    public void setDataProcessamento(Date dataProcessamento) {
        this.dataProcessamento = dataProcessamento;
    }
}
}
}
