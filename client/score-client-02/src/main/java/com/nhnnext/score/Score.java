package com.nhnnext.score;

import java.util.Scanner;

import com.nhnnext.score.lecture.Lecture;
import com.nhnnext.score.lecture.PassFailGrader;
import com.nhnnext.score.lecture.StandardGrader;
import com.nhnnext.score.scores.HttpScoreRepository;

public class Score {
	public static void main(String [] args) {
		Lecture lecture = null;
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.print("grader? ");
			switch(scanner.next()) {
			case "st":
				lecture = new Lecture(new StandardGrader(), new HttpScoreRepository());
				break;
			case "pf":
				lecture = new Lecture(new PassFailGrader(), new HttpScoreRepository());			
				break;
			default:
				return;
			}
			System.out.println(lecture.grade());
		} finally {
			scanner.close();
		}
	}
}
