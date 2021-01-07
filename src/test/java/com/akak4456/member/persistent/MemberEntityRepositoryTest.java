package com.akak4456.member.persistent;

import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.test.context.junit4.SpringRunner;

import com.akak4456.ideal.IdealApplication;
import com.akak4456.member.domain.MemberEntity;

import lombok.extern.java.Log;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = IdealApplication.class)
@Transactional
@Commit
@Log
public class MemberEntityRepositoryTest {
	@Autowired
	private MemberEntityRepository memberRepo;
	
	@Test
	public void saveTest() {
		MemberEntity member = MemberEntity.builder().email("akak4456@naver.com").build();
		memberRepo.save(member);
	}
}
