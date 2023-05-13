import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Fenetre extends JFrame implements ActionListener{
	JLabel l1=new JLabel("ID ");
	JLabel l2=new JLabel("LIBELLE");
	JLabel l3=new JLabel("PRIX");
	JTextField txt1=new JTextField(20);
	JTextField txt2=new JTextField(20);
	JTextField txt3=new JTextField(20);
	JButton b1=new JButton("Ajouter");
	JButton b2=new JButton("Supprimer");
	JButton b3=new JButton("Quitter");
	JTable table=new JTable();
	String[]Titre={"ID","LIBELLE","PRIX"};
	DefaultTableModel model;
	JScrollPane tpan=new JScrollPane(table);
	
	
	
	public Fenetre()
	{
	
		
	b1.addActionListener(this);
	b2.addActionListener(new Remove());

	JPanel p1=new JPanel();
	p1.setLayout(new GridLayout(0,2));
	p1.add(l1);
	p1.add(txt1);
	p1.add(l2);
	p1.add(txt2);  
	p1.add(l3);
	p1.add(txt3);
	
	JPanel p2=new JPanel();
	p2.add(b1);
	p2.add(b2);
	p2.add(b3);
	this.getContentPane().add(tpan, BorderLayout.NORTH);
	this.getContentPane().add(p1,BorderLayout.CENTER);
	this.getContentPane().add(p2,BorderLayout.SOUTH);
	
	setSize(400,600);
	setVisible(true);
	
	
	}
	class Remove implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
}
