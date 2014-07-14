package com.nhnnext.score;

import java.util.Scanner;

import com.nhnnext.score.lecture.Lecture;

public class Score {
	private static LectureRegistry lectureFactory = new LectureRegistry();
	
	public static void main(String [] args) {
		Lecture lecture = null;
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.print("grader? ");
			switch(scanner.next()) {
			case "st":
				lecture = lectureFactory.getStandardGradeLecture();
				break;
			case "pf":
				lecture = lectureFactory.getPassFailGradeLecture();			
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
