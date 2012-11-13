import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import java.awt.Color;





public class BMI_GUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textV;
	private JTextField textT;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BMI_GUI frame = new BMI_GUI();
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
	public BMI_GUI() {
		setTitle("by Nikola Simovi\u0107");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(107, 142, 35));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		textV = new JTextField();
		textV.setBounds(39, 28, 150, 25);
		contentPane.add(textV);
		textV.setColumns(10);

		textT = new JTextField();
		textT.setBounds(39, 87, 150, 25);
		contentPane.add(textT);
		textT.setColumns(10);

		final JTextPane textPane = new JTextPane();
		textPane.setBackground(new Color(169, 169, 169));
		textPane.setFont(new Font("Calibri", Font.BOLD, 15));
		textPane.setForeground(Color.RED);
		textPane.setEditable(false);
		textPane.setText("");
		textPane.setBounds(39, 202, 336, 53);
		contentPane.add(textPane);

		JButton btnNewButton = new JButton("Izra\u010Dunaj");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				BMIKalkulator v = new BMIKalkulator();
				try{	
					double visina=Double.parseDouble(textV.getText());
					double tezina = Double.parseDouble(textT.getText());
					String bmi= v.vrednostBMI(tezina, visina);

					textPane.setText(bmi);
				}catch(Exception error){
					JOptionPane.showMessageDialog(null, "Greska");
				}

			}
		});
		btnNewButton.setBounds(248, 28, 127, 49);
		contentPane.add(btnNewButton);

		JLabel lblVisina = new JLabel("Unesite visinu (m)");
		lblVisina.setBounds(67, 11, 103, 14);
		contentPane.add(lblVisina);

		JLabel lblTezina = new JLabel("Unesite te\u017Einu (kg)");
		lblTezina.setBounds(67, 73, 109, 14);
		contentPane.add(lblTezina);

		JButton btnObrisi = new JButton("Obri\u0161i");
		btnObrisi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textPane.setText("");
				textT.setText("");
				textV.setText("");
			}
		});
		btnObrisi.setBounds(248, 88, 127, 23);
		contentPane.add(btnObrisi);




	}
}