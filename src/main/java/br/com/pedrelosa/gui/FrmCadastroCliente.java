package br.com.pedrelosa.gui;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


/**
 *
 * @author pedre
 */
public class FrmCadastroCliente extends JFrame {



    // Variables declaration - do not modify                     
    private JLabel jLabel1;
    private JLabel jLabel20;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JPanel jPanel4;
    private JScrollPane jScrollPane1;
    private JScrollPane jScrollPane2;
    private JButton jbNAO;
    private JButton jbSIM;
    private JLabel jfCliente;
    private JFormattedTextField jfTelefoneInicial;
    private JFormattedTextField jftCEP;
    private JFormattedTextField jftTelefone;
    private JLabel jlBairro;
    private JLabel jlCEP;
    private JLabel jlCodigoCliente;
    private JLabel jlCodigoClienteApresentavel;
    private JLabel jlComplemento;
    private JLabel jlConfirma;
    private JLabel jlLogradouro;
    private JLabel jlNome;
    private JLabel jlNumero;
    private JLabel jlObs;
    private JLabel jlQuantidadePedidos;
    private JLabel jlQuantidadePedidosApresentavel;
    private JLabel jlReferencia;
    private JLabel jlTaxaEntrega;
    private JLabel jlUltimoPedido;
    private JLabel jlUltimoPedidoApresentavel;
    private JTextField jtfBairro;
    private JTextField jtfComplemento;
    private JTextField jtfConfirma;
    private JTextField jtfLogradouro;
    private JTextField jtfNome;
    private JTextField jtfNumero;
    private JTextPane jtfObs;
    private JTextPane jtfReferencia;
    private JTextField jtfTaxaEntrega;

