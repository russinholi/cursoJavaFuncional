package dim.jolim.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Materia {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private String nome;
	
	@Column(name = "CARGA_HORARIA")
	private Integer cargaHoraria;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "materia")
	private List<Avaliacao> avaliacoes = new ArrayList<Avaliacao>();

	public Integer getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(Integer cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public List<Avaliacao> getAvaliacoes() {
		return avaliacoes;
	}

	public void addAvaliacao(Avaliacao avaliacao) {
		if (!avaliacoes.contains(avaliacao)) {
			avaliacao.setMateria(this);
			this.avaliacoes.add(avaliacao);
		}
	}
}
