package com.infosys.adminoperation;

import java.sql.SQLException;

public interface AdminOperation {
	public abstract void displayAllScoresAscending() throws SQLException;
	public abstract void fetchStudentScoreById() throws SQLException;
	public abstract void addQuestionWithOptions() throws SQLException;

}
