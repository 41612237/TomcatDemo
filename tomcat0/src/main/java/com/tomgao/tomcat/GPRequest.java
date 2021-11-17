package com.tomgao.tomcat;

import lombok.Data;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author 高立赟
 * @Description
 * @Date 创建于 2021/11/17 11:08
 */

@Data
public class GPRequest {

    private String method;
    private String url;

    public GPRequest(InputStream in) throws IOException {

        String content = "";
        byte[] buff = new byte[1024];
        int len = 0;
        if ((len = in.read(buff)) > 0) {
            content = new String(buff,0,len);
        }

        String line = content.split("\\n")[0];
        String[] arr = line.split("\\s");

        this.method = arr[0];
        this.url = arr[1].split("\\?")[0];
    }
}
