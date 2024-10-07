package com.whatsapp.payload;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SendMessageRequest {
    private Integer userId;
    private Integer chatId;
    private String content;
}
