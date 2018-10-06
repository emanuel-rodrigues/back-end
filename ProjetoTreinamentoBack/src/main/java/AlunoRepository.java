import java.util.ArrayList;
import java.util.List;

public class AlunoRepository {
	
	private static List alunos = new ArrayList<>();
	
	
	public void cadastraAluno(Aluno aluno) {
		AlunoRepository.alunos.add(aluno);
	}
	
	public List getAlunos() {
		return AlunoRepository.alunos;
	}
	
	
	

}
