package com.anan.reactback.domain.entity;

import com.anan.reactback.domain.dto.MemberDto;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString(of = {"loginId", "username", "age"})
public class Member {
    @Id @GeneratedValue
    private Long id;
    private String loginId;
    private String password;
    private String username;
    private int age;

    @OneToMany(mappedBy = "member")
    private List<Post> posts = new ArrayList<>();

    public MemberDto convertToDto() {
        return MemberDto.builder()
                .id(this.id)
                .loginId(this.loginId)
                .age(this.age)
                .username(this.username)
//                .postDtos()
                .build();
    }
}
