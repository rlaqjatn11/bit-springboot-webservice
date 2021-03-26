package com.example.web.springboot.web;

import com.example.web.springboot.service.PostsService;
import com.example.web.springboot.web.dto.HelloResponseDto;
import com.example.web.springboot.web.dto.PostsListResponseDto;
import com.example.web.springboot.web.dto.PostsResponseDto;
import com.example.web.springboot.web.dto.PostsSaveRequestDto;
import com.example.web.springboot.web.dto.PostsUpdateRequestDto;
import org.springframework.web.bind.annotation.RequestBody;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RequiredArgsConstructor
@RestController
public class PostsApiController {

    private final PostsService postsService;


    @PostMapping("/api/v1/posts")
    public Long update(@PathVariable PostsSaveRequestDto requestDto) {
            return postsService.save(requestDto);
    }

    @PutMapping("/api/v1/posts/{id}")
    public Long update(@PathVariable Long id, @RequestBody PostsUpdateRequestDto requestDto) {
        return postsService.update(id, requestDto);
    }

    @GetMapping("/api/v1/posts/{id}")
    public PostsResponseDto findById(@PathVariable Long id) {
        return postsService.findById(id);

        }

    @GetMapping("/api/v1/posts/list")
    public List<PostsListResponseDto> findAll() {
        return postsService.findAllDesc();
    }

    @DeleteMapping("/api/v1/posts/{id}")
    public Long delete(@PathVariable Long id) {
        postsService.delete(id);
        return id;
    }
}




