package com.nhnnext.score;

import java.util.Scanner;

import com.nhnnext.score.lecture.Lecture;
import com.nhnnext.score.lecture.PassFailGrader;
import com.nhnnext.score.lecture.StandardGrader;

public class Score {
	public static void main(String [] args) {
		Lecture lecture = null;
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.print("grader? ");
			switch(scanner.next()) {
			case "st":
				lecture = new Lecture(new StandardGrader());
				break;
			case "pf":
				lecture = new Lecture(new PassFailGrader());			
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
