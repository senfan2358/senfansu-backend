package com.senfan.springbootinit.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.senfan.springbootinit.common.BaseResponse;
import com.senfan.springbootinit.common.ErrorCode;
import com.senfan.springbootinit.common.ResultUtils;
import com.senfan.springbootinit.exception.BusinessException;
import com.senfan.springbootinit.manager.SearchFacade;
import com.senfan.springbootinit.model.dto.post.PostQueryRequest;
import com.senfan.springbootinit.model.dto.search.SearchRequest;
import com.senfan.springbootinit.model.dto.user.UserQueryRequest;
import com.senfan.springbootinit.model.entity.Picture;
import com.senfan.springbootinit.model.vo.PostVO;
import com.senfan.springbootinit.model.vo.SearchVO;
import com.senfan.springbootinit.model.vo.UserVO;
import com.senfan.springbootinit.service.PictureService;
import com.senfan.springbootinit.service.PostService;
import com.senfan.springbootinit.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.concurrent.CompletableFuture;

/**
 * 图片接口
 */
@RestController
@RequestMapping("/search")
public class SearchController {
    @Resource
    private UserService userService;

    @Resource
    private PostService postService;

    @Resource
    private PictureService pictureService;
    @Resource
    private SearchFacade searchFacade;

    @PostMapping("/all")
    public BaseResponse<SearchVO> searchAll(@RequestBody SearchRequest searchRequest, HttpServletRequest request) {
        return ResultUtils.success(searchFacade.searchAll(searchRequest, request));
    }
}
