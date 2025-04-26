package Objetos;

public class Cursos {
	
	private String NomeCurso;
	private String TipoDeCurso;
	private String CargaHoraria;
	private String Disciplinas;
	
	
	public Cursos(String nomeCurso, String tipoDeCurso, String cargaHoraria, String disciplinas) {
		NomeCurso = nomeCurso;
		TipoDeCurso = tipoDeCurso;
		CargaHoraria = cargaHoraria;
		Disciplinas = disciplinas;
	}
	
	
	public String getNomeCurso() {
		return NomeCurso;
	}
	public void setNomeCurso(String nomeCurso) {
		NomeCurso = nomeCurso;
	}
	public String getTipoDeCurso() {
		return TipoDeCurso;
	}
	public void setTipoDeCurso(String tipoDeCurso) {
		TipoDeCurso = tipoDeCurso;
	}
	public String getCargaHoraria() {
		return CargaHoraria;
	}
	public void setCargaHoraria(String cargaHoraria) {
		CargaHoraria = cargaHoraria;
	}
	public String getDisciplinas() {
		return Disciplinas;
	}
	public void setDisciplinas(String disciplinas) {
		Disciplinas = disciplinas;
	}
}
