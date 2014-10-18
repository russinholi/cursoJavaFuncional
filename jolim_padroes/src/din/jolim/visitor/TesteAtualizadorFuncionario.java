package din.jolim.visitor;

import java.util.ArrayList;
import java.util.List;

public class TesteAtualizadorFuncionario {

	public static void main(String[] args) {
		List<Departamento> departamentos = 
				new ArrayList<Departamento>();
		
		Departamento vendas = new Departamento("Vendas");
		vendas.getFuncionarios().add(
				new Gerente("Gerente Vendas", 10000.00, "1234"));
		vendas.getFuncionarios().add(
				new Telefonista("Telefonista Vendas", 2000.00,"2"));
		departamentos.add(vendas);
		
		Departamento sac = new Departamento("SAC");
		sac.getFuncionarios().add(
				new Gerente("Gerente SAC", 7000.00, "431"));
		sac.getFuncionarios().add(
				new Telefonista("Telefon. SAC", 3000.00,"3"));
		departamentos.add(sac);		
		
		AtualizadorFuncionario atualizador = new AtualizadorSalarial();
		
		for (Departamento depto : departamentos) {
			depto.aceitar(atualizador);
		}

		for (Departamento depto : departamentos) {
			for (Funcionario funcionario :  depto.getFuncionarios()) {
				System.out.println("Nome: "+funcionario.getNome()+
						" Salário: "+funcionario.getSalario());
			}
		}
		
	}

}
