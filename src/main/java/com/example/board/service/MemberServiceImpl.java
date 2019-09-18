package com.example.board.service;
 
import java.util.List;
 
import javax.inject.Inject;
 
import org.springframework.stereotype.Service;

import com.example.board.dao.MemberDAO;
import com.example.board.model.MemberModel;
 
@Service
public class MemberServiceImpl implements MemberService {
 
    @Inject
    private MemberDAO dao;
    
    @Override
    public List<MemberModel> selectMember() throws Exception {
 
        return dao.selectMember();
    }
 
}