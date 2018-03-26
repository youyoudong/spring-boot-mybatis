package com.wangz.springBoot.service;

import com.wangz.springBoot.dao.SourceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * SourceService
 * @author wangz
 */
@Service
public class SourceService {

    @Autowired
    private SourceDao sourceDao;
}
