package stream;

public class Site {
	private String name;
	
	public Site() {;}

	public Site(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Site [name=" + name + "]";
	}
	
	
	
}
