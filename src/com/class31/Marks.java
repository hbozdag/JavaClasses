package com.class31;

public abstract class Marks {
	public abstract double getPercentage();
}

class A extends Marks {
	double Eng;
	double Math;
	double Phy;

	A(double Eng, double Math, double Phy) {
		this.Eng = Eng;
		this.Math = Math;
		this.Phy = Phy;
	}

	@Override
	public double getPercentage() {
		double per = ((Eng * 0.30) + (Math * 0.5) + (Phy * 0.2));
		return per;
	}
}

class B extends Marks {
	double Eng;
	double Math;
	double Phy;
	double Che;

	B(double Eng, double Math, double Phy, double Che) {
		this.Eng = Eng;
		this.Math = Math;
		this.Phy = Phy;
		this.Che = Che;
	}

	@Override
	public double getPercentage() {
		double per = ((Eng * 0.3) + (Math * 0.3) + (Phy * 0.2) + (Che * 0.2));
		return per;
	}
}