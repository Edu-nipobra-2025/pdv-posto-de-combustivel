package com.br.domain.entity;

public class Preco{

    private BigDecimal valor;
    private Date dataAlteracao;
    private Date horaAlteracao;

    public Preco(BigDecimal valor, Date dataAlteracao, Date horaAlteracao){

}
public BigDecimal getValor(){
    return valor;
}
public void setValor(Bigdecimal valor){
this.valor = valor;
}
public Date getDataAlteracao(){
    return getDataAlteracao;

}
public void setDataAlteracao(){
    this.dataAlteracao = dataAlteracao;
}

public Date getHoraAlteracao(){
    return horaAlteracao;
}
public void setHoraAlteracao(){
    this.horaAlteracao = horaAlteracao;
}
