package controller;

import java.util.ArrayList;
import java.util.List;

import model.TarefasModel;

public class TarefasController {

	private List<TarefasModel> listaDeTarefas;

	private TarefasView tarefasView;

	public TarefasController() {
		listaDeTarefas = new ArrayList<>();
		tarefasView = new TarefasView();
	}

	public void adicionarTarefa(String nomeTarefa, String status) {
		TarefasModel tarefa = new TarefasModel(nomeTarefa, status);
		listaDeTarefas.add(tarefa);
	}

	public void exibirListaDeTarefas() {
		tarefasView.exibirListaDeTarefas(listaDeTarefas);
	}

	public void removerTarefa(String nomeDeTarefaRemover) {
		boolean tarefaRemovida = false;

	for(

	TarefasModel tarefa:listaDeTarefa)
	{

		if (tarefa.getNome().equalsIgnoreCase(nomeDeTarefaRemover)) {
			listaDeTarefa.remove(tarefa);

			tarefaRemovida = true;
			break;
		}
	}

	tarefaView.removerTarefa(tarefaRemovida);
	}

	public void limparListaDeTarefas() {
		listaDeTarefa.clear();
		tarefaView.limparListaDePaises();

	}
}
