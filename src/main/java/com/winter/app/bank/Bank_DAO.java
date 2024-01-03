package com.winter.app.bank;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.jsp.jstl.sql.Result;

import com.winter.app.util.DBConnector;




public class Bank_DAO {

	// 목록
	public List<Bank_DTO> getList() throws Exception {
		Connection con = DBConnector.getConnector();
		String sql = "SELECT productnum,productname  FROM product";
		PreparedStatement st = con.prepareStatement(sql);
		ResultSet rs = st.executeQuery();
		
		ArrayList<Bank_DTO> ar = new ArrayList<Bank_DTO>();
		while(rs.next()) {
			Bank_DTO bank_DTO = new Bank_DTO();
			Long n = rs.getLong("productnum");
			bank_DTO.setProductNum(n);
			bank_DTO.setProductName("productname");
			
			ar.add(bank_DTO);
		}
		DBConnector.disConnect(rs, st, con);
		return ar;
	}

	// 디테일
	public Bank_DTO detail(Bank_DTO bank_DTO) throws Exception {
		Connection con = DBConnector.getConnector();
		String sql = "SELECT * FROM product WHERE PRODUCTNUM=?";
		PreparedStatement st = con.prepareStatement(sql);
		ResultSet rs = st.executeQuery();
		Bank_DTO resultDTO=null;
		if(rs.next()) {
			resultDTO = new Bank_DTO();
			resultDTO.setProductNum(rs.getLong("productnum"));
			resultDTO.setProductName(rs.getString("productname"));
			resultDTO.setProductContents(rs.getString("productcontents"));
			resultDTO.setProductRate(rs.getDouble("productrate"));
			resultDTO.setProductJumsu(rs.getDouble("productjumsu"));
		}
		return resultDTO;
	}

	// 등록
	public int doAdd(Bank_DTO bank_DTO) throws Exception {

		return 0;
	}

	// 수정
	public int update(Bank_DTO bank_DTO) throws Exception {

		return 0;
	}

	// 삭제
	public int delete(Bank_DTO bank_DTO) throws Exception {

		return 0;
	}

}
