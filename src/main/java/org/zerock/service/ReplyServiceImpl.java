package org.zerock.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.zerock.domain.ReplyVO;
import org.zerock.persistence.ReplyDAO;

@Service
public class ReplyServiceImpl  implements ReplyService {
      
	 @Inject
      private ReplyDAO dao;
      
      @Override
      public void addReply(ReplyVO vo) throws Exception {
    	  dao.create(vo);
      }
      
      @Override
      public List<ReplyVO> listReply(Integer bno) throws Exception {
    	  return dao.list(bno);
      }
      
      @Override
      public void modifyReply(ReplyVO vo) throws Exception {
    	  dao.update(vo);
      }
      
      @Override
      public void removeReply(Integer rno) throws Exception {
          dao.delete(rno);	  
      }
}
