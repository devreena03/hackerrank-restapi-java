package com.reena.movie;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import com.google.gson.Gson; 
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject; 


public class Solution {

	private static final String URL = "https://jsonmock.hackerrank.com/api/movies/search/?Title=";

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String title = sc.next();
		sc.close();

		List<String> titles = getMovieTitles(title);
		Collections.sort(titles);
		titles.forEach(System.out::println);
	}

	private static List<String> getMovieTitles(String subtitle) throws IOException {
		List<String> titles = new ArrayList<>();
		int page = 1;
		int totalPage = 1;
		String response;

		while (page <= totalPage) {
			URL obj = new URL(URL + subtitle + "&page=" + page);

			HttpURLConnection con = (HttpURLConnection) obj.openConnection();
			con.setRequestMethod("GET");

			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));

			while ((response = in.readLine()) != null) {
				System.out.print(response);

				JsonObject jsonResponse = new Gson().fromJson(response, JsonObject.class);
				totalPage = jsonResponse.get("total_pages").getAsInt();
				JsonArray data = jsonResponse.getAsJsonArray("data");

				for (JsonElement e : data) {
					String title = e.getAsJsonObject().get("Title").getAsString();
					titles.add(title);
				}

			}

			page++;
		}
		return titles;
	}

}
