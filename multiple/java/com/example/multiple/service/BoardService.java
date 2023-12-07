package com.example.multiple.service;

import com.example.multiple.dto.BoardDto;
import com.example.multiple.dto.FileDto;
import com.example.multiple.mappers.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService {
    @Autowired
    BoardMapper boardMapper;

    public int getGrpMaxCnt(String configCode){ //controller
        //mapper에서 넘어오는 데이터
        return boardMapper.getGrpMaxCnt(configCode);
    };

    public void setBoard(BoardDto boardDto){
        boardMapper.setBoard(boardDto);
    };

    public void setFiles(FileDto fileDto){
        boardMapper.setFiles(fileDto);
    }

}
