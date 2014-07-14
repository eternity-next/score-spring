package com.nhnnext.score.lecture;

import com.nhnnext.score.scores.ScoreRepository;

public class Lecture {
	private ScoreRepository scoreRepository;
	private Grader grader;
	
	public Lecture(Grader grader, ScoreRepository scoreRepository) {
		this.grader = grader;
		this.scoreRepository = scoreRepository;
	}

	public String grade() {
		return grader.grade(scoreRepository.getScores());
	}
}
