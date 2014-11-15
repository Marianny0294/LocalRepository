package GraphicInterface;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SpinnerDateModel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

import EmploymentAgency.Person;

public class PersonRegister extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private final JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	// private Dimension dim;
	private final JTable table;
	private final DefaultTableModel tableModel;
	private Object[] fila;
	private int filasel, pos1;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private final JPanel panel;
	private JComboBox comboBox_1;
	private ArrayList<Person> persons;
	private final JPanel panel_4;
	private final JPanel panel_5;

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public PersonRegister() {
		setBounds(7, 55, 1290, 600);
		setResizable(false);
		setModal(true);
		setLocationRelativeTo(null);
		// dim = super.,getToolkit().getScreenSize();
		// super.setSize(dim);
		// setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Universitary studies:",
				TitledBorder.LEFT, TitledBorder.TOP, null, null));
		panel.setBounds(10, 252, 349, 231);
		contentPanel.add(panel);
		panel.setVisible(false);
		panel.setLayout(null);

		panel_4 = new JPanel();
		panel.add(panel_4);
		panel_4.setBorder(new TitledBorder(null, "Technical studies:",
				TitledBorder.LEFT, TitledBorder.TOP, null, null));
		panel_4.setBounds(10, 252, 349, 231);
		contentPanel.add(panel_4);
		panel_4.setVisible(false);
		panel_4.setLayout(null);

		JLabel label_4 = new JLabel("Certified:");
		label_4.setHorizontalAlignment(SwingConstants.TRAILING);
		label_4.setBounds(10, 27, 107, 14);
		panel_4.add(label_4);

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(
				new String[] {
						"<Select>",
						"Human resource management",
						"Surveying and Geomatics for real estate development",
						"Atmosphere of premises: Creating and composing styles environments",
						"Basic Statistical Analysis",
						"Culinary arts",
						"Financial audit",
						"Library and information science",
						"Chocolate and confectionery",
						"Configuring and Deploying Windows Server 2008",
						"Financial accounting",
						"Address and business management",
						"Design and development of business models",
						"Strategic Finance:",
						"Optimization of resources and investment projection",
						"Administrative management for executive assistants",
						"Risk management of information security",
						"Strategic management of family businesses",
						"Integrated project management (DIGIP) in real estate and construction in DR",
						"Management and strategic direction of human capital",
						"Corporate Taxes: New Trends and tax regulations",
						"Corporate Intelligence", "Intermediate English",
						"Measurement, redesign and process improvements",
						"Supply chain management",
						"Techniques of computer assisted audit (TAAC'S)" }));
		comboBox.setBounds(127, 24, 219, 20);
		panel_4.add(comboBox);

		JLabel label_1 = new JLabel("Specialized \r\ncourses:");
		label_1.setHorizontalAlignment(SwingConstants.TRAILING);
		label_1.setBounds(10, 48, 107, 22);
		panel_4.add(label_1);

		JComboBox comboBox_5 = new JComboBox();
		comboBox_5
				.setModel(new DefaultComboBoxModel(
						new String[] {
								"<Select>",
								"Knowing the stock market DR",
								"Cost control for food and beverage operations",
								"IT network essential",
								"Effective management of social networks",
								"Sales Forecast",
								"Specialized techniques in preparation of meat: Cortes, cooking, completion and presentation" }));
		comboBox_5.setBounds(127, 49, 219, 20);
		panel_4.add(comboBox_5);

		JLabel label_2 = new JLabel("Technical college:");
		label_2.setHorizontalAlignment(SwingConstants.TRAILING);
		label_2.setBounds(10, 73, 107, 22);
		panel_4.add(label_2);

		JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setModel(new DefaultComboBoxModel(new String[] { "<Select>",
				"Small and medium enterprises", "Advertising",
				"Market aspects", "Graphic design",
				"Programming information systems", "Computerized accounting",
				"Financial and tax accounting" }));
		comboBox_6.setBounds(127, 74, 219, 20);
		panel_4.add(comboBox_6);

		JLabel label_3 = new JLabel("Job:");
		label_3.setHorizontalAlignment(SwingConstants.TRAILING);
		label_3.setBounds(10, 98, 107, 22);
		panel_4.add(label_3);

		JComboBox comboBox_7 = new JComboBox();
		comboBox_7.setModel(new DefaultComboBoxModel(new String[] { "<Select>",
				"Accountant", "Actor / Actress", "Air hostess",
				"Archaeologist", "Astronaut", "Baker", "Biologist",
				"Bricklayer", "Bus driver", "Businessman", "Businesswoman",
				"Butcher", "Caretaker", "Carpenter", "Cashier", "Cleaner",
				"Clown", "Cobbler", "Consultant", "Cook", "Counselor", "Chef",
				"Chemist", "Dancer", "Decorator", "Dentist", "Designer",
				"Dressmaker", "Dustman", "Economist", "Electrician", "Farmer",
				"Fireman", "FIsherman", "Florist", "Fruiterer",
				"Garbage collector", "Gardener", "Hairdresser", "Housewife",
				"Hunter", "Jeweller", "Judge", "Lawyer", "Librarian",
				"Life guard", "Lorry driver", "Mailman", "Mechanic",
				"Meteorologist", "Miner", "Model", "Monk", "Nanny", "Nun",
				"Nurse", "Nursemaid", "Office worker", "Painter",
				"Pastry cook", "Pharmacist", "Photographer", "Physicist",
				"Plumber", "Policeman / Policewoman", "Politician", "Porter",
				"Postman", "Priest", "Professor", "Programmer", "Psychiatrist",
				"Psychologist", "Receptionist", "Researcher", "Sailor",
				"Salesman", "Scientist", "Secretary", "Secretary", "Shoemaker",
				"Shop assistant", " Singer", "Social worker", "Surgeon",
				"Taxi driver", "Teacher", "Telephone operator", "Travel agent",
				"Truck driver", "Vet", "Veterinarian", "Waiter", "Waitress",
				"Window cleaner", "Writer" }));
		comboBox_7.setBounds(127, 99, 219, 20);
		panel_4.add(comboBox_7);

		panel_5 = new JPanel();
		panel_5.setBorder(new TitledBorder(null, "Other studies:",
				TitledBorder.LEFT, TitledBorder.TOP, null, null));
		panel_4.setBounds(10, 252, 349, 231);
		contentPanel.add(panel_5);
		panel_5.setVisible(false);
		panel_5.setLayout(null);
		{
			JLabel label = new JLabel("Certified:");
			label.setHorizontalAlignment(SwingConstants.TRAILING);
			label.setBounds(10, 25, 107, 14);
			panel_5.add(label);
		}
		{
			JComboBox comboBox_8 = new JComboBox();
			comboBox_8
					.setModel(new DefaultComboBoxModel(
							new String[] {
									"<Select>",
									"Human resource management",
									"Surveying and Geomatics for real estate development",
									"Atmosphere of premises: Creating and composing styles environments",
									"Basic Statistical Analysis",
									"Culinary arts",
									"Financial audit",
									"Library and information science",
									"Chocolate and confectionery",
									"Configuring and Deploying Windows Server 2008",
									"Financial accounting",
									"Address and business management",
									"Design and development of business models",
									"Strategic Finance:",
									"Optimization of resources and investment projection",
									"Administrative management for executive assistants",
									"Risk management of information security",
									"Strategic management of family businesses",
									"Integrated project management (DIGIP) in real estate and construction in DR",
									"Management and strategic direction of human capital",
									"Corporate Taxes: New Trends and tax regulations",
									"Corporate Intelligence",
									"Intermediate English",
									"Measurement, redesign and process improvements",
									"Supply chain management",
									"Techniques of computer assisted audit (TAAC'S)" }));
			comboBox_8.setBounds(127, 22, 219, 20);
			panel_5.add(comboBox_8);
		}
		{
			JLabel label = new JLabel("Specialized \r\ncourses:");
			label.setHorizontalAlignment(SwingConstants.TRAILING);
			label.setBounds(10, 46, 107, 22);
			panel_5.add(label);
		}
		{
			JComboBox comboBox_8 = new JComboBox();
			comboBox_8
					.setModel(new DefaultComboBoxModel(
							new String[] {
									"<Select>",
									"Knowing the stock market DR",
									"Cost control for food and beverage operations",
									"IT network essential",
									"Effective management of social networks",
									"Sales Forecast",
									"Specialized techniques in preparation of meat: Cortes, cooking, completion and presentation" }));
			comboBox_8.setBounds(127, 47, 219, 20);
			panel_5.add(comboBox_8);
		}
		{
			JLabel label = new JLabel("Job:");
			label.setHorizontalAlignment(SwingConstants.TRAILING);
			label.setBounds(10, 72, 107, 22);
			panel_5.add(label);
		}
		{
			JComboBox comboBox_8 = new JComboBox();
			comboBox_8.setModel(new DefaultComboBoxModel(new String[] {
					"<Select>", "Accountant", "Actor / Actress", "Air hostess",
					"Archaeologist", "Astronaut", "Baker", "Biologist",
					"Bricklayer", "Bus driver", "Businessman", "Businesswoman",
					"Butcher", "Caretaker", "Carpenter", "Cashier", "Cleaner",
					"Clown", "Cobbler", "Consultant", "Cook", "Counselor",
					"Chef", "Chemist", "Dancer", "Decorator", "Dentist",
					"Designer", "Dressmaker", "Dustman", "Economist",
					"Electrician", "Farmer", "Fireman", "FIsherman", "Florist",
					"Fruiterer", "Garbage collector", "Gardener",
					"Hairdresser", "Housewife", "Hunter", "Jeweller", "Judge",
					"Lawyer", "Librarian", "Life guard", "Lorry driver",
					"Mailman", "Mechanic", "Meteorologist", "Miner", "Model",
					"Monk", "Nanny", "Nun", "Nurse", "Nursemaid",
					"Office worker", "Painter", "Pastry cook", "Pharmacist",
					"Photographer", "Physicist", "Plumber",
					"Policeman / Policewoman", "Politician", "Porter",
					"Postman", "Priest", "Professor", "Programmer",
					"Psychiatrist", "Psychologist", "Receptionist",
					"Researcher", "Sailor", "Salesman", "Scientist",
					"Secretary", "Secretary", "Shoemaker", "Shop assistant",
					" Singer", "Social worker", "Surgeon", "Taxi driver",
					"Teacher", "Telephone operator", "Travel agent",
					"Truck driver", "Vet", "Veterinarian", "Waiter",
					"Waitress", "Window cleaner", "Writer" }));
			comboBox_8.setBounds(127, 73, 219, 20);
			panel_5.add(comboBox_8);
		}
		{
			JLabel lblPu = new JLabel("Grade:");
			lblPu.setHorizontalAlignment(SwingConstants.TRAILING);
			lblPu.setBounds(10, 26, 107, 14);
			panel.add(lblPu);
		}

		JComboBox comboBox_2 = new JComboBox();
		comboBox_2
				.setModel(new DefaultComboBoxModel(
						new String[] {
								"<Select>",
								"Business adm. mention operations",
								"Business adm. mention finance",
								"Business adm. mention strategy",
								"Business adm. mention creation and development of new business",
								"Business adm. mention human gestion",
								"Business adm. mention international business",
								"Hotel management mention food and drink",
								"Hotel management mention hotel marketing",
								"Architecture",
								"Social communication mention audiovisual production",
								"Social communication mention corporate communication",
								"Law",
								"Design and interior",
								"Ecology and environmental management",
								"Economy",
								"Education",
								"Nursing",
								"Stomatology",
								"Phylosophy",
								"Financial management and auditing",
								"Civil Engineering",
								"Electromechanical Engineering mention mechanical",
								"Electronechanical Engineerin mention electric",
								"Industrial Engineering",
								"System and computer Engineering",
								"Electronic Engineering",
								"Telematic Engineering", "Medicine",
								"Marketing", "Nutrition and dietetics",
								"Psychology", "Physical therapy" }));
		comboBox_2.setBounds(127, 23, 219, 20);
		panel.add(comboBox_2);

		JLabel lblPostgrade = new JLabel("Post-grade:");
		lblPostgrade.setHorizontalAlignment(SwingConstants.TRAILING);
		lblPostgrade.setBounds(10, 51, 107, 14);
		panel.add(lblPostgrade);

		JComboBox comboBox_3 = new JComboBox();
		comboBox_3
				.setModel(new DefaultComboBoxModel(
						new String[] {
								"<Select>",
								"Executive Master in Strategic Human Resources",
								"Master of Strategic Management",
								"MBA in Insurance Programs",
								"LLM in Economic Regulation",
								"Master of Labour Law and Social Security",
								"MSc in Real Estate",
								"Master of Intellectual Property and New Technologies",
								"Master of Law in Corporate Business",
								"Master of International Relations",
								"Master of Public Policy",
								"Master of Business Economics",
								"Executive Master in Supply Chain Management",
								"Architectural Design Master of Interior Architecture Concentration",
								"Architectural Design Master of Architecture mention Tourist Accommodation",
								"Specialization in Applied Mathematics in Education",
								"Specialization in Mathematics Education Basic Level" }));
		comboBox_3.setBounds(127, 48, 219, 20);
		panel.add(comboBox_3);
		{
			JLabel lblCertified = new JLabel("Certified:");
			lblCertified.setHorizontalAlignment(SwingConstants.TRAILING);
			lblCertified.setBounds(10, 79, 107, 14);
			panel.add(lblCertified);
		}
		{
			JComboBox comboBox_4 = new JComboBox();
			comboBox_4
					.setModel(new DefaultComboBoxModel(
							new String[] {
									"<Select>",
									"Human resource management",
									"Surveying and Geomatics for real estate development",
									"Atmosphere of premises: Creating and composing styles environments",
									"Basic Statistical Analysis",
									"Culinary arts",
									"Financial audit",
									"Library and information science",
									"Chocolate and confectionery",
									"Configuring and Deploying Windows Server 2008",
									"Financial accounting",
									"Address and business management",
									"Design and development of business models",
									"Strategic Finance:",
									"Optimization of resources and investment projection",
									"Administrative management for executive assistants",
									"Risk management of information security",
									"Strategic management of family businesses",
									"Integrated project management (DIGIP) in real estate and construction in DR",
									"Management and strategic direction of human capital",
									"Corporate Taxes: New Trends and tax regulations",
									"Corporate Intelligence",
									"Intermediate English",
									"Measurement, redesign and process improvements",
									"Supply chain management",
									"Techniques of computer assisted audit (TAAC'S)" }));
			comboBox_4.setBounds(127, 76, 219, 20);
			panel.add(comboBox_4);
		}
		{
			JLabel lblSpecializedCourses = new JLabel(
					"Specialized \r\ncourses:");
			lblSpecializedCourses
					.setHorizontalAlignment(SwingConstants.TRAILING);
			lblSpecializedCourses.setBounds(10, 102, 107, 22);
			panel.add(lblSpecializedCourses);
		}
		{
			JComboBox comboBox_4 = new JComboBox();
			comboBox_4
					.setModel(new DefaultComboBoxModel(
							new String[] {
									"<Select>",
									"Knowing the stock market DR",
									"Cost control for food and beverage operations",
									"IT network essential",
									"Effective management of social networks",
									"Sales Forecast",
									"Specialized techniques in preparation of meat: Cortes, cooking, completion and presentation" }));
			comboBox_4.setBounds(127, 103, 219, 20);
			panel.add(comboBox_4);
		}
		{
			JLabel lblTechnicalCollege = new JLabel("Technical college:");
			lblTechnicalCollege.setHorizontalAlignment(SwingConstants.TRAILING);
			lblTechnicalCollege.setBounds(10, 127, 107, 22);
			panel.add(lblTechnicalCollege);
		}
		{
			JComboBox comboBox_4 = new JComboBox();
			comboBox_4
					.setModel(new DefaultComboBoxModel(new String[] {
							"<Select>", "Small and medium enterprises",
							"Advertising", "Market aspects", "Graphic design",
							"Programming information systems",
							"Computerized accounting",
							"Financial and tax accounting" }));
			comboBox_4.setBounds(127, 128, 219, 20);
			panel.add(comboBox_4);
		}
		{
			JLabel lblDoctorate = new JLabel("Doctorate:");
			lblDoctorate.setHorizontalAlignment(SwingConstants.TRAILING);
			lblDoctorate.setBounds(10, 155, 107, 22);
			panel.add(lblDoctorate);
		}
		{
			JComboBox comboBox_4 = new JComboBox();
			comboBox_4
					.setModel(new DefaultComboBoxModel(
							new String[] {
									"<Select>",
									"Constitutional Law and Fundamental Rights",
									"Democratic Society, State and Law",
									"Education (and/or in leadership or in pedagogical sciencies)",
									"Business studies",
									"Cooperation and Social Intervention",
									"Educational Psychology and Human Development",
									"Economy", "Sociology",
									"Philosophy for a Global World" }));
			comboBox_4.setBounds(127, 156, 219, 20);
			panel.add(comboBox_4);
		}

		JLabel lblJob = new JLabel("Job:");
		lblJob.setHorizontalAlignment(SwingConstants.TRAILING);
		lblJob.setBounds(10, 181, 107, 22);
		panel.add(lblJob);

		JComboBox comboBox_4_1 = new JComboBox();
		comboBox_4_1.setModel(new DefaultComboBoxModel(new String[] {
				"<Select>", "Accountant", "Actor / Actress", "Air hostess",
				"Archaeologist", "Astronaut", "Baker", "Biologist",
				"Bricklayer", "Bus driver", "Businessman", "Businesswoman",
				"Butcher", "Caretaker", "Carpenter", "Cashier", "Cleaner",
				"Clown", "Cobbler", "Consultant", "Cook", "Counselor", "Chef",
				"Chemist", "Dancer", "Decorator", "Dentist", "Designer",
				"Dressmaker", "Dustman", "Economist", "Electrician", "Farmer",
				"Fireman", "FIsherman", "Florist", "Fruiterer",
				"Garbage collector", "Gardener", "Hairdresser", "Housewife",
				"Hunter", "Jeweller", "Judge", "Lawyer", "Librarian",
				"Life guard", "Lorry driver", "Mailman", "Mechanic",
				"Meteorologist", "Miner", "Model", "Monk", "Nanny", "Nun",
				"Nurse", "Nursemaid", "Office worker", "Painter",
				"Pastry cook", "Pharmacist", "Photographer", "Physicist",
				"Plumber", "Policeman / Policewoman", "Politician", "Porter",
				"Postman", "Priest", "Professor", "Programmer", "Psychiatrist",
				"Psychologist", "Receptionist", "Researcher", "Sailor",
				"Salesman", "Scientist", "Secretary", "Secretary", "Shoemaker",
				"Shop assistant", " Singer", "Social worker", "Surgeon",
				"Taxi driver", "Teacher", "Telephone operator", "Travel agent",
				"Truck driver", "Vet", "Veterinarian", "Waiter", "Waitress",
				"Window cleaner", "Writer" }));
		comboBox_4_1.setBounds(127, 182, 219, 20);
		panel.add(comboBox_4_1);

		JLabel lblId = new JLabel("ID:");
		lblId.setHorizontalAlignment(SwingConstants.TRAILING);
		lblId.setVerticalAlignment(SwingConstants.BOTTOM);
		lblId.setBounds(10, 11, 68, 14);
		contentPanel.add(lblId);

		textField = new JTextField();
		textField.setBounds(106, 8, 124, 20);
		contentPanel.add(textField);
		textField.setColumns(10);

		table = new JTable();
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setBounds(35, 400, 400, 200);
		tableModel = new DefaultTableModel();
		String[] columnNames = { "#", "ID", "Name", "Last name", "Born date",
				"Nacionality", "Sex", "Civil state" };
		tableModel.setColumnIdentifiers(columnNames);
		loadCandidate();

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(1343, 267, -1331, 428);
		contentPanel.add(scrollPane);

		{

			JPanel panel_1 = new JPanel();
			panel_1.setBorder(new TitledBorder(null, "Personal data:",
					TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_1.setBounds(10, 48, 272, 201);
			contentPanel.add(panel_1);
			panel_1.setLayout(null);
			{
				JLabel lblName = new JLabel("Name:");
				lblName.setBounds(21, 27, 68, 14);
				panel_1.add(lblName);
				lblName.setHorizontalAlignment(SwingConstants.TRAILING);
				lblName.setVerticalAlignment(SwingConstants.BOTTOM);
			}
			{
				textField_1 = new JTextField();
				textField_1.setBounds(117, 24, 130, 20);
				panel_1.add(textField_1);
				textField_1.setColumns(10);
			}
			{
				JLabel lblLastName = new JLabel("Last name:");
				lblLastName.setBounds(21, 51, 68, 14);
				panel_1.add(lblLastName);
				lblLastName.setHorizontalAlignment(SwingConstants.TRAILING);
				lblLastName.setVerticalAlignment(SwingConstants.BOTTOM);
			}
			{
				textField_2 = new JTextField();
				textField_2.setBounds(117, 48, 130, 20);
				panel_1.add(textField_2);
				textField_2.setColumns(10);
			}
			{
				JLabel lblBornDate = new JLabel("Born date:");
				lblBornDate.setBounds(21, 71, 68, 20);
				panel_1.add(lblBornDate);
				lblBornDate.setHorizontalAlignment(SwingConstants.TRAILING);
			}

			JSpinner spinner = new JSpinner();
			spinner.setBounds(117, 71, 130, 20);
			panel_1.add(spinner);
			spinner.setModel(new SpinnerDateModel(new Date(-946756800000L),
					new Date(-946756800000L), new Date(915163200000L),
					Calendar.DAY_OF_YEAR));
			{
				JComboBox comboBox_1_1 = new JComboBox();
				comboBox_1_1.setBounds(117, 95, 130, 20);
				panel_1.add(comboBox_1_1);
				comboBox_1_1.setModel(new DefaultComboBoxModel(new String[] {
						"<Select>", "Afghan", "American", "Argentinian",
						"Australian", "Austrian", "Belgian", "Bolivian",
						"Brazilian", "British", "Bulgarian", "Canadian",
						"Chilean", "Chinese", "Colombian", "Costa Rican",
						"Cuban", "Czech", "Danish", "Dominican", "Dutch",
						"Ecuadorean", "Egyptian", "English", "Filipino ",
						"Finnish ", "French ", "German ", "Greek ",
						"Greenlander ", "Guatemalan ", "Haitian ", "Hawaiian ",
						"Honduran ", "Hungarian ", "Icelandic ", "Indian ",
						"Indonesian ", "Iranian ", "Iraqui ", "Irish ",
						"Israeli ", "Italian ", "Jamaican ", "Japanese ",
						"korean ", "Lebanese ", "Malaysian ", "Maltese ",
						"Mexican ", "Moroccan ", "Nepalese ", "New Zealander ",
						"Nicaraguan ", "Nigerian ", "Norwegian ", "Pakistani ",
						"Palestinian ", "Panamanian", "Paraguayan ",
						"Peruvian ", "Polish ", "Portuguese ", "Puerto Rican ",
						"Rumanian ", "Russian ", "Saudi Arabian ", "Scottish ",
						"Singaporean ", "Spanish ", "Swedish ", "Swiss ",
						"Syrian ", "Tahitian ", "Thai ", "Tunisian ",
						"Turkish ", "Ukrainian ", "Uruguayan ", "Venezuelan ",
						"Vietnamese ", "Welsh ", "Yugoslavian " }));
			}
			{
				JLabel lblNacionality = new JLabel("Nacionality:");
				lblNacionality.setBounds(21, 95, 68, 20);
				panel_1.add(lblNacionality);
				lblNacionality.setHorizontalAlignment(SwingConstants.TRAILING);
			}
			{
				JComboBox comboBox_1_1 = new JComboBox();
				comboBox_1_1.setBounds(117, 119, 130, 20);
				panel_1.add(comboBox_1_1);
				comboBox_1_1.setModel(new DefaultComboBoxModel(new String[] {
						"<Select>", "Female", "Male" }));
			}
			{
				JLabel lblSex = new JLabel("Sex:");
				lblSex.setBounds(21, 119, 68, 20);
				panel_1.add(lblSex);
				lblSex.setHorizontalAlignment(SwingConstants.TRAILING);
			}
			{
				JLabel lblCivilState = new JLabel("Civil state:");
				lblCivilState.setBounds(21, 143, 68, 20);
				panel_1.add(lblCivilState);
				lblCivilState.setHorizontalAlignment(SwingConstants.TRAILING);
			}
			{
				JComboBox comboBox_1_1 = new JComboBox();
				comboBox_1_1.setBounds(117, 143, 130, 20);
				panel_1.add(comboBox_1_1);
				comboBox_1_1.setModel(new DefaultComboBoxModel(new String[] {
						"<Select>", "Single", "Married", "Dirvorced",
						"Widowed", "Engaged", "Other" }));
			}

			comboBox_1 = new JComboBox();
			comboBox_1.setBounds(117, 167, 130, 20);
			panel_1.add(comboBox_1);
			comboBox_1.addItemListener(new ItemListener() {
				@Override
				public void itemStateChanged(ItemEvent arg0) {
					if (comboBox_1.getSelectedItem() == "Tecnical") {
						panel.setVisible(false);
						panel_4.setVisible(true);
						panel_5.setVisible(false);
					}

					if (comboBox_1.getSelectedItem() == "Universitary") {
						panel_4.setVisible(false);
						panel.setVisible(true);
						panel_5.setVisible(false);
					}
					if (comboBox_1.getSelectedItem() == "Other") {
						panel_5.setVisible(true);
						panel.setVisible(false);
						panel_4.setVisible(false);
					}
					if ((comboBox_1.getSelectedItem() == "<Select>")) {
						panel_5.setVisible(false);
						panel.setVisible(false);
						panel_4.setVisible(false);
					}

				}
			});
			comboBox_1.setModel(new DefaultComboBoxModel(new String[] {
					"<Select>", "Universitary", "Technical", "Other" }));

			JLabel lblSyudyLevel = new JLabel("Study level:");
			lblSyudyLevel.setBounds(10, 170, 82, 14);
			panel_1.add(lblSyudyLevel);
			lblSyudyLevel.setHorizontalAlignment(SwingConstants.TRAILING);
			{
				JPanel panel_2 = new JPanel();
				panel_2.setBorder(new TitledBorder(null, "Contact:",
						TitledBorder.LEADING, TitledBorder.TOP, null, null));
				panel_2.setBounds(292, 52, 510, 195);
				contentPanel.add(panel_2);
				panel_2.setLayout(null);
				{
					JPanel panel_3 = new JPanel();
					panel_3.setBorder(new TitledBorder(null, "Adress:",
							TitledBorder.LEFT, TitledBorder.TOP, null, null));
					panel_3.setBounds(10, 77, 490, 116);
					panel_2.add(panel_3);
					panel_3.setLayout(null);
					{
						JLabel label = new JLabel("Street:");
						label.setBounds(10, 25, 68, 14);
						panel_3.add(label);
						label.setVerticalAlignment(SwingConstants.BOTTOM);
						label.setHorizontalAlignment(SwingConstants.TRAILING);
					}
					{
						textField_8 = new JTextField();
						textField_8.setBounds(108, 22, 130, 20);
						panel_3.add(textField_8);
						textField_8.setColumns(10);
					}
					{
						JLabel label = new JLabel("Number:");
						label.setBounds(10, 53, 68, 14);
						panel_3.add(label);
						label.setVerticalAlignment(SwingConstants.BOTTOM);
						label.setHorizontalAlignment(SwingConstants.TRAILING);
					}
					{
						textField_7 = new JTextField();
						textField_7.setBounds(108, 50, 130, 20);
						panel_3.add(textField_7);
						textField_7.setColumns(10);
					}
					{
						JLabel lblCountry = new JLabel("Country:");
						lblCountry.setBounds(10, 80, 68, 14);
						panel_3.add(lblCountry);
						lblCountry.setVerticalAlignment(SwingConstants.BOTTOM);
						lblCountry
								.setHorizontalAlignment(SwingConstants.TRAILING);
					}
					{
						JLabel lblSector = new JLabel("Sector:");
						lblSector.setBounds(262, 22, 88, 14);
						panel_3.add(lblSector);
						lblSector.setVerticalAlignment(SwingConstants.BOTTOM);
						lblSector
								.setHorizontalAlignment(SwingConstants.TRAILING);
					}
					{
						textField_10 = new JTextField();
						textField_10.setBounds(360, 21, 120, 20);
						panel_3.add(textField_10);
						textField_10.setColumns(10);
					}
					{
						JLabel lblCity = new JLabel("City:");
						lblCity.setBounds(262, 58, 88, 14);
						panel_3.add(lblCity);
						lblCity.setVerticalAlignment(SwingConstants.BOTTOM);
						lblCity.setHorizontalAlignment(SwingConstants.TRAILING);
					}
					{
						textField_9 = new JTextField();
						textField_9.setBounds(360, 52, 120, 20);
						panel_3.add(textField_9);
						textField_9.setColumns(10);
					}
					{
						JLabel lblRegion = new JLabel("Region:");
						lblRegion.setBounds(264, 89, 86, 14);
						panel_3.add(lblRegion);
						lblRegion.setVerticalAlignment(SwingConstants.BOTTOM);
						lblRegion
								.setHorizontalAlignment(SwingConstants.TRAILING);
					}
					{
						textField_11 = new JTextField();
						textField_11.setBounds(360, 86, 120, 20);
						panel_3.add(textField_11);
						textField_11.setColumns(10);
					}
					{
						JComboBox comboBox_1_1 = new JComboBox();
						comboBox_1_1.setBounds(108, 77, 130, 20);
						panel_3.add(comboBox_1_1);
						comboBox_1_1
								.setModel(new DefaultComboBoxModel(
										new String[] {
												"<Select>",
												"Afghanistan ",
												"Albania ",
												"Algeria ",
												"American Samoa ",
												"Andorra ",
												"Angola",
												"Anguilla ",
												"Antarctica ",
												"Antigua and Barbuda ",
												"Argentina ",
												"Armenia ",
												"Aruba ",
												"Australia ",
												"Austria ",
												"Azerbaijan  ",
												"Bahamas ",
												"Bahrain ",
												"Bangladesh ",
												"Barbados ",
												"Belarus ",
												"Belgium ",
												"Belize ",
												"Benin ",
												"Bermuda ",
												"Bhutan",
												"Bolivia ",
												"Bosnia and Herzegovina ",
												"Botswana ",
												"Brazil ",
												"Brunei Darussalam",
												"Bulgaria ",
												"Burkina Faso ",
												"Burundi ",
												"Cambodia ",
												"Cameroon ",
												"Canada ",
												"Cape Verde ",
												"Cayman Islands ",
												"Central African Republic ",
												"Chad ",
												"Chile ",
												"China ",
												"Christmas Island ",
												"Cocos (Keeling) Islands ",
												"Colombia ",
												"Comoros ",
												"Democratic Republic of the Congo (Kinshasa) ",
												"Congo, Republic of (Brazzaville) ",
												"Cook Islands ",
												"Costa Rica ",
												"Ivory Coast (Cote d'Ivoire) ",
												"Croatia ",
												"Cuba ",
												"Cyprus ",
												"Czech Republic ",
												"Denmark ",
												"Djibouti ",
												"Dominica ",
												"Dominican Republic ",
												"East Timor Timor-Leste ",
												"Ecuador ",
												"Egypt ",
												"El Salvador ",
												"Equatorial Guinea ",
												"Eritrea ",
												"Estonia ",
												"Ethiopia ",
												"Falkland Islands ",
												"Faroe Islands ",
												"Fiji ",
												"Finland ",
												"France ",
												"French Guiana ",
												"French Polynesia ",
												"French Southern Territories ",
												"Gabon ",
												"Gambia ",
												"Georgia ",
												"Germany ",
												"Ghana ",
												"Gibraltar ",
												"Great Britain ",
												"Greece ",
												"Greenland ",
												"Grenada ",
												"Guadeloupe ",
												"Guam ",
												"Guatemala ",
												"Guinea ",
												"Guinea-Bissau ",
												"Guyana ",
												"Haiti ",
												"Holy See ",
												"Honduras ",
												"Hong Kong ",
												"Hungary ",
												"Iceland ",
												"India ",
												"Indonesia ",
												"Iran (Islamic Republic of) ",
												"Iraq",
												"Ireland ",
												"Israel ",
												"Italy ",
												"Jamaica ",
												"Japan ",
												"Jordan ",
												"Kazakhstan ",
												"Kenya ",
												"Kiribati",
												"Korea, Democratic People's Rep. (North Korea)",
												"Korea, Republic of (South Korea)",
												"Kosovo",
												"Kuwait ",
												"Kyrgyzstan",
												"Lao, People's Democratic Republic",
												"Latvia",
												"Lebanon",
												"Lesotho",
												"Liberia",
												"Libya",
												"Liechtenstein",
												"Lithuania",
												"Luxembourg",
												"Macao",
												"Macedonia, Rep. of",
												"Madagascar",
												"Malawi",
												"Malaysia",
												"Maldives",
												"Mali",
												"Malta",
												"Marshall Islands",
												"Martinique",
												"Mauritania",
												"Mauritius",
												"Mayotte",
												"Mexico",
												"Micronesia, Federal States of",
												"Moldova, Republic of",
												"Monaco",
												"Mongolia",
												"Montenegro",
												"Montserrat",
												"Morocco",
												"Mozambique",
												"Myanmar, Burma",
												"Namibia",
												"Nauru ",
												"Nepal",
												"Netherlands",
												"Netherlands Antilles",
												"New Caledonia",
												"New Zealand",
												"Nicaragua",
												"Niger",
												"Nigeria",
												"Niue",
												"Northern Mariana Islands",
												"Norway",
												"Oman",
												"Pakistan",
												"Palau",
												"Palestinian territories",
												"Panama",
												"Papua New Guinea",
												"Paraguay",
												"Peru",
												"Philippines",
												"Pitcairn Island",
												"Poland",
												"Portugal",
												"Puerto Rico",
												"Qatar",
												"Reunion Island",
												"Romania",
												"Russian Federation",
												"Rwanda",
												"Saint Kitts and Nevis",
												"Saint Lucia",
												"Saint Vincent and the Grenadines",
												"Samoa",
												"San Marino",
												"Saint Tome and Principe ",
												"Saudi Arabia",
												"Senegal",
												"Serbia",
												"Seychelles",
												"Sierra Leone",
												"Singapore",
												"Slovakia (Slovak Republic)",
												"Slovenia",
												"Solomon Islands",
												"Somalia",
												"South Africa",
												"South Sudan",
												"Spain",
												"Sri Lanka",
												"Sudan",
												"Suriname",
												"Swaziland",
												"Sweden",
												"Switzerland",
												"Syria",
												"Taiwan (Republic of China)",
												"Tajikistan",
												"Tanzania",
												"Thailand",
												"Tibet",
												"Timor-Leste (East Timor)",
												"Togo",
												"Tokelau",
												"Tonga",
												"Trinidad and Tobago",
												"Tunisia",
												"Turkey ",
												"Turkmenistan",
												"Turks and Caicos Islands",
												"Tuvalu",
												"Uganda",
												"Ukraine",
												"United Arab Emirates",
												"United Kingdom",
												"United States",
												"Uruguay",
												"Uzbekistan",
												"Vanuatu",
												"Vatican City State (Holy See)",
												"Venezuela", "Vietnam",
												"Virgin Islands (British)",
												"Virgin Islands (U.S.)",
												"Wallis and Futuna Islands",
												"Western Sahara", "Yemen",
												"Zambia", "Zimbabwe" }));
					}
				}
				{
					JLabel lblEmail = new JLabel("E-mail:");
					lblEmail.setBounds(15, 26, 68, 14);
					panel_2.add(lblEmail);
					lblEmail.setVerticalAlignment(SwingConstants.BOTTOM);
					lblEmail.setHorizontalAlignment(SwingConstants.TRAILING);
				}
				{
					textField_3 = new JTextField();
					textField_3.setBounds(111, 23, 136, 20);
					panel_2.add(textField_3);
					textField_3.setColumns(10);
				}
				{
					JLabel lblCellphone = new JLabel("Cell-phone:");
					lblCellphone.setBounds(15, 57, 68, 14);
					panel_2.add(lblCellphone);
					lblCellphone.setVerticalAlignment(SwingConstants.BOTTOM);
					lblCellphone
							.setHorizontalAlignment(SwingConstants.TRAILING);
				}
				{
					textField_4 = new JTextField();
					textField_4.setBounds(111, 54, 136, 20);
					panel_2.add(textField_4);
					textField_4.setColumns(10);
				}
				{
					JLabel lblTelephone = new JLabel("Telephone:");
					lblTelephone.setBounds(272, 26, 88, 14);
					panel_2.add(lblTelephone);
					lblTelephone.setVerticalAlignment(SwingConstants.BOTTOM);
					lblTelephone
							.setHorizontalAlignment(SwingConstants.TRAILING);
				}
				{
					textField_5 = new JTextField();
					textField_5.setBounds(370, 23, 119, 20);
					panel_2.add(textField_5);
					textField_5.setColumns(10);
				}
				{
					JLabel lblPostalCode = new JLabel("Postal code:");
					lblPostalCode.setBounds(274, 57, 86, 14);
					panel_2.add(lblPostalCode);
					lblPostalCode.setVerticalAlignment(SwingConstants.BOTTOM);
					lblPostalCode
							.setHorizontalAlignment(SwingConstants.TRAILING);
				}
				{
					textField_6 = new JTextField();
					textField_6.setBounds(370, 54, 119, 20);
					panel_2.add(textField_6);
					textField_6.setColumns(10);
				}
			}

			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent arg0) {
						setVisible(false);
					}
				});
				{
					JButton btnDelete = new JButton("Delete");
					buttonPane.add(btnDelete);
				}
				{
					JButton btnUpdate = new JButton("Update");
					buttonPane.add(btnUpdate);
				}

				JButton btnRegister = new JButton("Register");
				buttonPane.add(btnRegister);
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent arg0) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

	private void loadCandidate() {
		// TODO Auto-generated method stub
		// Equipo[] equipos1;
		// equipos1 = new Equipo[12];
		// equipos1 = Delegacy1.getEquipos();
		tableModel.setRowCount(0);
		fila = new Object[tableModel.getColumnCount()];
		// for (int i = 0, j = 1; i < Delegacy1.getCant(); i++, j++) {

		// fila[0] = j;
		// fila[1] = equipos1[i].getNombre();
		// fila[2] = equipos1[i].isIndividual();
		// fila[3] = equipos1[i].getCanthombres();
		// fila[4] = equipos1[i].getCantmujeres();
		// fila[5] = equipos1[i].getCantmedoro();
		// fila[6] = equipos1[i].getCantmedplata();
		// fila[7] = equipos1[i].getCantmedbronce();
		// tableModel.addRow(fila);
		// }

		table.setModel(tableModel);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		table.getTableHeader().setReorderingAllowed(false);
		TableColumnModel columnModel = table.getColumnModel();
		columnModel.getColumn(0).setPreferredWidth(70);
		columnModel.getColumn(1).setPreferredWidth(150);
		columnModel.getColumn(2).setPreferredWidth(150);
		columnModel.getColumn(3).setPreferredWidth(150);
		columnModel.getColumn(4).setPreferredWidth(150);
		columnModel.getColumn(5).setPreferredWidth(150);
		columnModel.getColumn(6).setPreferredWidth(150);
		columnModel.getColumn(7).setPreferredWidth(150);
	}
}