package com.example.multiple.service;

import com.example.multiple.dto.BoardDto;
import com.example.multiple.dto.FileDto;
import com.example.multiple.mappers.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public List<BoardDto> getBoardList(String configCode){
        return boardMapper.getBoardList(configCode);
    }

    public BoardDto getBoard(String configCode, int id){
        return boardMapper.getBoard(configCode, id);
    }

    public List<FileDto> getFiles(String configCode, int id){
        return boardMapper.getFiles(configCode, id);
    }


}
