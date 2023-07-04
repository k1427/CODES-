package calling;



import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class updation extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;
    private JLabel lblNewLabel_2;
    private JTextField textField_2;
    private JButton btnNewButton;
    private JButton btnUpdate;
    private JButton btnNewButton_2;
    private JLabel lblNewLabel_3;


    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    updation frame = new updation();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public updation() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 800, 414);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("Roll    : ");
        lblNewLabel.setBounds(228, 151, 73, 25);
        lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        contentPane.add(lblNewLabel);

        textField = new JTextField();
        textField.setBounds(314, 153, 266, 25);
        lblNewLabel.setLabelFor(textField);
        textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
        contentPane.add(textField);
        textField.setColumns(20);

        JLabel lblNewLabel_1 = new JLabel("Name : ");
        lblNewLabel_1.setBounds(228, 184, 71, 25);
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        contentPane.add(lblNewLabel_1);

        textField_1 = new JTextField();
        textField_1.setBounds(314, 186, 266, 25);
        lblNewLabel_1.setLabelFor(textField_1);
        textField_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
        contentPane.add(textField_1);
        textField_1.setColumns(20);

        lblNewLabel_2 = new JLabel("Marks : ");
        lblNewLabel_2.setBounds(228, 219, 71, 25);
        lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
        contentPane.add(lblNewLabel_2);

        textField_2 = new JTextField();
        textField_2.setBounds(314, 216, 266, 25);
        textField_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
        contentPane.add(textField_2);
        textField_2.setColumns(20);

        btnNewButton = new JButton("Insert");
        btnNewButton.setBounds(249, 282, 100, 23);
        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
        contentPane.add(btnNewButton);

        btnUpdate = new JButton("Update");
        btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnUpdate.setBounds(369, 282, 100, 23);
        contentPane.add(btnUpdate);

        btnNewButton_2 = new JButton("Delete");
        btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnNewButton_2.setBounds(496, 282, 100, 23);
        contentPane.add(btnNewButton_2);

        lblNewLabel_3 = new JLabel("STS");
        lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 30));
        lblNewLabel_3.setBounds(356, 60, 100, 65);
        contentPane.add(lblNewLabel_3);
    }

}