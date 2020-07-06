package com.fan.common.dto.request;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class InvitationContentsRequest {
    private List<String> channels;

}
