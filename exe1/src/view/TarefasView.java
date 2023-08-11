package view;

import java.util.List;

import model.TarefasModel;

public class TarefasView {
	public void exibirListaDeTarefas(List<TarefasModel> tarefa) {
		
		System.out.println("------Lista de Tarefas------");
		
		for (TarefasModel tarefas : tarefa) {
			System.out.println("Tarefa: " + tarefa.getNome() + "-Status: " + tarefa.getStatus());
		}
		System.out.println("------------");
	}
	
	public void removerTarefa(boolean paisRemovido) {
		if (tarefaRemovida) {
			System.out.println("Tarefa removida");
		} else {
			System.out.println("Tarefa não encontrada na lista. \n ");
		}
	}

}
