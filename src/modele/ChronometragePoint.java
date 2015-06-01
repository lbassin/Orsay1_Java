package modele;

import java.sql.Time;

public class ChronometragePoint {
	
	private Time heure;
	private PointControle pointControle;
	private Coureur coureur;
	
	public ChronometragePoint(Time heure, PointControle pointControle, Coureur coureur)
	{
		this.heure = heure;
		this.pointControle = pointControle;
		this.coureur = coureur;
	}
	
}
