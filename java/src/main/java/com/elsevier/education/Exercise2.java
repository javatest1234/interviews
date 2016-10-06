package com.elsevier.education;

/**


*/
public class Exercise2 {

	public static class Car {
		
		private GasEngine engine = new GasEngine();
		private ElectricEngine eengine = new ElectricEngine();
		
		public Car() {
		}
		
		public void moveForward() {
			engine.spinWheels();
		}
		
		//refer the method spinWheels() based on type of engine.
		
		public GasEngine getGengine() {
			return gengine;
		}

		public void setGengine(GasEngine gengine) {
			this.gengine = gengine;
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
