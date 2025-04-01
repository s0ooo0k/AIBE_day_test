package io.github.s0ooo0k.day49.util;

import io.github.cdimascio.dotenv.Dotenv;
import io.github.s0ooo0k.day49.service.SearchService;

public interface DotenvMixin {
    Dotenv dotenv = Dotenv.configure().ignoreIfMissing().load();

}
