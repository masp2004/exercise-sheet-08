package de.unistuttgart.iste.sqa.pse.sheet08.homework.olympics;

/**
 * Implements a Race Plan in which the RunnerHamster runs slowly.
 */
public final class RunSlowlyRacePlan implements RacePlan {

	@Override
	public void nextStep(final RunnerHamster hamster) {
		hamster.runSlowly();
	}
}