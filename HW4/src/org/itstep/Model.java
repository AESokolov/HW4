package org.itstep;

import java.util.Scanner;

public class Model {
	private String word;
	private long number;

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public Model(String word, long number) {
		super();
		this.word = word;
		this.number = number;
	}

	public Model() {
		super();
	}

	public String inputWordByScaner1(String word) {
		if (word.equals("Andrey")) { // Имя студента
			String correctWord = word;
			return correctWord;
		} else {
			return null;
		}
	}

	public long inputWordByScaner2(long number) {
		if (number == 4) {
			long correctNumber = number;
			return correctNumber;
		} else {
			return 0;
		}
	}

	public String writeSentence(String word1, long number) {
		return word1 + " " + number;
	}
}
