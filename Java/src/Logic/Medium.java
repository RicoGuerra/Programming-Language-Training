package Logic;

public abstract class Medium {
	private Long id;
	private String name;

	public Medium(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "ID=" + id + ", " + name + " by ";
	}
}
