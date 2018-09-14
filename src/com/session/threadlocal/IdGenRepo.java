package com.session.threadlocal;

import java.util.UUID;


public class IdGenRepo {
    String getUserNameForUserId(Integer userId) {
        return UUID.randomUUID().toString();
    }
}
