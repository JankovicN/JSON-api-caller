package rs.ac.bg.fon.np.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import rs.ac.bg.fon.np.domain.Bored;

public class Main1 {

	public static void main(String[] args) {
		
		try {
			
			URL url = new URL("http://www.boredapi.com/api/activity/");
			
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("GET");
			
			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			
			Gson gson = new GsonBuilder().create();
			Bored bored= gson.fromJson(in, Bored.class);
			
			System.out.println(bored);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
