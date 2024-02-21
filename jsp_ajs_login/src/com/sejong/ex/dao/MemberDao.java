package com.sejong.ex.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.sejong.ex.dto.MemberDto;


public class MemberDao {
   
   public static final int MEMBER_LOGIN_FAIL = 0;
   public static final int MEMBER_LOGIN_SUCCESS = 1;
   
   //커넥션 풀 객체
   private DataSource dataSource = null;
   
   
   public MemberDao() {
      try {
         Context context = new InitialContext();
         dataSource = (DataSource) context.lookup("java:comp/env/jdbc/oracle");
      } catch (Exception e) {
         e.printStackTrace();
      }
   }
   

   public int userCheck(String id, String pw){
      int result = MemberDao.MEMBER_LOGIN_FAIL; //0
      
      Connection con=null;
      PreparedStatement pstmt = null;
      ResultSet rs=null;
      
      String sql = "select * from members where id = ? and pw = ?";
      
      try {
   
          con = dataSource.getConnection();
          pstmt = con.prepareStatement(sql);
          pstmt.setString(1, id);
          pstmt.setString(2, pw);    
          rs = pstmt.executeQuery();
         
            if(rs.next()){
             pw = rs.getString("pw");
             id = rs.getString("id");
             System.out.println("로그인 정보 있음 id pw : " + id +" || "+ pw);
             result = MemberDao.MEMBER_LOGIN_SUCCESS; //1
          }     
         
      } catch (Exception e) {
         e.printStackTrace();
      } finally {
         
         try {
               if(rs != null)
                  rs.close();
               
               if(pstmt != null)
                  pstmt.close();
      
               if(con != null)
                  con.close();      
               
         } catch (Exception e2) {
            e2.printStackTrace();
         }
         
      }
      
      return result;
   }
   
   public MemberDto getMember(String id){
      MemberDto dto = null;
      
      Connection con=null;
      PreparedStatement pstmt = null;
      ResultSet rs=null;
      
      String sql = "select * from members where id = ?";
      
      try {
   
          con = dataSource.getConnection();
          pstmt = con.prepareStatement(sql);
          pstmt.setString(1, id);
          rs = pstmt.executeQuery();
         
            if(rs.next()){
               dto = new MemberDto();
               
               dto.setId(rs.getString("id"));
               dto.setPw(rs.getString("pw"));
               dto.setEmail(rs.getString("email"));
               dto.setAddress(rs.getString("address"));            
          
          }     
         
      } catch (Exception e) {
         e.printStackTrace();
      } finally {
         
         try {
               if(rs != null)
                  rs.close();
               
               if(pstmt != null)
                  pstmt.close();
      
               if(con != null)
                  con.close();      
               
         } catch (Exception e2) {
            e2.printStackTrace();
         }
         
      }
      
      return dto;
   }
   
}