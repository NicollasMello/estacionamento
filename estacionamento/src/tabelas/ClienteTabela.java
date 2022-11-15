package tabelas;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import model.Cliente;
import repository.ClienteRep;

public class ClienteTabela extends AbstractTableModel{
	
	private ClienteRep crep = new ClienteRep();
    private List<Cliente> clientes = crep.listar();

    @Override
    public int getRowCount() {
        return clientes.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    public Cliente get(int row) {
        return clientes.get(row);

    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return clientes.get(rowIndex).getId();
            case 1:
                return clientes.get(rowIndex).getNome();
            case 2:
                return clientes.get(rowIndex).getCpf();
            case 3:
                return clientes.get(rowIndex).getCelular();
        }
        return null;
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Id";
            case 1:
                return "Nome";
            case 2:
                return "Cpf";
            case 3:
                return "Celular";
        }
        return null;
    }

}
