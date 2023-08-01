package com.tovelop.maphant.mapper

import com.tovelop.maphant.dto.*
import org.apache.ibatis.annotations.Mapper
import org.springframework.stereotype.Repository

@Mapper
@Repository
interface BoardMapper {
    fun getBoardTypeIdByBoardTypeName(boardTypeName: String): Int
    fun getCategoryIdByCategoryName(categoryName: String): Int
    fun findBoardList(findBoardDTO: FindBoardDTO, startRow: Int, categoryId: Int, boardTypeId: Int): List<PageBoardDTO>
    fun insertBoard(boardDTO: BoardDTO)
    fun findBoard(boardId: Int): BoardDTO?
    fun updateBoard(updateBoardDTO: UpdateBoardDTO)
    fun deleteBoard(boardId: Int)
    fun insertBoardLike(boardId: Int, userId: Int)
    fun deleteBoardLike(boardId: Int, userId: Int)
    fun insertBoardReport(boardId: Int, userId: Int, reportId: Int)
    fun findBoardByKeyword(keyword: String): List<BoardDTO>
    fun isInCategory(categoryId: Int): String?
    fun isInBoardType(boardType: String): String?
    fun findBoardLike(boardId: Int, userId: Int): BoardLikeDTO?
    fun isInReportByBoardId(boardId: Int, userId: Int): BoardReportDTO?
    fun isInReportId(reportId: Int): String?
    fun isInBoardByBoardId(boardId: Int): Int?
    fun insertBoardQna(parentBoardId: Int, childBoardId: Int)
    fun updateIsCompleteOfBoard(boardId: Int, isComplete: Int)
    fun updateStateOfBoard(boardId: Int, state: Int)
}
