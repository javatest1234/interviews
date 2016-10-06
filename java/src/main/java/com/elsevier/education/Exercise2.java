package com.elsevier.education;

/**


*/
public class Exercise2 {

	public static class Car {
		
		private GasEngine engine = new GasEngine();
		private ElectricEngine eengine = new ElectricEngine();
		
		public Car() {
		}
		
		//For gas engine's spinWheels() reference
		public void moveForward() {
			getEngine().spinWheels();
		}
		//For electric engine's spinWheels() reference
		public void moveForward() {
			 getEengine().spinWheels();
		}
		
		//refer the method spinWheels() based on type of engine.
		
		public GasEngine getEngine() {
			return engine;
		}

		public void setEngine(GasEngine gengine) {
			this.engine = gengine;
		}

		public ElectricEngine getEengine() {
			return eengine;
		}

		public void setEengine(ElectricEngine eengine) {
			this.eengine = eengine;
		}
		
	}
	
	public static class GasEngine {
		public void spinWheels() {
			// no-op for now
		}
	}
	public static class ElectricEngine {
		public void spinWheels() {
			// no-op for now
		}
	}
}
