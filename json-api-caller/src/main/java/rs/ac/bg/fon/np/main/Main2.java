package rs.ac.bg.fon.np.main;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import rs.ac.bg.fon.np.domain.Bored;

public class Main2 {

	public static void main(String[] args) {
		
		try {
			
			URL url = new URL("http://www.boredapi.com/api/activity/");
			HttpURLConnection con;
			BufferedReader in;
			List<Bored> list = new ArrayList<>();
			
			for(int i =0;i<4;i++) {
				
				con = (HttpURLConnection) url.openConnection();
				con.setRequestMethod("GET");
				in = new BufferedReader(new InputStreamReader(con.getInputStream()));
				
				Gson gson = new GsonBuilder().create();
				Bored bored= gson.fromJson(in, Bored.class);
				list.add(bored);
				in.close();
			}
			
			System.out.println(list);
			
			try(PrintWriter out = new PrintWriter(new FileWriter("niz_objekata.json"))) {
				Gson gson = new GsonBuilder().setPrettyPrinting().create();
				
				out.print(gson.toJson(list));
			}catch(IOException e) {
				e.printStackTrace();
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}
