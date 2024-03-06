package hello.servlet.domain.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MemberRepositoryTest {
    MemberRepository memberRepository = MemberRepository.getInstance();

    @AfterEach
    void afterEach(){
        memberRepository.clearStore();
    }

    @Test
    void save(){
        Member member = new Member("hellp",20);
        Member savedMember=memberRepository.save(member);

        Member findMember = memberRepository.findById(savedMember.getId());

        Assertions.assertThat(findMember).isEqualTo(savedMember);

    }
    @Test
    void findAll(){
        Member m1 = new Member("member1",20);
        Member m2 = new Member("member2",21);
        Member m3 = new Member("member3",21);

        memberRepository.save(m1);
        memberRepository.save(m2);
        memberRepository.save(m3);

        List<Member> result = memberRepository.findAll();
        Assertions.assertThat(result.size()).isEqualTo(3);



    }
}