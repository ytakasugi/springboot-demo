package jp.co.checkbord.demo.application.usecase;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import jp.co.checkbord.demo.application.form.CommentForm;
import jp.co.checkbord.demo.domain.model.UserComment;
import jp.co.checkbord.demo.domain.model.UserCommentRepository;

@Service
@RequiredArgsConstructor
public class UserCommentUseCase {
    private final UserCommentRepository repository;
    public void write(CommentForm commentForm) {
        UserComment userComment = UserComment.from(
            commentForm.getName(), 
            commentForm.getMailAddress(), 
            commentForm.getComment()
        );
        repository.save(userComment);
    }
}
