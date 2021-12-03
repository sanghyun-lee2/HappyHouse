package com.ssafy.vue.model.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ssafy.util.PageNavigation;
import com.ssafy.vue.model.NoticeDto;
import com.ssafy.vue.model.BoardParameterDto;
import com.ssafy.vue.model.mapper.NoticeMapper;

@Service
public class NoticeServiceImpl implements NoticeService {
	
	@Autowired
	private SqlSession sqlSession;

	@Override
	public boolean writeArticle(NoticeDto boardDto) throws Exception {
		if(boardDto.getSubject() == null || boardDto.getContent() == null) {
			throw new Exception();
		}
		return sqlSession.getMapper(NoticeMapper.class).writeArticle(boardDto) == 1;
	}

	@Override
	public List<NoticeDto> listArticle(BoardParameterDto boardParameterDto) throws Exception {
		int start = boardParameterDto.getPg() == 0 ? 0 : (boardParameterDto.getPg() - 1) * boardParameterDto.getSpp();
		boardParameterDto.setStart(start);
		return sqlSession.getMapper(NoticeMapper.class).listArticle(boardParameterDto);
	}

	@Override
	public PageNavigation makePageNavigation(BoardParameterDto boardParameterDto) throws Exception {
		int naviSize = 5;
		PageNavigation pageNavigation = new PageNavigation();
		pageNavigation.setCurrentPage(boardParameterDto.getPg());
		pageNavigation.setNaviSize(naviSize);
		int totalCount = sqlSession.getMapper(NoticeMapper.class).getTotalCount(boardParameterDto);//총글갯수  269
		pageNavigation.setTotalCount(totalCount);  
		int totalPageCount = (totalCount - 1) / boardParameterDto.getSpp() + 1;//27
		pageNavigation.setTotalPageCount(totalPageCount);
		boolean startRange = boardParameterDto.getPg() <= naviSize;
		pageNavigation.setStartRange(startRange);
		boolean endRange = (totalPageCount - 1) / naviSize * naviSize < boardParameterDto.getPg();
		pageNavigation.setEndRange(endRange);
		pageNavigation.makeNavigator();
		return pageNavigation;
	}

	@Override
	public NoticeDto getArticle(int articleno) throws Exception {
		return sqlSession.getMapper(NoticeMapper.class).getArticle(articleno);
	}
	
	@Override
	public void updateHit(int articleno) throws Exception {
		sqlSession.getMapper(NoticeMapper.class).updateHit(articleno);
	}

	@Override
	@Transactional
	public boolean modifyArticle(NoticeDto boardDto) throws Exception {
		return sqlSession.getMapper(NoticeMapper.class).modifyArticle(boardDto) == 1;
	}

	@Override
	@Transactional
	public boolean deleteArticle(int articleno) throws Exception {
		sqlSession.getMapper(NoticeMapper.class).deleteMemo(articleno);
		return sqlSession.getMapper(NoticeMapper.class).deleteArticle(articleno) == 1;
	}
}