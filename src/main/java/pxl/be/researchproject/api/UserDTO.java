package pxl.be.researchproject.api;

public record UserDTO(Long id,
                      String nickname,
                      String email,
                      String password) {
}
