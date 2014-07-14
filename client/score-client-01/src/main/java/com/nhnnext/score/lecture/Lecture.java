package com.nhnnext.score.lecture;

import com.nhnnext.score.scores.HttpScoreRepository;

public class Lecture {
	private HttpScoreRepository scoreRepository;
	private Grader grader;
	
	public Lecture(Grader grader) {
		this.grader = grader;
		this.scoreRepository = new HttpScoreRepository();
	}

	public String grade() {
		return grader.grade(scoreRepository.getScores());
	}
}
