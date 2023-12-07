package com.example.multiple.mappers;

import com.example.multiple.dto.BoardDto;
import com.example.multiple.dto.FileDto;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.io.File;

@Mapper
public interface BoardMapper {
    @Select("select ifnull(max(grp) + 1, 1) from board_${configCode}")
    public int getGrpMaxCnt(String configCode);

    @Insert("insert into board_${configCode} values(null, #{subject}, #{writer}, #{content}, 0, now(), #{grp}, 1, 1)")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    public void setBoard(BoardDto boardDto);

    @Insert("insert into files_${configCode} values(#{id}, #{orgName}, #{savedFileName}, #{savedPathName}, #{savedFileSize}, #{folderName}, '')")
    public void setFiles(FileDto fileDto);

}
