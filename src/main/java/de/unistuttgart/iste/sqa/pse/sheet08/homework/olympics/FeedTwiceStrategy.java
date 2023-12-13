package de.unistuttgart.iste.sqa.pse.sheet08.homework.olympics;

/**
 * A feeding strategy that feeds the hamster twice.
 *
 * @author Marvin Spiegel, Ismail Ratni
 */
public final class FeedTwiceStrategy implements FeedingStrategy {
	private int numberOfFeedings = 0;

	@Override
	public boolean isFeedingRequired() {
		if (numberOfFeedings < 2) {
			numberOfFeedings++;
			return true;
		}
		return false;
	}
}