package de.unistuttgart.iste.sqa.pse.sheet08.homework.olympics;

/**
 * This class manages the Sprinter Race Plan.
 *
 * @author Marvin Spiegel, Ismail Ratni
 */
public final class SprinterRacePlan implements RacePlan {

	@Override
	public void nextStep(final RunnerHamster hamster) {
		while (!hamster.hasFinished()) {
			hamster.executeNextAction();
		}
	}
}