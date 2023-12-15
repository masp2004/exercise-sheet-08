package de.unistuttgart.iste.sqa.pse.sheet08.presence.transportation;

/**
 * A public transportation method for people.
 */
public abstract class PublicTransportation implements Transportation {
	// @ private instance invariant transportationMethodName != null;

	private final String transportationMethodName;

	/*@
	@ requires transportationMethodName != null;
	@ ensures this.transportationMethodName == transportationMethodName;
	@*/
	/**
	 * Creates a new public transportation object.
	 * @param transportationMethodName The name of the transportation method.
	 * @throws IllegalArgumentException If the preconditions are not satisfied.
	 */
	public PublicTransportation(final String transportationMethodName) throws IllegalArgumentException {
		if (transportationMethodName == null) {
			throw new IllegalArgumentException("Transportation type name may not be null.");
		}
		this.transportationMethodName = transportationMethodName;
	}

	/**
	 * Prints the name of the transportation method to the console.
	 */
	public void printTransportationMethodName() {
		System.out.format("Transportation method name: %s%n", transportationMethodName);
	}

	@Override
	public EfficiencyCategory getEfficiencyCategory() {
		return Efficiency.calculateEfficiency(this.getTotalCapacity(), this.getSpeed());
	}

	/*@
	@ ensures \result > 0;
	@*/
	/**
	 * @return The speed of this transportation method in km/h
	 */
	public abstract float getSpeed();

	/**
	 * Prints the general vehicle information of the corresponding transportation method
	 */
	public void printTransportationInfo() {
		System.out.println(
				"Transportation method name: " + transportationMethodName + ", Speed: " + this.getSpeed() + " km/h");
	}
}
