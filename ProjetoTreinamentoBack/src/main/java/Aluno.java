
public class Aluno {
	
	private long id;
	private String nome;
	private String curso;
	private Integer matricula;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getCurso() {
		return this.curso;
	}
	
	public Integer getMatricula() {
		return this.matricula;
	}
	
	public long getId() {
		return this.id;
	}

}
