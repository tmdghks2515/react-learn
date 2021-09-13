package com.anan.reactback.domain.entity;

import com.anan.reactback.domain.dto.PostDto;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString(of = {"type", "type", "title", "content"})
public class Post {
    @Id @GeneratedValue
    private Long id;
    private int type;
    private String title;
    private String content;

    @ManyToOne(fetch = FetchType.LAZY)
    private Member member;

    public PostDto convertToDto() {
        return PostDto.builder()
                .id(this.id)
                .content(this.content)
                .title(this.title)
                .memberDto(this.member.convertToDto())
                .build();
    }
}
