package utils;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.json.JSONObject;

import com.fasterxml.jackson.databind.ObjectMapper;

import beans.User;

public class APIUtils {

	public enum PASSWORD {
		john123, mayur456, william45, great100;
	}

	public static String getPassowrd() {
		Random random = new Random();
		List<PASSWORD> enumValues = Arrays.asList(PASSWORD.values());
		return enumValues.get(random.nextInt(enumValues.size())).name();
	}

	public static User getRandomUser() {

		String email = RandomStringUtils.random(8, "mayur") + "@" + RandomStringUtils.random(6, "yahoogmailhotmail")+ ".com";
		String username = RandomStringUtils.random(7, "johnmayur");
		return new User(username, email, getPassowrd());
	}
	
	public static <T> JSONObject serializeJavatoJson(T object) {
		ObjectMapper objectMapper= new ObjectMapper();
		JSONObject jsonObject = new JSONObject();
		try {
			jsonObject.put("user", new JSONObject(objectMapper.writeValueAsString(object)));
			System.out.println("The Serialized JSON String is:\n"+jsonObject.toString());
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Exception occured while Creating JSON from JAVA Object"+e.getMessage());
		}
		return jsonObject;
	}
}
