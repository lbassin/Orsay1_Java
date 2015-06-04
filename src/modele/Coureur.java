package modele;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

public class Coureur {
	
	public static int NB_COUREURS = 0;
	private int numDossard;
	private String nom;
	private String prenom;
	private char sexe;
	private Date dateNaiss; 
	// Categorie
	private Categorie categorie;
	
	private String adresse;
	private int codePostal;
	private String ville;
	private String etat;
	private String pays;
	private String nationalite;
	private long tel;
	private String email;
	private String club;
	private int numLicense;
	private boolean licenseCopie;
	private String typePaiement;
	private long numCB;
	private int CB_DerniesChiffres;
	private int moisFinCB;
	private int anneeFinCB;
	private boolean paiement;
	private boolean certificatMedical;
	private Date dateInscription;
	private boolean dossardRetire;
	
	// TempsReel
	
	// position
	private int position;
	
	
	private ArrayList<ChronometragePoint> chronos;
	private Ecole_Entreprise institution; // 0..1
	private TypeDossard typeDossard;
	
	
	public Coureur(String nom, String prenom){
		NB_COUREURS++;
		
		this.nom = nom;
		this.prenom = prenom;
		this.numDossard = NB_COUREURS;
		
		chronos = new ArrayList<ChronometragePoint>();
		
		chronos.add(new ChronometragePoint(new Time(01,01,14) , this));
	    chronos.add(new ChronometragePoint(new Time(10,11,14) , this));
		
		position = 1;
		categorie = new Categorie("Cadet", "CA", 1995, 2015);
		
	}
	
	public Coureur(String nom, String prenom, char sexe, Date dateNaiss, String adresse, int cp, 
			String ville, String pays, String nationalite, long tel, String mail, String club, int license,
			Ecole_Entreprise institution)
	{
		NB_COUREURS++;
		
		this.nom = nom;
		this.prenom = prenom;
		this.sexe = sexe;
		this.dateNaiss = dateNaiss;
		this.adresse = adresse;
		this.codePostal = cp;
		this.ville = ville;
		this.pays = pays;
		this.nationalite = nationalite;
		this.tel = tel;
		this.email = mail;
		this.club = club;
		this.numLicense = license;
		this.institution = institution;
		this.numDossard = NB_COUREURS;
	}
	
	public int getNumDossard() 
	{ return numDossard; }
	
	public String getNom() 
	{ return nom; }
	
	public String getPrenom() 
	{ return prenom; }
	
	public Date getDateNaiss() 
	{ return dateNaiss; }
	
	public int getPosition()
	{ return position; }
	
	public String getCodeCategorie()
	{ return categorie.getCode(); }
	
	public String getHeureLigneDepart()
	{
		String heure = "";
		heure += chronos.get(0).getHeure().getHours() + ":";
		heure += chronos.get(0).getHeure().getMinutes() + ":";
		heure += chronos.get(0).getHeure().getSeconds();
		
		return heure;
	}
	
	public String getHeureLigneArrivee()
	{
		String heure = "";
		heure += chronos.get(chronos.size()-1).getHeure().getHours() + ":";
		heure += chronos.get(chronos.size()-1).getHeure().getMinutes() + ":";
		heure += chronos.get(chronos.size()-1).getHeure().getSeconds();
		
		return heure;
	}

	public void setPaiement(String typePaiement) {
		this.typePaiement = typePaiement;
		
	}

	public void setPaiement(String typePaiement, long numCB, int moisCB, int anneeCB, int criptoCB) {
		this.typePaiement = "cb";
		this.numCB = numCB;
		this.moisFinCB = moisCB;
		this.anneeFinCB = anneeCB;
		this.CB_DerniesChiffres = criptoCB;
	}

	public void setTypeDossard(TypeDossard typeDossardTmp) {
		this.typeDossard = typeDossardTmp;
	}

	public void setCategorie(Categorie catTmp) {
		this.categorie=categorie;
	}
	
}




