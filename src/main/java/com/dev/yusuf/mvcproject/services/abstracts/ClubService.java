package com.dev.yusuf.mvcproject.services.abstracts;

import com.dev.yusuf.mvcproject.dtos.ClubDto;

import java.util.List;

public interface ClubService {
    List<ClubDto> findAllClubs();
}
