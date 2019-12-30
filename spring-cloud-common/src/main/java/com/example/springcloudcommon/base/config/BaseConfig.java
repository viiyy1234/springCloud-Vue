package com.example.springcloudcommon.base.config;

import com.example.springcloudcommon.base.constants.StringConstant;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * <p>className: BaseConfig</p>
 * <p>description: 公共基础配置类</p>
 *
 * @author tengfei
 * @version 1.0
 * @date 2019-12-08 10:56
 */
@Configuration
public class BaseConfig {

    /**
     * 从配置文件获取并设置nginx路径
     * @param nginxPath
     */
    @Value("${base.upload.nginxPath:C:/Suqian/web/}")
    private void setNginxPath(String nginxPath) {
        StringConstant.NGINX_PATH = nginxPath;
    }

    /**
     * 从配置文件获取并设置上传路径
     * @param uploadFileUrl
     */
    @Value("${base.upload.uploadFileUrl:upload/}")
    private void setUploadFileUrl(String uploadFileUrl) {
        StringConstant.UPLOAD_FILE_URL = uploadFileUrl;
    }

    @Value("${base.upload.layeditPath:C:/Suqian/web/}")
    private void setLayeditPath(String layeditPath) {
        StringConstant.LAYEDIT_PATH = layeditPath;
    }
}
