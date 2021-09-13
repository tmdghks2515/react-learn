package com.anan.reactback.domain.repository;

import com.anan.reactback.domain.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
