package Program;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class Okno extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Okno frame = new Okno();
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
	public Okno() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setSize(300,280);
		
		MyActionListener listener = new MyActionListener();
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{68, 68, 68, 68, 0};
		gbl_contentPane.rowHeights = new int[]{33, 33, 33, 33, 33, 33, 33, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel label = new JLabel("");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.fill = GridBagConstraints.BOTH;
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 0;
		gbc_label.gridy = 0;
		contentPane.add(label, gbc_label);
		
		textField = new JTextField();
		textField.setEditable(false);
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.gridwidth = 2;
		gbc_textField.fill = GridBagConstraints.BOTH;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 0;
		contentPane.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JLabel label_2 = new JLabel("");
		GridBagConstraints gbc_label_2 = new GridBagConstraints();
		gbc_label_2.fill = GridBagConstraints.BOTH;
		gbc_label_2.insets = new Insets(0, 0, 5, 0);
		gbc_label_2.gridx = 3;
		gbc_label_2.gridy = 0;
		contentPane.add(label_2, gbc_label_2);
		
		JButton btnNewButton = new JButton("7");
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 0;
		gbc_btnNewButton.gridy = 1;
		contentPane.add(btnNewButton, gbc_btnNewButton);
		btnNewButton.addActionListener(listener);
		
		JButton btnNewButton_1 = new JButton("8");
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_1.gridx = 1;
		gbc_btnNewButton_1.gridy = 1;
		contentPane.add(btnNewButton_1, gbc_btnNewButton_1);
		btnNewButton_1.addActionListener(listener);
		
		JButton button = new JButton("9");
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.fill = GridBagConstraints.BOTH;
		gbc_button.insets = new Insets(0, 0, 5, 5);
		gbc_button.gridx = 2;
		gbc_button.gridy = 1;
		contentPane.add(button, gbc_button);
		button.addActionListener(listener);
		
		JButton btnNewButton_4 = new JButton("+");
		GridBagConstraints gbc_btnNewButton_4 = new GridBagConstraints();
		gbc_btnNewButton_4.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_4.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_4.gridx = 3;
		gbc_btnNewButton_4.gridy = 1;
		contentPane.add(btnNewButton_4, gbc_btnNewButton_4);
		btnNewButton_4.addActionListener(listener);
		
		JButton button_1 = new JButton("4");
		GridBagConstraints gbc_button_1 = new GridBagConstraints();
		gbc_button_1.fill = GridBagConstraints.BOTH;
		gbc_button_1.insets = new Insets(0, 0, 5, 5);
		gbc_button_1.gridx = 0;
		gbc_button_1.gridy = 2;
		contentPane.add(button_1, gbc_button_1);
		button_1.addActionListener(listener);
		
		JButton button_2 = new JButton("5");
		GridBagConstraints gbc_button_2 = new GridBagConstraints();
		gbc_button_2.fill = GridBagConstraints.BOTH;
		gbc_button_2.insets = new Insets(0, 0, 5, 5);
		gbc_button_2.gridx = 1;
		gbc_button_2.gridy = 2;
		contentPane.add(button_2, gbc_button_2);
		button_2.addActionListener(listener);
		
		JButton button_3 = new JButton("6");
		GridBagConstraints gbc_button_3 = new GridBagConstraints();
		gbc_button_3.fill = GridBagConstraints.BOTH;
		gbc_button_3.insets = new Insets(0, 0, 5, 5);
		gbc_button_3.gridx = 2;
		gbc_button_3.gridy = 2;
		contentPane.add(button_3, gbc_button_3);
		button_3.addActionListener(listener);
		
		JButton btnNewButton_5 = new JButton("-");
		GridBagConstraints gbc_btnNewButton_5 = new GridBagConstraints();
		gbc_btnNewButton_5.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_5.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_5.gridx = 3;
		gbc_btnNewButton_5.gridy = 2;
		contentPane.add(btnNewButton_5, gbc_btnNewButton_5);
		btnNewButton_5.addActionListener(listener);
		
		JButton button_4 = new JButton("1");
		GridBagConstraints gbc_button_4 = new GridBagConstraints();
		gbc_button_4.fill = GridBagConstraints.BOTH;
		gbc_button_4.insets = new Insets(0, 0, 5, 5);
		gbc_button_4.gridx = 0;
		gbc_button_4.gridy = 3;
		contentPane.add(button_4, gbc_button_4);
		button_4.addActionListener(listener);
		
		JButton button_5 = new JButton("2");
		GridBagConstraints gbc_button_5 = new GridBagConstraints();
		gbc_button_5.fill = GridBagConstraints.BOTH;
		gbc_button_5.insets = new Insets(0, 0, 5, 5);
		gbc_button_5.gridx = 1;
		gbc_button_5.gridy = 3;
		contentPane.add(button_5, gbc_button_5);
		button_5.addActionListener(listener);
		
		JButton button_6 = new JButton("3");
		GridBagConstraints gbc_button_6 = new GridBagConstraints();
		gbc_button_6.fill = GridBagConstraints.BOTH;
		gbc_button_6.insets = new Insets(0, 0, 5, 5);
		gbc_button_6.gridx = 2;
		gbc_button_6.gridy = 3;
		contentPane.add(button_6, gbc_button_6);
		button_6.addActionListener(listener);
		
		JButton btnNewButton_6 = new JButton("*");
		GridBagConstraints gbc_btnNewButton_6 = new GridBagConstraints();
		gbc_btnNewButton_6.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_6.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_6.gridx = 3;
		gbc_btnNewButton_6.gridy = 3;
		contentPane.add(btnNewButton_6, gbc_btnNewButton_6);
		btnNewButton_6.addActionListener(listener);
		
		JButton button_7 = new JButton("(");
		GridBagConstraints gbc_button_7 = new GridBagConstraints();
		gbc_button_7.fill = GridBagConstraints.BOTH;
		gbc_button_7.insets = new Insets(0, 0, 5, 5);
		gbc_button_7.gridx = 0;
		gbc_button_7.gridy = 4;
		contentPane.add(button_7, gbc_button_7);
		button_7.addActionListener(listener);
		
		JButton button_8 = new JButton("0");
		GridBagConstraints gbc_button_8 = new GridBagConstraints();
		gbc_button_8.fill = GridBagConstraints.BOTH;
		gbc_button_8.insets = new Insets(0, 0, 5, 5);
		gbc_button_8.gridx = 1;
		gbc_button_8.gridy = 4;
		contentPane.add(button_8, gbc_button_8);
		button_8.addActionListener(listener);
		
		JButton button_9 = new JButton(")");
		GridBagConstraints gbc_button_9 = new GridBagConstraints();
		gbc_button_9.fill = GridBagConstraints.BOTH;
		gbc_button_9.insets = new Insets(0, 0, 5, 5);
		gbc_button_9.gridx = 2;
		gbc_button_9.gridy = 4;
		contentPane.add(button_9, gbc_button_9);
		button_9.addActionListener(listener);
		
		JButton btnNewButton_7 = new JButton("/");
		GridBagConstraints gbc_btnNewButton_7 = new GridBagConstraints();
		gbc_btnNewButton_7.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_7.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_7.gridx = 3;
		gbc_btnNewButton_7.gridy = 4;
		contentPane.add(btnNewButton_7, gbc_btnNewButton_7);
		btnNewButton_7.addActionListener(listener);
		
		JButton btnNewButton_2 = new JButton("^");
		GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
		gbc_btnNewButton_2.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_2.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_2.gridx = 0;
		gbc_btnNewButton_2.gridy = 5;
		contentPane.add(btnNewButton_2, gbc_btnNewButton_2);
		btnNewButton_2.addActionListener(listener);
		
		JButton button_10 = new JButton("%");
		GridBagConstraints gbc_button_10 = new GridBagConstraints();
		gbc_button_10.fill = GridBagConstraints.BOTH;
		gbc_button_10.insets = new Insets(0, 0, 5, 5);
		gbc_button_10.gridx = 1;
		gbc_button_10.gridy = 5;
		contentPane.add(button_10, gbc_button_10);
		button_10.addActionListener(listener);
		
		JButton btnNewButton_8 = new JButton("v");
		GridBagConstraints gbc_btnNewButton_8 = new GridBagConstraints();
		gbc_btnNewButton_8.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_8.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_8.gridx = 2;
		gbc_btnNewButton_8.gridy = 5;
		contentPane.add(btnNewButton_8, gbc_btnNewButton_8);
		btnNewButton_8.addActionListener(listener);
		
		JButton button_11 = new JButton("!");
		GridBagConstraints gbc_button_11 = new GridBagConstraints();
		gbc_button_11.fill = GridBagConstraints.BOTH;
		gbc_button_11.insets = new Insets(0, 0, 5, 0);
		gbc_button_11.gridx = 3;
		gbc_button_11.gridy = 5;
		contentPane.add(button_11, gbc_button_11);
		button_11.addActionListener(listener);
		
		JButton btnNewButton_9 = new JButton("C");
		GridBagConstraints gbc_btnNewButton_9 = new GridBagConstraints();
		gbc_btnNewButton_9.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_9.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton_9.gridx = 0;
		gbc_btnNewButton_9.gridy = 6;
		contentPane.add(btnNewButton_9, gbc_btnNewButton_9);
		btnNewButton_9.addActionListener(listener);
		
		JLabel label_3 = new JLabel("");
		GridBagConstraints gbc_label_3 = new GridBagConstraints();
		gbc_label_3.fill = GridBagConstraints.BOTH;
		gbc_label_3.insets = new Insets(0, 0, 0, 5);
		gbc_label_3.gridx = 1;
		gbc_label_3.gridy = 6;
		contentPane.add(label_3, gbc_label_3);
		
		JButton btnNewButton_3 = new JButton("=");
		GridBagConstraints gbc_btnNewButton_3 = new GridBagConstraints();
		gbc_btnNewButton_3.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_3.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton_3.gridx = 2;
		gbc_btnNewButton_3.gridy = 6;
		contentPane.add(btnNewButton_3, gbc_btnNewButton_3);
		btnNewButton_3.addActionListener(listener);
		
		JLabel label_4 = new JLabel("");
		GridBagConstraints gbc_label_4 = new GridBagConstraints();
		gbc_label_4.fill = GridBagConstraints.BOTH;
		gbc_label_4.gridx = 3;
		gbc_label_4.gridy = 6;
		contentPane.add(label_4, gbc_label_4);
		
	}
	
	private class MyActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String co = ((JButton)e.getSource()).getText();
			switch(co){
			case "C":
				textField.setText("");
				break;
			case "=":
				textField.setText(textField.getText()+"=");
				ONP rownanie = new ONP();
				String wyrazenieONP=null;
				try {
					wyrazenieONP = rownanie.tworzONP(textField.getText());
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				Kalkulator calc = new Kalkulator(wyrazenieONP);
				Double wynik=0.0;
				try {
					wynik = calc.oblicz();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				if(wynik.toString().equals("Infinity")) textField.setText("Dzielenie przez 0 blad");
				else textField.setText(wynik.toString());
				break;
			default:
				textField.setText(textField.getText()+co);
				break;
			}
			
		}
		
		
	}
}
