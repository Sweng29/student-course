package com.dummy.course.model;

import com.dummy.course.model.constants.MessageType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ChatMessage {

    private MessageType messageType;
    private String content;
    private String sender;

}
