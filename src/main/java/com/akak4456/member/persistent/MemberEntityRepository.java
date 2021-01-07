package com.akak4456.member.persistent;

import org.springframework.data.jpa.repository.JpaRepository;

import com.akak4456.member.domain.MemberEntity;

public interface MemberEntityRepository extends JpaRepository<MemberEntity, String> {

}
