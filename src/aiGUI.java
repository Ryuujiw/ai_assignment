import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.JButton;

import weka.classifiers.Classifier;
import weka.core.DenseInstance;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Scanner;

public class aiGUI {

	private JFrame frmMocapHandPostures;
	private JTextField textField2;
	private JTextField textField3;
	private JTextField textField4;
	private JTextField textField8;
	private JTextField textField9;
	private JTextField textField10;
	private JTextField textField14;
	private JTextField textField15;
	private JTextField textField16;
	private JTextField textField20;
	private JTextField textField21;
	private JTextField textField22;
	private JTextField textField26;
	private JTextField textField27;
	private JTextField textField28;
	private JTextField textField32;
	private JTextField textField33;
	private JTextField textField5;
	private JTextField textField6;
	private JTextField textField7;
	private JTextField textField11;
	private JTextField textField12;
	private JTextField textField13;
	private JTextField textField17;
	private JTextField textField18;
	private JTextField textField19;
	private JTextField textField23;
	private JTextField textField24;
	private JTextField textField25;
	private JTextField textField29;
	private JTextField textField30;
	private JTextField textField31;
	private JTextField textField_output;
	private JTextField textField34;
	private JTextField textField35;
	private JTextField textField36;
	private JTextField textField37;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					aiGUI window = new aiGUI();
					window.frmMocapHandPostures.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public aiGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMocapHandPostures = new JFrame();
		frmMocapHandPostures.setResizable(false);
		frmMocapHandPostures.setTitle("MoCap Hand Postures");
		frmMocapHandPostures.setBounds(50, 50, 820, 730);
		frmMocapHandPostures.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMocapHandPostures.getContentPane().setLayout(null);
		frmMocapHandPostures.setLocationRelativeTo(null);
		
		JLabel lblPleaseInputThe = new JLabel("Enter the 11 hand marker coordinates and press \"Compute\"");
		lblPleaseInputThe.setFont(new Font("Dialog", Font.PLAIN, 17));
		lblPleaseInputThe.setBounds(30, 5, 482, 34);
		frmMocapHandPostures.getContentPane().add(lblPleaseInputThe);
		
		JLabel lblMarker = new JLabel("Marker 1");
		lblMarker.setBounds(30, 45, 56, 16);
		frmMocapHandPostures.getContentPane().add(lblMarker);
		
		JLabel label = new JLabel("Marker 3");
		label.setBounds(30, 110, 56, 16);
		frmMocapHandPostures.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("Marker 2");
		label_1.setBounds(425, 45, 56, 16);
		frmMocapHandPostures.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("Marker 4");
		label_2.setBounds(425, 110, 56, 16);
		frmMocapHandPostures.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("Marker 5");
		label_3.setBounds(30, 175, 56, 16);
		frmMocapHandPostures.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("Marker 6");
		label_4.setBounds(425, 175, 56, 16);
		frmMocapHandPostures.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("Marker 7");
		label_5.setBounds(30, 240, 56, 16);
		frmMocapHandPostures.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("Marker 8");
		label_6.setBounds(425, 240, 56, 16);
		frmMocapHandPostures.getContentPane().add(label_6);
		
		JLabel label_7 = new JLabel("Marker 9");
		label_7.setBounds(30, 305, 56, 16);
		frmMocapHandPostures.getContentPane().add(label_7);
		
		JLabel label_8 = new JLabel("Marker 10");
		label_8.setBounds(425, 305, 67, 16);
		frmMocapHandPostures.getContentPane().add(label_8);
		
		JLabel label_9 = new JLabel("Marker 11");
		label_9.setBounds(30, 370, 67, 16);
		frmMocapHandPostures.getContentPane().add(label_9);
		
		JLabel label_10 = new JLabel("x:");
		label_10.setBounds(30, 70, 11, 16);
		frmMocapHandPostures.getContentPane().add(label_10);
		
		JLabel label_11 = new JLabel("y:");
		label_11.setBounds(150, 70, 11, 16);
		frmMocapHandPostures.getContentPane().add(label_11);
		
