package br.com.pedrelosa.gui;

import br.com.pedrelosa.connection.ConnectionDAO;
import br.com.pedrelosa.connection.LogradouroDAO;
import br.com.pedrelosa.model.Cliente;
import br.com.pedrelosa.model.Logradouro;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class CadastroCliente extends JFrame {
    protected JPanel mainPanel;
    private JTextField tfNome;
    private JTextField tfObs;
    private JTextField tfTelefone;
    private JButton cadastarButton;
    private JTextField tfLogradouro;
    private JTextField tfNumero;
    private JTextField tfComplemento;
    private JList<String> lLogradouros;
    private JScrollPane jspLogradouros;
    private Integer quantidadeCaracteresDigitados;

    DefaultListModel<String> model;

    public CadastroCliente() {


        jspLogradouros.setSize(100,100);

        lLogradouros.setVisible(false);
        model = new DefaultListModel<>();
        lLogradouros.setModel(model);

//        lLogradouros.setSize(200,300);

        this.setSize(700, 400);
        this.setResizable(false);
        this.setContentPane(this.mainPanel);
        this.setTitle("Teste Cadastro Cliente");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);

        cadastarButton.addActionListener(e -> {
            ConnectionDAO<Cliente> cCDAO = new ConnectionDAO<>();

            Cliente cliente = new Cliente();

            cliente.setTelefone(tfTelefone.getText());

        });

        tfLogradouro.addKeyListener(new KeyAdapter() {

            @Override
            public void keyTyped(KeyEvent e) {

                System.out.println(tfLogradouro.getText().length());

                if (tfLogradouro.getText().length() > 2) {
                    System.out.println("Aparendo");


                    model.clear();
//
//                    model.clear();
//
//                    LogradouroDAO lDAO = new LogradouroDAO();
//
//                    List<Logradouro> logradouros = lDAO.buscaTodosPorCaracteres(tfLogradouro.getText());
//
//                    logradouros.forEach(logradouro -> model.addElement(logradouro.getNome()));
//                    lLogradouros.setVisible(true);


                    new TesteThread(model, lLogradouros, tfLogradouro);
                    lLogradouros.setVisible(true);

                    lLogradouros.setSize(400,80);
                }else{
                    model.clear();
//                    lLogradouros.setVisible(false);
//                    jspLogradouros.setVisible(false);
                }
            }
        });
    }

    private void createUIComponents() {
    }

    public static void main(String[] args) {

        LogradouroDAO lDAO = new LogradouroDAO();

        lDAO.consultaPorId(Logradouro.class, 1L);

        CadastroCliente cadastroCliente = new CadastroCliente();
    }

}
