package cargos;

import funcionarios.Funcionario;

public class Caixa<T> extends Funcionario<T>{
	
	int diasTrabalhado;
	
	@Override
	public double bonus() {
		if (this.diasTrabalhado <6) {
			return super.getSalario()*1.05;
		}
		return super.getSalario()*1.2;
	}
	
	public int getDiasTrabalhado() {
		return diasTrabalhado;
	}
	
	public void setDiasTrabalhado(int diasTrabalhado) {
		this.diasTrabalhado = diasTrabalhado;
	}
	
}
