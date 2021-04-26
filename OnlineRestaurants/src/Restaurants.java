

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.JScrollBar;
import javax.swing.JFormattedTextField;
import javax.swing.JList;
import javax.swing.JSlider;
import javax.swing.JProgressBar;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;

public class Restaurants {

	private static String action="";
	private static int num1=0;
	private static int num2=0;	
	private static float results=0;
	private JFrame frame;
	private JTextField jtxtBurger;
	private JTextField jtxtBurgerMeal;
	private JTextField jtxtCheeseBurger;
	private JTextField jtxtBur;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField jtxtQty;
	private JTextField jtxtConvert;
	private JTextField jtxtchi;

	double i[]=new double[5];
	
	double US_Dollars=70.0;
	protected JLabel jlblConvert;
	private JTextField jtxtConversion;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Restaurants window = new Restaurants();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Restaurants() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0,0, 1368, 689);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel.setBounds(58, 77, 468, 276);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblCheeseBurger = new JLabel("Cheese Burger");
		lblCheeseBurger.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblCheeseBurger.setBounds(25, 114, 171, 29);
		panel.add(lblCheeseBurger);
		
		
		jtxtCheeseBurger = new JTextField();
		jtxtCheeseBurger.setHorizontalAlignment(SwingConstants.RIGHT);
		jtxtCheeseBurger.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jtxtCheeseBurger.setColumns(10);
		jtxtCheeseBurger.setBounds(282, 114, 148, 29);
		panel.add(jtxtCheeseBurger);
		
		JPanel panel_6 = new JPanel();
		panel_6.setLayout(null);
		panel_6.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_6.setBounds(0, 0, 468, 276);
		panel.add(panel_6);
		
		JLabel lblChickenBurger = new JLabel("Chicken Burger");
		lblChickenBurger.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblChickenBurger.setBounds(25, 34, 179, 29);
		panel_6.add(lblChickenBurger);
		
		JLabel label_1 = new JLabel("");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		label_1.setBounds(10, 74, 223, 29);
		panel_6.add(label_1);
		
		JLabel label_2 = new JLabel("Cheese Burger");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 24));
		label_2.setBounds(25, 114, 171, 29);
		panel_6.add(label_2);
		
		jtxtBur = new JTextField();
		jtxtBur.setHorizontalAlignment(SwingConstants.RIGHT);
		jtxtBur.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jtxtBur.setColumns(10);
		jtxtBur.setBounds(282, 74, 148, 29);
		panel_6.add(jtxtBur);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 24));
		textField_4.setColumns(10);
		textField_4.setBounds(282, 74, 148, 29);
		panel_6.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 24));
		textField_5.setColumns(10);
		textField_5.setBounds(282, 114, 148, 29);
		panel_6.add(textField_5);
		
		JLabel lblNewLabel_1 = new JLabel("Chicken Burger");
		lblNewLabel_1.setBounds(25, 34, 179, 29);
		panel_6.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		
		JLabel lblDrink = new JLabel("Drink");
		lblDrink.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblDrink.setBounds(25, 154, 95, 29);
		panel_6.add(lblDrink);
		
		JLabel lblQuantity = new JLabel("Quantity");
		lblQuantity.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblQuantity.setBounds(282, 154, 171, 29);
		panel_6.add(lblQuantity);
		
		JCheckBox jCTax = new JCheckBox("Tax");
		jCTax.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 24));
		jCTax.setBounds(278, 228, 70, 29);
		panel_6.add(jCTax);
		
		jtxtQty = new JTextField();
		jtxtQty.setHorizontalAlignment(SwingConstants.RIGHT);
		jtxtQty.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jtxtQty.setColumns(10);
		jtxtQty.setBounds(282, 192, 148, 29);
		panel_6.add(jtxtQty);
		
		JComboBox jComboDrink = new JComboBox();
		jComboDrink.setFont(new Font("Tahoma", Font.PLAIN, 21));
		jComboDrink.setModel(new DefaultComboBoxModel(new String[] {"Select a drink", "Apple Juice", "Tea", "Cola", "Coke", "Coffee", "Ice Tea", "Ice Coffee", "Orange"}));
		jComboDrink.setBounds(25, 194, 171, 27);
		panel_6.add(jComboDrink);
		
		JCheckBox jCDelivery = new JCheckBox("Home Delivery");
		jCDelivery.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 24));
		jCDelivery.setBounds(25, 228, 179, 29);
		panel_6.add(jCDelivery);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(25, 152, 417, 2);
		panel_6.add(separator);
		
		jtxtchi = new JTextField();
		jtxtchi.setHorizontalAlignment(SwingConstants.RIGHT);
		jtxtchi.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jtxtchi.setColumns(10);
		jtxtchi.setBounds(282, 34, 148, 29);
		panel_6.add(jtxtchi);
		
		JLabel lblChickenBurgerMeal = new JLabel("Green-Chilli Burger");
		lblChickenBurgerMeal.setBounds(25, 74, 223, 29);
		panel_6.add(lblChickenBurgerMeal);
		lblChickenBurgerMeal.setFont(new Font("Tahoma", Font.PLAIN, 24));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_1.setBounds(602, 77, 274, 276);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JComboBox jCombo = new JComboBox();
		jCombo.setModel(new DefaultComboBoxModel(new String[] {"Choose One...", "US_Dollars", "", ""}));
		jCombo.setFont(new Font("Tahoma", Font.PLAIN, 21));
		jCombo.setBounds(47, 25, 171, 27);
		panel_1.add(jCombo);
		
		jtxtConvert = new JTextField();
		jtxtConvert.setHorizontalAlignment(SwingConstants.RIGHT);
		jtxtConvert.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jtxtConvert.setColumns(10);
		jtxtConvert.setBounds(48, 82, 171, 49);
		panel_1.add(jtxtConvert);
		
		JLabel jlblConvert = new JLabel("");
		jlblConvert.setHorizontalAlignment(SwingConstants.RIGHT);
		jlblConvert.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jlblConvert.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		jlblConvert.setBounds(38, 158, 201, 29);
		panel_1.add(jlblConvert);
		
		JButton jBtnConvert = new JButton("Convert");
		jBtnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double Indian_Rupee=Double.parseDouble(jtxtConvert.getText());
				if(jCombo.getSelectedItem().equals("US_Dollars")){
					
					String cConvert1=String.format("Rs %.2f",Indian_Rupee*US_Dollars);
					jlblConvert.setText(cConvert1);
					
				}
				
				
				
				
				
			}
		});
		jBtnConvert.setFont(new Font("Tahoma", Font.PLAIN, 22));
		jBtnConvert.setBounds(24, 224, 115, 41);
		panel_1.add(jBtnConvert);
		
		JButton jBtnClose = new JButton("Close");
		jBtnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				jtxtConvert.setText("0");
				jlblConvert.setText(null);
				jCombo.setSelectedItem("Choose One...");
			}
		});
		jBtnClose.setFont(new Font("Tahoma", Font.PLAIN, 22));
		jBtnClose.setBounds(162, 224, 89, 41);
		panel_1.add(jBtnClose);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_2.setBounds(943, 77, 347, 480);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 27, 327, 442);
		panel_2.add(tabbedPane);
		
		JPanel panel_8 = new JPanel();
		tabbedPane.addTab("Calculator", null, panel_8, null);
		panel_8.setLayout(null);
		
		textField_6 = new JTextField();
		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		textField_6.setForeground(Color.GRAY);
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_6.setBounds(22, 22, 277, 54);
		panel_8.add(textField_6);
		textField_6.setColumns(10);
		
		JButton btnC = new JButton("C");
		btnC.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnC.setBounds(101, 100, 69, 54);
		panel_8.add(btnC);
		
		JButton button_1 = new JButton("%");
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		button_1.setBounds(168, 100, 69, 54);
		panel_8.add(button_1);
		
		JButton button_2 = new JButton("+");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			action=	"+";
			num1=Integer.valueOf(textField_6.getText());
			textField_6.setText("");
				
			}
		});
		button_2.setFont(new Font("Tahoma", Font.PLAIN, 24));
		button_2.setBounds(243, 100, 69, 54);
		panel_8.add(button_2);
		
		JButton button_3 = new JButton("7");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str=textField_6.getText() +button_3.getText();
				textField_6.setText(str);
			}
		});
		button_3.setFont(new Font("Tahoma", Font.PLAIN, 24));
		button_3.setBounds(22, 165, 69, 54);
		panel_8.add(button_3);
		
		JButton button_4 = new JButton("4");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str=textField_6.getText() +button_4.getText();
				textField_6.setText(str);
			}
		});
		button_4.setFont(new Font("Tahoma", Font.PLAIN, 24));
		button_4.setBounds(22, 230, 69, 54);
		panel_8.add(button_4);
		
		JButton button_5 = new JButton("1");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str=textField_6.getText() +button_5.getText();
				textField_6.setText(str);
			}
		});
		button_5.setFont(new Font("Tahoma", Font.PLAIN, 24));
		button_5.setBounds(22, 295, 69, 54);
		panel_8.add(button_5);
		
		JButton button_6 = new JButton("0");
		button_6.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent arg0) {
				String str=button_6.getText() +textField_6.getText();
				textField_6.setText(str);
			}
		});
		button_6.setFont(new Font("Tahoma", Font.PLAIN, 24));
		button_6.setBounds(22, 360, 69, 54);
		panel_8.add(button_6);
		
		JButton button_7 = new JButton("-");
		button_7.setFont(new Font("Tahoma", Font.PLAIN, 24));
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				action="-";
				num1=Integer.valueOf(textField_6.getText());
				textField_6.setText("");
			}
		});
		button_7.setBounds(243, 165, 69, 54);
		panel_8.add(button_7);
		
		JButton button_8 = new JButton("8");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str=textField_6.getText() +button_8.getText();
				textField_6.setText(str);
			}
		});
		button_8.setFont(new Font("Tahoma", Font.PLAIN, 24));
		button_8.setBounds(101, 165, 69, 54);
		panel_8.add(button_8);
		
		JButton button_9 = new JButton("9");
		button_9.setHorizontalAlignment(SwingConstants.LEFT);
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str=textField_6.getText() +button_9.getText();
				textField_6.setText(str);
			}
		});
		button_9.setFont(new Font("Tahoma", Font.PLAIN, 24));
		button_9.setBounds(168, 165, 69, 54);
		panel_8.add(button_9);
		
		JButton button_10 = new JButton("5");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str=textField_6.getText() +button_10.getText();
				textField_6.setText(str);
			}
		});
		button_10.setFont(new Font("Tahoma", Font.PLAIN, 24));
		button_10.setBounds(101, 230, 69, 54);
		panel_8.add(button_10);
		
		JButton button_11 = new JButton("6");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str=textField_6.getText() +button_11.getText();
				textField_6.setText(str);
			}
		});
		button_11.setFont(new Font("Tahoma", Font.PLAIN, 24));
		button_11.setBounds(168, 230, 69, 54);
		panel_8.add(button_11);
		
		JButton button_12 = new JButton("2");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str=textField_6.getText() +button_12.getText() ;
				textField_6.setText(str);
			}
		});
		button_12.setFont(new Font("Tahoma", Font.PLAIN, 23));
		button_12.setBounds(101, 295, 69, 54);
		panel_8.add(button_12);
		
		JButton button_13 = new JButton("3");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String str=textField_6.getText() +button_13.getText();
				textField_6.setText(str);
			}
		});
		button_13.setFont(new Font("Tahoma", Font.PLAIN, 24));
		button_13.setBounds(168, 295, 69, 54);
		panel_8.add(button_13);
		
		JButton button_14 = new JButton(".");
		button_14.setFont(new Font("Tahoma", Font.PLAIN, 26));
		button_14.setBounds(101, 360, 69, 54);
		panel_8.add(button_14);
		
		JButton button_15 = new JButton("+-");
		button_15.setFont(new Font("Tahoma", Font.PLAIN, 24));
		button_15.setBounds(168, 360, 69, 54);
		panel_8.add(button_15);
		
		JButton button_16 = new JButton("*");
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			action="*";
			num1=Integer.valueOf(textField_6.getText());
			textField_6.setText("");
			}
		});
		button_16.setFont(new Font("Tahoma", Font.PLAIN, 24));
		button_16.setBounds(243, 230, 69, 54);
		panel_8.add(button_16);
		
		JButton button_17 = new JButton("/");
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				action="/";
				num1=Integer.valueOf(textField_6.getText());
				textField_6.setText("");
			}
		});
		button_17.setFont(new Font("Tahoma", Font.PLAIN, 24));
		button_17.setBounds(243, 295, 69, 54);
		panel_8.add(button_17);
		
		JButton button_18 = new JButton("=");
		button_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num2=Integer.valueOf(textField_6.getText());
				
				if("+".equals(action)){
					results=(float)(num1+num2);
				}
				else if("-".equals(action)){
					results=(float)(num1-num2);}
				if("*".equals(action)){
					results=(float)(num1*num2);
				}
				if("/".equals(action)){
					results=(float)(num1/num2);	
			
			}
			textField_6.setText(String.valueOf(action));	
			}}
		);
		button_18.setFont(new Font("Tahoma", Font.PLAIN, 24));
		button_18.setBounds(243, 360, 69, 54);
		panel_8.add(button_18);
		
		JPanel panel_7 = new JPanel();
		tabbedPane.addTab("Receipt", null, panel_7, null);
		panel_7.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(10, 11, 302, 30);
		panel_7.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(43, 78, 46, -23);
		panel_7.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(10, 52, 302, 30);
		panel_7.add(lblNewLabel_4);
		
		JLabel jlbl3 = new JLabel("");
		jlbl3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		jlbl3.setBounds(10, 93, 302, 30);
		panel_7.add(jlbl3);
		
		JLabel jlbl4 = new JLabel("");
		jlbl4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		jlbl4.setBounds(10, 134, 302, 30);
		panel_7.add(jlbl4);
		
		JLabel label_7 = new JLabel("");
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_7.setBounds(10, 175, 302, 30);
		panel_7.add(label_7);
		
		JLabel label = new JLabel("");
		label.setFont(new Font("Tahoma", Font.BOLD, 16));
		label.setBounds(10, 216, 302, 30);
		panel_7.add(label);
		
		JLabel label_6 = new JLabel("");
		label_6.setFont(new Font("Tahoma", Font.ITALIC, 17));
		label_6.setBounds(10, 373, 302, 30);
		panel_7.add(label_6);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_3.setBounds(58, 379, 468, 178);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel label_3 = new JLabel("Cost of Drinks");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 24));
		label_3.setBounds(24, 31, 179, 29);
		panel_3.add(label_3);
		
		JLabel label_4 = new JLabel("Cost of Meal");
		label_4.setHorizontalAlignment(SwingConstants.LEFT);
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 24));
		label_4.setBounds(24, 71, 171, 29);
		panel_3.add(label_4);
		
		JLabel label_5 = new JLabel("Cost of Delivery");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 24));
		label_5.setBounds(24, 112, 171, 29);
		panel_3.add(label_5);
		
		JLabel jlblCostOfDrink = new JLabel("");
		jlblCostOfDrink.setHorizontalAlignment(SwingConstants.RIGHT);
		jlblCostOfDrink.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jlblCostOfDrink.setBounds(213, 31, 201, 29);
		jlblCostOfDrink.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_3.add(jlblCostOfDrink);
		
		JLabel jlblCostOfMeal = new JLabel("");
		jlblCostOfMeal.setHorizontalAlignment(SwingConstants.RIGHT);
		jlblCostOfMeal.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jlblCostOfMeal.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		jlblCostOfMeal.setBounds(213, 71, 201, 29);
		panel_3.add(jlblCostOfMeal);
		
		JLabel jlblCostOfDelivery = new JLabel("");
		jlblCostOfDelivery.setHorizontalAlignment(SwingConstants.RIGHT);
		jlblCostOfDelivery.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jlblCostOfDelivery.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		jlblCostOfDelivery.setBounds(213, 112, 201, 29);
		panel_3.add(jlblCostOfDelivery);

		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_4.setBounds(58, 569, 1232, 70);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		
		
		JButton jBtnTotal = new JButton("Total");
		
		jBtnTotal.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jBtnTotal.setBounds(349, 21, 89, 38);
		panel_4.add(jBtnTotal);
		
		JButton jBtnReceipt = new JButton("Receipt");
	
		jBtnReceipt.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jBtnReceipt.setBounds(542, 21, 114, 38);
		panel_4.add(jBtnReceipt);
		
		JButton jBtnReset = new JButton("Reset");
		
		jBtnReset.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jBtnReset.setBounds(744, 21, 105, 38);
		panel_4.add(jBtnReset);
		
		JButton jBtnExit = new JButton("Exit");
		jBtnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		jBtnExit.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jBtnExit.setBounds(927, 21, 89, 38);
		panel_4.add(jBtnExit);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 8));
		panel_5.setBounds(602, 379, 274, 178);
		frame.getContentPane().add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lblTax = new JLabel("Tax");
		lblTax.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblTax.setBounds(10, 22, 113, 29);
		panel_5.add(lblTax);
		
		JLabel lblSubTotal = new JLabel("Sub Total");
		lblSubTotal.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblSubTotal.setBounds(10, 62, 105, 29);
		panel_5.add(lblSubTotal);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblTotal.setBounds(10, 102, 95, 29);
		panel_5.add(lblTotal);
		
		JLabel jlblTotal = new JLabel("");
		jlblTotal.setHorizontalAlignment(SwingConstants.RIGHT);
		jlblTotal.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jlblTotal.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		jlblTotal.setBounds(133, 103, 131, 29);
		panel_5.add(jlblTotal);
		
		JLabel jlblSubTotal = new JLabel("");
		jlblSubTotal.setHorizontalAlignment(SwingConstants.RIGHT);
		jlblSubTotal.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jlblSubTotal.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		jlblSubTotal.setBounds(133, 62, 131, 29);
		panel_5.add(jlblSubTotal);
		
		JLabel jlblTax = new JLabel("");
		jlblTax.setHorizontalAlignment(SwingConstants.RIGHT);
		jlblTax.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jlblTax.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		jlblTax.setBounds(133, 22, 131, 29);
		panel_5.add(jlblTax);
		
		JLabel lblNewLabel = new JLabel("Restaurant Billing Application");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 54));
		lblNewLabel.setBounds(278, 11, 870, 55);
		frame.getContentPane().add(lblNewLabel);
		
		
		
		
		
		jBtnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				jlblCostOfDelivery.setText(null);
				jlblCostOfDrink.setText(null);
				jlblCostOfMeal.setText(null);
				jlblSubTotal.setText(null);
				jlblConvert.setText(null);
				jlblTax.setText(null);
				jlblTotal.setText(null);
				jtxtBur.setText(null);
				jtxtCheeseBurger.setText(null);
				jtxtQty.setText(null);
				jtxtConvert.setText(null);
				jCombo.setSelectedItem("Choose One...");
				jComboDrink.setSelectedItem("Select a drink");
				jtxtchi.setText(null);
				
				
			
				
				
				
				
			}
		});
		jBtnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			double ChickenBurger=Double.parseDouble(jtxtchi.getText());
			double iChickenBurger=70.34;
			double Burger;
			Burger=(ChickenBurger*iChickenBurger);
			String pMeal=String.format("%.2f",Burger);
			jlblCostOfMeal.setText(pMeal);
			
			
			double GreenChilliBurger=Double.parseDouble(jtxtBur.getText());
			double iChickenBurgerMeal=60.45;
			double GreenChilli;
			 GreenChilli=(GreenChilliBurger*iChickenBurgerMeal);
			String cbMeal=String.format("%.2f", GreenChilli + Burger);
			jlblCostOfMeal.setText(cbMeal);
			
			
			double CheeseBurger=Double.parseDouble(jtxtCheeseBurger.getText());
			double iCheeseBurger=65.67;
			double CheeseBurgerMeal;
			CheeseBurgerMeal=(CheeseBurger*iCheeseBurger);
			String cheese=String.format("%.2f",CheeseBurgerMeal +  GreenChilli + Burger);
			jlblCostOfMeal.setText(cheese);
			
			double iDelivery =95.0;
		if(jCDelivery.isSelected()){
				
				String pDelivery=String.format("%.2f",iDelivery);
				jlblCostOfDelivery.setText(pDelivery);
			}
		else{
			jlblCostOfDelivery.setText("0");
			
		}
				double Drinks=Double.parseDouble(jtxtQty.getText());
		        double Apple_Juice=55.5* Drinks;
		        double Tea=25.0 * Drinks;
		        double Cola=40.0 * Drinks;
		        double Coffee=45.0 * Drinks;
		        double Coke=40.0 * Drinks;
		        double Orange=70.0 * Drinks;
		        double Ice_Coffee=65.0 * Drinks;
		        double Ice_Tea=30.0 * Drinks;
		        
		       if(jComboDrink.getSelectedItem().equals("Apple Juice")){
		    	   
		    	   String cApple_Juice=String.format("%.2f",Apple_Juice);
		    	 jlblCostOfDrink.setText(cApple_Juice);  
		       }
		       
		       if(jComboDrink.getSelectedItem().equals("Tea")){
		    	   
		    	   String cTea=String.format("%.2f",Tea);
		    	 jlblCostOfDrink.setText(cTea);  
		       }   
		       if(jComboDrink.getSelectedItem().equals("Cola")){
		    	   
		    	   String cCola=String.format("%.2f",Cola);
		    	 jlblCostOfDrink.setText(cCola);  
		       }   
		       if(jComboDrink.getSelectedItem().equals("Coffee")){
		    	   
		    	   String cCoffee=String.format("%.2f",	Coffee);
		    	 jlblCostOfDrink.setText(cCoffee);  
		       }   
		       if(jComboDrink.getSelectedItem().equals("Coke")){
		    	   
		    	   String cCoke=String.format("%.2f",Coke);
		    	 jlblCostOfDrink.setText(cCoke);  
		       }   
		       if(jComboDrink.getSelectedItem().equals("Orange")){
		    	   
		    	   String cOrange=String.format("%.2f",Orange);
		    	 jlblCostOfDrink.setText(cOrange);  
		       }   
		       if(jComboDrink.getSelectedItem().equals("Ice Coffee")){
		    	   
		    	   String cIce_Coffee=String.format("%.2f",Ice_Coffee);
		    	 jlblCostOfDrink.setText(cIce_Coffee);  
		       }   
		       if(jComboDrink.getSelectedItem().equals("Ice Tea")){
		    	   
		    	   String cIce_Tea=String.format("%.2f",Ice_Tea);
		    	 jlblCostOfDrink.setText(cIce_Tea);  
		       }
              if(jComboDrink.getSelectedItem().equals("Select a drink")){
		    	   
		    	   
		    	 jlblCostOfDrink.setText("0");  
		       }
			
			double cTotal1=Double.parseDouble(jlblCostOfDrink.getText());
			double cTotal2=Double.parseDouble(jlblCostOfMeal.getText());
			double cTotal3=Double.parseDouble(jlblCostOfDelivery.getText());
			double AllTotal= (cTotal1+cTotal2+cTotal3)/100;
			
			if(jCTax.isSelected()){
				
				String iTotal=String.format("%.2f",AllTotal);
				jlblTax.setText(iTotal);;
			} 
              double cTotal4=Double.parseDouble(jlblTax.getText());
              double subTotal=(cTotal1+cTotal2+cTotal3);
              
              String isubTotal=String.format("%.2f",subTotal);
              jlblSubTotal.setText(isubTotal);
              double allTotal=cTotal1+cTotal2+cTotal3+cTotal4;
              String iallTotal=String.format("%.2f",allTotal);
              jlblTotal.setText(iallTotal);
              
              
              String iTaxTotal=String.format("%.2f",cTotal4);
            jlblTax.setText(iTaxTotal);;  
            			
			
			}
		});
		
		jBtnReceipt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double Qty1=Double.parseDouble(jtxtchi.getText());
				double Qty2=Double.parseDouble(jtxtBur.getText());
				double Qty3=Double.parseDouble(jtxtCheeseBurger.getText());
				double Qty4=Double.parseDouble(jlblTax.getText());
				double Qty5=Double.parseDouble(jlblTotal.getText());
				
				
				   
				
				
				
				lblNewLabel_2.setText("\n  Restaurant Billing System   \n");
			   lblNewLabel_4.setText("\nChicken Burger       :"+Qty1);
			      jlbl3.setText("\nChicken Burger Meal       :"+Qty2); 
			      jlbl4.setText("\nCheese Burger       :"+Qty3);
			    label_7.setText("\nTax :       "+Qty4);
			    label.setText("\nTotal :       "+Qty5);
			    label_6.setText("Thank You for Visiting.....");
			    
//			
				
			}
		});
		
	}
}
