package com.br.domain.entity;
import java.math.BigDecimal;

public class Estoque{
    private BigDecimal quantidade;
    private EString localTanque;
    private String localEndereço;
    private String loteFabricacao;
    private String dataValidade;
public Estoque (BigDecimal quantidade, String local endereço, String loteFabricacao, String dataValidade) {

this.quantidade =quantidade;
this.localTanque =localTanque;
this.localEndereco =localEndereço;
this.loteFabricacao =loteFabricacao;
this.dataValidade =dataValidade;

}
//lembrar modificadores de acesso (private public etc.)
    //um get, um set, um get, um set...
}
        this.quantidade =quantidade;
this.localTanque =localTanque;
this.localEndereco =localEndereço;
this.loteFabricacao =loteFabricacao;
this.dataValidade =dataValidade;
