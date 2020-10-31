package task02Enum;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum HttpCodeEnum {
    INFO(100, 199, new InfoHttpCodeHandler()),
    SUCCESS(200, 299, new SuccessHttpCodeHandler()),
    REDIRECTION(300, 399, new RedirectionHttpCodeHandler()),
    CLIENT(400, 499, new ClientHttpCodeHandler()),
    SERVER(500, 599, new ServerHttpCodeHandler());

    private final int min;
    private final int max;
    private final HttpHandler handler;

    public void handle() {
        handler.handle();
    }

    public static HttpCodeEnum findByHttpCode(int code) {
        HttpCodeEnum[] enums = values();
        for (HttpCodeEnum anEnums : enums) {
            if (anEnums.min <= code && code <= anEnums.max) {
                return anEnums;
            }

        }
        throw new IllegalStateException(code + "not supported range");
    }

}
