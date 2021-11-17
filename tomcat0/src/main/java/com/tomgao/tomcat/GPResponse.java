package com.tomgao.tomcat;

import lombok.Data;

import java.io.IOException;
import java.io.OutputStream;

/**
 * @author 高立赟
 * @Description
 * @Date 创建于 2021/11/17 11:08
 */
@Data
public class GPResponse {

    private OutputStream out;

    public GPResponse(OutputStream out) {
        this.out = out;
    }

    public void write(String s) throws IOException {

        StringBuilder sb = new StringBuilder();
        sb.append("HTTP/1.1 200 OK\n")
                .append("Content-Type: text/html;\n")
                .append("\r\n")
                .append(s);
        out.write(sb.toString().getBytes());
    }
}
