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

      return ar;
   }

   // 디테일
   public Bank_DTO detail(Bank_DTO bank_DTO) throws Exception {

      
      return null;
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