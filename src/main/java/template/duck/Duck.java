package template.duck;

public class Duck implements Comparable {

	String name = "";
	int weight=1;
	
	public Duck(String name, int weight) {
		super();
		this.name = name;
		this.weight = weight;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Duck b = (Duck) o;
		if(this.weight > b.weight){
			return 1;
		}
		else{
			return -1;
		}
	}

	@Override
	public String toString() {
		return "Duck [name=" + name + ", weight=" + weight + "]";
	}

}
