package models;

public class GoodStudent extends Student {
	double gpa;
	String bestRewardName;

	public GoodStudent() {
		super();
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public String getBestRewardName() {
		return bestRewardName;
	}

	public void setBestRewardName(String bestRewardName) {
		this.bestRewardName = bestRewardName;
	}

	@Override
	public String ShowMyInfor() {
		return super.ShowMyInfor() + '\'' + ", gpa='" + getGpa() + '\'' + ", bestRewardName='" + getBestRewardName();
	}
}
