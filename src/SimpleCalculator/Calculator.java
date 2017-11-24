package SimpleCalculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.ComponentOrientation;
import java.awt.Font;

public class Calculator extends JFrame {

	private JPanel contentPane;
    StringBuilder firstArg = new StringBuilder();
    boolean firstArgIsDone = false;
    StringBuilder secondArg = new StringBuilder();
    String operation = "";
    Integer result = 0;
    JLabel jLabelDisplay = null;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setVisible(true);					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void clickbutton(StringBuilder s)
	{
		if(firstArgIsDone == false)
		{
			firstArg.append(s);			
			jLabelDisplay.setText(firstArg.toString());		    
		}
		else
		{
			secondArg.append(s);
			jLabelDisplay.setText(secondArg.toString());
		}
		
		
	};

	/**
	 * Create the frame.
	 */
	public Calculator() {
		setResizable(false);
		
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				StringBuilder tmp = new StringBuilder();
				tmp.append(1);
				clickbutton(tmp);
			}
		});
		btnNewButton.setBounds(20, 125, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("4");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StringBuilder tmp = new StringBuilder();
				tmp.append(4);
				clickbutton(tmp);
			}
		});
		btnNewButton_1.setBounds(20, 160, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("7");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StringBuilder tmp = new StringBuilder();
				tmp.append(7);
				clickbutton(tmp);
			}
		});
		btnNewButton_2.setBounds(20, 194, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("2");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StringBuilder tmp = new StringBuilder();
				tmp.append(2);
				clickbutton(tmp);
			}
			
		});
		btnNewButton_3.setBounds(119, 125, 89, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("5");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StringBuilder tmp = new StringBuilder();
				tmp.append(5);
				clickbutton(tmp);
			}
		});
		btnNewButton_4.setBounds(119, 160, 89, 23);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("8");
		btnNewButton_5.setBounds(119, 194, 89, 23);
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StringBuilder tmp = new StringBuilder();
				tmp.append(8);
				clickbutton(tmp);
			}
		});
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("3");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StringBuilder tmp = new StringBuilder();
				tmp.append(3);
				clickbutton(tmp);
			}
		});
		btnNewButton_6.setBounds(218, 125, 89, 23);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("6");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StringBuilder tmp = new StringBuilder();
				tmp.append(6);
				clickbutton(tmp);
			}
		});
		btnNewButton_7.setBounds(218, 160, 89, 23);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("9");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StringBuilder tmp = new StringBuilder();
				tmp.append(9);
				clickbutton(tmp);
			}
		});
		btnNewButton_8.setBounds(218, 194, 89, 23);
		contentPane.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("+");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				operation = "add";
				if(firstArgIsDone == false)
				{
					jLabelDisplay.setText("");
					firstArgIsDone = true;
				}
				if(secondArg.length() > 0)
				{
					 if(result != 0)
					 {
						 result = Integer.parseInt(firstArg.toString()) + Integer.parseInt(secondArg.toString());
						 jLabelDisplay.setText(result.toString());
						 firstArg.setLength(0);
						 firstArg.append(result.toString());
						 secondArg.setLength(0);
					 }
					 else
					 {
					  result = Integer.parseInt(firstArg.toString()) + Integer.parseInt(secondArg.toString());
				      jLabelDisplay.setText(result.toString());		
				      firstArg.setLength(0);
				      firstArg.append(result.toString());
				      secondArg.setLength(0);
					 }
					  
				}
			}
		});
		btnNewButton_9.setBounds(335, 11, 89, 23);
		contentPane.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("-");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operation = "substract";
				if(firstArgIsDone == false)
				{
					jLabelDisplay.setText("");
					firstArgIsDone = true;
				}
			}
		});
		btnNewButton_10.setBounds(335, 45, 89, 23);
		contentPane.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("*");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operation = "multiply";
				if(firstArgIsDone == false)
				{
					jLabelDisplay.setText("");
					firstArgIsDone = true;
				}
			}			
		});
		btnNewButton_11.setBounds(335, 79, 89, 23);
		contentPane.add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("/");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operation = "divide";
				if(firstArgIsDone == false)
				{
					jLabelDisplay.setText("");
					firstArgIsDone = true;
				}
			}
		});
		btnNewButton_12.setBounds(335, 113, 89, 23);
		contentPane.add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("=");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(secondArg.length() == 0)
					return;
				jLabelDisplay.setText("");
				if(operation == "add")
				    result = Integer.parseInt(firstArg.toString()) + Integer.parseInt(secondArg.toString());
				if(operation == "substract")
					result = Integer.parseInt(firstArg.toString()) - Integer.parseInt(secondArg.toString());
				if(operation == "multiply")
					result = Integer.parseInt(firstArg.toString()) * Integer.parseInt(secondArg.toString());
				if(operation == "divide")
					result = Integer.parseInt(firstArg.toString()) / Integer.parseInt(secondArg.toString());
			    String tmp = result.toString();
			    firstArg.setLength(0);
			    secondArg.setLength(0);
			    firstArg.append(tmp);
				jLabelDisplay.setText(result.toString());
				operation = "";
			}
		});
		btnNewButton_13.setBounds(335, 194, 89, 23);
		contentPane.add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("Reset");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstArgIsDone = false;
				firstArg.setLength(0);
				secondArg.setLength(0);
				jLabelDisplay.setText("");
			}
		});
		btnNewButton_14.setBounds(335, 228, 89, 23);
		contentPane.add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("0");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StringBuilder tmp = new StringBuilder();
				tmp.append(0);
				clickbutton(tmp);
			}
		});
		btnNewButton_15.setBounds(119, 228, 89, 23);
		contentPane.add(btnNewButton_15);
		
	    jLabelDisplay = new JLabel("", SwingConstants.LEFT);
	    jLabelDisplay.setFont(new Font("Tahoma", Font.PLAIN, 18));
	    jLabelDisplay.setHorizontalAlignment(SwingConstants.LEFT);
		jLabelDisplay.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		jLabelDisplay.setBounds(20, 11, 287, 90);
		contentPane.add(jLabelDisplay);
	}
}
