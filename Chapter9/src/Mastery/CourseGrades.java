package Mastery;

public class CourseGrades {

	public static void main(String[] args) {
		GradeBook grades = new GradeBook(2, 3);
		grades.getGrades();
		
		grades.showGrades();
		
		grades.studentAvg();
		
		grades.testAvg();
	}

}
/*
SCREENDUMP #1:
Enter test score 1 for student 1: 65
Enter test score 2 for student 1: 78
Enter test score 3 for student 1: 76
Enter test score 1 for student 2: 98
Enter test score 2 for student 2: 99
Enter test score 3 for student 2: 87

Student 1 grade on test 1 is 65
Student 1 grade on test 2 is 78
Student 1 grade on test 3 is 76
Student 2 grade on test 1 is 98
Student 2 grade on test 2 is 99
Student 2 grade on test 3 is 87

Student 1 average grade is 73
Student 2 average grade is 94

test 1 average grade is 81
test 2 average grade is 88
test 3 average grade is 81
SCREENDUMP #2:
Enter test score 1 for student 1: 54
Enter test score 2 for student 1: 65
Enter test score 3 for student 1: 76
Enter test score 4 for student 1: 87
Enter test score 5 for student 1: 98
Enter test score 1 for student 2: 98
Enter test score 2 for student 2: 99
Enter test score 3 for student 2: 77
Enter test score 4 for student 2: 66
Enter test score 5 for student 2: 
55
Enter test score 1 for student 3: 55
Enter test score 2 for student 3: 66
Enter test score 3 for student 3: 44
Enter test score 4 for student 3: 34
Enter test score 5 for student 3: 23
Enter test score 1 for student 4: 56
Enter test score 2 for student 4: 78
Enter test score 3 for student 4: 65
Enter test score 4 for student 4: 43
Enter test score 5 for student 4: 56
Enter test score 1 for student 5: 7
Enter test score 2 for student 5: 88
Enter test score 3 for student 5: 9
Enter test score 4 for student 5: 77
Enter test score 5 for student 5: 54
Enter test score 1 for student 6: 90
Enter test score 2 for student 6: 87
Enter test score 3 for student 6: 89
Enter test score 4 for student 6: 72
Enter test score 5 for student 6: 12
Enter test score 1 for student 7: 34
Enter test score 2 for student 7: 67
Enter test score 3 for student 7: 68
Enter test score 4 for student 7: 59
Enter test score 5 for student 7: 45
Enter test score 1 for student 8: 75
Enter test score 2 for student 8: 43
Enter test score 3 for student 8: 56
Enter test score 4 for student 8: 71
Enter test score 5 for student 8: 23
Enter test score 1 for student 9: 43
Enter test score 2 for student 9: 57
Enter test score 3 for student 9: 65
Enter test score 4 for student 9: 76
Enter test score 5 for student 9: 87
Enter test score 1 for student 10: 89
Enter test score 2 for student 10: 76
Enter test score 3 for student 10: 54
Enter test score 4 for student 10: 98
Enter test score 5 for student 10: 99
Enter test score 1 for student 11: 54
Enter test score 2 for student 11: 32
Enter test score 3 for student 11: 67
Enter test score 4 for student 11: 88
Enter test score 5 for student 11: 61
Enter test score 1 for student 12: 23
Enter test score 2 for student 12: 56
Enter test score 3 for student 12: 423
Enter test score 4 for student 12: 56
Enter test score 5 for student 12: 78

Student 1 grade on test 1 is 54
Student 1 grade on test 2 is 65
Student 1 grade on test 3 is 76
Student 1 grade on test 4 is 87
Student 1 grade on test 5 is 98
Student 2 grade on test 1 is 98
Student 2 grade on test 2 is 99
Student 2 grade on test 3 is 77
Student 2 grade on test 4 is 66
Student 2 grade on test 5 is 55
Student 3 grade on test 1 is 55
Student 3 grade on test 2 is 66
Student 3 grade on test 3 is 44
Student 3 grade on test 4 is 34
Student 3 grade on test 5 is 23
Student 4 grade on test 1 is 56
Student 4 grade on test 2 is 78
Student 4 grade on test 3 is 65
Student 4 grade on test 4 is 43
Student 4 grade on test 5 is 56
Student 5 grade on test 1 is 7
Student 5 grade on test 2 is 88
Student 5 grade on test 3 is 9
Student 5 grade on test 4 is 77
Student 5 grade on test 5 is 54
Student 6 grade on test 1 is 90
Student 6 grade on test 2 is 87
Student 6 grade on test 3 is 89
Student 6 grade on test 4 is 72
Student 6 grade on test 5 is 12
Student 7 grade on test 1 is 34
Student 7 grade on test 2 is 67
Student 7 grade on test 3 is 68
Student 7 grade on test 4 is 59
Student 7 grade on test 5 is 45
Student 8 grade on test 1 is 75
Student 8 grade on test 2 is 43
Student 8 grade on test 3 is 56
Student 8 grade on test 4 is 71
Student 8 grade on test 5 is 23
Student 9 grade on test 1 is 43
Student 9 grade on test 2 is 57
Student 9 grade on test 3 is 65
Student 9 grade on test 4 is 76
Student 9 grade on test 5 is 87
Student 10 grade on test 1 is 89
Student 10 grade on test 2 is 76
Student 10 grade on test 3 is 54
Student 10 grade on test 4 is 98
Student 10 grade on test 5 is 99
Student 11 grade on test 1 is 54
Student 11 grade on test 2 is 32
Student 11 grade on test 3 is 67
Student 11 grade on test 4 is 88
Student 11 grade on test 5 is 61
Student 12 grade on test 1 is 23
Student 12 grade on test 2 is 56
Student 12 grade on test 3 is 423
Student 12 grade on test 4 is 56
Student 12 grade on test 5 is 78

Student 1 average grade is 29
Student 2 average grade is 30
Student 3 average grade is 17
Student 4 average grade is 22
Student 5 average grade is 18
Student 6 average grade is 26
Student 7 average grade is 21
Student 8 average grade is 20
Student 9 average grade is 25
Student 10 average grade is 32
Student 11 average grade is 23
Student 12 average grade is 48

test 1 average grade is 56
test 2 average grade is 67
test 3 average grade is 91
test 4 average grade is 68
test 5 average grade is 57
*/