		JLabel label_12 = new JLabel("z:");
		label_12.setBounds(270, 70, 11, 16);
		frmMocapHandPostures.getContentPane().add(label_12);
		
		textField2 = new JTextField();
		textField2.setText("0");
		textField2.setBounds(45, 68, 92, 22);
		frmMocapHandPostures.getContentPane().add(textField2);
		textField2.setColumns(10);
		
		textField3 = new JTextField();
		textField3.setText("0");
		textField3.setColumns(10);
		textField3.setBounds(165, 68, 92, 22);
		frmMocapHandPostures.getContentPane().add(textField3);
		
		textField4 = new JTextField();
		textField4.setText("0");
		textField4.setColumns(10);
		textField4.setBounds(285, 68, 92, 22);
		frmMocapHandPostures.getContentPane().add(textField4);
		
		JLabel label_13 = new JLabel("x:");
		label_13.setBounds(30, 135, 11, 16);
		frmMocapHandPostures.getContentPane().add(label_13);
		
		textField8 = new JTextField();
		textField8.setText("0");
		textField8.setColumns(10);
		textField8.setBounds(45, 133, 92, 22);
		frmMocapHandPostures.getContentPane().add(textField8);
		
		JLabel label_14 = new JLabel("y:");
		label_14.setBounds(150, 135, 11, 16);
		frmMocapHandPostures.getContentPane().add(label_14);
		
		textField9 = new JTextField();
		textField9.setText("0");
		textField9.setColumns(10);
		textField9.setBounds(165, 133, 92, 22);
		frmMocapHandPostures.getContentPane().add(textField9);
		
		JLabel label_15 = new JLabel("z:");
		label_15.setBounds(270, 135, 11, 16);
		frmMocapHandPostures.getContentPane().add(label_15);
		
		textField10 = new JTextField();
		textField10.setText("0");
		textField10.setColumns(10);
		textField10.setBounds(285, 133, 92, 22);
		frmMocapHandPostures.getContentPane().add(textField10);
		
		JLabel label_16 = new JLabel("x:");
		label_16.setBounds(30, 200, 11, 16);
		frmMocapHandPostures.getContentPane().add(label_16);
		
		textField14 = new JTextField();
		textField14.setText("0");
		textField14.setColumns(10);
		textField14.setBounds(45, 198, 92, 22);
		frmMocapHandPostures.getContentPane().add(textField14);
		
		JLabel label_17 = new JLabel("y:");
		label_17.setBounds(150, 200, 11, 16);
		frmMocapHandPostures.getContentPane().add(label_17);
		
		textField15 = new JTextField();
		textField15.setText("0");
		textField15.setColumns(10);
		textField15.setBounds(165, 198, 92, 22);
		frmMocapHandPostures.getContentPane().add(textField15);
		
		JLabel label_18 = new JLabel("z:");
		label_18.setBounds(270, 200, 11, 16);
		frmMocapHandPostures.getContentPane().add(label_18);
		
		textField16 = new JTextField();
		textField16.setText("0");
		textField16.setColumns(10);
		textField16.setBounds(285, 198, 92, 22);
		frmMocapHandPostures.getContentPane().add(textField16);
		
		JLabel label_19 = new JLabel("x:");
		label_19.setBounds(30, 265, 11, 16);
		frmMocapHandPostures.getContentPane().add(label_19);
		
		textField20 = new JTextField();
		textField20.setText("0");
		textField20.setColumns(10);
		textField20.setBounds(45, 263, 92, 22);
		frmMocapHandPostures.getContentPane().add(textField20);
		
		JLabel label_20 = new JLabel("y:");
		label_20.setBounds(150, 265, 11, 16);
		frmMocapHandPostures.getContentPane().add(label_20);
		
		textField21 = new JTextField();
		textField21.setText("0");
		textField21.setColumns(10);
		textField21.setBounds(165, 263, 92, 22);
		frmMocapHandPostures.getContentPane().add(textField21);
		
		JLabel label_21 = new JLabel("z:");
		label_21.setBounds(270, 265, 11, 16);
		frmMocapHandPostures.getContentPane().add(label_21);
		
