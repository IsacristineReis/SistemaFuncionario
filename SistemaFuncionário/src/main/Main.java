package main;

import cargos.Atendente;
import cargos.Caixa;
import cargos.Gerente;
import funcionarios.Funcionario;

public class Main {

	public static void main(String[] args) {
		
		// Atendente Graziela
		Atendente<String> a1 = new Atendente<String>();
		a1.setNome("Graziela");
		a1.setId(061);
		a1.setSalario(1000.250);
		imprimirFuncionario(a1);
		
		// Atendente Vitória
		Atendente<String> a2 = new Atendente<String>();
		a2.setNome("Vitória");
		a2.setId(042);
		a2.setSalario(1050.50);
		imprimirFuncionario(a2);	
		
		// Gerente Principal
		Gerente<String> g1 = new Gerente<String>();
		g1.setId(01);
		g1.setNome("Isabelle");
		g1.setSalario(2510.100);
		g1.setAnoComeco(2019);
		imprimirFuncionario(g1);
		
		// Gerente secundário
		Gerente<String> g2 = new Gerente<String>();
		g2.setId(02);
		g2.setNome("Maria Betania");
		g2.setSalario(1510);
		g2.setAnoComeco(2026);
		imprimirFuncionario(g2);
		
		// Caixa
		Caixa<String> c1 = new Caixa<String>();
		c1.setId(015);
		c1.setNome("Jones");
		c1.setSalario(1230);
		c1.setDiasTrabalhado(2);
		imprimirFuncionario(c1);
		
		// Caixa
		Caixa<String> c2 = new Caixa<String>();
		c2.setId(89);
		c2.setNome("Bruno");
		c2.setSalario(1230);
		c2.setDiasTrabalhado(10);
		imprimirFuncionario(c2);
		
		
	}
	// Imprimir funcionarios
	private static <T> void imprimirFuncionario(Funcionario<T> aux) {
		System.out.println("Id: " + aux.getId() + 
				" Funcionário " + aux.getNome() + 
				" Sálario: " + aux.getSalario() + 
				" Bonificação: " + aux.bonus());
	}

}
