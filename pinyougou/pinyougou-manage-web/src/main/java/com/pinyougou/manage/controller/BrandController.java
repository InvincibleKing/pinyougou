package com.pinyougou.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pinyougou.pojo.TbBrand;
import com.pinyougou.sellergoods.service.BrandService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/brand")
/**
 * @RestController 相当于@Controller和@ResponseBody
 */
@RestController
public class BrandController {

    /**
     * 引用阿里的注解相当于AutoWriter
     */
    @Reference
    private BrandService brandService;

    /**
     * @GetMapping相当于get方法与@RequestMappering
     */
    @GetMapping("/findAll")
    public List<TbBrand> findAll(){
        return brandService.queryAll();
    }

}
