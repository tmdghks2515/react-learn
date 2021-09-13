package com.anan.reactback;

import com.anan.reactback.domain.entity.Member;
import com.anan.reactback.domain.entity.Post;
import com.anan.reactback.domain.repository.MemberRepository;
import com.anan.reactback.domain.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RequiredArgsConstructor
public class ReactBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactBackApplication.class, args);
	}

	private final PostRepository postRepository;
	private final MemberRepository memberRepository;

	@PostConstruct
	@Transactional
	public void init() {
		Member m = Member.builder()
				.loginId("tmdghks2515")
				.age(26)
				.password("1234")
				.username("아난1호")
				.build();
		memberRepository.save(m);

		List<Post> posts = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			Post post = Post.builder()
					.type(i/34)
					.content("게시글"+i+"호")
					.title("제목"+i+"호")
					.member(m)
					.build();
			posts.add(post);
		}
		postRepository.saveAll(posts);
	}

}
