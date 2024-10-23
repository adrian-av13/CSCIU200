//Adrian Alamilla-Vega
//CSCI U200 Lab 10
//04-08-23
//This code is an example of creating a GUI, Graphical User Interphase. Also an object is created and used from the ASCVD.java class.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Lab10 {
    public static void main(String[] args) {
        //ASCVD Object
        ASCVD ascvd = new ASCVD();
        ascvd.setFemale(false);
        ascvd.setWhite(true);
        ascvd.setTreated(true);
        ascvd.setDiabetes(false);
        ascvd.setSmoker(false);
        ascvd.setAge(53);
        ascvd.setSBP(132);
        ascvd.setCholesterol(185);
        ascvd.setHDL(48);
        double risk = 100*ascvd.getRisk();
        System.out.println("ASCVD Risk is "+String.format("%,.1f", risk)+"%");

        //Frame
        JFrame frame = new JFrame("ASCVD Risk Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(0, 4));

        //Risk label
        JLabel newRisk = new JLabel(""+ascvd.getRisk());

        //Male and Female Buttons
        JToggleButton female = new JToggleButton("Female");
        JToggleButton male = new JToggleButton("Male");
        female.setSelected(ascvd.getFemale());
        male.setSelected(!ascvd.getFemale());
        female.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                male.setSelected(!female.isSelected());
                ascvd.setFemale(female.isSelected());
                newRisk.setText(String.format("%,.1f",(ascvd.getRisk()*100))+"%");
            }
        });
        male.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                female.setSelected(!male.isSelected());
                ascvd.setFemale(female.isSelected());
                newRisk.setText(String.format("%,.1f",(ascvd.getRisk()*100))+"%");
            }
        });
        frame.add(female);
        frame.add(male);

        //Age TextField
        JTextField age = new JTextField(""+ascvd.getAge());
        age.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    ascvd.setAge(Integer.parseInt(age.getText()));
                } catch (NumberFormatException exception) {
                    age.setText(""+ascvd.getAge());
                }
                newRisk.setText(String.format("%,.1f",(ascvd.getRisk()*100))+"%");
            }
        });
        age.addFocusListener(new FocusAdapter() {
            public void focusLost(FocusEvent e) {
                try {
                    ascvd.setAge(Integer.parseInt(age.getText()));
                } catch (NumberFormatException exception) {
                    age.setText(""+ascvd.getAge());
                }
                newRisk.setText(String.format("%,.1f",(ascvd.getRisk()*100))+"%");
            }
        });
        frame.add(new JLabel("Age"));
        frame.add(age);

        //White and Other Buttons
        JToggleButton white = new JToggleButton("White");
        JToggleButton other = new JToggleButton("Other");
        white.setSelected(ascvd.getWhite());
        other.setSelected(!ascvd.getWhite());
        white.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e ){
                other.setSelected(!white.isSelected());
                ascvd.setWhite(white.isSelected());
                newRisk.setText(String.format("%,.1f",(ascvd.getRisk()*100))+"%");
            }
        });
        other.addActionListener(new ActionListener () {
            public void actionPerformed(ActionEvent e) {
                white.setSelected(!other.isSelected());
                ascvd.setWhite(white.isSelected());
                newRisk.setText(String.format("%,.1f",(ascvd.getRisk()*100))+"%");
            }
        });
        frame.add(white);
        frame.add(other);

        //SBP TextField
        JTextField sbp = new JTextField(""+ascvd.getSBP());
        sbp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    ascvd.setSBP(Integer.parseInt(sbp.getText()));
                } catch (NumberFormatException exception) {
                    sbp.setText(""+ascvd.getSBP());
                }
                newRisk.setText(String.format("%,.1f",(ascvd.getRisk()*100))+"%");
            }
        });
        sbp.addFocusListener(new FocusAdapter() {
            public void focusLost(FocusEvent e) {
                try {
                    ascvd.setSBP(Integer.parseInt(sbp.getText()));
                } catch (NumberFormatException exception) {
                    sbp.setText(""+ascvd.getSBP());
                }
                newRisk.setText(String.format("%,.1f",(ascvd.getRisk()*100))+"%");
            }
        });
        frame.add(new JLabel("SBP"));
        frame.add(sbp);

        //Treated or Untreated Buttons
        JToggleButton treated = new JToggleButton("Treated");
        JToggleButton untreated = new JToggleButton("Untreated");
        treated.setSelected(ascvd.getTreated());
        untreated.setSelected(!ascvd.getTreated());
        treated.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                untreated.setSelected(!treated.isSelected());
                ascvd.setTreated(treated.isSelected());
                newRisk.setText(String.format("%,.1f",(ascvd.getRisk()*100))+"%");
            }
        });
        untreated.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                treated.setSelected(!untreated.isSelected());
                ascvd.setTreated(treated.isSelected());
                newRisk.setText(String.format("%,.1f",(ascvd.getRisk()*100))+"%");
            }
        });
        frame.add(treated);
        frame.add(untreated);

        //Cholesterol textField
        JTextField cholesterol = new JTextField(""+ascvd.getCholesterol());
        cholesterol.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    ascvd.setCholesterol(Integer.parseInt(cholesterol.getText()));
                } catch (NumberFormatException exception) {
                    cholesterol.setText(""+ascvd.getCholesterol());
                }
                newRisk.setText(String.format("%,.1f",(ascvd.getRisk()*100))+"%");
            }
        });
        cholesterol.addFocusListener(new FocusAdapter() {
            public void focusLost(FocusEvent e) {
                try {
                    ascvd.setCholesterol(Integer.parseInt(cholesterol.getText()));
                } catch (NumberFormatException exception) {
                    cholesterol.setText(""+ascvd.getCholesterol());
                }
                newRisk.setText(String.format("%,.1f",(ascvd.getRisk()*100))+"%");
            }
        });
        frame.add(new JLabel("Cholesterol"));
        frame.add(cholesterol);

        //Diabetic or Non-Diabetic button
        JToggleButton diabetic = new JToggleButton("Diabetic");
        JToggleButton nonDiabetic = new JToggleButton("Non-Diabetic");
        diabetic.setSelected(ascvd.getDiabetes());
        nonDiabetic.setSelected(!ascvd.getDiabetes());
        diabetic.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                nonDiabetic.setSelected(!diabetic.isSelected());
                ascvd.setDiabetes(diabetic.isSelected());
                newRisk.setText(String.format("%,.1f",(ascvd.getRisk()*100))+"%");
            }
        });
        nonDiabetic.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                diabetic.setSelected(!nonDiabetic.isSelected());
                ascvd.setDiabetes(diabetic.isSelected());
                newRisk.setText(String.format("%,.1f",(ascvd.getRisk()*100))+"%");
            }
        });
        frame.add(diabetic);
        frame.add(nonDiabetic);

        //HDL textfield
        JTextField hdl = new JTextField(""+ascvd.getHDL());
        hdl.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    ascvd.setHDL(Integer.parseInt(hdl.getText()));
                } catch (NumberFormatException exception) {
                    hdl.setText(""+ascvd.getHDL());
                }
                newRisk.setText(String.format("%,.1f",(ascvd.getRisk()*100))+"%");
            }
        });
        hdl.addFocusListener(new FocusAdapter() {
            public void focusLost(FocusEvent e) {
                try {
                    ascvd.setHDL(Integer.parseInt(hdl.getText()));
                } catch (NumberFormatException exception) {
                    hdl.setText(""+ascvd.getHDL());
                }
                newRisk.setText(String.format("%,.1f",(ascvd.getRisk()*100))+"%");
            }
        });
        frame.add(new JLabel("HDL"));
        frame.add(hdl);

        //Smoker and Non-Smoker buttons
        JToggleButton smoker = new JToggleButton("Smoker");
        JToggleButton nonSmoker = new JToggleButton("Non-Smoker");
        smoker.setSelected(ascvd.getSmoker());
        nonSmoker.setSelected(!ascvd.getSmoker());
        smoker.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                nonSmoker.setSelected(!smoker.isSelected());
                ascvd.setSmoker(smoker.isSelected());
                newRisk.setText(String.format("%,.1f",(ascvd.getRisk()*100))+"%");
            }
        });
        nonSmoker.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                smoker.setSelected(!nonSmoker.isSelected());
                ascvd.setSmoker(smoker.isSelected());
                newRisk.setText(String.format("%,.1f",(ascvd.getRisk()*100))+"%");
            }
        });
        frame.add(smoker);
        frame.add(nonSmoker);

        //Risk Labels
        frame.add(new JLabel("ASCVD Risk"));
        frame.add(newRisk);



        frame.pack();
        frame.setVisible(true);
    }
}
