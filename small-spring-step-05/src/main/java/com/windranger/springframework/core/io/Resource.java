package com.windranger.springframework.core.io;

import java.io.IOException;
import java.io.InputStream;

public interface Resource {
    /**
     * 获取资源
     */
    InputStream getInputStream() throws IOException;
}
