package dim.jolim.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@Entity
@DiscriminatorValue("D")
public class AlunoEAD extends Aluno {
	
	private String unidade;
	
	@ManyToMany
	private List<MaterialEstudo> materiais = new ArrayList<MaterialEstudo>();

	public String getUnidade() {
		return unidade;
	}

	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}

	public List<MaterialEstudo> getMateriais() {
		return materiais;
	}

	public void addMaterial(MaterialEstudo material) {
		if (!this.materiais.contains(material)) {
			this.materiais.add(material);
		}
	}
}
