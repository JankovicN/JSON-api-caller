package rs.ac.bg.fon.np.domain;

public class Bored {

	private String activity;
	private String type;
	private int participants;

	public Bored() {
		// TODO Auto-generated constructor stub
	}

	public String getActivity() {
		return activity;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getParticipants() {
		return participants;
	}

	public void setParticipants(int participants) {
		this.participants = participants;
	}

	@Override
	public String toString() {
		return "\nYour activity is: " + activity + "\nType of activity: " + type
				+ "\nNumber of participants for this activity: " + participants + "\n";
	}

}
