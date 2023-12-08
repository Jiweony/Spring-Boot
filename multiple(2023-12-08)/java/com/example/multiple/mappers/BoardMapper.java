package com.example.multiple.mappers;

import com.example.multiple.dto.BoardDto;
import com.example.multiple.dto.FileDto;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.io.File;
import java.util.List;

@Mapper
public interface BoardMapper {
    @Select("select ifnull(max(grp) + 1, 1) from board_${configCode}")
    public int getGrpMaxCnt(String configCode);

    @Insert("insert into board_${configCode} values(null, #{subject}, #{writer}, #{content}, 0, now(), #{grp}, 1, 1)")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    public void setBoard(BoardDto boardDto);

    @Insert("insert into files_${configCode} values(#{id}, #{orgName}, #{savedFileName}, #{savedPathName}, #{savedFileSize}, #{folderName}, #{ext})")
    public void setFiles(FileDto fileDto);

    @Select("select * from board_${configCode} order by id desc")
    public List<BoardDto> getBoardList(String configCode);

    @Select("select * from board_${configCode} where id = #{id}")
    BoardDto getBoard(String configCode, int id);

    @Select("select * from files_${configCode} where id = #{id}")
    public List<FileDto> getFiles(String configCode, int id);


}
