package co.develhope.team3.blog.dto;

import co.develhope.team3.blog.models.User;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.Set;

@Data
@NoArgsConstructor
public class CommentDto {

    private Long id;
    private Date createdOn;
    @NotBlank(message = "il commento non puo essere vuoto")
    @Size(max = 1000, message = "il commento puo avere al massimo 1000 caratteri")
    private String content;
    private ArticleDto article;
    private UserDto user;

}