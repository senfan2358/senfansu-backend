package com.senfan.springbootinit.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.senfan.springbootinit.model.dto.post.PostQueryRequest;
import com.senfan.springbootinit.model.entity.Picture;
import com.senfan.springbootinit.model.entity.Post;
import com.senfan.springbootinit.model.vo.PostVO;

import javax.servlet.http.HttpServletRequest;

/**
 * 帖子服务
 *
 */
public interface PictureService{
    Page<Picture> searchPicture(String searchText, long pageNum, long pageSize);
}
