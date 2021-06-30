package models;

public class NormalStudent extends Student {
	double englishScore;
	double entryTestScore;

	public NormalStudent() {
		super();
	}

	public double getEnglishScore() {
		return englishScore;
	}

	public void setEnglishScore(double englishScore) {
		this.englishScore = englishScore;
	}

	public double getEntryTestScore() {
		return entryTestScore;
	}

	public void setEntryTestScore(double entryTestScore) {
		this.entryTestScore = entryTestScore;
	}

	@Override
	public String ShowMyInfor() {
		// TODO Auto-generated method stub
		return super.ShowMyInfor() + '\'' + ", englishScore='" + getEnglishScore() + '\'' + ", entryTestScore='"
				+ getEntryTestScore();
	}
}
