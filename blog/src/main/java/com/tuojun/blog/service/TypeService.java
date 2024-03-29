package com.tuojun.blog.service;

import com.tuojun.blog.po.Type;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Author:TuoJun
 * Date:2019-10-20 13:55
 * Description:(描述)
 */
public interface TypeService {

    Type saveType(Type type);

    Type getType(Long id);

    Type getTypeByName(String name);

    Page<Type> listType(Pageable pageable);

    List<Type> listType();

    List<Type> listTypeTop(Integer size);

    Type updateType(Long id, Type type);

    void deleteType(Long id);
}
