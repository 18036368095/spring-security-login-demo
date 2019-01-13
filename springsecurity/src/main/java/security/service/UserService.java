package security.service;

import security.domain.User;

public interface UserService {

    User findUserByName(String name);
}
