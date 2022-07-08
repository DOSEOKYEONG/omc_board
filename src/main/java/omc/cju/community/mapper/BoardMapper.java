package omc.cju.community.mapper;

import omc.cju.community.domain.BoardDTO;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface BoardMapper {

    public int insertBoard(BoardDTO params);

    public BoardDTO selectBoardDetail(Long id);

    public int updateBoard(BoardDTO params);

    public int deleteBoard(Long id);

    public List<BoardDTO> selectBoardList();

    public int selectBoardTotalCount();
}
