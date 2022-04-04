package rs.ac.bg.fon.np.main;

import java.io.FileReader;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import rs.ac.bg.fon.np.domain.Bored;

public class Main3 {

	public static void main(String[] args) {
		
		try(FileReader in = new FileReader("niz_objekata.json")){
			
			Gson gson = new GsonBuilder().setPrettyPrinting().create();
			
			List<Bored> bored = Arrays.asList(gson.fromJson(in, Bored[].class));
			
			for(Bored b: bored) {
				System.out.println(b);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		

	}

}
