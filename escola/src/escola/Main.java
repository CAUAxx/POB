package escola;

public class Main {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
			
		aluno.setCpf("11111111110");
		aluno.setMatricula("2025123456");
		aluno.setNome("Jose da silva");
		aluno.setEmail("ze@gmail.com");
		
		System.out.println(aluno.getMatricula());
		System.out.println(aluno.getNome());
		System.out.println(aluno.getEmail());
		System.out.println(aluno.getCpf());
		
		Disciplina disciplina = new Disciplina();
		disciplina.setCargaHoraria("110");
		disciplina.setNome("Programação Orientada a Objetos");
		disciplina.setSigla("POB");
		disciplina.setSemestre("2023.1");
		
		System.out.println(disciplina.getCargaHoraria());
		System.out.println(disciplina.getNome());
		System.out.println(disciplina.getSigla());
		System.out.println(disciplina.getSemestre());
	}	
}
