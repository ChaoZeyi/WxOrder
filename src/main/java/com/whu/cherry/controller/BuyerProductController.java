package com.whu.cherry.controller;

import com.whu.cherry.entity.ProductCategory;
import com.whu.cherry.entity.ProductInfo;
import com.whu.cherry.service.ProductCategoryService;
import com.whu.cherry.service.ProductInfoService;
import com.whu.cherry.vo.DataVo;
import com.whu.cherry.vo.ProductVo;
import com.whu.cherry.vo.ResultVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

/**
 * @author cherry
 * @date 2018/5/20 20:51
 */
@RestController
@RequestMapping("/buyer/product")
public class BuyerProductController {

    @Autowired
    private ProductInfoService productInfoService;
    @Autowired
    private ProductCategoryService productCategoryService;

    @GetMapping("/list")
    //查看所有的上架商品，并按类别显示
    public ResultVo list(){

        List<ProductInfo> productInfoList = productInfoService.findUpAll();
        Set<Integer> productTypeSet = new HashSet<>();
        for (ProductInfo productInfo: productInfoList) {
            productTypeSet.add(productInfo.getCategoryType());
        }

        List<ProductCategory> productCategoryList =
                productCategoryService.findByTypeList(new ArrayList<>(productTypeSet));



        List<DataVo> dataVoList = new ArrayList<>();

        for (ProductCategory productCategory:productCategoryList
             ) {
            DataVo dataVo = new DataVo();
            dataVo.setCategoryName(productCategory.getCategoryName());
            dataVo.setCategoryType(productCategory.getCategoryType());

            List<ProductVo> productVoList = new ArrayList<>();

            for (ProductInfo productInfo: productInfoList
                 ) {
                if(productInfo.getCategoryType().equals(productCategory.getCategoryType())){
                    ProductVo productVo = new ProductVo();
                    //复制属性值
                    BeanUtils.copyProperties(productInfo, productVo);
                    productVoList.add(productVo);
                }
            }
            dataVo.setProductVoList(productVoList);
            dataVoList.add(dataVo);
        }

        ResultVo resultVo = new ResultVo();

        resultVo.setCode(0);
        resultVo.setMsg("成功");
        resultVo.setDataVoList(dataVoList);
        return resultVo;
    }
}

