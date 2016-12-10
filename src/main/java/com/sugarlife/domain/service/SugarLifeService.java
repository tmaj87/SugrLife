package com.sugarlife.domain.service;

import com.sugarlife.domain.user.User;

public interface SugarLifeService {
    User findUserOrNull(String userName);

}
