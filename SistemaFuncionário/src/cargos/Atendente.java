package cargos;

import funcionarios.Funcionario;

public class Atendente<T> extends Funcionario<T>{
	
	int diasFerias;
	
	@Override
	public double bonus() {
		this.diasFerias = 30;
		return (super.getSalario()*2);
	}
	
	public int getDiasFerias() {
		return diasFerias;
	}
	
	public void setDiasFerias(int diasFerias) {
		this.diasFerias = diasFerias;
	}
	
}