		textField22 = new JTextField();
		textField22.setText("0");
		textField22.setColumns(10);
		textField22.setBounds(285, 263, 92, 22);
		frmMocapHandPostures.getContentPane().add(textField22);
		
		JLabel label_22 = new JLabel("x:");
		label_22.setBounds(30, 330, 11, 16);
		frmMocapHandPostures.getContentPane().add(label_22);
		
		textField26 = new JTextField();
		textField26.setText("0");
		textField26.setColumns(10);
		textField26.setBounds(45, 328, 92, 22);
		frmMocapHandPostures.getContentPane().add(textField26);
		
		JLabel label_23 = new JLabel("y:");
		label_23.setBounds(150, 330, 11, 16);
		frmMocapHandPostures.getContentPane().add(label_23);
		
		textField27 = new JTextField();
		textField27.setText("0");
		textField27.setColumns(10);
		textField27.setBounds(165, 328, 92, 22);
		frmMocapHandPostures.getContentPane().add(textField27);
		
		JLabel label_24 = new JLabel("z:");
		label_24.setBounds(270, 330, 11, 16);
		frmMocapHandPostures.getContentPane().add(label_24);
		
		textField28 = new JTextField();
		textField28.setText("0");
		textField28.setColumns(10);
		textField28.setBounds(285, 328, 92, 22);
		frmMocapHandPostures.getContentPane().add(textField28);
		
		JLabel label_25 = new JLabel("x:");
		label_25.setBounds(30, 395, 11, 16);
		frmMocapHandPostures.getContentPane().add(label_25);
		
		textField32 = new JTextField();
		textField32.setText("0");
		textField32.setColumns(10);
		textField32.setBounds(45, 393, 92, 22);
		frmMocapHandPostures.getContentPane().add(textField32);
		
		JLabel label_26 = new JLabel("y:");
		label_26.setBounds(150, 395, 11, 16);
		frmMocapHandPostures.getContentPane().add(label_26);
		
		textField33 = new JTextField();
		textField33.setText("0");
		textField33.setColumns(10);
		textField33.setBounds(165, 393, 92, 22);
		frmMocapHandPostures.getContentPane().add(textField33);
		
		JLabel label_27 = new JLabel("z:");
		label_27.setBounds(270, 395, 11, 16);
		frmMocapHandPostures.getContentPane().add(label_27);
		
		JLabel label_28 = new JLabel("x:");
		label_28.setBounds(425, 70, 11, 16);
		frmMocapHandPostures.getContentPane().add(label_28);
		
		textField5 = new JTextField();
		textField5.setText("0");
		textField5.setColumns(10);
		textField5.setBounds(440, 68, 92, 22);
		frmMocapHandPostures.getContentPane().add(textField5);
		
		JLabel label_29 = new JLabel("y:");
		label_29.setBounds(545, 70, 11, 16);
		frmMocapHandPostures.getContentPane().add(label_29);
		
		textField6 = new JTextField();
		textField6.setText("0");
		textField6.setColumns(10);
		textField6.setBounds(560, 68, 92, 22);
		frmMocapHandPostures.getContentPane().add(textField6);
		
		JLabel label_30 = new JLabel("z:");
		label_30.setBounds(665, 70, 11, 16);
		frmMocapHandPostures.getContentPane().add(label_30);
		
		textField7 = new JTextField();
		textField7.setText("0");
		textField7.setColumns(10);
		textField7.setBounds(680, 68, 92, 22);
		frmMocapHandPostures.getContentPane().add(textField7);
		
		JLabel label_31 = new JLabel("x:");
		label_31.setBounds(425, 135, 11, 16);
		frmMocapHandPostures.getContentPane().add(label_31);
		
		textField11 = new JTextField();
		textField11.setText("0");
		textField11.setColumns(10);
		textField11.setBounds(440, 133, 92, 22);
		frmMocapHandPostures.getContentPane().add(textField11);
		
		JLabel label_32 = new JLabel("y:");
		label_32.setBounds(545, 135, 11, 16);
		frmMocapHandPostures.getContentPane().add(label_32);
		
