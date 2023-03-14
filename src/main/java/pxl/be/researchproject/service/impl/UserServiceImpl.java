package pxl.be.researchproject.service.impl;

import org.springframework.stereotype.Service;
import pxl.be.researchproject.api.UserDTO;
import pxl.be.researchproject.api.UserRequest;
import pxl.be.researchproject.service.UserService;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Override
    public List<UserDTO> findAllUsers() {
        return null;
    }

    @Override
    public UserDTO findUserById(Long userId) {
        return null;
    }

    @Override
    public Long createUser(UserRequest userRequest) {
        return null;
    }

    @Override
    public UserDTO updateUser(Long userId, UserRequest userRequest) {
        return null;
    }

    @Override
    public boolean deleteUser(Long userId) {
        return false;
    }
}
