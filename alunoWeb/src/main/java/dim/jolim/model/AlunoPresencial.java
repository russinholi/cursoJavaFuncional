package dim.jolim.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@Entity
@DiscriminatorValue("P")
public class AlunoPresencial extends Aluno {

	@ManyToMany
	private List<Aula> presencas = new ArrayList<Aula>();

	public List<Aula> getPresencas() {
		return presencas;
	}

	public void addPresenca(Aula aula) {
		if (!presencas.contains(aula)) {
			presencas.add(aula);
		}
	}
}