		textField12 = new JTextField();
		textField12.setText("0");
		textField12.setColumns(10);
		textField12.setBounds(560, 133, 92, 22);
		frmMocapHandPostures.getContentPane().add(textField12);
		
		JLabel label_33 = new JLabel("z:");
		label_33.setBounds(665, 135, 11, 16);
		frmMocapHandPostures.getContentPane().add(label_33);
		
		textField13 = new JTextField();
		textField13.setText("0");
		textField13.setColumns(10);
		textField13.setBounds(680, 133, 92, 22);
		frmMocapHandPostures.getContentPane().add(textField13);
		
		JLabel label_34 = new JLabel("x:");
		label_34.setBounds(425, 200, 11, 16);
		frmMocapHandPostures.getContentPane().add(label_34);
		
		textField17 = new JTextField();
		textField17.setText("0");
		textField17.setColumns(10);
		textField17.setBounds(440, 198, 92, 22);
		frmMocapHandPostures.getContentPane().add(textField17);
		
		JLabel label_35 = new JLabel("y:");
		label_35.setBounds(545, 200, 11, 16);
		frmMocapHandPostures.getContentPane().add(label_35);
		
		textField18 = new JTextField();
		textField18.setText("0");
		textField18.setColumns(10);
		textField18.setBounds(560, 198, 92, 22);
		frmMocapHandPostures.getContentPane().add(textField18);
		
		JLabel label_36 = new JLabel("z:");
		label_36.setBounds(665, 200, 11, 16);
		frmMocapHandPostures.getContentPane().add(label_36);
		
		textField19 = new JTextField();
		textField19.setText("0");
		textField19.setColumns(10);
		textField19.setBounds(680, 198, 92, 22);
		frmMocapHandPostures.getContentPane().add(textField19);
		
		JLabel label_37 = new JLabel("x:");
		label_37.setBounds(425, 265, 11, 16);
		frmMocapHandPostures.getContentPane().add(label_37);
		
		textField23 = new JTextField();
		textField23.setText("0");
		textField23.setColumns(10);
		textField23.setBounds(440, 263, 92, 22);
		frmMocapHandPostures.getContentPane().add(textField23);
		
		JLabel label_38 = new JLabel("y:");
		label_38.setBounds(545, 265, 11, 16);
		frmMocapHandPostures.getContentPane().add(label_38);
		
		textField24 = new JTextField();
		textField24.setText("0");
		textField24.setColumns(10);
		textField24.setBounds(560, 263, 92, 22);
		frmMocapHandPostures.getContentPane().add(textField24);
		
		JLabel label_43 = new JLabel("Marker 12");
		label_43.setBounds(425, 370, 67, 16);
		frmMocapHandPostures.getContentPane().add(label_43);
		
		JLabel label_44 = new JLabel("x:");
		label_44.setBounds(425, 395, 11, 16);
		frmMocapHandPostures.getContentPane().add(label_44);
		
		textField35 = new JTextField();
		textField35.setEditable(false);
		textField35.setColumns(10);
		textField35.setText("0");
		textField35.setBounds(440, 393, 92, 22);
		frmMocapHandPostures.getContentPane().add(textField35);
		
		JLabel label_45 = new JLabel("y:");
		label_45.setBounds(545, 395, 11, 16);
		frmMocapHandPostures.getContentPane().add(label_45);
		
		textField36 = new JTextField();
		textField36.setEditable(false);
		textField36.setText("0");
		textField36.setColumns(10);
		textField36.setBounds(560, 393, 92, 22);
		frmMocapHandPostures.getContentPane().add(textField36);
		
		JLabel label_46 = new JLabel("z:");
		label_46.setBounds(665, 395, 11, 16);
		frmMocapHandPostures.getContentPane().add(label_46);
		
		textField37 = new JTextField();
		textField37.setEditable(false);
		textField37.setText("0");
		textField37.setColumns(10);
		textField37.setBounds(680, 393, 92, 22);
		frmMocapHandPostures.getContentPane().add(textField37);
		
		JLabel label_39 = new JLabel("z:");
		label_39.setBounds(665, 265, 11, 16);
		frmMocapHandPostures.getContentPane().add(label_39);
		
