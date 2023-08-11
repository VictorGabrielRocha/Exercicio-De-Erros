package model;

public class TarefasModel {
	private String nomeTarefa;
	private String status;

	public TarefasModel(String nomeTarefa, String status) {
		this.nomeTarefa = nomeTarefa;
		this.status = status;
	}

	public String getNomeTarefa() {
		return nomeTarefa;
	}

	public void setNomeTarefa(String nomeTarefa) {
		this.nomeTarefa = nomeTarefa;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}
