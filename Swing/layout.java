package Lab3;
import javax.swing.*;

public class layout extends javax.swing.JFrame{
    public static void main(String[] args){
        JFrame panel = new JFrame("Printer");
        //JPanel panel = new JPanel();
        JLabel nameLabel = new JLabel("Printer:My Printer",null,0);
        JLabel nameLabe2 = new JLabel("Print Quality",null,0);
        JTextArea areaText1 = new JTextArea();
        JTextArea areaText2 = new JTextArea();
        JTextArea areaText3 = new JTextArea();

        JCheckBox chk1 = new JCheckBox("Image", null);
        JCheckBox chk2 = new JCheckBox("Text", null);
        JCheckBox chk3 = new JCheckBox("Code", null);
        JCheckBox chk4 = new JCheckBox("Print to File", null);

        JRadioButton rad1 = new JRadioButton("Selection", null);
        JRadioButton rad2 = new JRadioButton("All", null);
        JRadioButton rad3 = new JRadioButton("Applet", null);

        ButtonGroup group = new ButtonGroup();
        group.add(rad1);
        group.add(rad2);
        group.add(rad3);

        String options[] = {"High","Medium","Low"};
        JComboBox<String> cbox = new JComboBox<String>(options);

        JButton ok = new JButton("OK", null);
        JButton cancel = new JButton("Cancel", null);
        JButton setup = new JButton("SetUp...", null);
        JButton help = new JButton("Help", null);

        nameLabel.setBounds(0,10,200,20);
        areaText1.setBounds(40,50,50,80);
        chk1.setBounds(100,50,70,20);
        chk2.setBounds(100,75,70,20);
        chk3.setBounds(100,100,70,20);
        areaText2.setBounds(175,50,40,80);
        rad1.setBounds(225,50,100,30);
        rad2.setBounds(225,75,100,30);
        rad3.setBounds(225,100,100,30);
        areaText3.setBounds(325,50,70,80);
        nameLabe2.setBounds(0, 130, 200, 20);
        cbox.setBounds(160,130,75,20);
        chk4.setBounds(250,130,125,20);

        ok.setBounds(450,10,100,30);
        cancel.setBounds(450,50,100, 30);
        setup.setBounds(450,90,100, 30);
        help.setBounds(450,130,100, 30);
    
        panel.add(nameLabel);
        panel.add(nameLabe2);
        panel.add(areaText1);
        panel.add(areaText2);
        panel.add(areaText3);
        panel.add(chk1);
        panel.add(chk2);
        panel.add(chk3);
        panel.add(chk4);
        panel.add(rad1);
        panel.add(rad2);
        panel.add(rad3);
        panel.add(cbox);
        panel.add(ok);
        panel.add(cancel);
        panel.add(setup);
        panel.add(help);
        //frame .add(panel);

        panel.setSize(600,250);
        panel.setLayout(null);
        panel.setVisible(true); 
        panel.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
