package omc.cju.community.service;

import omc.cju.community.domain.BoardDTO;

import java.util.List;

public interface BoardService {

    public boolean registerBoard(BoardDTO params);

    public BoardDTO getBoardDetail(Long id);

    public boolean deleteBoard(Long id);

    public List<BoardDTO> getBoardList();
}
