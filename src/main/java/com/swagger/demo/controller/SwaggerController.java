package com.swagger.demo.controller;

import com.swagger.demo.io.CityIO;
import com.swagger.demo.result.CityResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

/**
 * @author Shuoshi.Yan
 * @package:com.swagger.demo.test
 * @className:
 * @description:
 * @date 2019-12-04 10:39
 * @version:V1.0
 * @NOTICE：本内容仅限于xxx有限公司内部传阅,禁止外泄以及用于其他的商业项目
 * @ Copyright  xxx. All rights reserved.
 **/
@RestController
@RequestMapping("/yss")
@Api(tags = "城市",description = "城市")
public class SwaggerController {

    @GetMapping("/get")
    @ApiOperation(value = "根据id查询城市名称",notes = "根据id查询城市名称",response = String.class)
    public String getTest(@ApiParam(name = "城市id",value = "id",required = false) @RequestParam(value = "id",required = false)String id){
        return "this is BeiJing！";
    }

    @PostMapping("/post")
    @ApiOperation(value = "城市简介",notes = "城市简介",response = CityResult.class)
    public CityResult postTest(@ApiParam(required = true) @RequestBody CityIO cityIO){
        CityResult cityResult = new CityResult();
        cityResult.setCityName("北京");
        cityResult.setMessage("是中国首都！");
        return cityResult;
    }
}
