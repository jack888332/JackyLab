package test.base.annotation;

public class EnumTest {

	public static void main(String[] args) {
		for (ComboBox s : ComboBox.values()) {
			String name = s.name();
			String desc = s.toString();
			int ordinal = s.ordinal();
			int levelValue = s.getLevelValue();
			double distance = s.getDistance();
			System.out.println("name=" + name + ",  description=" + desc + ",  ordinal=" + ordinal + ", levelValue="
					+ levelValue + ", distance=" + distance);
		}
	}

}
