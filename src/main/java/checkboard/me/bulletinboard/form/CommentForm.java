package checkboard.me.bulletinboard.form;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

@Data
public class CommentForm {
    private String name;
    private String mailAddress;
    private  String comment;
}
