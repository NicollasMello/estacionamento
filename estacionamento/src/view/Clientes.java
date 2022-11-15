package view;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;

import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UIManager;

import java.util.logging.Logger;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import model.Cliente;
import repository.ClienteRep;
import tabelas.ClienteTabela;

public class Clientes extends javax.swing.JFrame {
	
	 private JButton btnAlterar;
	 private JButton btnExcluir;
	 private JButton btnNovo;
	 private JButton jButton6;
	 private JLabel jLabel1;
	 private JLabel jLabel2;
	 private JLabel jLabel3;
	 private JLabel jLabel4;
	 private JScrollPane jScrollPane1;
	 public JTable tblClientes;
	 public JTextField txtCpf;
	 public JTextField txtNome;
	 private JTextField txtPesquisa;
	 public JTextField txtCelular;

    ClienteTabela ct;
    Cliente c = new Cliente();
    ClienteRep crep = new ClienteRep();

    public void refresh() {
    	ct = new ClienteTabela();
    	tblClientes.setModel(ct);
    }

    public Clientes() {
        initComponents();
        this.setLocationRelativeTo(null);
        refresh();
    }

    public void definirAtributos() {
        c.setNome(txtNome.getText());
        c.setCpf(txtCpf.getText());
        c.setCelular(txtCelular.getText());
    }
    
    public void filtrar(String query){
        TableRowSorter<ClienteTabela> tr = new TableRowSorter<ClienteTabela>(ct);
        tblClientes.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(query));
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        txtPesquisa = new javax.swing.JTextField();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtCpf = new javax.swing.JTextField();
        txtCelular = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtPesquisa.setForeground(new java.awt.Color(150, 150, 150));
        txtPesquisa.setText("Pesquisar");
        txtPesquisa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPesquisaMouseClicked(evt);
            }
        });
        txtPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisaActionPerformed(evt);
            }
        });
        txtPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisaKeyReleased(evt);
            }
        });

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        jButton6.setText("<");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Tabela de Clientes");

        jLabel1.setText("Nome");

        jLabel2.setText("Cpf");

        jLabel4.setText("Celular");

        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
            	tblClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblClientes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(btnAlterar)
                                .addGap(14, 14, 14)
                                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 50, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPesquisa)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton6))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jButton6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluir)
                    .addComponent(btnAlterar)
                    .addComponent(btnNovo))
                .addContainerGap())
        );

        pack();
    }

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {
        if (txtNome.getText().isEmpty()
                || txtCpf.getText().isEmpty()
                || txtCelular.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Preencha todos os campos antes de cadastrar");

        } else {
            definirAtributos();
            crep.salvar(c);

            JOptionPane.showMessageDialog(rootPane, "Cliente cadastrado com sucesso!");
        }
        refresh();

    }

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
        Menu m = new Menu();
        m.setVisible(true);
        dispose();
    }

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {
        if (tblClientes.getSelectedRow() >= 0) {
            c = ct.get(tblClientes.getSelectedRow());
            c.setId((int) ct.getValueAt(tblClientes.getSelectedRow(), 0));
            definirAtributos();
            crep.alterar(c);
            JOptionPane.showMessageDialog(rootPane, "Cliente alterado com sucesso!");
            txtNome.setText("");
            txtCpf.setText("");
            txtCelular.setText("");
        } else {
            JOptionPane.showMessageDialog(rootPane, "Selecione um cliente para alterar!");
        }
        refresh();
    }

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {
         if (tblClientes.getSelectedRow() >= 0) {
            if (JOptionPane.showConfirmDialog(rootPane, "Você tem certeza?", "Excluir", JOptionPane.YES_NO_OPTION) == 0) {

                Cliente c = ct.get(tblClientes.getSelectedRow());
                crep.excluir(c);
                
                JOptionPane.showMessageDialog(rootPane, "Funcionário excluído com sucesso!");
            }

        } else {
            JOptionPane.showMessageDialog(rootPane, "Informe o funcionário que deseja excluir!");
        }
        refresh();   
    }

    private void txtPesquisaActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    private void txtPesquisaKeyReleased(java.awt.event.KeyEvent evt) {
        String query = txtPesquisa.getText();
        filtrar(query);
    }

    private void txtPesquisaMouseClicked(java.awt.event.MouseEvent evt) {
        txtPesquisa.setText("");
        txtPesquisa.setForeground(Color.black);
    }

    private void tblClientesMouseClicked(java.awt.event.MouseEvent evt) {
        txtNome.setText(ct.getValueAt(tblClientes.getSelectedRow(), 1).toString());
        txtCpf.setText(ct.getValueAt(tblClientes.getSelectedRow(), 2).toString());
        txtCelular.setText(ct.getValueAt(tblClientes.getSelectedRow(), 3).toString());
    }


    public static void main(String args[]) {
        try {
            for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Clientes().setVisible(true);
            }
        });
    }
}
