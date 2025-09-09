package com.br.domain.entity;
import java.math.BigDecimal;
import java.util.Date;

public class Estoque{
    private BigDecimal quantidade;
    private String localTanque;
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

    public BigDecimal getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(){
    this.quantidade = quantidade;
    }
    public String getLocalTanque{
    return localTanque;
    }
    public void setLocalTanque{
    this.localTanque = localTanque;
    }
    public String getLocalEndereço{
  return localEndereço;
    }
    public void setLocalEndereço{
    this.localEndereço = localEndereço;
    }
    public String getLoteFabricacao{
    return loteFabricacao;
    }
    public void setLoteFabricacao{
    this.loteFabricacao = loteFabricacao;
    }
    public String getDataValidade{
    return dataValidade;
    }
    public void setDataValidade{
    this.dataValidade = dataValidade;
    }
//lembrar modificadores de acesso (private public etc.)
    //um get, um set, um get, um set...
}