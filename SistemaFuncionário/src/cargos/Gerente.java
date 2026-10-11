package cargos;

import funcionarios.Funcionario;

public class Gerente<T> extends Funcionario<T> {

	int anoComeco;
	
	@Override
	public double bonus() {
		if (this.anoComeco <= 2020) {
			return super.getSalario()+1000;
		}
		return super.getSalario()*2;
	}
	
	public int getAnoComeco() {
		return anoComeco;
	}
	
	public void setAnoComeco(int anoComeco) {
		this.anoComeco = anoComeco;
	}
	
}