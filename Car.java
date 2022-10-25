import java.util.*;

public class Car {
		private String make;
		private String model;
		private int modelYear;
		
		public Car() {
			make = "";
		}
		
		public Car(String make, String model) {
			
		}
		
		public String getMake() {
			return make;
		}
		
		public void setMake(String make) {
			this.make = make;
		}
		
		public String getModel() {
			return model;
		}
		
		public void setModel(String model) {
			this.model = model;
		}
		
		public int getModelYear() {
			return modelYear;
		}
		
		public void setModelYear(int modelYear) {
			this.modelYear = modelYear;
		}
		
		public boolean newCar() {
			return modelYear >= 2021;
		}
		
		public String toString() {
			 return "Car{" +
		                "make: '" + make +
		                ", model: '" + model +
		                ", model year: " + modelYear +
		                '}';
		}
		
}
