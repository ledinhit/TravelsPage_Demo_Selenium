package utilities;

import java.time.ZonedDateTime;
import java.util.Random;

public class Generator {
	String[] words = { "man", "mountain", "state", "ocean", "country", "building", "cat", "airline", "Act", "Agree",
			"Arrive", "Ask", "Bake", "Bring", "Build", "Buy" };

	// random vị trí của chữ trong mảng
	public int createRandomNumber() {
		Random ran = new Random();
		int x = ran.nextInt(words.length);
		return x;
	}

	// lấy thời gian hiện tại dùng miliseconds
	public int getTime() {
		return (int) ZonedDateTime.now().toInstant().toEpochMilli();
	}

	// tạo ra chuỗi random
	public String randomString() {
		String randomString = words[createRandomNumber()] + " " + words[createRandomNumber()] + " "
				+ words[createRandomNumber()] + " " + words[createRandomNumber()] + " " + words[createRandomNumber()]
				+ " " + words[createRandomNumber()] + " " + words[createRandomNumber()] + " "
				+ words[createRandomNumber()] + " ";
		return randomString;
	}

	public String getTitle() {
		return randomString() + " Title";
	}
	
	public String getContent() {
		return randomString() + " Content";
	}
}
