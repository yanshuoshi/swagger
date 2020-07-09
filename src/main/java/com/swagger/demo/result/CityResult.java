package com.swagger.demo.result;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author Shuoshi.Yan
 * @package:com.swagger.demo.result
 * @className:城市返回对象
 * @description:
 * @date 2019-12-04 16:05
 * @version:V1.0
 * @NOTICE：本内容仅限于xxx有限公司内部传阅,禁止外泄以及用于其他的商业项目
 * @ Copyright  xxx. All rights reserved.
 **/
@Data
@ApiModel(value = "CityResult参数说明",description = "CityResult参数说明")
public class CityResult {
    @ApiModelProperty(value = "城市名称")
    private String cityName;
    @ApiModelProperty(value = "城市说明")
    private String message;
}
