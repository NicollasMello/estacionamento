package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Cliente;
import util.ConexaoBD;

public class ClienteRep {

    private static final String INSERT = "insert into cliente (nome, cpf, celular) values (?,?,?);";

    private static final String SELECT = "select id, nome, cpf, celular from cliente";

    private static final String DELETE = "delete from cliente where id = ?";

    private static final String UPDATE = "update cliente set cpf = ?,  nome = ?, celular = ? where id = ?";

    private Connection connection = ConexaoBD.conectarBanco();
    private PreparedStatement pstm;

    public void salvar(Cliente cliente) {
        try {
            pstm = connection.prepareStatement(INSERT);
            pstm.setString(1, cliente.getNome());
            pstm.setString(2, cliente.getCpf());
            pstm.setString(3, cliente.getCelular());
            pstm.execute();
            pstm.close();

        } catch (SQLException ex) {
            System.out.println("Ocorreu um erro ao tentar salvar: " + ex.getMessage());
        }
    }

    public void alterar(Cliente cliente) {

        try {
            pstm = connection.prepareStatement(UPDATE);
            pstm.setString(1, cliente.getCpf());
            pstm.setString(2, cliente.getNome());
            pstm.setString(3, cliente.getCelular());
            pstm.setInt(4, cliente.getId());
            pstm.execute();
            pstm.close();
        } catch (SQLException ex) {
            System.out.println("Ocorreu um erro ao tentar alterar: " + ex.getMessage());
        }
    }

    public void excluir(Cliente cliente) {
        try {
            pstm = connection.prepareStatement(DELETE);
            pstm.setInt(1, cliente.getId());
            pstm.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Ocorreu um erro ao tentar excluir: " + ex.getMessage());
        }

    }

    public List<Cliente> listar() {
        List<Cliente> cliente = new ArrayList<>();
        ResultSet res;

        try {
            pstm = connection.prepareStatement(SELECT);
            res = pstm.executeQuery();

            while (res.next()) {
            	Cliente c = new Cliente();
            	c.setId(res.getInt("id"));
                c.setNome(res.getString("nome"));
                c.setCpf(res.getString("cpf"));
                c.setCelular(res.getString("celular"));
                cliente.add(c);
            }

        } catch (SQLException ex) {
            System.out.println("Ocorreu um erro ao tentar buscar as pessoas do banco: " + ex.getMessage());
        }
        return cliente;
    }
}
