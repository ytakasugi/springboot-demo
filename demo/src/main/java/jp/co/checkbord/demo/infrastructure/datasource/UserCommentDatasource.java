package jp.co.checkbord.demo.infrastructure.datasource;

import jp.co.checkbord.demo.domain.model.UserComment;
import jp.co.checkbord.demo.application.dto.UserCommentDto;
import jp.co.checkbord.demo.domain.model.UserCommentRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@RequiredArgsConstructor
@Repository
public class UserCommentDatasource implements UserCommentRepository {
    private final UserCommentMapper mapper;

    @Override
    public void save(UserComment userComment) {
        mapper.insert(UserCommentDto.from(userComment));
    }
}