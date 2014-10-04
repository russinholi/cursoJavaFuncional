package dim.jolim.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Avaliacao {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Enumerated(EnumType.STRING)
	private TipoAvaliacao tipo;
	
	private Integer bimestre;
	
	private Integer peso;

	@ManyToOne
	private Materia materia;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "avaliacao")
	private List<Nota> notas = new ArrayList<Nota>();
	
	public Integer getId() {
		return id;
	}

	public TipoAvaliacao getTipo() {
		return tipo;
	}

	public void setTipo(TipoAvaliacao tipo) {
		this.tipo = tipo;
	}

	public Integer getBimestre() {
		return bimestre;
	}

	public void setBimestre(Integer bimestre) {
		this.bimestre = bimestre;
	}

	public Integer getPeso() {
		return peso;
	}

	public void setPeso(Integer peso) {
		this.peso = peso;
	}

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

	public List<Nota> getNotas() {
		return notas;
	}

	public void addNota(Nota nota) {
		if (!notas.contains(nota)) {
			nota.setAvaliacao(this);
			notas.add(nota);
		}
	}

}