		textField25 = new JTextField();
		textField25.setText("0");
		textField25.setColumns(10);
		textField25.setBounds(680, 263, 92, 22);
		frmMocapHandPostures.getContentPane().add(textField25);
		
		JLabel label_40 = new JLabel("x:");
		label_40.setBounds(425, 330, 11, 16);
		frmMocapHandPostures.getContentPane().add(label_40);
		
		textField29 = new JTextField();
		textField29.setText("0");
		textField29.setColumns(10);
		textField29.setBounds(440, 328, 92, 22);
		frmMocapHandPostures.getContentPane().add(textField29);
		
		JLabel label_41 = new JLabel("y:");
		label_41.setBounds(545, 330, 11, 16);
		frmMocapHandPostures.getContentPane().add(label_41);
		
		textField30 = new JTextField();
		textField30.setText("0");
		textField30.setColumns(10);
		textField30.setBounds(560, 328, 92, 22);
		frmMocapHandPostures.getContentPane().add(textField30);
		
		JLabel label_42 = new JLabel("z:");
		label_42.setBounds(665, 330, 11, 16);
		frmMocapHandPostures.getContentPane().add(label_42);
		
		textField31 = new JTextField();
		textField31.setText("0");
		textField31.setColumns(10);
		textField31.setBounds(680, 328, 92, 22);
		frmMocapHandPostures.getContentPane().add(textField31);

		textField34 = new JTextField();
		textField34.setText("0");
		textField34.setColumns(10);
		textField34.setBounds(285, 393, 92, 22);
		frmMocapHandPostures.getContentPane().add(textField34);
		
		JLabel lblOutput = new JLabel("Class of hand posture:");
		lblOutput.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblOutput.setBounds(300, 505, 161, 18);
		frmMocapHandPostures.getContentPane().add(lblOutput);
		
		textField_output = new JTextField();
		textField_output.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_output.setEditable(false);
		textField_output.setBounds(462, 503, 50, 22);
		frmMocapHandPostures.getContentPane().add(textField_output);
		textField_output.setColumns(10);
		
		JButton btnCompute = new JButton("Compute");
		btnCompute.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCompute.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					Instances test =  null;
					DataSource source = new DataSource("dataset.arff");
					
					test = source.getDataSet();
					test.setClassIndex(0);
					
					Classifier cls = (Classifier) weka.core.SerializationHelper.read("latest.model");
					
					/*ArrayList<JTextField> textFields = new ArrayList<JTextField>();
					textFields.add(textField2);
					textFields.add(textField3);
					textFields.add(textField4);
					textFields.add(textField5);
					textFields.add(textField6);
					textFields.add(textField7);
					textFields.add(textField8);
					textFields.add(textField9);
					textFields.add(textField10);
					textFields.add(textField11);
					textFields.add(textField12);
					textFields.add(textField13);
					textFields.add(textField14);
					textFields.add(textField15);
					textFields.add(textField16);
					textFields.add(textField17);
					textFields.add(textField18);
					textFields.add(textField19);
					textFields.add(textField20);
					textFields.add(textField21);
					textFields.add(textField22);
					textFields.add(textField23);
					textFields.add(textField24);
					textFields.add(textField25);
					textFields.add(textField26);
					textFields.add(textField27);
					textFields.add(textField28);
					textFields.add(textField29);
					textFields.add(textField30);
					textFields.add(textField31);
					textFields.add(textField32);
					textFields.add(textField33);
					textFields.add(textField34);
					
					System.out.println(textFields.size()); 
					*/
					//Evaluation evaluation = new Evaluation(test);
					//evaluation.evaluateModel(cls, test);
					//System.out.println("Results: " + evaluation.toSummaryString());
					
					//System.out.println("Enter fields");
					
					double[] instanceValues = new double[test.numAttributes()];
					
