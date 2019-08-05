package com.example.friendnotes.validator;

import com.example.friendnotes.exception.FriendValidationException;
import com.example.friendnotes.request.FriendRequest;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import javax.validation.Valid;

@Component
public class FriendRequestValidator {
    public void validate(@Valid FriendRequest friendRequest) {
        if (StringUtils.isBlank(friendRequest.getName())) {
            throw new FriendValidationException("name could not be blank");
        }

        //TODO : validate all fields
    }
}
