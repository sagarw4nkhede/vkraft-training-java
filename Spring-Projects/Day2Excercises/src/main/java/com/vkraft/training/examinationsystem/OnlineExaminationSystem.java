package com.vkraft.training.examinationsystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Question {
	private String questionText;
	private String[] options;
	private String correctAnswer;

	public Question(String questionText, String[] options, String correctAnswer) {
		this.questionText = questionText;
		this.options = options;
		this.correctAnswer = correctAnswer;
	}

	public String getQuestionText() {
		return questionText;
	}

	public String[] getOptions() {
		return options;
	}

	public String getCorrectAnswer() {
		return correctAnswer;
	}
}

class Quiz {
	private List<Question> questions;
	private int score;

	public Quiz() {
		questions = new ArrayList<>();
		score = 0;
	}

	public void addQuestion(Question question) {
		questions.add(question);
	}

	public void startQuiz() {
		Scanner scanner = new Scanner(System.in);

		for (Question question : questions) {
			System.out.println(question.getQuestionText());
			String[] options = question.getOptions();
			for (int i = 0; i < options.length; i++) {
				System.out.println((i + 1) + ". " + options[i]);
			}

			System.out.print("Your answer: ");
			String userAnswer = scanner.nextLine().trim();

			if (userAnswer.equalsIgnoreCase(question.getCorrectAnswer())) {
				score++;
				System.out.println("Correct!");
			} else {
				System.out.println("Incorrect. The correct answer is: " + question.getCorrectAnswer());
			}
			System.out.println();
		}

		System.out.println("Your final score is: " + score + "/" + questions.size());
	}
}

public class OnlineExaminationSystem {
	public static void main(String[] args) {
		Quiz quiz = new Quiz();

		quiz.addQuestion(new Question("What is the capital of France?",
				new String[] { "Berlin", "Madrid", "Paris", "Rome" }, "Paris"));

		quiz.addQuestion(new Question("Which programming language is known as the 'mother of all languages'?",
				new String[] { "C", "Java", "Assembly", "FORTRAN" }, "FORTRAN"));

		quiz.addQuestion(new Question("What is 5 + 3?", new String[] { "5", "8", "10", "7" }, "8"));

		quiz.startQuiz();
	}
}
