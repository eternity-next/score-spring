package com.nhnnext.score.lecture;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LectureTest {
	@Test
	public void starndardGrade() {
		Lecture lecture = new Lecture(new StandardGrader());
		
		String grade = lecture.grade();
		
		assertEquals("A:1 B:1 C:1 D:0 F:2 ", grade);
	}

	@Test
	public void passFailGrade() {
		Lecture lecture = new Lecture(new PassFailGrader());
		
		String grade = lecture.grade();
		
		assertEquals("Pass:3 Fail:2 ", grade);
	}
}
