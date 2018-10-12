package bankingTool;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class BankingGui extends JFrame {

	private JPanel contentPane;
	
	int accountTotal;
	private JTextField accountTotalTextBox;
	private JTextField AnAmountOfMoney;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BankingGui frame = new BankingGui();
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
	public BankingGui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton depositBtn = new JButton("Deposit");
		depositBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				depositMoney(Integer.parseInt(AnAmountOfMoney.getText()));
			}
		});

		depositBtn.setBounds(163, 162, 89, 23);
		contentPane.add(depositBtn);
		
		accountTotalTextBox = new JTextField();
		accountTotalTextBox.setBounds(163, 55, 86, 20);
		contentPane.add(accountTotalTextBox);
		accountTotalTextBox.setColumns(10);
		
		JLabel lblCurrentBalance = new JLabel("Current Balance");
		lblCurrentBalance.setBounds(163, 32, 89, 14);
		contentPane.add(lblCurrentBalance);
		
		AnAmountOfMoney = new JTextField();
		AnAmountOfMoney.setBounds(163, 135, 86, 20);
		contentPane.add(AnAmountOfMoney);
		AnAmountOfMoney.setColumns(10);
		
		JLabel lblAmountTo = new JLabel("Amount to ...");
		lblAmountTo.setBounds(174, 101, 89, 23);
		contentPane.add(lblAmountTo);
		
		JButton withdrawMoneyBtn = new JButton("Withdraw");
		withdrawMoneyBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		withdrawMoneyBtn.setBounds(163, 196, 89, 23);
		contentPane.add(withdrawMoneyBtn);
		
		JButton emptyAccountBtn = new JButton("Empty Account");
		emptyAccountBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				emptyAccount();
			}
		});
		emptyAccountBtn.setBounds(143, 227, 135, 23);
		contentPane.add(emptyAccountBtn);
	}

	public void depositMoney(int amountOfMoney) {
		accountTotal = accountTotal + amountOfMoney; 		
	}
	
	public void setAccountTotal(int setAccountTotal) {
		accountTotal = setAccountTotal;		
	}

	public int getAccountTotal() {
		return accountTotal;
	}

	public void withdrawMoney(int amountOfMoney) {
		accountTotal = accountTotal - amountOfMoney;		
	}

	public void emptyAccount() {
		accountTotal = 0;		
	}
}
