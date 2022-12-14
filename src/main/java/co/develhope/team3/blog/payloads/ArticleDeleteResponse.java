package co.develhope.team3.blog.payloads;

import co.develhope.team3.blog.dto.ArticleDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ArticleDeleteResponse {

    private String message;
    private ArticleDto articleDto;

}
