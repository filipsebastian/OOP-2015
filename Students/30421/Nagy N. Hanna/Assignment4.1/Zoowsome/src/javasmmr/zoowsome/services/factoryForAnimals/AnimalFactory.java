package javasmmr.zoowsome.services.factoryForAnimals;

import javasmmr.zoowsome.services.factoryForAnimals.Constants.Species;

public class AnimalFactory {

	public SpeciesFactory getSpeciesFactory(String type) {
		
		if (Constants.Species.Mammals.equals(type)) {
			return new MammalFactory();
		} else if (Constants.Species.Reptiles.equals(type)) {
			return new ReptileFactory();
		} else if (Constants.Species.Birds.equals(type)) {
			return new BirdFactory();
		} else if (Constants.Species.Insects.equals(type)) {
			return new InsectFactory();
		} else if (Constants.Species.Aquatics.equals(type)) {
			return new AquaticFactory();
		} else
			return null;
	}

}
