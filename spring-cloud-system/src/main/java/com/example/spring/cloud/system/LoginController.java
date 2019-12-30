package com.example.spring.cloud.system;

import com.example.springcloudcommon.common.exception.ErrorCode;
import com.example.springcloudcommon.common.redis.RedisKeys;
import com.example.springcloudcommon.common.redis.RedisUtils;
import com.example.springcloudcommon.common.validator.AssertUtils;
import com.google.code.kaptcha.Producer;
import com.google.common.cache.CacheBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.google.common.cache.Cache;
import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

@RestController
public class LoginController {

    //这里的captchaProducer要和KaptchaConfig里面的bean命名一样
    @Autowired
    private Producer captchaProducer;

    private boolean open = false;
    /**
     * Local Cache  5分钟过期
     */
    Cache<String, String> localCache = CacheBuilder.newBuilder().maximumSize(1000).expireAfterAccess(5, TimeUnit.MINUTES).build();

    @GetMapping("captcha")
    public void  captcha(HttpServletResponse response, String uuid)throws IOException {
        //uuid不能为空
        AssertUtils.isBlank(uuid, ErrorCode.IDENTIFIER_NOT_NULL);
        //生成文字验证码
        String code = captchaProducer.createText();
        //生成图片验证码
        BufferedImage image = captchaProducer.createImage(uuid);
        RedisUtils redisUtils = new RedisUtils();
        if(open){
            uuid = RedisKeys.getCaptchaKey(uuid);
            redisUtils.set(uuid, code, 300);
        }else{
            localCache.put(uuid, code);
        }
        response.setHeader("Cache-Control", "no-store, no-cache");
        response.setContentType("image/jpeg");
        ServletOutputStream out = response.getOutputStream();
        ImageIO.write(image, "jpg", out);
        out.close();
    }
}