					instanceValues[0]= 0;
					instanceValues[1]= 0;
					
					 
					String data[] = {textField2.getText(),textField3.getText(),textField4.getText(),
							textField5.getText(),textField6.getText(),textField7.getText(),
							textField8.getText(),textField9.getText(),textField10.getText(),
							textField11.getText(),textField12.getText(),textField13.getText(),
							textField14.getText(),textField15.getText(),textField16.getText(),
							textField17.getText(),textField18.getText(),textField19.getText(),
							textField20.getText(),textField21.getText(),textField22.getText(),
							textField23.getText(),textField24.getText(),textField25.getText(),
							textField26.getText(),textField27.getText(),textField28.getText(),
							textField29.getText(),textField30.getText(),textField31.getText(),
							textField32.getText(),textField33.getText(),textField34.getText(),
							textField35.getText(),textField36.getText(),textField37.getText()
							};
					System.out.println(test.numAttributes());
										
					for(int i = 2 ; i < test.numAttributes(); i++){
						instanceValues[i] = Double.parseDouble(data[i-2]);
					}
					
					
					DenseInstance denseInstance = new DenseInstance(1, instanceValues);

					test.add(denseInstance);
					
					int s1 = test.numInstances()-1;
					
					Instance newInst = test.instance(s1);
					
					double value = cls.classifyInstance(newInst);
					
					String prediction = test.classAttribute().value((int)value);
					
					textField_output.setText(prediction);
					//System.out.println("The predicted value of instance "+
		             //       ": " + prediction); 
				
				} catch(Exception e){
					System.out.println(e);
				}
			}
		});
		btnCompute.setBounds(310, 445, 200, 50);
		frmMocapHandPostures.getContentPane().add(btnCompute);
		
		JLabel label_47 = new JLabel("");
		label_47.setBounds(50, 545, 115, 115);
		Image img= new ImageIcon(this.getClass().getResource("/fist.jpg")).getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
		label_47.setIcon(new ImageIcon(img));
		frmMocapHandPostures.getContentPane().add(label_47);
		
		
		JLabel label_48 = new JLabel("");
		label_48.setBounds(200, 545, 115, 115);
		Image img2= new ImageIcon(this.getClass().getResource("/stop.jpg")).getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
		label_48.setIcon(new ImageIcon(img2));
		frmMocapHandPostures.getContentPane().add(label_48);
		
		JLabel label_49 = new JLabel("");
		label_49.setBounds(350, 545, 115, 115);
		Image img3= new ImageIcon(this.getClass().getResource("/pointing.jpg")).getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
		label_49.setIcon(new ImageIcon(img3));
		frmMocapHandPostures.getContentPane().add(label_49);
		
		JLabel label_50 = new JLabel("");
		label_50.setBounds(500, 545, 115, 115);
		Image img4= new ImageIcon(this.getClass().getResource("/peace.jpg")).getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
		label_50.setIcon(new ImageIcon(img4));
		frmMocapHandPostures.getContentPane().add(label_50);
		
		JLabel label_51 = new JLabel("");
		label_51.setBounds(650, 545, 115, 115);
		Image img5= new ImageIcon(this.getClass().getResource("/grab.jpg")).getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
		label_51.setIcon(new ImageIcon(img5));
		frmMocapHandPostures.getContentPane().add(label_51);
		
		JLabel lblClass = new JLabel("Class 1");
		lblClass.setBounds(85, 655, 56, 16);
		frmMocapHandPostures.getContentPane().add(lblClass);
		
		JLabel lblClass_1 = new JLabel("Class 2");
		lblClass_1.setBounds(235, 655, 45, 16);
		frmMocapHandPostures.getContentPane().add(lblClass_1);
		
		JLabel lblClass_2 = new JLabel("Class 3");
		lblClass_2.setBounds(385, 655, 56, 16);
		frmMocapHandPostures.getContentPane().add(lblClass_2);
		
		JLabel lblClass_3 = new JLabel("Class 4");
		lblClass_3.setBounds(535, 655, 56, 16);
		frmMocapHandPostures.getContentPane().add(lblClass_3);
		
		JLabel lblClass_4 = new JLabel("Class 5");
		lblClass_4.setBounds(685, 655, 56, 16);
		frmMocapHandPostures.getContentPane().add(lblClass_4);
		
		
	}
}
