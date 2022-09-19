package jp.co.checkbord.demo.infrastructure.datasource;

import jp.co.checkbord.demo.application.dto.UserCommentDto;
import jp.co.checkbord.demo.application.dto.UserCommentReadDto;
import jp.co.checkbord.demo.domain.model.UserComment;
import jp.co.checkbord.demo.domain.model.UserCommentRepository;
import jp.co.checkbord.demo.domain.model.UserComments;
import jp.co.checkbord.demo.domain.model.UserId;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Repository
public class UserCommentDatasource implements UserCommentRepository {
    private final UserCommentMapper mapper;

    @Override
        public void save(UserComment userComment) {
        mapper.insert(UserCommentDto.from(userComment));
    }

    @Override
    public UserComments select() {
        List<UserCommentReadDto> dtos = mapper.select();
        return convert(dtos);
    }

    @Override
    public UserComments select(UserId userId) {
        List<UserCommentReadDto> dtos = mapper.selectById(userId.toString());
        return convert(dtos);
    }

    private UserComments convert(List<UserCommentReadDto> dtos) {
        return UserComments.from(
            dtos.stream().map( dto -> UserComments.UserComment.from(
                dto.getId(),
                dto.getUserId(),
                dto.getName(),
                dto.getMailAddress(),
                dto.getComment(),
                dto.getCreatedAt()
            )).collect(Collectors.toUnmodifiableList())
        );
    }
}