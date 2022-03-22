package com.jackson.json;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {

	
	public static void main(String[] args) {
		
		try {
			
			//create object mapper
			
			ObjectMapper mapper = new ObjectMapper();
			
			
			//read JSON file and map/convert to Java POJO:
			//dara/sample-lite.json
			
			Student theStudent =
					mapper.readValue(new File("data/sample-full.json"), Student.class);
			
			//print first name and last name
			System.out.println("First name = "+ theStudent.getFirstName()); 
			System.out.println("Last name = "+theStudent.getLastName());
			
			Address tempaddress = theStudent.getAddress();
			System.out.println("City = "+ tempaddress.getCity());
			System.out.println("Country = "+ tempaddress.getCountry());
			
			//print out languages
			for(String templang : theStudent.getLanguages()) {
				System.out.println("Languages ="+templang);
			}
			
		}
		catch(Exception exc) {
			exc.printStackTrace();
			
		}

	}

}
