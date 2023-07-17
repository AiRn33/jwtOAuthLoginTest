package social.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import social.test.kakao.Member;

import java.util.Map;
import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {
    Optional<Member> findByEmail(String email);
}
