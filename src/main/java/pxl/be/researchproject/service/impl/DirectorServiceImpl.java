package pxl.be.researchproject.service.impl;

import org.springframework.stereotype.Service;
import pxl.be.researchproject.api.DirectorDTO;
import pxl.be.researchproject.api.DirectorRequest;
import pxl.be.researchproject.service.DirectorService;

import java.util.List;
@Service
public class DirectorServiceImpl implements DirectorService {
    @Override
    public List<DirectorDTO> findAllDirectors() {
        return null;
    }

    @Override
    public DirectorDTO findDirectorById(Long directorId) {
        return null;
    }

    @Override
    public Long createDirector(DirectorRequest directorRequest) {
        return null;
    }

    @Override
    public DirectorDTO updateDirector(Long directorId, DirectorRequest directorRequest) {
        return null;
    }

    @Override
    public boolean deleteDirector(Long directorId) {
        return false;
    }
}
