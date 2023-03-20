abstract class Vaccine {
	public abstract void firstDose(String nationality, int age);

	public abstract void secondDose();
}

class Vaccination extends Vaccine {
	boolean firstDoseTaken = false;

	public void firstDose(String nationality, int age) {
		if (nationality.equals("Indian") && age >= 18) {
			System.out.println("First dose taken. Please pay 50rs.");
			firstDoseTaken = true;
		} else {
			System.out.println("Sorry, you are not eligible for the first dose.");
		}
	}

	public void secondDose() {
		if (firstDoseTaken) {
			System.out.println("Second dose taken.");
		} else {
			System.out.println("Please take the first dose before taking the second dose.");
		}
	}

	public static void main(String[] args) {
		Vaccination vaccine = new Vaccination();
		vaccine.firstDose("Indian", 18); // First dose taken. Please pay 50rs.
		vaccine.firstDose("American", 20); // Sorry, you are not eligible for the first dose.
		vaccine.secondDose(); // Please take the first dose before taking the second dose.
		vaccine.firstDose("Indian", 20); // Sorry, you are not eligible for the first dose.
		vaccine.secondDose(); // Please take the first dose before taking the second dose.
		vaccine.firstDose("Indian", 18); // First dose taken. Please pay 50rs.
		vaccine.secondDose(); // Second dose taken.
	}
}

class VaccinationSuccessful extends Vaccine {
	public void firstDose(String nationality, int age) {
		System.out.println("You have already taken the first dose.");
	}

	public void secondDose() {
		System.out.println("You have already taken the second dose.");
	}

	public void boosterDose() {
		System.out.println("Booster dose taken.");
	}

	public static void main(String[] args) {
		VaccinationSuccessful vs = new VaccinationSuccessful();
		vs.boosterDose(); // Booster dose taken.
	}
}




