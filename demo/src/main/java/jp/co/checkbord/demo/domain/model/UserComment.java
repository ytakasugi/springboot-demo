package jp.co.checkbord.demo.domain.model;

import jp.co.checkbord.demo.domain.type.Comment;
import jp.co.checkbord.demo.domain.type.MailAddress;
import jp.co.checkbord.demo.domain.type.Name;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class UserComment {
    private final Name name;
    private final UserId userId;
    private final MailAddress mailAddress;
    private final Comment comment;

    public static UserComment from(String name, String userId, String mailAddress, String comment) {
        return new UserComment (
            Name.from(name),
            UserId.from(userId),
            MailAddress.from(mailAddress),
            Comment.form(comment)
        );
    }
    
}
