package de.unistuttgart.iste.sqa.pse.sheet08.homework.olympics;

/**
 * A feeding strategy that feeds the hamster once.
 *
 * @author Marvin Spiegel, Ismail Ratni
 */
public final class FeedOnceStrategy implements FeedingStrategy {
	private int numberOfFeedings = 0;

	@Override
	public boolean isFeedingRequired() {
		if (numberOfFeedings < 1) {
			numberOfFeedings++;
			return true;
		}
		return false;

	}
}