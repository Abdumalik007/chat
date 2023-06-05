package uz.limon.chatsecurity.dto.custom;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MessageCustomDTO {

    private String userName;
    private String chatName;
    private String content;
    private String type;
    private String ext;
    private String createdAt;

}
