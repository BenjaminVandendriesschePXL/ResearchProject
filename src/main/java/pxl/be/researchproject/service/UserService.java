package pxl.be.researchproject.service;

import pxl.be.researchproject.api.MovieDTO;
import pxl.be.researchproject.api.MovieRequest;
import pxl.be.researchproject.api.UserDTO;
import pxl.be.researchproject.api.UserRequest;

import java.util.List;

public interface UserService {

    List<UserDTO> findAllUsers();
    UserDTO findUserById(Long userId);
    Long createUser(UserRequest userRequest);
    UserDTO updateUser(Long userId, UserRequest userRequest);
    boolean deleteUser(Long userId);
}
