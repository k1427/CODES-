package calling;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Register extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_4;
    private JTextField textField_5;


    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Register frame = new Register();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Register() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 900, 550);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("New User Register");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
        lblNewLabel.setBounds(307, 29, 294, 43);
        contentPane.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("First Name  ");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblNewLabel_1.setBounds(76, 101, 111, 36);
        contentPane.add(lblNewLabel_1);

        JLabel lblNewLabel_1_1 = new JLabel("Last Name  ");
        lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblNewLabel_1_1.setBounds(76, 174, 111, 36);
        contentPane.add(lblNewLabel_1_1);

        JLabel lblNewLabel_1_1_1 = new JLabel("Email address");
        lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblNewLabel_1_1_1.setBounds(76, 247, 111, 36);
        contentPane.add(lblNewLabel_1_1_1);

        textField = new JTextField();
        textField.setFont(new Font("Tahoma", Font.PLAIN, 18));
        textField.setBounds(201, 101, 204, 31);
        contentPane.add(textField);
        textField.setColumns(20);

        textField_1 = new JTextField();
        textField_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
        textField_1.setColumns(20);
        textField_1.setBounds(201, 177, 204, 31);
        contentPane.add(textField_1);

        textField_2 = new JTextField();
        textField_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
        textField_2.setColumns(20);
        textField_2.setBounds(201, 247, 204, 31);
        contentPane.add(textField_2);

        JLabel lblNewLabel_1_2 = new JLabel("Username");
        lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblNewLabel_1_2.setBounds(490, 101, 111, 36);
        contentPane.add(lblNewLabel_1_2);

        textField_3 = new JTextField();
        textField_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
        textField_3.setColumns(20);
        textField_3.setBounds(638, 101, 204, 31);
        contentPane.add(textField_3);

        JLabel lblNewLabel_1_1_2 = new JLabel("Password");
        lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblNewLabel_1_1_2.setBounds(490, 174, 111, 36);
        contentPane.add(lblNewLabel_1_1_2);

        textField_4 = new JTextField();
        textField_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
        textField_4.setColumns(20);
        textField_4.setBounds(638, 177, 204, 31);
        contentPane.add(textField_4);

        JLabel lblNewLabel_1_1_1_1 = new JLabel("Mobile number");
        lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblNewLabel_1_1_1_1.setBounds(490, 247, 128, 36);
        contentPane.add(lblNewLabel_1_1_1_1);

        textField_5 = new JTextField();
        textField_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
        textField_5.setColumns(20);
        textField_5.setBounds(638, 247, 204, 31);
        contentPane.add(textField_5);

        JButton btnNewButton = new JButton("Register");
        btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 35));
        btnNewButton.setBounds(357, 321, 217, 51);
        contentPane.add(btnNewButton);
    }
}
