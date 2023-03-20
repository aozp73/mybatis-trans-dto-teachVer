package shop.mtcoding.mybatisdto.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
public class BoardJoinUserDto {
    private BoardDto board;
    private UserDto user;
    //private List<BoardDto> boards;
}
