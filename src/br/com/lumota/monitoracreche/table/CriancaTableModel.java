package br.com.lumota.monitoracreche.table;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import br.com.lumota.monitoracreche.model.Crianca;

public class CriancaTableModel extends AbstractTableModel{
	
	private List<Crianca> criancas = new ArrayList<Crianca>();
	
	private String[] colunas = new String[] {
		"ID", "PAI", "CPFPAI", "MAE", "CPFMAE", "ENDERECO", "BAIRRO", "CEP", "TELEFONE", "CELULAR", "NOME", "IDADE", "TURMA", "TURNO"	
	};
	
	public CriancaTableModel(List<Crianca> criancas) {
		this.criancas = criancas;
	}
	
	public void addRow(Crianca crianca) {
		criancas.add(crianca);
	}
	
	
	@Override
	public String getColumnName(int columnIndex) {
		// TODO Auto-generated method stub
		return colunas[columnIndex];
	}
	
	

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return colunas.length;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return criancas.size();
	}
	
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		
		Crianca crianca = criancas.get(rowIndex);
		
		switch (columnIndex) {
		case 0:
			return crianca.getId();
		case 1:
			return crianca.getPai();
		case 2:
			return crianca.getCpfPai();
		case 3:
			return crianca.getMae();
		case 4:
			return crianca.getCpfMae();
		case 5:
			return crianca.getEndereco();
		case 6:
			return crianca.getBairro();
		case 7:
			return crianca.getCep();
		case 8:
			return crianca.getTelefone();
		case 9:
			return crianca.getCelular();
		case 10:
			return crianca.getNome();
		case 11:
			return crianca.getIdade();
		case 12:
			return crianca.getTurma();
		case 13:
			return crianca.getTurma().getTurno();
			
		default:
			throw new IndexOutOfBoundsException("columnIndex out of bounds");
		}
		
	}
	
	

}
