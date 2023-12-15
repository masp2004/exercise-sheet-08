package de.unistuttgart.iste.sqa.pse.sheet08.homework.olympics;

/**
 * Implements a Race Plan in which the RunnerHamster runs steadily.
 *
 * @author Marvin Spiegel, Ismail Ratni
 */
public final class RunSteadilyRacePlan implements RacePlan {
	@Override
	public void nextStep(final RunnerHamster hamster) {
		while (!hamster.hasFinished()) {
			hamster.runSteadily();
		}
	}
}