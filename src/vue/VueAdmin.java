package vue;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class VueAdmin extends JPanel implements ActionListener {

	private JButton inscrire;
	private JButton retraitDossard;
	private JButton institution;
	private JButton modifInfos;
	
	public VueAdmin()
	{
		this.setLayout(new BorderLayout());
		
		inscrire = new JButton("Inscrire");
		inscrire.addActionListener(this);
		inscrire.setActionCommand("inscrire");
		
		retraitDossard = new JButton("<html><center>Valider retrait<br>dossard</center></html>");
		retraitDossard.addActionListener(this);
		retraitDossard.setActionCommand("dossard");
		
		institution = new JButton("<html><center>Afficher ecoles et entreprises</center></html>");
		institution.addActionListener(this);
		institution.setActionCommand("institution");
		
		modifInfos = new JButton("Modifier informations");
		modifInfos.addActionListener(this);
		modifInfos.setActionCommand("modification");
		
		JLabel titre = new JLabel("Administration", SwingConstants.CENTER);
		titre.setFont(new Font(titre.getFont().getFontName(), titre.getFont().getStyle(), 36));
		
		JPanel pnlBtns = new JPanel();
		pnlBtns.setLayout(new BorderLayout());
		
		pnlBtns.add(new JLabel("           "), BorderLayout.WEST);
		pnlBtns.add(new JLabel("           "), BorderLayout.EAST);
		
		JPanel pnlCenter = new JPanel();
		pnlBtns.add(pnlCenter, BorderLayout.CENTER);

		pnlCenter.setLayout(new GridLayout(2, 1));
		
		JPanel pnlBtnHaut = new JPanel();
		pnlBtnHaut.setLayout(new BorderLayout());
		
		JPanel pnlDeuxBtnHaut = new JPanel();
		JPanel pnlBtnGaucheHaut = new JPanel();
		
		pnlBtnGaucheHaut.setLayout(new BorderLayout());
		pnlBtnGaucheHaut.add(inscrire, BorderLayout.CENTER);
		pnlBtnGaucheHaut.add(new JLabel("  "), BorderLayout.EAST);
		
		pnlDeuxBtnHaut.setLayout(new GridLayout(1,3));
		pnlDeuxBtnHaut.add(pnlBtnGaucheHaut);
		pnlDeuxBtnHaut.add(retraitDossard);
		
		pnlBtnHaut.add(new JLabel("  "), BorderLayout.NORTH);
		pnlBtnHaut.add(new JLabel("  "), BorderLayout.SOUTH);
		pnlBtnHaut.add(new JLabel("  "), BorderLayout.EAST);
		pnlBtnHaut.add(new JLabel("  "), BorderLayout.WEST);
		pnlBtnHaut.add(pnlDeuxBtnHaut, BorderLayout.CENTER);
		
		JPanel pnlBtnBas = new JPanel();
		pnlBtnBas.setLayout(new BorderLayout());
		
		JPanel pnlDeuxBtnBas = new JPanel();
		JPanel pnlBtnGaucheBas = new JPanel();
		
		pnlBtnGaucheBas.setLayout(new BorderLayout());
		pnlBtnGaucheBas.add(institution, BorderLayout.CENTER);
		pnlBtnGaucheBas.add(new JLabel("  "), BorderLayout.EAST);
		
		pnlDeuxBtnBas.setLayout(new GridLayout(1,3));
		pnlDeuxBtnBas.add(pnlBtnGaucheBas);
		pnlDeuxBtnBas.add(modifInfos);
		
		pnlBtnBas.add(new JLabel("  "), BorderLayout.NORTH);
		pnlBtnBas.add(new JLabel("  "), BorderLayout.SOUTH);
		pnlBtnBas.add(new JLabel("  "), BorderLayout.EAST);
		pnlBtnBas.add(new JLabel("  "), BorderLayout.WEST);
		pnlBtnBas.add(pnlDeuxBtnBas, BorderLayout.CENTER);
		
		//
		
		pnlCenter.add(pnlBtnHaut);
		pnlCenter.add(pnlBtnBas);
		
		this.add(titre, BorderLayout.NORTH);
		this.add(pnlBtns, BorderLayout.CENTER);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getActionCommand());
	}
	
}
	