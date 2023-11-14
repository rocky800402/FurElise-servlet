package com.furelise.estabcase;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import util.Util;

public class EstabCaseDAOImpl implements EstabCaseDAO{
	private static final String INSERT_STMT = 
			"INSERT INTO estabcase(estabCaseID, empID, planOrdID, estabCaseDate, estabCaseStart, estabCaseEnd, planPricePerCase, estabCasePic, takeStatus, estabCaseStatus, estabCaseLevel, estabCaseFeedback, estabCaseFBTime)VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	private static final String UPDATE_STMT =
			"UPDATE estabcase SET empID = ?, planOrdID = ?, estabCaseDate = ?, estabCaseStart = ?, estabCaseEnd = ?, planPricePerCase = ?, estabCasePic = ?, takeStatus = ?, estabCaseStatus = ?, estabCaseLevel = ?, estabCaseFeedback = ?, estabCaseFBTime = ? WHERE estabCaseID = ?";
	private static final String DELETE_STMT  =
			"DELETE FROM estabcase WHERE estabCaseID = ?";
	private static final String FIND_BY_PK =
			"SELECT * FROM estabcase WHERE estabCaseID = ?";
	private static final String GET_ALL = 
			"SELECT * FROM estabcase";
	
	static {
		try {
			Class.forName(Util.DRIVER);
		} catch (ClassNotFoundException ce) {
			// TODO Auto-generated catch block
			ce.printStackTrace();
		}
	}
	
	
	@Override
	public void add(EstabCase estabCase) {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = DriverManager.getConnection(Util.URL,Util.USER,Util.PASSWORD);
			pstmt = con.prepareStatement(INSERT_STMT);
			
			pstmt.setInt(1, estabCase.getEstabCaseID());
			pstmt.setInt(2, estabCase.getEmpID());
			pstmt.setInt(3, estabCase.getPlanOrdID());
			pstmt.setDate(4, estabCase.getEstabCaseDate());
			pstmt.setTimestamp(5, estabCase.getEstabCaseStart());
			pstmt.setTimestamp(6, estabCase.getEstabCaseEnd());
			pstmt.setBigDecimal(7, estabCase.getPlanPricePerCase());
			pstmt.setBytes(8, estabCase.getEstabCasePic());
			pstmt.setByte(9, estabCase.getTakeStatus());
			pstmt.setInt(10, estabCase.getEstabCaseStatus());
			pstmt.setInt(11, estabCase.getEstabCaseLevel());
			pstmt.setString(12, estabCase.getEstabCaseFeedback());
			pstmt.setTimestamp(13, estabCase.getEstabCaseFBTime());
			
			pstmt.executeUpdate();
			
			
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			}finally {
				closeResources(con, pstmt, null);
			}
		
	}

	@Override
	public void update(EstabCase estabCase) {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = DriverManager.getConnection(Util.URL,Util.USER,Util.PASSWORD);
			pstmt = con.prepareStatement(INSERT_STMT);
			
			pstmt.setInt(1, estabCase.getEstabCaseID());
			pstmt.setInt(2, estabCase.getEmpID());
			pstmt.setInt(3, estabCase.getPlanOrdID());
			pstmt.setDate(4, estabCase.getEstabCaseDate());
			pstmt.setTimestamp(5, estabCase.getEstabCaseStart());
			pstmt.setTimestamp(6, estabCase.getEstabCaseEnd());
			pstmt.setBigDecimal(7, estabCase.getPlanPricePerCase());
			pstmt.setBytes(8, estabCase.getEstabCasePic());
			pstmt.setByte(9, estabCase.getTakeStatus());
			pstmt.setInt(10, estabCase.getEstabCaseStatus());
			pstmt.setInt(11, estabCase.getEstabCaseLevel());
			pstmt.setString(12, estabCase.getEstabCaseFeedback());
			pstmt.setTimestamp(13, estabCase.getEstabCaseFBTime());
			
			pstmt.executeUpdate();
			
			
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			}finally {
				closeResources(con, pstmt, null);
			}
		
	}

	@Override
	public EstabCase findByPK(Integer estabCaseID) {
		EstabCase estabCase = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {

			con = DriverManager.getConnection(Util.URL, Util.USER, Util.PASSWORD);
			pstmt = con.prepareStatement(FIND_BY_PK);
			pstmt.setInt(1, estabCaseID);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				estabCase = new EstabCase();
				estabCase.setEstabCaseID(rs.getInt("estabCaseID"));
				estabCase.setEmpID(rs.getInt("empID"));
				estabCase.setPlanOrdID(rs.getInt("planOrdID"));
				estabCase.setEstabCaseDate(rs.getDate("estabCaseDate"));
				estabCase.setEstabCaseStart(rs.getTimestamp("estabCaseStart"));
				estabCase.setEstabCaseEnd(rs.getTimestamp("estabCaseEnd"));
				estabCase.setPlanPricePerCase(rs.getBigDecimal("planPricePerCase"));
				estabCase.setEstabCasePic(rs.getBytes("estabCasePic"));
				estabCase.setTakeStatus(rs.getByte("takeStatus"));
				estabCase.setEstabCaseStatus(rs.getInt("estabCaseStatus"));
				estabCase.setEstabCaseLevel(rs.getInt("estabCaseLevel"));
				estabCase.setEstabCaseFeedback(rs.getString("estabCaseFeedback"));
				estabCase.setEstabCaseFBTime(rs.getTimestamp("estabCaseFBTime"));
				
//				
			}

		} catch (SQLException se) {
			se.printStackTrace();
			// Clean up JDBC resources
		} finally {
			closeResources(con, pstmt, rs);
		}

		return estabCase;
	}

	@Override
	public List<EstabCase> getAll() {
		List<EstabCase> estabCaseList = new ArrayList<>();
		EstabCase estabCase = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {

			con = DriverManager.getConnection(Util.URL, Util.USER, Util.PASSWORD);
			pstmt = con.prepareStatement(GET_ALL);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				estabCase = new EstabCase();
				estabCase.setEstabCaseID(rs.getInt("estabCaseID"));
				estabCase.setEmpID(rs.getInt("empID"));
				estabCase.setPlanOrdID(rs.getInt("planOrdID"));
				estabCase.setEstabCaseDate(rs.getDate("estabCaseDate"));
				estabCase.setEstabCaseStart(rs.getTimestamp("estabCaseStart"));
				estabCase.setEstabCaseEnd(rs.getTimestamp("estabCaseEnd"));
				estabCase.setPlanPricePerCase(rs.getBigDecimal("planPricePerCase"));
				estabCase.setEstabCasePic(rs.getBytes("estabCasePic"));
				estabCase.setTakeStatus(rs.getByte("takeStatus"));
				estabCase.setEstabCaseStatus(rs.getInt("estabCaseStatus"));
				estabCase.setEstabCaseLevel(rs.getInt("estabCaseLevel"));
				estabCase.setEstabCaseFeedback(rs.getString("estabCaseFeedback"));
				estabCase.setEstabCaseFBTime(rs.getTimestamp("estabCaseFBTime"));
				estabCaseList.add(estabCase);
//				
			}

		} catch (SQLException se) {
			se.printStackTrace();
			// Clean up JDBC resources
		} finally {
			closeResources(con, pstmt, rs);
		}

		return estabCaseList;
	}
	
	private void closeResources(Connection con, PreparedStatement pstmt, ResultSet rs) {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException se) {
				se.printStackTrace(System.err);
			}
		}
		if (pstmt != null) {
			try {
				pstmt.close();
			} catch (SQLException se) {
				se.printStackTrace(System.err);
			}
		}
		if (con != null) {
			try {
				con.close();
			} catch (Exception e) {
				e.printStackTrace(System.err);
			}
		}
	}
	

}
