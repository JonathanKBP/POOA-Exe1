package aula_polimorfismo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Teste {
	public static void  main(String [] args) {
		List <Empregado> empregados = new ArrayList <> ();
		Random gerador = new Random ();
		
		//Trecho 1 - Listagem 3
		for(int i=0; i<10; i++) {
			int tipo = 1 + gerador.nextInt(4);
			if(tipo == 1) {
				empregados.add(new EmpregadoTipo1 (tipo));
				double salario = 1500 + gerador.nextDouble() * 3500;
				empregados.get(i).setSalario(salario);
				empregados.get(i).setValorAReceber();
			}
			else if(tipo == 2) {
				empregados.add(new EmpregadoTipo2 (tipo));
				double salario = 1200 + gerador.nextDouble() * 1000;
				double percentualComissao = gerador.nextDouble();
				empregados.get(i).setSalario(salario);
				empregados.get(i).setPercentualComissao(percentualComissao);
				empregados.get(i).setValorAReceber();
			}
			else if(tipo == 3) {
				empregados.add(new EmpregadoTipo3 (tipo));
				double salario = 1100 + gerador.nextDouble() * 700;
				double percentualComissao = 0.2 +gerador.nextDouble() * 0.5;
				double bonus = 100;
				empregados.get(i).setSalario(salario);
				empregados.get(i).setPercentualComissao(percentualComissao);
				empregados.get(i).setBonus(bonus);
				empregados.get(i).setValorAReceber();
			}
			else {
				empregados.add(new EmpregadoTipo4 (tipo));
				double bonus = 2000 + gerador.nextDouble() * 2500;
				empregados.get(i).setBonus(bonus);
				empregados.get(i).setValorAReceber();
			}
		}
		
		//Trecho 2 - Listagem 4
		for (Empregado e: empregados) {
			System.out.println("Tipo do empregado: " + e.getTipo());
			System.out.println(String.format("Valor a receber: %.2f", e.getValorAReceber()));
		}
	}
}
