package agent.dyn;

public class PersonBeanImpl implements PersonBean {

	String name;
	String gender;
	String interests;
	int rating;
	int ratingcount = 0;
	
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	public String getGender() {
		// TODO Auto-generated method stub
		return gender;
	}

	public String getInterests() {
		// TODO Auto-generated method stub
		return interests;
	}

	public int getHotOrNotRating() {
		// TODO Auto-generated method stub
		if(ratingcount == 0)
			return 0;
		return (rating/ratingcount);
	}

	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}

	public void setGender(String gender) {
		// TODO Auto-generated method stub
		this.gender = gender;
	}

	public void setInterests(String interests) {
		// TODO Auto-generated method stub
		this.interests = interests;
	}

	public void setHotOrNotRating(int rating) {
		// TODO Auto-generated method stub
		this.rating = rating;
		ratingcount++;
	}

}
