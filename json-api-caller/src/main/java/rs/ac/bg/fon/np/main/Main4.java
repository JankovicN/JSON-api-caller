package rs.ac.bg.fon.np.main;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

import rs.ac.bg.fon.np.domain.Bored;

public class Main4 {

	public static void main(String[] args) {
		
		Bored bored= new Bored();
		bored.setActivity("Learn how to ski");
		bored.setParticipants(1);
		bored.setType("recreational");
		
		JsonObject objectBored = new JsonObject();
		objectBored.addProperty("activity", bored.getActivity());
		objectBored.addProperty("participants", bored.getParticipants());
		objectBored.addProperty("type", bored.getType());
		
		try(FileWriter out =new FileWriter("rucni_upis.json")) {
			Gson gson = new GsonBuilder().setPrettyPrinting().create();
			
			out.write(gson.toJson(objectBored));
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