    /**
     * Creates new form FrmCadastroCliente
     */
    public FrmCadastroCliente() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new JPanel();
        jLabel1 = new JLabel();
        jPanel2 = new JPanel();
        jfCliente = new JLabel();
        jfTelefoneInicial = new JFormattedTextField();
        jPanel3 = new JPanel();
        jlNome = new JLabel();
        jlLogradouro = new JLabel();
        jtfLogradouro = new JTextField();
        jlNumero = new JLabel();
        jtfComplemento = new JTextField();
        jlBairro = new JLabel();
        jtfBairro = new JTextField();
        jlReferencia = new JLabel();
        jScrollPane1 = new JScrollPane();
        jtfReferencia = new JTextPane();
        jlCEP = new JLabel();
        jftCEP = new JFormattedTextField();
        jlTaxaEntrega = new JLabel();
        jlObs = new JLabel();
        jScrollPane2 = new JScrollPane();
        jtfObs = new JTextPane();
        jlComplemento = new JLabel();
        jtfNumero = new JTextField();
        jlCodigoCliente = new JLabel();
        jtfNome = new JTextField();
        jlCodigoClienteApresentavel = new JLabel();
        jLabel20 = new JLabel();
        jftTelefone = new JFormattedTextField();
        jtfTaxaEntrega = new JTextField();
        jPanel4 = new JPanel();
        jlConfirma = new JLabel();
        jbSIM = new JButton();
        jbNAO = new JButton();
        jtfConfirma = new JTextField();
        jlQuantidadePedidos = new JLabel();
        jlQuantidadePedidosApresentavel = new JLabel();
        jlUltimoPedido = new JLabel();
        jlUltimoPedidoApresentavel = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 0, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Informações do programa");

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 289, GroupLayout.PREFERRED_SIZE)
                                .addGap(384, 384, 384))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jfCliente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jfCliente.setText("Cliente:");

        try {
            jfTelefoneInicial.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jfTelefoneInicial.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jfTelefoneInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jfTelefoneInicialActionPerformed(evt);
            }
        });

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(jfCliente)
                                .addGap(18, 18, 18)
                                .addComponent(jfTelefoneInicial, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jfCliente)
                                        .addComponent(jfTelefoneInicial, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(32, Short.MAX_VALUE))
        );

        jfTelefoneInicial.getAccessibleContext().setAccessibleName("");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jlNome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlNome.setText("Nome:");

        jlLogradouro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlLogradouro.setText("Logradouro:");

        jtfLogradouro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jlNumero.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlNumero.setText("Número:");

        jtfComplemento.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jlBairro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlBairro.setText("Bairro:");

        jtfBairro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jlReferencia.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlReferencia.setText("Referência:");

        jScrollPane1.setViewportView(jtfReferencia);

        jlCEP.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlCEP.setText("CEP:");

        try {
            jftCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jftCEP.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jlTaxaEntrega.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlTaxaEntrega.setText("Taxa de entrega:");

        jlObs.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlObs.setText("Observação:");

        jScrollPane2.setViewportView(jtfObs);

        jlComplemento.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlComplemento.setText("Complemento:");

        jtfNumero.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jlCodigoCliente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlCodigoCliente.setText("Código:");

        jtfNome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jlCodigoClienteApresentavel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlCodigoClienteApresentavel.setText("XXXXX");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel20.setText("Telefone:");

        try {
            jftTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) # ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jftTelefone.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jtfTaxaEntrega.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jtfTaxaEntrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfTaxaEntregaActionPerformed(evt);
            }
        });

        GroupLayout jPanel3Layout = new GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(129, 129, 129)
                                                .addComponent(jlCEP, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jftCEP, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(8, 8, 8)
                                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel20)
                                                        .addComponent(jlCodigoCliente))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jlCodigoClienteApresentavel)
                                                        .addComponent(jftTelefone, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE))))
                                .addGap(200, 200, 200)
                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(jlTaxaEntrega)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jtfTaxaEntrega, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addGroup(GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                        .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                                .addGroup(jPanel3Layout.createSequentialGroup()
                                                                        .addGap(68, 68, 68)
                                                                        .addComponent(jlBairro))
                                                                .addComponent(jlNumero)
                                                                .addComponent(jlLogradouro)
                                                                .addComponent(jlNome)
                                                                .addComponent(jlComplemento))
                                                        .addGap(18, 18, 18)
                                                        .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(jtfComplemento)
                                                                .addComponent(jtfNumero)
                                                                .addComponent(jtfLogradouro)
                                                                .addComponent(jtfBairro, GroupLayout.PREFERRED_SIZE, 365, GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jtfNome)))
                                                .addGroup(GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                        .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                                .addComponent(jlObs)
                                                                .addComponent(jlReferencia))
                                                        .addGap(18, 18, 18)
                                                        .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(jScrollPane1)
                                                                .addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 365, GroupLayout.PREFERRED_SIZE)))))
                                .addGap(41, 41, 41))
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(20, 20, 20)
                                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jlNome)
                                                        .addComponent(jtfNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jlLogradouro)
                                                        .addComponent(jtfLogradouro, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jlNumero)
                                                        .addComponent(jtfNumero, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jtfComplemento, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jlComplemento))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jlBairro)
                                                        .addComponent(jtfBairro, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jlReferencia))
                                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                                                                .addComponent(jlObs)
                                                                .addGap(76, 76, 76))
                                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)))
                                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jlTaxaEntrega)
                                                        .addComponent(jtfTaxaEntrega, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(44, 44, 44)
                                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jlCodigoCliente)
                                                        .addComponent(jlCodigoClienteApresentavel))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel20)
                                                        .addComponent(jftTelefone, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jlCEP)
                                                        .addComponent(jftCEP, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));

        jlConfirma.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlConfirma.setText("Confirma?");

        jbSIM.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbSIM.setText("SIM");
        jbSIM.setFocusable(false);

        jbNAO.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbNAO.setText("NÃO");
        jbNAO.setFocusable(false);

        jtfConfirma.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jlQuantidadePedidos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlQuantidadePedidos.setText("Quantidade de pedidos:");

        jlQuantidadePedidosApresentavel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlQuantidadePedidosApresentavel.setText("XX");

        jlUltimoPedido.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlUltimoPedido.setText("Último pedido:");

        jlUltimoPedidoApresentavel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlUltimoPedidoApresentavel.setText("XX");

        GroupLayout jPanel4Layout = new GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(jlUltimoPedido)
                                        .addComponent(jlQuantidadePedidos))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addComponent(jlUltimoPedidoApresentavel)
                                                .addGap(212, 212, 212)
                                                .addComponent(jlConfirma)
                                                .addGap(71, 71, 71)
                                                .addComponent(jbSIM)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jbNAO)
                                                .addGap(18, 18, 18)
                                                .addComponent(jtfConfirma, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jlQuantidadePedidosApresentavel))
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jlQuantidadePedidos)
                                        .addComponent(jlQuantidadePedidosApresentavel))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jlUltimoPedido)
                                        .addComponent(jlUltimoPedidoApresentavel)
                                        .addGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                .addComponent(jlConfirma)
                                                .addComponent(jbSIM)
                                                .addComponent(jbNAO)
                                                .addComponent(jtfConfirma, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(12, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                        .addComponent(jPanel4, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void jfTelefoneInicialActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jtfTaxaEntregaActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    public static void main(String args[]) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException |
                 UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmCadastroCliente frmCadastroCliente = new FrmCadastroCliente();

                frmCadastroCliente.setVisible(true);

//                frmCadastroCliente.jtfLogradouro.addKeyListener(new KeyAdapter() {
//
//                    @Override
//                    public void keyTyped(KeyEvent e) {
//
//                        System.out.println(tfLogradouro.getText().length());
//
//                        if (tfLogradouro.getText().length() > 2) {
//                            System.out.println("Aparendo");
//
//
//                            model.clear();
////
////                    model.clear();
////
////                    LogradouroDAO lDAO = new LogradouroDAO();
////
////                    List<Logradouro> logradouros = lDAO.buscaTodosPorCaracteres(tfLogradouro.getText());
////
////                    logradouros.forEach(logradouro -> model.addElement(logradouro.getNome()));
////                    lLogradouros.setVisible(true);
//
//
//                            new TesteThread(model, lLogradouros, tfLogradouro);
//                            lLogradouros.setVisible(true);
//
//                            lLogradouros.setSize(400,80);
//                        }else{
//                            model.clear();
////                    lLogradouros.setVisible(false);
////                    jspLogradouros.setVisible(false);
//                        }
//                    }
//                });

            }
        });
    }
}