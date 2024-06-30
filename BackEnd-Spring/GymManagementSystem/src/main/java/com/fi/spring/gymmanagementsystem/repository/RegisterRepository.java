package com.fi.spring.gymmanagementsystem.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.fi.spring.gymmanagementsystem.entity.MemberLoginEntity;

public interface RegisterRepository extends JpaRepository<MemberLoginEntity, String> 
{
	@Query(nativeQuery = true,value = "select * from member where email=:nameemail and password=:namepassword")
	public MemberLoginEntity authMember(@Param("nameemail")String email,@Param("namepassword")String password);
	
	@Query(nativeQuery = true,value = "select * from member")
	public List<MemberLoginEntity> getAllMembers();
	
	@Modifying
    @Transactional
    @Query(nativeQuery=true,value="insert into member(memberid,membername,email,password,contactno,age,address,confirmpassword,membershipid) values(:memberid,:membername,:email,:password,:contactno,:age,:address,:confirmpassword,:membershipid)")
    public int addNewMember( @Param("memberid")int memberid, @Param("membername")String membername, @Param("email")String email,
    		@Param("password")String password, @Param("contactno")String contactno, @Param("age")int age, @Param("address")String address, @Param("confirmpassword")String confirmpassword,@Param("membershipid")int membershipid);
	
}
