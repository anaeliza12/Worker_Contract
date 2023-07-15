package entities;

public class Department {
	@Override
	public String toString() {
		return "Department [name=" + name + "]";
	}

	private String name;

	public String getName() {
		return name;
	}

	public Department(String name) {
		super();
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
