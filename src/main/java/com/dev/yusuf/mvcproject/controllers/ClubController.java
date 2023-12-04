package com.dev.yusuf.mvcproject.controllers;

import com.dev.yusuf.mvcproject.dtos.ClubDto;
import com.dev.yusuf.mvcproject.services.abstracts.ClubService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class ClubController {

    @Autowired
    private ClubService clubService;

    @GetMapping("/clubs")
    public List<ClubDto> getAll(){
        return this.clubService.findAllClubs();
    }

}
