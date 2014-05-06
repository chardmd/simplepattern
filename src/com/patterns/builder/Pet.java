package com.patterns.builder;
import java.util.Date;

/**
 * 
 * @author Richard Dimalanta
 * Design Pattern Sample - Builder Pattern
 * Sample Usage:
   
   Pet.Builder builder = new Pet.Builder();
   Pet pet = builder
			.withAnimal(Animal.CAT)
			.withAddress("Dau Mabalacat, Philippines")
			.withOwner("Bilzerian")
			.withName("Catty")
			.withTelephone("1231-1231")
			.build();
 
 */
public class Pet {

	private Pet(Animal animal, String name, String owner, String address, 
			String telephone, Date dateOfBirth, String emailAddress) {
	}
	
	public static class Builder {
		
		private Animal animal;
		private String name;
		private String owner;
		private String address;
		private String telephone;
		private Date dateOfBirth;
		private String emailAddress;
		
		public Builder withAnimal(Animal animal) {
			this.animal = animal;
			return this;
		}
		
		public Builder withName(String name) {
			this.name = name;
			return this;
		}
		
		public Builder withOwner(String owner) {
			this.owner = owner;
			return this;
		}
		
		public Builder withAddress(String address) {
			this.address = address;
			return this;
		}
		
		public Builder withTelephone(String telephone) {
			this.telephone =  telephone;
			return this;
		}
		
		public Builder withDateOfBirth(Date dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
			return this;
		}
		
		public Builder withEmailAddress(String emailAddress) {
			this.emailAddress = emailAddress;
			return this;
		}
		
		public Pet build() {
			if (animal == null ||
				name == null ||
				address == null ||
				telephone == null) {
				throw new IllegalStateException("Cannot create Pet object");
			}
			
			return new Pet(animal, name, owner, address, telephone, dateOfBirth, emailAddress);
			
		}
		
	}
}
