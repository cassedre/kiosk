package com.henriquedemetrio.cursomc.domain;

import javax.persistence.Entity;

import com.henriquedemetrio.cursomc.domain.enums.EstadoPagamento;

@Entity
public class PagamentoCartao extends Pagamento{
	private static final long serialVersionUID = 1L;
	
	private Integer numeroDeParcelas ;


public PagamentoCartao() {
	
	
	
}

public PagamentoCartao(Integer id, EstadoPagamento estado, Pedido pedido, Integer numeroDeParcelas) { //source>generateconstructor from superclass
	super (id,estado, pedido);
	
	this.numeroDeParcelas = numeroDeParcelas;
	
	
}

public Integer getNumeroDeParcelas() {
	return numeroDeParcelas;
}

public void setNumeroDeParcelas(Integer numeroDeParcelas) {
	this.numeroDeParcelas = numeroDeParcelas;
}

}
