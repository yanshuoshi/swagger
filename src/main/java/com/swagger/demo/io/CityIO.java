package com.swagger.demo.io;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author Shuoshi.Yan
 * @package:com.swagger.demo
 * @className:
 * @description:
 * @date 2019-12-04 15:55
 * @version:V1.0
 * @NOTICE：本内容仅限于xxx有限公司内部传阅,禁止外泄以及用于其他的商业项目
 * @ Copyright  xxx. All rights reserved.
 **/
@Data
@ApiModel(value = "CityIO参数说明",description = "CityIO参数说明")
public class CityIO {
    @ApiModelProperty(value = "城市id")
    private String id;
    @ApiModelProperty(value = "城市位于南方北方 1/南方 2/北方")
    private String position;
}
