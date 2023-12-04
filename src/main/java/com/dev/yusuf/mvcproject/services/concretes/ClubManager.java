package com.dev.yusuf.mvcproject.services.concretes;

import com.dev.yusuf.mvcproject.core.utilities.mappers.ModelMapperService;
import com.dev.yusuf.mvcproject.dtos.ClubDto;
import com.dev.yusuf.mvcproject.models.Club;
import com.dev.yusuf.mvcproject.repository.ClubRepository;
import com.dev.yusuf.mvcproject.services.abstracts.ClubService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ClubManager implements ClubService {

    @Autowired
    private ClubRepository clubRepository;
    private ModelMapperService modelMapperService;

    @Override
    public List<ClubDto> findAllClubs() {

        List<Club> clubList = clubRepository.findAll();
        List<ClubDto> clubDtoList = clubList.stream().map(club -> this.modelMapperService.forResponse().map(club, ClubDto.class)).collect(Collectors.toList());

        return clubDtoList;
    }
}
