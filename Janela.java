import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Janela extends JFrame {    

    private void centralizar(){
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension janela = getSize();
        if(janela.height > screen.height) {
            setSize(janela.width, screen.height);
        };
        if(janela.width > screen.width){
            setSize(screen.width, janela.height);
        };
        setLocation((screen.width - janela.width) /2, (screen.height - janela.height) /2);
    }
    private JTextField jtfConta;
    private JTextField jtfNome;
    private JTextField jtfEndereco;
    private JTextField jtfTelefone;
    private JTextField jtfCpf;
    private JButton jbConsultar;
    private JButton jbAtualizar;

    public Janela() {
        setResizable(false);
        getContentPane().setLayout(null);
        setSize(400, 255);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Java Swing - Desenvolvimento de Sistemas");
        centralizar();
        JLabel jlAgencia = new JLabel("Código da Agência");
        jlAgencia.setText("Código da Agência");
        jlAgencia.setSize(110, 18);
        jlAgencia.setLocation(10, 10);
        add(jlAgencia);
        JTextField jtfAgencia = new JTextField();
        jtfAgencia.setSize(50, 20);
        jtfAgencia.setLocation(125, 10);
        add(jtfAgencia);
        JLabel jlConta = new JLabel("Número da Conta");
        jlConta.setSize(105, 18);
        jlConta.setLocation(205, 10);
        add(jlConta);
        jtfConta = new JTextField();
        jtfConta.setSize(60, 20);
        jtfConta.setLocation(315, 10);
        add(jtfConta);
        JSeparator jSeparator01 = new JSeparator();
        jSeparator01.setBounds(10, 40, 365, 10);
        add(jSeparator01);
        JLabel jlNome = new JLabel("Nome:");
        jlNome.setSize(60, 18);
        jlNome.setLocation(10, 50);
        jlNome.setHorizontalAlignment(SwingConstants.RIGHT);
        add(jlNome);
        jtfNome = new JTextField();
        jtfNome.setSize(300, 20);
        jtfNome.setLocation(75, 50);
        add(jtfNome);
        JLabel jlEndereco = new JLabel("Endereço: ");
        jlEndereco.setText("Endereço: ");
        jlEndereco.setSize(60, 18);
        jlEndereco.setLocation(10,75);
        jlEndereco.setHorizontalAlignment(SwingConstants.RIGHT);
        add(jlEndereco);
        jtfEndereco = new JTextField();
        jtfEndereco.setSize(300, 20);
        jtfEndereco.setLocation(75, 75);
        add(jtfEndereco);
        JLabel jlTelefone = new JLabel("Telefone: ");
        jlTelefone.setSize(60,18);
        jlTelefone.setLocation(10, 100);
        jlTelefone.setHorizontalAlignment(SwingConstants.RIGHT);
        add(jlTelefone);
        jtfTelefone = new JTextField();
        jtfTelefone.setSize(300, 20);
        jtfTelefone.setLocation(75,100);
        add(jtfTelefone);
        JLabel jlCpf = new JLabel("CPF.");
        jlCpf.setSize(60, 18);
        jlCpf.setLocation(10,125);
        jlCpf.setHorizontalAlignment(SwingConstants.RIGHT);
        add(jlCpf);
        jtfCpf = new JTextField();
        jtfCpf.setBounds(75, 125, 300,20);
        add(jtfCpf);
        JRadioButton jrbCorrente = new JRadioButton("Conta Corrente");
        jrbCorrente.setSize(111, 20);
        jrbCorrente.setLocation(100,150);
        jrbCorrente.setMnemonic('C');
        jrbCorrente.setSelected(true);
        add(jrbCorrente);
        JRadioButton jrbPoupanca = new JRadioButton("Poupança");
        jrbPoupanca.setSize(118, 20);
        jrbPoupanca.setLocation(225, 150);
        jrbPoupanca.setMnemonic('P');
        add(jrbPoupanca);
        ButtonGroup bgContas = new ButtonGroup();
        bgContas.add(jrbCorrente);
        bgContas.add(jrbPoupanca);
        JSeparator jSeparator02 = new JSeparator();
        jSeparator02.setSize(365, 10);
        jSeparator02.setLocation(10 ,180);
        add(jSeparator02);
        jbConsultar = new JButton("Consultar");
        jbConsultar.setSize(100, 23);
        jbConsultar.setLocation(35, 190);
        jbConsultar.setMnemonic('S');
        jbConsultar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Simulação de consulta
                String conta = jtfConta.getText();
                if (conta.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Informe o número da conta para consultar.");
                } else {
                    jtfNome.setText("João da Silva");
                    jtfEndereco.setText("Rua das Flores, 123");
                    jtfTelefone.setText("(11) 98765-4321");
                    jtfCpf.setText("123.456.789-00");
                    jbAtualizar.setEnabled(true);
                }
            }
        });
        add(jbConsultar);
        
        JButton jbAtualizar = new JButton("Atualizar");
        jbAtualizar.setSize(100, 23);
        jbAtualizar.setLocation(145,190);
        jbAtualizar.setMnemonic('A');
        jbAtualizar.setEnabled(true);
        jbAtualizar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Simulação de atualização
                String nome = jtfNome.getText();
                String endereco = jtfEndereco.getText();
                String telefone = jtfTelefone.getText();
                String cpf = jtfCpf.getText();
        
                if (nome.isEmpty() || endereco.isEmpty() || telefone.isEmpty() || cpf.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Preencha todos os campos antes de atualizar.");
                } else {
                    JOptionPane.showMessageDialog(null, "Dados atualizados com sucesso!");
                    jbAtualizar.setEnabled(false); // Desabilita após atualização
                }
            }
        });
        add(jbAtualizar);
        
        JButton jbFechar = new JButton("Fechar");
        jbFechar.setSize(100, 23);
        jbFechar.setLocation(255, 190);
        jbFechar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?", "Confirmação", JOptionPane.YES_NO_OPTION);
                if (resposta == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
            }
        });
        add(jbFechar);


    }
     public static void main(String args[]) {
        Janela janela = new Janela();

        janela.setVisible(true);
    } 



}

