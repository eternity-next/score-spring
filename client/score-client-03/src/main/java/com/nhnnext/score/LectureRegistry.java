package com.nhnnext.score;

import com.nhnnext.score.lecture.Lecture;
import com.nhnnext.score.lecture.PassFailGrader;
import com.nhnnext.score.lecture.StandardGrader;
import com.nhnnext.score.scores.HttpScoreRepository;
import com.nhnnext.score.scores.ScoreRepository;

public class LectureRegistry {
	private Lecture standardGradeLecture;
	private Lecture passFailGradeLecture;
	
	public LectureRegistry() {
		ScoreRepository repository = new HttpScoreRepository();
		standardGradeLecture = new Lecture(new StandardGrader(), repository); 
		passFailGradeLecture = new Lecture(new PassFailGrader(), repository);
	}
	
	public Lecture getStandardGradeLecture() {
		return standardGradeLecture;
	}
	
	public Lecture getPassFailGradeLecture() {
		return passFailGradeLecture;
	}
}
